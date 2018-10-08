DROP TABLE IF EXISTS `items`;
DROP TABLE IF EXISTS `orders`;
DROP TABLE IF EXISTS `user`;
DROP TABLE IF EXISTS `orderdetail`;
/*items是商品表*/
CREATE TABLE `items` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(32) NOT NULL COMMENT '商品名称',
  `price` FLOAT(10,1) NOT NULL COMMENT '商品定价',
  `detail` TEXT COMMENT '商品描述',
  `pic` VARCHAR(64) DEFAULT NULL COMMENT '商品图片',
  `createtime` DATETIME NOT NULL COMMENT '生产日期',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
INSERT INTO `items` VALUES (4, '笔记本', 5099.0, '华硕FH5900', '1.jpg', '2018-9-3 14:57:58');
INSERT INTO `items` VALUES (5, '玫瑰', 9.9, '红玫瑰', '2.jpg', '2018-9-4 14:59:14');
INSERT INTO `items` VALUES (6, '羽扇', 344.0, '诸葛牌羽扇', '3.jpg', '2018-9-14 15:00:09');
INSERT INTO `items` VALUES (7, '玩具手枪', 39.0, '黄河手枪', '4.jpg', '2018-9-12 15:00:56');
INSERT INTO `items` VALUES (8, '忘情水', 99999.0, '遗忘今生水', '5.jpg', '2018-9-20 15:01:34');
INSERT INTO `items` VALUES (9, '战国策', 599.0, '人民出版社', '6.jpg', '2018-9-10 15:02:10');

/*user是用户表*/
CREATE TABLE `user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(32) NOT NULL COMMENT '用户名称',
  `birthday` DATE DEFAULT NULL COMMENT '生日',
  `gender` CHAR(1) DEFAULT NULL COMMENT '性别',
  `address` VARCHAR(256) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
INSERT INTO `user` VALUES (27, '小明', '2018-9-11', '男', '湖南娄底');
INSERT INTO `user` VALUES (28, '小云', '2018-9-3', '女', '湖南长沙');
INSERT INTO `user` VALUES (29, '杜甫', '1999-9-5', '男', '河南巩义');
INSERT INTO `user` VALUES (30, '屈原', '2018-9-18', '男', '湖北宜昌');

/*orders是订单表*/
CREATE TABLE `orders` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL COMMENT '下单用户id',
  `number` VARCHAR(32) NOT NULL COMMENT '订单号',
  `createtime` DATETIME NOT NULL COMMENT '创建订单时间',
  `note` VARCHAR(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `FK_orders_1` (`user_id`),
  CONSTRAINT `FK_orders_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=INNODB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
INSERT INTO `orders` VALUES (6, 27, '000001', '2018-9-19 15:05:28', '笔记本');
INSERT INTO `orders` VALUES (7, 28, '000002', '2018-9-19 15:06:00', '玫瑰');
INSERT INTO `orders` VALUES (8, 30, '000003', '2018-9-12 15:06:25', '忘情水');
INSERT INTO `orders` VALUES (9, 28, '000005', '2018-9-11 15:06:59', '玩具手枪');
INSERT INTO `orders` VALUES (10, 29, '000006', '2018-9-10 15:08:00', '战国策');
INSERT INTO `orders` VALUES (11, 27, '000004', '2018-9-4 15:08:32', '羽扇');

/*orderdetail是订单明细表*/
DROP TABLE IF EXISTS orderdetail;
CREATE TABLE `orderdetail` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `orders_id` INT(11) NOT NULL COMMENT '订单id',
  `items_id` INT(11) NOT NULL COMMENT '商品id',
  `items_num` INT(11) DEFAULT NULL COMMENT '商品购买数量',
  PRIMARY KEY (`id`),
  KEY `FK_orderdetail_1` (`orders_id`),
  KEY `FK_orderdetail_2` (`items_id`),
  CONSTRAINT `FK_orderdetail_1` FOREIGN KEY (`orders_id`) REFERENCES `orders` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_orderdetail_2` FOREIGN KEY (`items_id`) REFERENCES `items` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
INSERT INTO `orderdetail` VALUES (5, 6, 4, 1);
INSERT INTO `orderdetail` VALUES (6, 7, 5, 222);
INSERT INTO `orderdetail` VALUES (8, 8, 6, 44);
INSERT INTO `orderdetail` VALUES (9, 9, 7, 23);
INSERT INTO `orderdetail` VALUES (10, 10, 8, 45);
INSERT INTO `orderdetail` VALUES (11, 11, 9, 34);