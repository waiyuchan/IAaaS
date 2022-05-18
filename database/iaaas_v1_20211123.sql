/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : iaaas

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 23/11/2021 06:03:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ac_access_card
-- ----------------------------
DROP TABLE IF EXISTS `ac_access_card`;
CREATE TABLE `ac_access_card` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '门禁权限id，自增',
  `user_id` int(10) unsigned zerofill NOT NULL COMMENT '用户id',
  `username` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户账户名',
  `ac_access_id` int(10) unsigned zerofill NOT NULL COMMENT '门禁权限id',
  `room_id` int(10) unsigned zerofill NOT NULL COMMENT '房间id',
  `face_info` text COLLATE utf8mb4_general_ci COMMENT '人脸信息',
  `access_password` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '门禁密码',
  `status` tinyint NOT NULL COMMENT '状态，0: 生效，1: 失效',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`),
  KEY `user_access_card_fgk` (`user_id`),
  KEY `user_access_control_fgk` (`ac_access_id`),
  KEY `room_access_control_fgk` (`room_id`),
  CONSTRAINT `room_access_control_fgk` FOREIGN KEY (`room_id`) REFERENCES `ac_room` (`id`),
  CONSTRAINT `user_access_card_fgk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `user_access_control_fgk` FOREIGN KEY (`ac_access_id`) REFERENCES `ac_public_access_control` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='公寓门禁卡';

-- ----------------------------
-- Table structure for ac_access_record
-- ----------------------------
DROP TABLE IF EXISTS `ac_access_record`;
CREATE TABLE `ac_access_record` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '门禁权限id，自增',
  `access_card_id` int(10) unsigned zerofill NOT NULL COMMENT '门禁卡id',
  `public_access_control_id` int unsigned DEFAULT NULL COMMENT '公共门禁id',
  `room_access_control_id` int unsigned DEFAULT NULL COMMENT '房间门禁id',
  `operate_type` tinyint NOT NULL COMMENT '操作类型，0: 进门，1: 出门',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`),
  KEY `access_card_record_fgk` (`access_card_id`),
  KEY `public_access_record_fgk` (`public_access_control_id`),
  KEY `room_access_record_fgk` (`room_access_control_id`),
  CONSTRAINT `access_card_record_fgk` FOREIGN KEY (`access_card_id`) REFERENCES `ac_access_card` (`id`),
  CONSTRAINT `public_access_record_fgk` FOREIGN KEY (`public_access_control_id`) REFERENCES `ac_public_access_control` (`id`),
  CONSTRAINT `room_access_record_fgk` FOREIGN KEY (`room_access_control_id`) REFERENCES `ac_room_access_control` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='公寓进入门禁记录';

-- ----------------------------
-- Table structure for ac_building
-- ----------------------------
DROP TABLE IF EXISTS `ac_building`;
CREATE TABLE `ac_building` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '公寓id，自增',
  `name` varchar(100) CHARACTER SET utf8 NOT NULL COMMENT '公寓名称',
  `eng_name` varchar(100) CHARACTER SET utf8 NOT NULL COMMENT '公寓英文名',
  `address` varchar(150) CHARACTER SET utf8 NOT NULL COMMENT '公寓地址',
  `postcode` varchar(30) CHARACTER SET utf8 NOT NULL COMMENT '公寓邮编',
  `owner` varchar(50) CHARACTER SET utf8 NOT NULL COMMENT '公寓负责人',
  `floor_sum` int unsigned NOT NULL COMMENT '公寓楼层数量',
  `room_sum` int unsigned NOT NULL COMMENT '公寓住房数量',
  `status` tinyint unsigned NOT NULL COMMENT '状态，0: 正常，1: 已注销',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`),
  KEY `owner` (`owner`),
  CONSTRAINT `owner` FOREIGN KEY (`owner`) REFERENCES `user` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='公寓楼';

