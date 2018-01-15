/*
 * Copyright (c) 2017 Yanzheng [https://github.com/micyo202/yan]
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 * BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 * ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.0.200_ROOT
 Source Server Type    : MySQL
 Source Server Version : 50711
 Source Host           : 192.168.0.200
 Source Database       : demo

 Target Server Type    : MySQL
 Target Server Version : 50711
 File Encoding         : utf-8

 Date: 10/11/2017 15:25:12 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `ROLE_MENU_REL`
-- ----------------------------
DROP TABLE IF EXISTS `ROLE_MENU_REL`;
CREATE TABLE `ROLE_MENU_REL` (
  `REL_ID` varchar(32) NOT NULL COMMENT '关系ID（主键）',
  `ROLE_ID` varchar(32) NOT NULL COMMENT '角色ID',
  `MENU_ID` varchar(32) NOT NULL COMMENT '菜单资源ID',
  PRIMARY KEY (`REL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色与菜单关系表';

-- ----------------------------
--  Records of `ROLE_MENU_REL`
-- ----------------------------
BEGIN;
INSERT INTO `ROLE_MENU_REL` VALUES ('0B240220B2DC476D804CFE5EEB3EB451', 'BA1419119EA94537813B1927B774CB80', '82A67CA737A94B548CF25A98FFAF4826'), ('17BF776856524E90AF17716196D8BEBF', 'BA1419119EA94537813B1927B774CB80', '6CDA36CB1A36458B8152808CD32BE419'), ('2D744173BA924DF08C1DC708EAD14C56', 'CCEC9506B6064F94924E3189BA10CD01', '82A67CA737A94B548CF25A98FFAF4826'), ('5D9F8A6CDC8345D9B983FC7FB769A890', '9976A7FE2D3540E387F47577B1397E57', '285560D283BC4FBFAA0375F2C59DC0F9'), ('6F17C2BD6C444941ABCFE81076B1B200', 'CCEC9506B6064F94924E3189BA10CD01', '6CDA36CB1A36458B8152808CD32BE419'), ('8480B5A13FAB48E5AF02FEF0A9DB4512', '9976A7FE2D3540E387F47577B1397E57', 'BE76F593769A41DBA00D08154220E5AA'), ('9B0ED271050F4280AB3E912099C18151', 'CCEC9506B6064F94924E3189BA10CD01', '9D3282CE5B5546A99D83E4324155F86F'), ('A0DC640DE1C642179776E017203942FE', 'BA1419119EA94537813B1927B774CB80', '959D36B26FB3486DAC101BCEFDB2CCB3'), ('AB6A2AC604F04527BF21B7CA0F97EF4B', 'BA1419119EA94537813B1927B774CB80', '9D3282CE5B5546A99D83E4324155F86F'), ('B6EA8FB303EC4584A94AF69A9C7937F5', 'BA1419119EA94537813B1927B774CB80', '285560D283BC4FBFAA0375F2C59DC0F9'), ('CCA75962F13C42A1A4C3E6A595355D10', '9976A7FE2D3540E387F47577B1397E57', '959D36B26FB3486DAC101BCEFDB2CCB3'), ('FC6834AB4227408FB361C3629F243813', 'BA1419119EA94537813B1927B774CB80', 'BE76F593769A41DBA00D08154220E5AA');
COMMIT;

-- ----------------------------
--  Table structure for `SYS_MENU`
-- ----------------------------
DROP TABLE IF EXISTS `SYS_MENU`;
CREATE TABLE `SYS_MENU` (
  `MENU_ID` varchar(32) NOT NULL DEFAULT '' COMMENT '菜单ID',
  `MENU_PID` varchar(32) DEFAULT NULL COMMENT '菜单父ID',
  `MENU_NAME` varchar(100) DEFAULT NULL COMMENT '菜单名称',
  `MENU_DESCRIBE` varchar(200) DEFAULT NULL COMMENT '菜单描述',
  `MENU_URL` varchar(100) DEFAULT NULL COMMENT '菜单地址URL',
  `MENU_ICON` varchar(32) DEFAULT NULL COMMENT '图标',
  `MENU_INDEX` int(11) DEFAULT NULL COMMENT '菜单排序',
  `MENU_TYPE` varchar(32) NOT NULL COMMENT '菜单类型（文件夹/菜单）',
  `MENU_LEVEL` int(11) DEFAULT NULL COMMENT '菜单级别',
  `MENU_VALID` tinyint(1) DEFAULT NULL COMMENT '有效值',
  PRIMARY KEY (`MENU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统菜单表';

-- ----------------------------
--  Records of `SYS_MENU`
-- ----------------------------
BEGIN;
INSERT INTO `SYS_MENU` VALUES ('00000000000000000000000000000000', null, '资源根节点', null, null, null, null, 'folder', '0', '1'), ('00000000000000000000000000000001', '00000000000000000000000000000000', '菜单资源', '', '', '', '1', 'folder', '1', '1'), ('285560D283BC4FBFAA0375F2C59DC0F9', '71A77D3BE8D54DB0B9F90233C60A7F4B', '产品详情', '', '/demo/product/detail', '', '1', 'menu', '3', '1'), ('6CDA36CB1A36458B8152808CD32BE419', '9DFCDE1F191F4C4DBC98043F6415672E', '系统性能测试', '', '/test/property', '', '1', 'menu', '3', '1'), ('71A77D3BE8D54DB0B9F90233C60A7F4B', '00000000000000000000000000000001', '产品信息管理', '', '', 'fa fa-cc-visa', '1', 'folder', '2', '1'), ('82A67CA737A94B548CF25A98FFAF4826', '9DFCDE1F191F4C4DBC98043F6415672E', '服务端响应查看', '', '/test/server', '', '3', 'menu', '3', '1'), ('959D36B26FB3486DAC101BCEFDB2CCB3', '71A77D3BE8D54DB0B9F90233C60A7F4B', '产品库存', '', '/demo/product/store', '', '3', 'menu', '3', '0'), ('9D3282CE5B5546A99D83E4324155F86F', '9DFCDE1F191F4C4DBC98043F6415672E', '消息推送测试', '', '/test/message', '', '2', 'menu', '3', '1'), ('9DFCDE1F191F4C4DBC98043F6415672E', '00000000000000000000000000000001', '测试模块管理', '', '', 'fa fa-bug', '2', 'folder', '2', '1'), ('BE76F593769A41DBA00D08154220E5AA', '71A77D3BE8D54DB0B9F90233C60A7F4B', '产品展示', '', '/demo/product/init', '', '1', 'menu', '3', '1');
COMMIT;

-- ----------------------------
--  Table structure for `SYS_ROLE`
-- ----------------------------
DROP TABLE IF EXISTS `SYS_ROLE`;
CREATE TABLE `SYS_ROLE` (
  `ROLE_ID` varchar(32) NOT NULL COMMENT '角色ID（主键）',
  `ROLE_PID` varchar(32) DEFAULT NULL COMMENT '角色父ID',
  `ROLE_NAME` varchar(100) DEFAULT NULL COMMENT '角色名称',
  `ROLE_INDEX` int(11) DEFAULT NULL COMMENT '角色排序',
  `ROLE_TYPE` varchar(32) DEFAULT NULL COMMENT '角色类型，菜单类型（文件夹/菜单）',
  `ROLE_LEVEL` int(11) DEFAULT NULL COMMENT '角色级别',
  `ROLE_VALID` tinyint(1) DEFAULT NULL COMMENT '有效值',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
--  Records of `SYS_ROLE`
-- ----------------------------
BEGIN;
INSERT INTO `SYS_ROLE` VALUES ('00000000000000000000000000000000', null, '角色根节点', null, 'group', '0', '1'), ('00000000000000000000000000000001', '00000000000000000000000000000000', '用户角色', '1', 'group', '1', '1'), ('9976A7FE2D3540E387F47577B1397E57', '00000000000000000000000000000001', '一般用户角色', '2', 'role', '2', '1'), ('BA1419119EA94537813B1927B774CB80', '00000000000000000000000000000001', '管理员角色', '1', 'role', '2', '1'), ('CCEC9506B6064F94924E3189BA10CD01', '00000000000000000000000000000001', '测试账户', '3', 'role', '2', '1');
COMMIT;

-- ----------------------------
--  Table structure for `SYS_USER`
-- ----------------------------
DROP TABLE IF EXISTS `SYS_USER`;
CREATE TABLE `SYS_USER` (
  `USER_ID` varchar(32) NOT NULL COMMENT '用户ID（主键）',
  `USER_CODE` varchar(32) NOT NULL COMMENT '用户代码（用户名）',
  `USER_NAME` varchar(32) NOT NULL COMMENT '姓名',
  `USER_PASSWORD` varchar(32) NOT NULL COMMENT '密码',
  `USER_ADDRESS` varchar(200) DEFAULT NULL COMMENT '地址',
  `USER_EMAIL` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `USER_PHONE` varchar(32) DEFAULT NULL COMMENT '电话',
  `USER_BIRTHDAY` date DEFAULT NULL COMMENT '生日（系统会根据生日计算年龄）',
  `USER_JOINDATE` datetime NOT NULL COMMENT '加入时间（注册时间）',
  `USER_PHOTO` varchar(100) DEFAULT NULL COMMENT '照片（头像）',
  `USER_TYPE` varchar(32) NOT NULL COMMENT '类型',
  `USER_VALID` tinyint(1) NOT NULL COMMENT '有效标志，true：有效、false：无效',
  PRIMARY KEY (`USER_ID`,`USER_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户表';

-- ----------------------------
--  Records of `SYS_USER`
-- ----------------------------
BEGIN;
INSERT INTO `SYS_USER` VALUES ('361DFC9647E64A5CBD3893B64237EEC3', 'admin', '管理员', '123456', '陕西省西安市雁塔区小寨西路', 'admin@live.cn', '13888888888', '2017-08-17', '2017-08-17 18:02:18', '20170817180024.png', 'admin', '1'), ('431C6C684DC1420E8C1D27F3DA9B0D3E', 'zhangsan', '张三', '123456', '陕西省西安市高新区', 'zhangsan@163.com', null, null, '2017-09-20 17:23:57', null, 'general', '1'), ('5350A5DE1AA54D73A8ECCF6CDB1DF57E', 'lisi', '李四', '123456', '陕西省西安市碑林区', 'lisi@126.com', null, null, '2017-09-20 17:24:56', null, 'general', '1'), ('A07E2ADB74BB4387BDB6F2138C56066D', 'yange', '严格', '123456', '陕西省西安市曲江新区', 'yange@google.com', '13666666666', '1990-08-03', '2017-09-05 12:53:09', '201709051253.png', 'general', '1');
COMMIT;

-- ----------------------------
--  Table structure for `USER_ROLE_REL`
-- ----------------------------
DROP TABLE IF EXISTS `USER_ROLE_REL`;
CREATE TABLE `USER_ROLE_REL` (
  `REL_ID` varchar(32) NOT NULL COMMENT '关系ID（主键）',
  `USER_ID` varchar(32) NOT NULL COMMENT '人员ID',
  `ROLE_ID` varchar(32) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`REL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人员角色关系表';

-- ----------------------------
--  Records of `USER_ROLE_REL`
-- ----------------------------
BEGIN;
INSERT INTO `USER_ROLE_REL` VALUES ('1E7B2CC514E34A559B62E472E42E4D92', '431C6C684DC1420E8C1D27F3DA9B0D3E', '9976A7FE2D3540E387F47577B1397E57'), ('5F6777B085DD4EE7A38DB91A89DB4A86', 'A07E2ADB74BB4387BDB6F2138C56066D', '9976A7FE2D3540E387F47577B1397E57'), ('7FC2634BD87143D4997DC3B97344705C', 'A07E2ADB74BB4387BDB6F2138C56066D', 'CCEC9506B6064F94924E3189BA10CD01'), ('8C80B520B6A64C458384917A2606DAFB', '5350A5DE1AA54D73A8ECCF6CDB1DF57E', 'CCEC9506B6064F94924E3189BA10CD01'), ('90F07CFB601E4EB18037EE0DABAE37C5', 'A07E2ADB74BB4387BDB6F2138C56066D', 'BA1419119EA94537813B1927B774CB80');
COMMIT;

-- ----------------------------
--  Table structure for `logging_event`
-- ----------------------------
DROP TABLE IF EXISTS `logging_event`;
CREATE TABLE `logging_event` (
  `timestmp` bigint(20) NOT NULL,
  `formatted_message` text COLLATE utf8_bin NOT NULL,
  `logger_name` varchar(254) COLLATE utf8_bin NOT NULL,
  `level_string` varchar(254) COLLATE utf8_bin NOT NULL,
  `thread_name` varchar(254) COLLATE utf8_bin DEFAULT NULL,
  `reference_flag` smallint(6) DEFAULT NULL,
  `arg0` varchar(254) COLLATE utf8_bin DEFAULT NULL,
  `arg1` varchar(254) COLLATE utf8_bin DEFAULT NULL,
  `arg2` varchar(254) COLLATE utf8_bin DEFAULT NULL,
  `arg3` varchar(254) COLLATE utf8_bin DEFAULT NULL,
  `caller_filename` varchar(254) COLLATE utf8_bin NOT NULL,
  `caller_class` varchar(254) COLLATE utf8_bin NOT NULL,
  `caller_method` varchar(254) COLLATE utf8_bin NOT NULL,
  `caller_line` char(4) COLLATE utf8_bin NOT NULL,
  `event_id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
--  Table structure for `logging_event_exception`
-- ----------------------------
DROP TABLE IF EXISTS `logging_event_exception`;
CREATE TABLE `logging_event_exception` (
  `event_id` bigint(20) NOT NULL,
  `i` smallint(6) NOT NULL,
  `trace_line` varchar(254) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`event_id`,`i`),
  CONSTRAINT `logging_event_exception_ibfk_1` FOREIGN KEY (`event_id`) REFERENCES `logging_event` (`event_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
--  Table structure for `logging_event_property`
-- ----------------------------
DROP TABLE IF EXISTS `logging_event_property`;
CREATE TABLE `logging_event_property` (
  `event_id` bigint(20) NOT NULL,
  `mapped_key` varchar(254) COLLATE utf8_bin NOT NULL,
  `mapped_value` text COLLATE utf8_bin,
  PRIMARY KEY (`event_id`,`mapped_key`),
  CONSTRAINT `logging_event_property_ibfk_1` FOREIGN KEY (`event_id`) REFERENCES `logging_event` (`event_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

SET FOREIGN_KEY_CHECKS = 1;
