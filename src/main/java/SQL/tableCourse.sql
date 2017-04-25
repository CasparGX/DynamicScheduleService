drop TABLE `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course`  varchar(32) NOT NULL COMMENT '课程名',
  `location`  varchar(32) NOT NULL COMMENT '上课地点',
  `teacher`  varchar(32) NOT NULL COMMENT '教师',
  `weekDay` int(1) NOT NULL COMMENT '星期',
  `weekString`  varchar(32) NOT NULL COMMENT '上课周提示',
  `sectionLength` int(2) NOT NULL COMMENT '课程节数',
  `sectionStart` int(2) NOT NULL COMMENT '开始上课节数',
  `sectionEnd` int(2) NOT NULL COMMENT '结束上课节数',
  `week`  varchar(32) NOT NULL COMMENT '上课周',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;