-- ----------------------------
-- Table structure for ac_contract
-- ----------------------------
DROP TABLE IF EXISTS `ac_contract`;
CREATE TABLE `ac_contract` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '合同id，自增',
  `c_unicode` varchar(100) COLLATE utf8mb4_general_ci NOT NULL COMMENT '合同唯一标识码',
  `room_id` int(10) unsigned zerofill NOT NULL COMMENT '房间id',
  `user_id` int(10) unsigned zerofill NOT NULL COMMENT '用户id',
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户账户名',
  `fee_status` tinyint unsigned NOT NULL COMMENT '费用状态， 0: 未支付，1: 部分支付，2: 已支付',
  `fee_order_id` int(10) unsigned zerofill NOT NULL COMMENT '付费账单id',
  `is_transfer` tinyint unsigned NOT NULL COMMENT '是否转移，0: 已转移，1: 未转移',
  `pre_tenant` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '转移前租户',
  `is_renew` tinyint unsigned NOT NULL COMMENT '是否续签，，0: 已续签，1: 未续签',
  `pre_contract_id` int(10) unsigned zerofill NOT NULL COMMENT '续签前合同id',
  `contract_file_url` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '合同文件地址',
  `status` tinyint unsigned NOT NULL COMMENT '状态，0: 已创建，未签署，1: 签署中，2:已签署，未支付，3：已支付，合同已生效，4: 合同已转移，本合同失效，5: 合同已续签，本合同失效',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`),
  KEY `room_fgk` (`room_id`),
  KEY `user_room_fgk` (`user_id`),
  KEY `order_room_fgk` (`fee_order_id`),
  CONSTRAINT `order_room_fgk` FOREIGN KEY (`fee_order_id`) REFERENCES `ac_fee_order` (`id`),
  CONSTRAINT `room_fgk` FOREIGN KEY (`room_id`) REFERENCES `ac_room` (`id`),
  CONSTRAINT `user_room_fgk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='公寓合同';

-- ----------------------------
-- Table structure for ac_deposit_and_withdrawal
-- ----------------------------
DROP TABLE IF EXISTS `ac_deposit_and_withdrawal`;
CREATE TABLE `ac_deposit_and_withdrawal` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '流水记录id',
  `wallet_card_link_id` int(10) unsigned zerofill NOT NULL COMMENT '关联记录id',
  `username` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户账户名',
  `type` tinyint unsigned NOT NULL COMMENT '操作类型，0: 充值，1: 提现',
  `money` int unsigned NOT NULL COMMENT '金额',
  `security_code` varchar(10) COLLATE utf8mb4_general_ci NOT NULL COMMENT '银行卡安全码',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`),
  KEY `wallet_card_link_fgk` (`wallet_card_link_id`),
  CONSTRAINT `wallet_card_link_fgk` FOREIGN KEY (`wallet_card_link_id`) REFERENCES `ac_wallet_card_link` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='公寓住户充值提现流水';

-- ----------------------------
-- Table structure for ac_express
-- ----------------------------
DROP TABLE IF EXISTS `ac_express`;
CREATE TABLE `ac_express` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '物流记录id，自增',
  `track_number` varchar(50) COLLATE utf8mb4_general_ci NOT NULL COMMENT '快递单号',
  `express_company` varchar(50) COLLATE utf8mb4_general_ci NOT NULL COMMENT '快递公司',
  `sender` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '寄件人',
  `sender_address` varchar(100) COLLATE utf8mb4_general_ci NOT NULL COMMENT '寄件人地址',
  `sender_mobile_phone` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '寄件人手机号码',
  `sender_mail` varchar(50) COLLATE utf8mb4_general_ci NOT NULL COMMENT '寄件人邮箱',
  `recipient` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '收件人',
  `recipient_address` varchar(100) COLLATE utf8mb4_general_ci NOT NULL COMMENT '收件人地址',
  `recipient_mobile_phone` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '收件人手机号码',
  `recipient_mail` varchar(50) COLLATE utf8mb4_general_ci NOT NULL COMMENT '收件人邮箱',
  `signer` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '签收人',
  `signer_contact` varchar(50) COLLATE utf8mb4_general_ci NOT NULL COMMENT '签收人联系方式',
  `send_time` datetime NOT NULL COMMENT '寄出时间，格式为: 2021-12-31 00:00:00',
  `arrive_time` datetime NOT NULL COMMENT '到达时间，格式为: 2021-12-31 00:00:00',
  `sign_time` datetime NOT NULL COMMENT '签收时间，格式为: 2021-12-31 00:00:00',
  `express_fee` int unsigned NOT NULL COMMENT '快递费用',
  `is_paid` tinyint unsigned NOT NULL COMMENT '是否已支付',
  `express_records` text COLLATE utf8mb4_general_ci NOT NULL COMMENT '物流记录',
  `status` tinyint unsigned NOT NULL COMMENT '状态，0: 已下单，未支付, 1: 已支付，未发货, 2: 已发货，运输中, 3: 已到达，未签收, 4: 已签收',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='公寓物流信息';

-- ----------------------------
-- Table structure for ac_fee_order
-- ----------------------------
DROP TABLE IF EXISTS `ac_fee_order`;
CREATE TABLE `ac_fee_order` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '账单id，自增',
  `room_id` int(10) unsigned zerofill NOT NULL COMMENT '房间id',
  `user_id` int(10) unsigned zerofill NOT NULL COMMENT '用户id',
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户账户名',
  `order_title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '账单标题',
  `order_detail` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '账单明细',
  `order_flow_records` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '流水记录列表',
  `amounts_payable` int NOT NULL DEFAULT '0' COMMENT '应付金额，单位为分',
  `arrears` int NOT NULL DEFAULT '0' COMMENT '欠费金额，单位为分',
  `status` tinyint unsigned NOT NULL DEFAULT '0' COMMENT '状态，0: 未支付，1: 部分支付，2: 已支付',
  `deadline` date NOT NULL COMMENT '截止日期，格式为: 2021-12-31',
  `payment_time` datetime NOT NULL COMMENT '支付时间，格式为: 2021-12-31 00:00:00',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`),
  KEY `room_order_fgk` (`room_id`),
  KEY `user_order_fgk` (`user_id`),
  CONSTRAINT `room_order_fgk` FOREIGN KEY (`room_id`) REFERENCES `ac_room` (`id`),
  CONSTRAINT `user_order_fgk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='公寓费用账单';

