/*
SQLyog Ultimate v8.32 
MySQL - 5.5.56 : Database - flower
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`flower` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `flower`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `name` varchar(255) DEFAULT NULL COMMENT '管理员账号',
  `pwd` varchar(255) DEFAULT NULL COMMENT '管理员密码'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `Cid` int(10) NOT NULL COMMENT '编号',
  `Commentid` int(10) DEFAULT NULL COMMENT '评论编号',
  `comment` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `user` varchar(255) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`Cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

/*Table structure for table `flower` */

DROP TABLE IF EXISTS `flower`;

CREATE TABLE `flower` (
  `ID` int(10) NOT NULL AUTO_INCREMENT COMMENT '商品编号',
  `name` varchar(16) DEFAULT NULL COMMENT '名称',
  `price` double(9,2) DEFAULT NULL COMMENT '价格',
  `type` varchar(16) DEFAULT NULL COMMENT '种类',
  `commentid` int(10) DEFAULT NULL COMMENT '评论编号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `flower` */

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `OrderId` int(10) NOT NULL AUTO_INCREMENT COMMENT '订单号',
  `time` date DEFAULT NULL COMMENT '订单时间',
  `listid` int(10) DEFAULT NULL COMMENT '订单清单号',
  `price` double(12,2) DEFAULT NULL COMMENT '订单总价',
  PRIMARY KEY (`OrderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order` */

/*Table structure for table `orderlist` */

DROP TABLE IF EXISTS `orderlist`;

CREATE TABLE `orderlist` (
  `listid` int(10) NOT NULL COMMENT '清单编号',
  `lid` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `number` int(4) DEFAULT NULL COMMENT '数量',
  `flower` varchar(255) DEFAULT NULL COMMENT '花',
  `price` double(12,2) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`lid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orderlist` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `userpwd` varchar(255) DEFAULT NULL COMMENT '密码',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `phone` varchar(255) DEFAULT NULL COMMENT '电话',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `photo` varchar(255) DEFAULT NULL COMMENT '头像',
  `introduction` varchar(255) DEFAULT NULL COMMENT '个人简介'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
