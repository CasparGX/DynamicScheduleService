drop TABLE `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course` text NOT NULL COMMENT '课程名',
  `location` text NOT NULL COMMENT '上课地点',
  `teacher` text NOT NULL COMMENT '教师',
  `weekDay` int(1) NOT NULL COMMENT '星期',
  `weekString` text NOT NULL COMMENT '上课周提示',
  `sectionLength` int(2) NOT NULL COMMENT '课程节数',
  `sectionStart` int(2) NOT NULL COMMENT '开始上课节数',
  `sectionEnd` int(2) NOT NULL COMMENT '结束上课节数',
  `week` text NOT NULL COMMENT '上课周',
  `shareCode` text NOT NULL COMMENT '分享码',
  `city` text NOT NULL COMMENT '定位城市',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;