/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.27 : Database - zhibo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`zhibo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `zhibo`;

/*Table structure for table `company` */

DROP TABLE IF EXISTS `company`;

CREATE TABLE `company` (
  `company_id` int(255) NOT NULL COMMENT '学院唯一标识号',
  `company_name` varchar(500) DEFAULT NULL COMMENT '学院名称',
  PRIMARY KEY (`company_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `company` */

insert  into `company`(`company_id`,`company_name`) values (1,'现代教育中心'),(2,'学生处'),(3,'信息科学与技术学院'),(4,'机电工程学校'),(5,'城乡建设学院'),(6,'理学院'),(7,'艺术学院'),(8,'外国语学院');

/*Table structure for table `live` */

DROP TABLE IF EXISTS `live`;

CREATE TABLE `live` (
  `l_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '直播唯一标识符',
  `l_name` varchar(100) DEFAULT NULL COMMENT '直播展示名字',
  `l_password` varchar(500) DEFAULT NULL COMMENT '直播的密码',
  `l_description` varchar(2000) DEFAULT NULL COMMENT '直播介绍',
  `l_create_by` int(255) DEFAULT NULL COMMENT '直播创建人',
  `l_create_date` date DEFAULT NULL COMMENT '申请直播的时间',
  `l_url` varchar(1000) DEFAULT NULL COMMENT '直播的',
  `l_level` varchar(100) DEFAULT NULL COMMENT '直播类型',
  `l_status` int(11) DEFAULT '0' COMMENT '直播状态，0，未开始，1直播中，2结束',
  `l_date` datetime DEFAULT NULL COMMENT '直播时间',
  PRIMARY KEY (`l_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `live` */

insert  into `live`(`l_id`,`l_name`,`l_password`,`l_description`,`l_create_by`,`l_create_date`,`l_url`,`l_level`,`l_status`,`l_date`) values (1,'王老师数学讲堂','王五','王老师数学讲堂',2,'2019-05-22','rtmp://oflaDemo1/math','数学',2,'2019-06-01 14:30:00'),(2,'张老师计算机组成原理','张三','张老师计算机组成原理',1,'2019-05-22','rtmp://oflaDemo1/computer','计算机',0,'2019-05-30 09:40:00'),(3,'康老师大学物理','康国立','康老师大学物理',3,'2019-05-23','rtmp://oflaDemo1/physic','物理',0,'2019-05-23 14:00:00'),(4,'李老师大学统计学','李四','李老师大学统计学',2,'2019-05-22','rtmp://oflaDemo1/computetere','统计学',1,'2019-05-22 19:55:46'),(5,'直播测试','live','这是直播测试的第一个',1,'2019-05-30','http://localhost:5080/oflaDemo/live.html','直播测试',1,'2019-05-30 18:33:48'),(6,'毕业设计直播演示','live','这个直播是我提前申请的直播，将要在答辩时，给各位老师演示直播功能，希望各位老师提出宝贵的意见。',1,'2019-05-31','http://localhost:5080/oflaDemo/live.html','答辩直播',1,'2019-06-01 08:00:00');

/*Table structure for table `office` */

DROP TABLE IF EXISTS `office`;

CREATE TABLE `office` (
  `Oid` int(255) NOT NULL AUTO_INCREMENT COMMENT 'office表的主键',
  `office_name` varchar(500) NOT NULL COMMENT '系的名称',
  `company_id` int(255) NOT NULL COMMENT '所属学院的id',
  `office_id` int(255) NOT NULL COMMENT '系的唯一标识号',
  PRIMARY KEY (`Oid`),
  KEY `FKqfmw2uo0g1kab0x3fb0uq5wkw` (`company_id`),
  CONSTRAINT `FKqfmw2uo0g1kab0x3fb0uq5wkw` FOREIGN KEY (`company_id`) REFERENCES `company` (`company_id`),
  CONSTRAINT `学院的唯一标识号` FOREIGN KEY (`company_id`) REFERENCES `company` (`company_id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

/*Data for the table `office` */

insert  into `office`(`Oid`,`office_name`,`company_id`,`office_id`) values (1,'网络中心',1,1),(2,'电教中心',1,2),(3,'学生管理处',2,1),(4,'计算机科学系',3,1),(5,'网络工程系',3,2),(6,'电子信息科学系',3,3),(7,'农业机械化系',4,1),(8,'机械工程系',4,2),(9,'电气工程系',4,3),(10,'信息技术教育系',3,4),(11,'水利工程系',5,1),(12,'土木工程系',5,2),(13,'工程管理系',5,3),(14,'建筑系',5,4),(15,'市政与环境工程系',5,5),(16,'城乡规划系',5,6),(17,'化学系',6,1),(18,'数学系',6,2),(19,'物理系',6,3),(20,'艺术设计系',7,1),(21,'英语系',8,1),(22,'日语系',8,2),(23,'小语种系',8,3);

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `name` varchar(64) DEFAULT NULL,
  `no` varchar(64) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  `office_id` int(11) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `create_by` varchar(32) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `level` int(11) NOT NULL DEFAULT '1' COMMENT '级别设置，管理员0，教师1默认为0',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `sys_user` */

insert  into `sys_user`(`user_id`,`username`,`password`,`name`,`no`,`company_id`,`office_id`,`email`,`phone`,`create_by`,`create_time`,`level`) values (1,'admin01','1234','廉阔','01',1,1,'liankuo@qq.com','123456789','0',NULL,1),(2,'admin02','1234','马港','02',1,1,'magang@qq.com','187123457719','0',NULL,0),(3,'gaomengbo','1234','高孟波','101',23,12,'gaomengbo@qq.com','18713269181','1',NULL,1),(4,'1','1234','小管理',NULL,0,0,NULL,NULL,NULL,NULL,0),(6,'01','1234','王继业',NULL,0,0,NULL,NULL,NULL,NULL,0),(9,'xuhong','1234','徐宏','03',22,12,'xuhong@qq.com','18713269181','4','2019-05-18',1),(10,'zhangsan','1234','张三','04',45,1,'zhangsan@qq.com','18713269181','4','2019-05-18',1),(11,'wangwu','1234','王五','06',12,22,'wangwu@qq.com','18713269181','4','2019-05-18',1),(13,'chengfei','1234','程菲儿','13',3,2,'chengfei@163.com','187321412414',NULL,NULL,1),(14,'masan','1234','马三立',NULL,NULL,NULL,NULL,NULL,NULL,NULL,1),(15,'masan','1234','马三立',NULL,NULL,NULL,NULL,NULL,NULL,NULL,1);

/*Table structure for table `video` */

DROP TABLE IF EXISTS `video`;

CREATE TABLE `video` (
  `v_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '视频唯一标识符',
  `v_name` varchar(100) DEFAULT NULL COMMENT '表示名字',
  `v_realname` varchar(200) DEFAULT NULL COMMENT '真实的名字',
  `v_description` varchar(2000) DEFAULT NULL COMMENT '视频介绍',
  `v_create_by` int(255) DEFAULT NULL COMMENT '创建人id',
  `v_create_date` date DEFAULT NULL COMMENT '创建时间',
  `v_url` varchar(500) DEFAULT NULL COMMENT '本地存储真实位置',
  `v_level` varchar(100) DEFAULT NULL COMMENT '类型',
  `v_vreate_date` date DEFAULT NULL,
  PRIMARY KEY (`v_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `video` */

insert  into `video`(`v_id`,`v_name`,`v_realname`,`v_description`,`v_create_by`,`v_create_date`,`v_url`,`v_level`,`v_vreate_date`) values (1,'一出好戏','一出好戏','黄渤主演',1,'2019-05-22','D://video','1','1901-02-01'),(2,'亮剑','亮剑','李云龙',2,'2019-05-21','D://video','2','1901-02-01'),(3,'我心所向','我心所向','碧昂丝',1,'2019-05-22','D://video','1','1901-02-01'),(4,'战狼2','战狼2','吴京',1,'2019-05-18','D://video/movie','1','1901-02-01'),(5,'测试1','test1','这是测试用的',1,'2019-05-30','http://localhost:5080/oflaDemo/test.html','1','1901-02-01'),(6,'印度舞曲','video1','这是在音悦台上下载下来的印度的舞曲，适合很多的舞蹈，也很好听。',4,'2019-05-31','http://localhost:5080/oflaDemo/video1.html','2','1901-02-01'),(7,'Love Story','video2','网易云音乐上下载的MV，这首歌曲是美国著名的歌手泰勒斯威夫特唱的，深受广大音乐发烧友喜欢',5,'2019-05-30','http://localhost:5080/oflaDemo/video2.html','4','1901-02-01'),(8,'Blank Space','video3','歌手Taylor Swift,泰勒·斯威夫特（Taylor Swift），1989年12月13日出生于美国宾夕法尼亚州，美国流行音乐、乡村音乐创作型女歌手、音乐制作人、演员、慈善家。岁时，泰勒随家人搬到宾夕法尼亚州的怀奥米辛；10岁时，泰勒开始写歌，并在卡拉OK大赛、节日以及家乡周围一带演唱，她撰写了一篇350页的小说，但未出版；',2,'2019-05-31','http://localhost:5080/oflaDemo/video3.html','5','1901-02-01'),(10,'video2','video2','123123',4,NULL,'http://localhost:5080/oflaDemo/video2.html','13212','2019-06-01'),(11,'test',NULL,NULL,NULL,NULL,NULL,NULL,'2020-03-01'),(12,'test',NULL,NULL,NULL,NULL,NULL,NULL,'2020-03-01');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