-- ----------------------------
-- Table structure for ac_invoice
-- ----------------------------
DROP TABLE IF EXISTS `ac_invoice`;
CREATE TABLE `ac_invoice` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '发票id，自增',
  `fee_order_id` int(10) unsigned zerofill NOT NULL COMMENT '费用账单id',
  `user_id` int(10) unsigned zerofill NOT NULL COMMENT '发票申请人id',
  `username` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '发票申请人id账户名',
  `machine_code` varchar(100) COLLATE utf8mb4_general_ci NOT NULL COMMENT '机器编号',
  `invoice_code` varchar(100) COLLATE utf8mb4_general_ci NOT NULL COMMENT '发票代码',
  `invoice_number` varchar(100) COLLATE utf8mb4_general_ci NOT NULL COMMENT '发票号码',
  `check_code` varchar(100) COLLATE utf8mb4_general_ci NOT NULL COMMENT '校验码',
  `entry` varchar(50) COLLATE utf8mb4_general_ci NOT NULL COMMENT '条目',
  `unit` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '单位',
  `quantity` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '数量',
  `price` int unsigned NOT NULL COMMENT '单价，单位为分',
  `invoice_fee` int unsigned NOT NULL COMMENT '金额，单位为分',
  `tax_rate` float unsigned NOT NULL COMMENT '税率，保留小数点后',
  `tax_fee` int unsigned NOT NULL COMMENT '税额，单位为分',
  `amount` int unsigned NOT NULL COMMENT '发票总额，单位为分',
  `capitalized_amout` varchar(50) COLLATE utf8mb4_general_ci NOT NULL COMMENT '发票总额大写',
  `remark` varchar(0) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '发票备注',
  `payee_name` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '收款人姓名',
  `reviewer` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '复核人姓名',
  `invoice_person_name` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '开票人姓名',
  `billing_party_name` varchar(50) COLLATE utf8mb4_general_ci NOT NULL COMMENT '开票方名称',
  `taxpayer_identify_number` varchar(50) COLLATE utf8mb4_general_ci NOT NULL COMMENT '开票方纳税人识别号',
  `billing_party_address_and_telephone` varchar(150) COLLATE utf8mb4_general_ci NOT NULL COMMENT '开票方地址&电话',
  `account_bank_and_phone_number` varchar(100) COLLATE utf8mb4_general_ci NOT NULL COMMENT '开票方开户行及电话',
  `invoice_file_url` text COLLATE utf8mb4_general_ci NOT NULL COMMENT '发票文件地址',
  `status` tinyint unsigned NOT NULL DEFAULT '0' COMMENT '状态，0: 开票中，1: 已开票，2: 开票异常',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`),
  KEY `fee_order_invoice_fgk` (`fee_order_id`),
  KEY `user_invoice_fgk` (`user_id`),
  CONSTRAINT `fee_order_invoice_fgk` FOREIGN KEY (`fee_order_id`) REFERENCES `ac_fee_order` (`id`),
  CONSTRAINT `user_invoice_fgk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='发票记录';

