package com.junlin.controller;

import ch.qos.logback.classic.Logger;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RestController
//@RequestMapping("/file")
public class upDownController {
    @GetMapping("/hello")
    public String belloWorld(){
        System.out.printf("输出正确结果");
        return "hello world";
    }

    @PostMapping("upload")
    public String uploalFile(@RequestParam(required = false) MultipartFile file){
        System.out.printf("文件上传未显示");
        if (file.isEmpty()){
            return "上传失败";
        }
        String fileName = file.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        String filePath = "F:/7z";
        File desk = new File(filePath +'/'+ fileName);
//        System.out.println("文件名称"+fileName);
        if (desk.getParentFile().exists()){
            desk.getParentFile().mkdir();
        }
        try{
            file.transferTo(desk);
            return "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }

    @RequestMapping("/download")
    public String fileDownLoad(HttpServletResponse response, @RequestParam("fileName") String fileName){
        String downloadFilePath = "F:/7z";
        File file = new File(downloadFilePath +'/'+ fileName);
        if(!file.exists()){
            return "下载文件不存在";
        }
        response.reset();
        response.setContentType("application/octet-stream");
        response.setCharacterEncoding("utf-8");
        response.setContentLength((int) file.length());
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName );

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            byte buff[] = new byte[1024];
            OutputStream os = response.getOutputStream();
            int i = 0;
            while ((i = bis.read(buff)) != -1){
                os.write(buff, 0, i);
                os.flush();
            }

        } catch (IOException e) {
//            log.error("{}",e);
            return "下载失败";
        }
        return "下载成功";
    }
}
