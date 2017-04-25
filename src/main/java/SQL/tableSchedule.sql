drop TABLE `schedule`;
CREATE TABLE `schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL COMMENT '用户ID',
  `cid` int(11) NOT NULL COMMENT '课程ID',
  `shareCode`  varchar(32) NOT NULL COMMENT '分享码',
  `city`  varchar(32) NULL COMMENT '定位城市',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;