-- ----------------------------
-- Table structure for ac_public_access_control
-- ----------------------------
DROP TABLE IF EXISTS `ac_public_access_control`;
CREATE TABLE `ac_public_access_control` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '门禁权限id，自增',
  `ac_id` int(10) unsigned zerofill NOT NULL COMMENT '公寓id',
  `status` tinyint NOT NULL COMMENT '状态，0: 未启用，1: 已启用',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`),
  KEY `ac_access_fkg` (`ac_id`),
  CONSTRAINT `ac_access_fkg` FOREIGN KEY (`ac_id`) REFERENCES `ac_building` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='公寓门禁权限';

-- ----------------------------
-- Table structure for ac_room
-- ----------------------------
DROP TABLE IF EXISTS `ac_room`;
CREATE TABLE `ac_room` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '房间id，自增',
  `ac_id` int(10) unsigned zerofill NOT NULL COMMENT '所属公寓id',
  `room_num` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '房间号',
  `sub_room_num` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '子房间号',
  `type` tinyint unsigned NOT NULL COMMENT '房间类型',
  `floor` int NOT NULL COMMENT '所在楼层',
  `materials` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '配套物料列表',
  `status` tinyint unsigned NOT NULL DEFAULT '0' COMMENT '状态，0: 正常，1: 异常',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`),
  KEY `ac_fgk` (`ac_id`),
  CONSTRAINT `ac_fgk` FOREIGN KEY (`ac_id`) REFERENCES `ac_building` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='公寓房间';

-- ----------------------------
-- Table structure for ac_room_access_control
-- ----------------------------
DROP TABLE IF EXISTS `ac_room_access_control`;
CREATE TABLE `ac_room_access_control` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '门禁权限id，自增',
  `room_id` int(10) unsigned zerofill NOT NULL COMMENT '房间id',
  `ac_id` int unsigned NOT NULL COMMENT '公寓id',
  `status` tinyint NOT NULL COMMENT '状态，0: 未启用，1: 已启用',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`),
  KEY `ac_access_fkg` (`room_id`),
  KEY `ac_room_access_control_ac_fgk` (`ac_id`),
  CONSTRAINT `ac_room_access_control_ac_fgk` FOREIGN KEY (`ac_id`) REFERENCES `ac_building` (`id`),
  CONSTRAINT `ac_room_access_control_fgk` FOREIGN KEY (`room_id`) REFERENCES `ac_room` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='公寓房间门禁权限';

-- ----------------------------
-- Table structure for ac_transaction
-- ----------------------------
DROP TABLE IF EXISTS `ac_transaction`;
CREATE TABLE `ac_transaction` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '流水记录id，自增',
  `transaction_id` int(10) unsigned zerofill NOT NULL COMMENT '流水号',
  `user_id` int(10) unsigned zerofill NOT NULL COMMENT '用户id',
  `username` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户账户名',
  `trans_detail` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '流水明细',
  `trans_property` tinyint unsigned NOT NULL COMMENT '流水性质，0: 付款，1: 退款',
  `fee_type` tinyint unsigned NOT NULL COMMENT '费用类型，0: Bill，1: 住宿费，2: 场地租赁费',
  `payment_channel` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '付款渠道，0: 用户余额，1: 银行卡',
  `trans_amount` int unsigned NOT NULL COMMENT '交易金额，单位为分',
  `payer_account` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '付款方账户',
  `payer_name` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '付款方名称',
  `payer_institution` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '付款方所属机构',
  `recipient_account` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '收款方账户',
  `recipient_name` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '收款方名称',
  `recipient_institution` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '收款方所属机构',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`),
  KEY `user_transcation_fgk` (`user_id`),
  CONSTRAINT `user_transcation_fgk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='公寓交易流水明细';

-- ----------------------------
-- Table structure for ac_wallet
-- ----------------------------
DROP TABLE IF EXISTS `ac_wallet`;
CREATE TABLE `ac_wallet` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '合同id，自增',
  `user_id` int(10) unsigned zerofill NOT NULL COMMENT '用户id',
  `username` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户账户名',
  `balance` int unsigned NOT NULL DEFAULT '0' COMMENT '钱包余额，单位为分',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`),
  KEY `user_wallet_fgk` (`user_id`),
  CONSTRAINT `user_wallet_fgk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='公寓住户个人钱包';

-- ----------------------------
-- Table structure for ac_wallet_card_link
-- ----------------------------
DROP TABLE IF EXISTS `ac_wallet_card_link`;
CREATE TABLE `ac_wallet_card_link` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '关联记录id，自增',
  `wallet_id` int(10) unsigned zerofill NOT NULL COMMENT '钱包id',
  `user_id` int(10) unsigned zerofill NOT NULL COMMENT '用户id',
  `username` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户账户名',
  `card_number` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '银行卡号',
  `security_code` varchar(10) COLLATE utf8mb4_general_ci NOT NULL COMMENT '银行卡安全码',
  `bank` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '所属银行',
  `card_owner_name` varchar(30) COLLATE utf8mb4_general_ci NOT NULL COMMENT '持卡人姓名',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`),
  KEY `wallet_link_fgk` (`wallet_id`),
  KEY `user_link_fgk` (`user_id`),
  CONSTRAINT `user_link_fgk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `wallet_link_fgk` FOREIGN KEY (`wallet_id`) REFERENCES `ac_wallet` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='公寓住户钱包银行卡关联';

-- ----------------------------
-- Table structure for loc_area
-- ----------------------------
DROP TABLE IF EXISTS `loc_area`;
CREATE TABLE `loc_area` (
  `id` int NOT NULL AUTO_INCREMENT,
  `country_id` int DEFAULT NULL,
  `code` int DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lower_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='地点-地区';

-- ----------------------------
-- Table structure for loc_cities
-- ----------------------------
DROP TABLE IF EXISTS `loc_cities`;
CREATE TABLE `loc_cities` (
  `id` smallint unsigned NOT NULL AUTO_INCREMENT,
  `state_id` smallint NOT NULL COMMENT '所属州省代码',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `cname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `lower_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `code_full` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '地区代码',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `cities_state_id_index` (`state_id`) USING BTREE,
  KEY `cities_code_index` (`code_full`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=3796 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC COMMENT='地点-城市';

-- ----------------------------
-- Table structure for loc_continents
-- ----------------------------
DROP TABLE IF EXISTS `loc_continents`;
CREATE TABLE `loc_continents` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `name` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '英文名',
  `cname` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '中文名',
  `lower_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='地点-大陆';

