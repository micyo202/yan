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

 Source Server         : ROOT_192.168.0.200
 Source Server Type    : MySQL
 Source Server Version : 50711
 Source Host           : 192.168.0.200
 Source Database       : yan

 Target Server Type    : MySQL
 Target Server Version : 50711
 File Encoding         : utf-8

 Date: 02/11/2018 11:12:15 AM
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
--  Table structure for `TB_PRODUCT`
-- ----------------------------
DROP TABLE IF EXISTS `TB_PRODUCT`;
CREATE TABLE `TB_PRODUCT` (
  `PRODUCT_CODE` varchar(32) NOT NULL COMMENT '产品代码（主键）',
  `PRODUCT_NAME` varchar(100) DEFAULT NULL COMMENT '产品名称',
  `PRODUCT_PRICE` decimal(10,2) DEFAULT NULL COMMENT '产品价格',
  `PRODUCT_NUM` int(11) DEFAULT NULL COMMENT '产品库存',
  `PRODUCT_USER` varchar(32) DEFAULT NULL COMMENT '操作人员',
  `PRODUCT_DATE` datetime DEFAULT NULL COMMENT '操作时间',
  `PRODUCT_TYPE` varchar(32) DEFAULT NULL COMMENT '产品类型',
  `PRODUCT_STATUS` tinyint(1) DEFAULT NULL COMMENT '产品状态',
  PRIMARY KEY (`PRODUCT_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品信息表';

-- ----------------------------
--  Records of `TB_PRODUCT`
-- ----------------------------
BEGIN;
INSERT INTO `TB_PRODUCT` VALUES ('1ba6d11d2639401ebf63c00c5ae7c2a0', '保时捷Cayenne turboS', '3880000.00', '2', 'custom', '2017-08-22 11:14:21', '汽车', '1'), ('1d5b51b6b7a14ea19aca38906ad290c2', '伏特加', '188.00', '60', 'custom', '2017-08-22 11:08:28', '酒水', '1'), ('2c76dbb178ba4907b1016d2d9984173b', '芝华士', '820.00', '100', 'custom', '2017-08-22 11:07:46', '酒水', '1'), ('2ccdbcd58ceb4e0ead96f4211ebe4251', '宾利 慕尚', '4980000.00', '1', 'custom', '2017-08-22 11:17:40', '汽车', '1'), ('369c9bb87098484ab4ed2b964703ce2d', '杰克丹尼', '368.00', '17', 'custom', '2017-08-22 11:08:52', '酒水', '1'), ('422918b835814a60900230bb1c81df93', '茅台', '1288.00', '10', 'admin', '2017-08-21 17:28:11', '酒水', '1'), ('53112a029b4040ae90c1dbd1130f335e', '法拉利 LaFerrari', '22500000.00', '1', 'custom', '2017-08-22 11:19:26', '汽车', '1'), ('58da9da4c3324da585350e756cd6432f', '阿斯顿·马丁DB9', '3070000.00', '6', 'custom', '2017-08-22 11:18:24', '汽车', '1'), ('5dcf5e10ae1246bdb84f6e97f83e0734', '劳斯莱斯 幻影', '8000000.00', '1', 'custom', '2017-08-22 11:20:02', '汽车', '1'), ('80b463c42b53470089d4a1f06f579171', '奥迪A8L w12', '1130000.00', '2', 'admin', '2017-08-22 11:11:47', '汽车', '0'), ('8355a61f5e2747c294161b7384e297a3', '奔驰G65 AMG', '3200000.00', '2', 'custom', '2017-08-22 11:13:03', '汽车', '1'), ('8382585c2119406ba0b098572f929cf7', '五粮液', '880.00', '99', 'admin', '2017-08-21 17:27:07', '酒水', '0'), ('8a74d1b156ed450a93be73b97b0848e7', '宝马750Li 施坦威限量版', '2880000.00', '2', 'custom', '2017-08-22 11:12:36', '汽车', '1'), ('a0f3a141a5fb4de796cd9d49fb3b998d', '兰博基尼 Aventador', '8010000.00', '1', 'custom', '2017-08-22 11:18:58', '汽车', '1'), ('cf6fa3d8128c413abec6de46c0ab0572', '轩尼诗VSOP', '3688.00', '7', 'custom', '2017-08-22 11:08:07', '酒水', '1'), ('eaaabde7661b45d394e6586eaed6dfa6', '玛莎拉蒂 GranCabrio', '3080000.00', '2', 'custom', '2017-08-22 11:16:31', '汽车', '1');
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
INSERT INTO `USER_ROLE_REL` VALUES ('5F6777B085DD4EE7A38DB91A89DB4A86', 'A07E2ADB74BB4387BDB6F2138C56066D', '9976A7FE2D3540E387F47577B1397E57'), ('7FC2634BD87143D4997DC3B97344705C', 'A07E2ADB74BB4387BDB6F2138C56066D', 'CCEC9506B6064F94924E3189BA10CD01'), ('8C80B520B6A64C458384917A2606DAFB', '5350A5DE1AA54D73A8ECCF6CDB1DF57E', 'CCEC9506B6064F94924E3189BA10CD01'), ('90F07CFB601E4EB18037EE0DABAE37C5', 'A07E2ADB74BB4387BDB6F2138C56066D', 'BA1419119EA94537813B1927B774CB80'), ('A07D5739E3AB4F599F96D4A5F8864C82', '431C6C684DC1420E8C1D27F3DA9B0D3E', '9976A7FE2D3540E387F47577B1397E57');
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
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

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
