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
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50711
 File Encoding         : utf-8

 Date: 10/11/2017 15:25:24 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

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

SET FOREIGN_KEY_CHECKS = 1;