-- ----------------------------
-- Table structure for loc_countries
-- ----------------------------
DROP TABLE IF EXISTS `loc_countries`;
CREATE TABLE `loc_countries` (
  `id` smallint unsigned NOT NULL AUTO_INCREMENT,
  `continent_id` int DEFAULT NULL,
  `code` char(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '地区代码',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '名称',
  `full_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `cname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `full_cname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `lower_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `remark` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `countries_code_index` (`code`) USING BTREE,
  KEY `continens` (`continent_id`)
) ENGINE=MyISAM AUTO_INCREMENT=241 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC COMMENT='地点-国家，数据来源：https://github.com/wizardcode/world-area';

-- ----------------------------
-- Table structure for loc_regions
-- ----------------------------
DROP TABLE IF EXISTS `loc_regions`;
CREATE TABLE `loc_regions` (
  `id` smallint unsigned NOT NULL AUTO_INCREMENT,
  `city_id` smallint NOT NULL COMMENT '所属城市代码',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `cname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '名称',
  `lower_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `code_full` char(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '地区代码',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `regions_city_id_index` (`city_id`) USING BTREE,
  KEY `regions_code_index` (`code_full`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=2743 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC COMMENT='地点-地区';

-- ----------------------------
-- Table structure for loc_states
-- ----------------------------
DROP TABLE IF EXISTS `loc_states`;
CREATE TABLE `loc_states` (
  `id` smallint unsigned NOT NULL AUTO_INCREMENT,
  `country_id` smallint NOT NULL COMMENT '所属国家代码',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `cname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `lower_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `code_full` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `area_id` int DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `states_country_id_index` (`country_id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=270 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC COMMENT='地点-省/州';

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '用户id，自增',
  `type` tinyint unsigned NOT NULL COMMENT '用户类型，0: 管理者，1: 员工，2: 租户',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账户名，每个用户唯一',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码，加密存储',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `eng_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '英文名，非必填，如无可为空',
  `birthday` date NOT NULL COMMENT '出生年月日，格式为: 2000-01-01',
  `birthplace` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '出生地',
  `nationality` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '国籍',
  `cert_type` varchar(10) COLLATE utf8mb4_general_ci NOT NULL COMMENT '证件类型',
  `cert_number` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '证件号码',
  `email` varchar(50) CHARACTER SET utf8 NOT NULL COMMENT '电子邮箱',
  `mobile_phone` varchar(30) CHARACTER SET utf8 DEFAULT NULL COMMENT '手机号码',
  `address` varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '家庭住址',
  `postcode` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '邮政编码',
  `institution` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所属机构',
  `status` tinyint(3) unsigned zerofill NOT NULL DEFAULT '000' COMMENT '状态，0: 正常，1: 已注销',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，格式为: 2021-12-31 00:00:00',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间，格式为: 2021-12-31 00:00:00',
  PRIMARY KEY (`id`),
  KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='用户信息';

SET FOREIGN_KEY_CHECKS = 1;
