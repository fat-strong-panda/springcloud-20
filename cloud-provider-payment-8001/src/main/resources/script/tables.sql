CREATE TABLE `payment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `serial` varchar(200) DEFAULT '' COMMENT '订单流水号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into payment (serial) values ("123456789");