drop TABLE `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course`  varchar(32) NOT NULL COMMENT '课程名',
  `location`  varchar(32) NOT NULL COMMENT '上课地点',
  `teacher`  varchar(32) NOT NULL COMMENT '教师',
  `week_day` int(1) NOT NULL COMMENT '星期',
  `week_string`  varchar(32) NOT NULL COMMENT '上课周提示',
  `section_length` int(2) NOT NULL COMMENT '课程节数',
  `section_start` int(2) NOT NULL COMMENT '开始上课节数',
  `section_end` int(2) NOT NULL COMMENT '结束上课节数',
  `week`  varchar(32) NOT NULL COMMENT '上课周',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;