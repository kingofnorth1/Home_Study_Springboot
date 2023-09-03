/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 80034
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 80034
File Encoding         : 65001

Date: 2023-09-03 20:43:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int NOT NULL,
  `user_id` int DEFAULT NULL,
  `order_name` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL,
  `order_type` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', '1', '电脑', '电子产品');
INSERT INTO `order` VALUES ('2', '1', '鼠标', '电子产品');
INSERT INTO `order` VALUES ('3', '2', '键盘', '电子产品');
INSERT INTO `order` VALUES ('4', '3', '相机', '电子产品');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `rid` int NOT NULL,
  `rolename` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'cfo');
INSERT INTO `role` VALUES ('2', 'ceo');
INSERT INTO `role` VALUES ('3', 'coo');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL,
  `username` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb3_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '小王', '123');
INSERT INTO `user` VALUES ('2', '小明', '234');
INSERT INTO `user` VALUES ('3', '小夏', '345');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `userId` int NOT NULL,
  `roleId` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1');
INSERT INTO `user_role` VALUES ('1', '2');
INSERT INTO `user_role` VALUES ('1', '3');
INSERT INTO `user_role` VALUES ('2', '1');
INSERT INTO `user_role` VALUES ('3', '1');
