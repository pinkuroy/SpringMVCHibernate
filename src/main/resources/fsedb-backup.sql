/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.7.7-rc-log : Database - fsedb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fsedb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `fsedb`;

/*Table structure for table `course_details` */

DROP TABLE IF EXISTS `course_details`;

CREATE TABLE `course_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(100) NOT NULL,
  `course_detail` varchar(200) NOT NULL,
  `skill_id` int(11) NOT NULL,
  `profeciency_level` int(10) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `skill_id` (`skill_id`),
  CONSTRAINT `course_details_ibfk_1` FOREIGN KEY (`skill_id`) REFERENCES `skills` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `course_details` */

insert  into `course_details`(`id`,`course_name`,`course_detail`,`skill_id`,`profeciency_level`) values (1,'Java','Adaptive assessment for Java',1,2),(2,'Java Fundamentals','This course provides complete coverage of the Java programming language giving you the strong language foundation required for any Java-based development environment. ',1,2),(3,'Simply Java: An Introduction to Java Programming','Providing review questions and programming exercises for each chapter, this book eliminates extraneous details and provides an easy-to-follow text that guides beginning programmers step-by-step throug',1,3),(4,'Database Systems and Relational Databases','A database is used by organizations to store their data, and allow their employees to access, update, and manage it. Organizations use a Database Management System, also known as a DBMS to control, st',8,2),(5,'Files and Databases','This course discusses how CICS applications can be used to access and update data, and also looks at the code and interfaces required by CICS to communicate with DB2.',6,4),(6,'MySQL Fundamentals','MySQL is a popular choice of database for use in web applications, and is a central component of the widely used LAMP open source web application software stack',7,2);

/*Table structure for table `emp_tbl` */

DROP TABLE IF EXISTS `emp_tbl`;

CREATE TABLE `emp_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `telephone` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

/*Data for the table `emp_tbl` */

insert  into `emp_tbl`(`id`,`name`,`email`,`address`,`telephone`) values (25,'John','john@112@gmail.com','1234 Ashford Dr.','1234567890');

/*Table structure for table `skills` */

DROP TABLE IF EXISTS `skills`;

CREATE TABLE `skills` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `skill_name` varchar(50) NOT NULL,
  `skill_tag` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `skills` */

insert  into `skills`(`id`,`skill_name`,`skill_tag`) values (1,'Java','J'),(2,'JEE','J'),(3,'Spring Boot','J'),(4,'Hibernate','J'),(5,'Spring MVC','J'),(6,'Database','D'),(7,'MySQL','D'),(8,'Oracle','D'),(9,'MsSQL','D');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `usertype` char(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`usertype`) values (1,'pinku','pinku123','L'),(2,'harry','harry123','ST');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
