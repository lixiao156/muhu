/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 8.0.19 : Database - menhu
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`menhu` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `menhu`;

/*Table structure for table `channels` */

DROP TABLE IF EXISTS `channels`;

CREATE TABLE `channels` (
  `channel_id` int NOT NULL,
  `channel_name` varchar(30) NOT NULL,
  `notices_id` bigint NOT NULL,
  `channel_parent_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `channels` */

insert  into `channels`(`channel_id`,`channel_name`,`notices_id`,`channel_parent_id`) values (1,'校园新闻',1,0),(2,'高一新闻',2,1),(3,'高二新闻',3,1),(4,'高三新闻',4,1);

/*Table structure for table `contents` */

DROP TABLE IF EXISTS `contents`;

CREATE TABLE `contents` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `notices_id` bigint DEFAULT NULL,
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `contents` */

insert  into `contents`(`id`,`notices_id`,`content`) values (1,1,'塒NG\r\n\Z\n设置图片'),(2,NULL,'新闻内容');

/*Table structure for table `notices` */

DROP TABLE IF EXISTS `notices`;

CREATE TABLE `notices` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `title` varchar(255) NOT NULL,
  `summary` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `author` varchar(30) NOT NULL,
  `createdid` bigint NOT NULL,
  `modifiedid` bigint DEFAULT NULL,
  `createdtime` date NOT NULL,
  `modifiedtime` date DEFAULT NULL,
  `pic` varchar(255) DEFAULT NULL,
  `channels_id` int DEFAULT NULL,
  `parent_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `notices` */

insert  into `notices`(`id`,`name`,`title`,`summary`,`author`,`createdid`,`modifiedid`,`createdtime`,`modifiedtime`,`pic`,`channels_id`,`parent_id`) values (1,'张树中学新闻','2019高考顺利结束','樟树中学校区高考圆满结束','admin',1,1,'2020-07-02','2020-07-02','/pic',1,0),(2,'Mingzi','标题','zhaiyao','lisi',1,NULL,'2020-07-02',NULL,NULL,1,NULL),(3,'Mingzi','标题','zhaiyao','lisi',1,NULL,'2020-07-02',NULL,NULL,1,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
