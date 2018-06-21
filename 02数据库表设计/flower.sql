/*
SQLyog Ultimate v8.32 
MySQL - 5.5.27 : Database - flower
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

insert  into `admin`(`name`,`pwd`) values ('admin','admin'),('nb','nbnb');

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

insert  into `comment`(`Cid`,`Commentid`,`comment`,`user`) values (1,1,'植物花卉01的评论','wqm01'),(2,1,'植物花卉01的评论（第二条）','cz02'),(3,2,'植物花卉02的评论','yc03'),(4,3,'植物花卉03的评论','yc03'),(5,4,'植物花卉04的评论','zb04');

/*Table structure for table `flower` */

DROP TABLE IF EXISTS `flower`;

CREATE TABLE `flower` (
  `ID` int(10) NOT NULL AUTO_INCREMENT COMMENT '商品编号',
  `name` varchar(16) DEFAULT NULL COMMENT '名称',
  `price` double(9,2) DEFAULT NULL COMMENT '价格',
  `type` varchar(16) DEFAULT NULL COMMENT '种类',
  `commentid` int(10) DEFAULT NULL COMMENT '评论编号',
  `picture` varchar(255) DEFAULT NULL COMMENT '图片',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `flower` */

insert  into `flower`(`ID`,`name`,`price`,`type`,`commentid`,`picture`) values (1,'植物花卉01',10.00,'热门商品',1,NULL),(2,'植物花卉02',10.00,'热门商品',2,NULL),(3,'植物花卉03',20.00,'普通商品',3,NULL),(4,'植物花卉04',6.00,'热门商品',4,NULL);

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `OrderId` int(10) NOT NULL AUTO_INCREMENT COMMENT '订单号',
  `time` date DEFAULT NULL COMMENT '订单时间',
  `listid` int(10) DEFAULT NULL COMMENT '订单清单号',
  `price` double(12,2) DEFAULT NULL COMMENT '订单总价',
  PRIMARY KEY (`OrderId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `order` */

insert  into `order`(`OrderId`,`time`,`listid`,`price`) values (1,'2018-06-21',1,100.00),(2,'2018-05-21',2,200.00),(3,'2018-04-21',3,300.00);

/*Table structure for table `orderlist` */

DROP TABLE IF EXISTS `orderlist`;

CREATE TABLE `orderlist` (
  `listid` int(10) NOT NULL COMMENT '清单编号',
  `lid` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `number` int(4) DEFAULT NULL COMMENT '数量',
  `flower` varchar(255) DEFAULT NULL COMMENT '花',
  `price` double(12,2) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`lid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `orderlist` */

insert  into `orderlist`(`listid`,`lid`,`number`,`flower`,`price`) values (1,1,4,'植物花卉01',40.00),(1,2,6,'植物花卉02',60.00),(2,3,10,'植物花卉01',100.00),(2,4,5,'植物花卉03',100.00),(3,5,50,'植物花卉04',300.00);

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

insert  into `user`(`username`,`userpwd`,`address`,`phone`,`sex`,`name`,`photo`,`introduction`) values ('wqm01','666','杭州','123456789','男','wqm',NULL,'本地人'),('cz02','666','温州','867644995','男','cxz',NULL,'干苦力的'),('yc03','666','温州','641864612','男','yc',NULL,'做网页的'),('zb04','666','温州','654518789','男','zb',NULL,'我是组长');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
