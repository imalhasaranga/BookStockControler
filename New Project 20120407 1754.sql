-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema posdata
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ posdata;
USE posdata;

--
-- Table structure for table `posdata`.`book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bookid` int(10) NOT NULL auto_increment,
  `booktypebtypeid` int(10) NOT NULL,
  `discountdiscountid` int(10) NOT NULL,
  `code` varchar(10) default NULL,
  `title` varchar(150) default NULL,
  `isactive` int(10) default '1',
  PRIMARY KEY  (`bookid`),
  KEY `FKbook298181` (`booktypebtypeid`),
  CONSTRAINT `FKbook298181` FOREIGN KEY (`booktypebtypeid`) REFERENCES `booktype` (`btypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`book`
--

/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` (`bookid`,`booktypebtypeid`,`discountdiscountid`,`code`,`title`,`isactive`) VALUES 
 (1,13,9,'o1','Ganithaya (Anumana Prashna)',1),
 (2,13,9,'o2','Vidyawa (Anumana Prashna)',1),
 (3,13,9,'o3','Sinhala (Anumana Prashna)',1),
 (4,1,9,'p1','Samanala Sathara',1),
 (5,1,9,'p2','Sigithi Sathara',1),
 (6,7,9,'601','Sarala Sathara',1),
 (7,13,9,'o7','O.L. Vibhavyatha Purwa',1),
 (8,11,9,'1001','10 Ganithaya Jayamaga',1),
 (9,12,9,'1101','11 Ganithaya Jayamaga',1);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`bookdiscount`
--

DROP TABLE IF EXISTS `bookdiscount`;
CREATE TABLE `bookdiscount` (
  `bdid` int(11) NOT NULL auto_increment,
  `bookbookid` int(10) NOT NULL,
  `discountdiscountid` int(10) NOT NULL,
  PRIMARY KEY  (`bdid`),
  KEY `FKbookdiscou160268` (`bookbookid`),
  KEY `FKbookdiscou863614` (`discountdiscountid`),
  CONSTRAINT `FKbookdiscou160268` FOREIGN KEY (`bookbookid`) REFERENCES `book` (`bookid`),
  CONSTRAINT `FKbookdiscou863614` FOREIGN KEY (`discountdiscountid`) REFERENCES `discount` (`discountid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`bookdiscount`
--

/*!40000 ALTER TABLE `bookdiscount` DISABLE KEYS */;
INSERT INTO `bookdiscount` (`bdid`,`bookbookid`,`discountdiscountid`) VALUES 
 (1,1,6),
 (2,1,7),
 (3,2,6),
 (4,2,7),
 (5,3,6),
 (6,3,7),
 (7,4,1),
 (8,5,1),
 (9,6,1),
 (10,7,6),
 (11,7,7),
 (12,8,4),
 (13,8,5),
 (14,9,4),
 (15,9,5);
/*!40000 ALTER TABLE `bookdiscount` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`bookprice`
--

DROP TABLE IF EXISTS `bookprice`;
CREATE TABLE `bookprice` (
  `bpriceid` int(10) NOT NULL auto_increment,
  `bookbookid` int(10) NOT NULL,
  `soldprice` double default NULL,
  `datefrom` date default NULL,
  `dateto` date default NULL,
  `isactive` int(10) default '1',
  PRIMARY KEY  (`bpriceid`),
  KEY `FKbookprice693943` (`bookbookid`),
  CONSTRAINT `FKbookprice693943` FOREIGN KEY (`bookbookid`) REFERENCES `book` (`bookid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`bookprice`
--

/*!40000 ALTER TABLE `bookprice` DISABLE KEYS */;
INSERT INTO `bookprice` (`bpriceid`,`bookbookid`,`soldprice`,`datefrom`,`dateto`,`isactive`) VALUES 
 (1,1,0,'2012-03-27','2012-03-27',0),
 (2,2,0,'2012-03-27','2012-03-27',0),
 (3,3,0,'2012-03-27','2012-03-27',0),
 (4,4,0,'2012-03-27','2012-03-27',0),
 (5,5,0,'2012-03-27','2012-03-27',0),
 (6,1,250,'2012-03-27','2222-02-22',1),
 (7,2,250,'2012-03-27','2222-02-22',1),
 (8,3,220,'2012-03-27','2222-02-22',1),
 (9,4,35,'2012-03-27','2222-02-22',1),
 (10,5,35,'2012-03-27','2222-02-22',1),
 (11,6,0,'2012-04-03','2012-04-03',0),
 (12,7,0,'2012-04-03','2012-04-03',0),
 (13,6,50,'2012-04-03','2222-02-22',1),
 (14,7,270,'2012-04-03','2222-02-22',1),
 (15,8,0,'2012-04-06','2012-04-06',0),
 (16,8,280,'2012-04-06','2222-02-22',1),
 (17,9,0,'2012-04-07','2012-04-07',0),
 (18,9,280,'2012-04-07','2222-02-22',1);
/*!40000 ALTER TABLE `bookprice` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`bookstock`
--

DROP TABLE IF EXISTS `bookstock`;
CREATE TABLE `bookstock` (
  `bstockid` int(10) NOT NULL auto_increment,
  `qty` int(10) default NULL,
  `bookbookid` int(10) NOT NULL,
  PRIMARY KEY  (`bstockid`),
  KEY `FKbookstock858023` (`bookbookid`),
  CONSTRAINT `FKbookstock858023` FOREIGN KEY (`bookbookid`) REFERENCES `book` (`bookid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`bookstock`
--

/*!40000 ALTER TABLE `bookstock` DISABLE KEYS */;
INSERT INTO `bookstock` (`bstockid`,`qty`,`bookbookid`) VALUES 
 (1,413,1),
 (2,112,2),
 (3,184,3),
 (4,-660,4),
 (5,-393,5),
 (6,-41,6),
 (7,-17,7),
 (8,-20,8),
 (9,250,9);
/*!40000 ALTER TABLE `bookstock` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`booktype`
--

DROP TABLE IF EXISTS `booktype`;
CREATE TABLE `booktype` (
  `btypeid` int(10) NOT NULL auto_increment,
  `type` varchar(50) default NULL,
  `isactive` int(10) default '1',
  PRIMARY KEY  (`btypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`booktype`
--

/*!40000 ALTER TABLE `booktype` DISABLE KEYS */;
INSERT INTO `booktype` (`btypeid`,`type`,`isactive`) VALUES 
 (1,'Pre School',1),
 (2,'Grade1',1),
 (3,'Grade2',1),
 (4,'Grade3',1),
 (5,'Grade4',1),
 (6,'Grade5',1),
 (7,'Grade6',1),
 (8,'Grade7',1),
 (9,'Grade8',1),
 (10,'Grade9',1),
 (11,'Grade10',1),
 (12,'Grade11',1),
 (13,'G.C.E.(O/L)',1),
 (14,'G.C.E.(A/L)',1);
/*!40000 ALTER TABLE `booktype` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`chequeinvoice`
--

DROP TABLE IF EXISTS `chequeinvoice`;
CREATE TABLE `chequeinvoice` (
  `chinid` int(10) NOT NULL auto_increment,
  `invoiceinno` int(10) NOT NULL,
  `chequeno` varchar(255) default NULL,
  `chdate` date default NULL,
  `bank` varchar(50) default NULL,
  `amount` double default NULL,
  PRIMARY KEY  (`chinid`),
  KEY `FKchequeinvo584626` (`invoiceinno`),
  CONSTRAINT `FKchequeinvo584626` FOREIGN KEY (`invoiceinno`) REFERENCES `invoice` (`inno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`chequeinvoice`
--

/*!40000 ALTER TABLE `chequeinvoice` DISABLE KEYS */;
INSERT INTO `chequeinvoice` (`chinid`,`invoiceinno`,`chequeno`,`chdate`,`bank`,`amount`) VALUES 
 (1,2,'223212','2012-03-31','HNB',4000),
 (2,4,'223219','2012-03-30','HNB',10000),
 (3,5,'221234','2012-03-30','HNB',6000),
 (4,8,'221236','2012-03-30','HNB',7000),
 (5,12,'223225','2012-03-31','HNB',4339.5),
 (6,15,'223230','2012-04-29','People\'s Bank',2477.5),
 (7,16,'225234','2012-04-29','People\'s Bank',7205.5),
 (8,17,'221300','2012-04-30','HNB',7000),
 (9,19,'221234','2012-04-27','HNB',7000),
 (10,21,'112213','2012-04-26','People\'s Bank',5000),
 (11,22,'221234','2012-04-26','HNB',4712.5),
 (12,25,'221134','2012-04-27','HNB',5305),
 (13,27,'223367','2012-04-27','HNB',4500);
/*!40000 ALTER TABLE `chequeinvoice` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`company`
--

DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `companyid` int(10) NOT NULL auto_increment,
  `address` varchar(100) default NULL,
  `con1` varchar(15) default NULL,
  `con2` varchar(15) default NULL,
  `email` varchar(50) default NULL,
  `web` varchar(50) default NULL,
  `fax` varchar(15) default NULL,
  PRIMARY KEY  (`companyid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`company`
--

/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` (`companyid`,`address`,`con1`,`con2`,`email`,`web`,`fax`) VALUES 
 (1,'124 1/1, Avissawella Road, Maharagama','0112850981','0117394140','sathara@sathara.com','www.sathara.com',NULL);
/*!40000 ALTER TABLE `company` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`dealer`
--

DROP TABLE IF EXISTS `dealer`;
CREATE TABLE `dealer` (
  `dealerid` int(10) NOT NULL auto_increment,
  `dealertypedtypeid` int(11) NOT NULL,
  `name` varchar(50) default NULL,
  `address` varchar(100) default NULL,
  `contact` varchar(15) default NULL,
  `isactive` int(10) default NULL,
  PRIMARY KEY  (`dealerid`),
  KEY `FKdealer970732` (`dealertypedtypeid`),
  CONSTRAINT `FKdealer970732` FOREIGN KEY (`dealertypedtypeid`) REFERENCES `dealertype` (`dtypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`dealer`
--

/*!40000 ALTER TABLE `dealer` DISABLE KEYS */;
INSERT INTO `dealer` (`dealerid`,`dealertypedtypeid`,`name`,`address`,`contact`,`isactive`) VALUES 
 (1,2,'Customer','No',NULL,1),
 (2,1,'Saranga Book Shop','32B, Alwis Rd, Maharagama','0771215629',1),
 (3,1,'Isuru Books','33/21, Mahawalla Rd, Homagama','0778221278',1),
 (4,1,'Orkid Book Center','32B, Nilwala Rd, Nugegoda','0775212239',1),
 (5,1,'Sarinka Books','115A, Highlevel Rd, Maharagama','0718223180',1),
 (6,1,'Naleen Books','110C, Athulathmudali Mw, Nugegoda','0112300235',1),
 (7,1,'Imal Books','23B, Pannipitiya','0718195095',1);
/*!40000 ALTER TABLE `dealer` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`dealerbalance`
--

DROP TABLE IF EXISTS `dealerbalance`;
CREATE TABLE `dealerbalance` (
  `dealerdealerid` int(10) NOT NULL,
  `netbalance` double default NULL,
  `balancedate` date default NULL,
  PRIMARY KEY  (`dealerdealerid`),
  KEY `FKdealerbala692552` (`dealerdealerid`),
  CONSTRAINT `FKdealerbala692552` FOREIGN KEY (`dealerdealerid`) REFERENCES `dealer` (`dealerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`dealerbalance`
--

/*!40000 ALTER TABLE `dealerbalance` DISABLE KEYS */;
INSERT INTO `dealerbalance` (`dealerdealerid`,`netbalance`,`balancedate`) VALUES 
 (2,40,'2012-04-06'),
 (3,241.5,'2012-04-04'),
 (4,0,'2012-04-04'),
 (5,0,'2012-04-04'),
 (6,350.5,'2012-04-03'),
 (7,150,'2012-04-07');
/*!40000 ALTER TABLE `dealerbalance` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`dealertype`
--

DROP TABLE IF EXISTS `dealertype`;
CREATE TABLE `dealertype` (
  `dtypeid` int(11) NOT NULL auto_increment,
  `type` varchar(20) default NULL,
  PRIMARY KEY  (`dtypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`dealertype`
--

/*!40000 ALTER TABLE `dealertype` DISABLE KEYS */;
INSERT INTO `dealertype` (`dtypeid`,`type`) VALUES 
 (1,'dealer'),
 (2,'customer');
/*!40000 ALTER TABLE `dealertype` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`discount`
--

DROP TABLE IF EXISTS `discount`;
CREATE TABLE `discount` (
  `discountid` int(10) NOT NULL auto_increment,
  `name` varchar(20) default NULL,
  `percentage` int(2) default NULL,
  `isactive` int(10) default '1',
  PRIMARY KEY  (`discountid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`discount`
--

/*!40000 ALTER TABLE `discount` DISABLE KEYS */;
INSERT INTO `discount` (`discountid`,`name`,`percentage`,`isactive`) VALUES 
 (1,'Magazine',20,1),
 (2,'Pre1',25,1),
 (3,'Pre2',27,1),
 (4,'S.Books1',35,1),
 (5,'S.Books2',37,1),
 (6,'O/L1',25,1),
 (7,'O/L2',27,1);
/*!40000 ALTER TABLE `discount` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`invoice`
--

DROP TABLE IF EXISTS `invoice`;
CREATE TABLE `invoice` (
  `inno` int(10) NOT NULL auto_increment,
  `dealerdealerid` int(10) NOT NULL,
  `useruserid` int(10) NOT NULL,
  `total` double default NULL,
  `paidTotal` double default NULL,
  `invoicedate` datetime default NULL,
  `type` varchar(255) default 'cash',
  `isactive` int(10) default '1',
  PRIMARY KEY  (`inno`),
  KEY `FKinvoice593804` (`dealerdealerid`),
  KEY `FKinvoice982283` (`useruserid`),
  CONSTRAINT `FKinvoice593804` FOREIGN KEY (`dealerdealerid`) REFERENCES `dealer` (`dealerid`),
  CONSTRAINT `FKinvoice982283` FOREIGN KEY (`useruserid`) REFERENCES `user` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`invoice`
--

/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` (`inno`,`dealerdealerid`,`useruserid`,`total`,`paidTotal`,`invoicedate`,`type`,`isactive`) VALUES 
 (1,4,1,8931.5,8000,'2012-03-27 10:07:46','cash',1),
 (2,3,1,4154,4000,'2012-03-27 10:10:36','cheque',1),
 (3,5,1,4636,4636,'2012-03-27 10:16:55','cash',1),
 (4,4,2,11166.5,11166.5,'2012-03-27 10:20:17','both',1),
 (5,2,1,6775,6775,'2012-03-27 10:29:46','both',1),
 (6,3,1,5081.5,5000,'2012-03-27 10:32:54','cash',1),
 (7,5,1,3551.5,3500,'2012-03-28 11:02:12','cash',1),
 (8,4,1,8074,8074,'2012-03-28 11:05:15','both',1),
 (9,4,1,4600,4600,'2012-03-28 11:57:13','cash',1),
 (10,2,1,6270,6000,'2012-03-28 19:46:06','cash',1),
 (11,5,1,1961.5,1961.5,'2012-03-29 11:39:35','cheque',1),
 (12,4,1,4339.5,4339.5,'2012-03-29 11:42:50','cheque',1),
 (13,5,1,5270,5270,'2012-03-29 11:47:17','cheque',1),
 (14,5,1,2464,2464,'2012-03-29 11:49:10','cheque',1),
 (15,2,1,2477.5,2477.5,'2012-03-29 12:03:39','cheque',1),
 (16,4,1,8205.5,8205.5,'2012-03-29 12:06:29','both',1),
 (17,2,1,7002.5,7002.5,'2012-03-30 06:57:55','both',1),
 (18,5,1,3689,3000,'2012-04-03 13:45:15','cash',1);
INSERT INTO `invoice` (`inno`,`dealerdealerid`,`useruserid`,`total`,`paidTotal`,`invoicedate`,`type`,`isactive`) VALUES 
 (19,5,1,6289,6289,'2012-04-03 13:46:26','cheque',1),
 (20,4,1,5730,5730,'2012-04-03 13:47:57','cash',0),
 (21,5,1,5225,5225,'2012-04-04 13:58:39','both',1),
 (22,2,1,4712.5,4712.5,'2012-04-04 14:00:43','cheque',1),
 (23,4,1,11001.5,11001.5,'2012-04-04 14:02:56','cash',0),
 (24,3,2,5241.5,5000,'2012-04-04 14:04:40','cash',1),
 (25,2,2,5305,5305,'2012-04-04 14:05:29','cheque',1),
 (26,2,1,4040,4000,'2012-04-06 09:56:16','cash',1),
 (27,1,1,4342.5,4342.5,'2012-04-06 12:33:39','cheque',1);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`invoicerecord`
--

DROP TABLE IF EXISTS `invoicerecord`;
CREATE TABLE `invoicerecord` (
  `irno` int(10) NOT NULL auto_increment,
  `invoiceinno` int(10) NOT NULL,
  `bookbookid` int(10) NOT NULL,
  `qty` int(10) default NULL,
  `amount` double default NULL,
  PRIMARY KEY  (`irno`),
  KEY `FKinvoicerec301163` (`invoiceinno`),
  KEY `FKinvoicerec531912` (`bookbookid`),
  CONSTRAINT `FKinvoicerec301163` FOREIGN KEY (`invoiceinno`) REFERENCES `invoice` (`inno`),
  CONSTRAINT `FKinvoicerec531912` FOREIGN KEY (`bookbookid`) REFERENCES `book` (`bookid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`invoicerecord`
--

/*!40000 ALTER TABLE `invoicerecord` DISABLE KEYS */;
INSERT INTO `invoicerecord` (`irno`,`invoiceinno`,`bookbookid`,`qty`,`amount`) VALUES 
 (1,1,4,100,2800),
 (2,1,5,100,2800),
 (3,1,3,10,1650),
 (4,1,1,15,2812.5),
 (5,2,3,15,2475),
 (6,2,2,10,1875),
 (7,3,4,50,1400),
 (8,3,5,50,1400),
 (9,3,2,12,2250),
 (10,4,4,100,2800),
 (11,4,5,100,2800),
 (12,4,2,35,6562.5),
 (13,5,4,100,2800),
 (14,5,3,15,2475),
 (15,5,2,15,2812.5),
 (16,6,4,10,280),
 (17,6,5,20,560),
 (18,6,3,10,1650),
 (19,6,2,15,2812.5),
 (20,7,4,100,2800),
 (21,7,3,10,1650),
 (22,8,4,50,1400),
 (23,8,5,50,1400),
 (24,8,3,10,1650),
 (25,8,2,10,1875),
 (26,8,1,15,2812.5),
 (27,9,4,25,700),
 (28,9,3,10,1650),
 (29,9,2,15,2812.5),
 (30,10,4,50,1400),
 (31,10,5,40,1120),
 (32,10,2,10,1875),
 (33,10,1,10,1875),
 (34,11,4,40,1120),
 (35,11,5,40,1120),
 (36,12,2,10,1875),
 (37,12,1,10,1875),
 (38,12,3,10,1650),
 (39,13,4,100,2800),
 (40,13,5,100,2800),
 (41,14,4,100,2800),
 (42,15,4,10,280),
 (43,15,3,6,990),
 (44,15,2,5,937.5),
 (45,16,4,50,1400),
 (46,16,3,12,1980),
 (47,16,5,55,1540),
 (48,16,2,10,1875);
INSERT INTO `invoicerecord` (`irno`,`invoiceinno`,`bookbookid`,`qty`,`amount`) VALUES 
 (49,16,1,12,2250),
 (50,17,4,100,2800),
 (51,17,5,100,2800),
 (52,17,2,15,2812.5),
 (53,18,6,50,2000),
 (54,18,7,10,2025),
 (55,19,4,100,2800),
 (56,19,5,100,2800),
 (57,20,4,100,2800),
 (58,20,5,100,2800),
 (59,21,4,100,2800),
 (60,21,5,100,2800),
 (61,21,2,10,1875),
 (62,22,3,10,1650),
 (63,22,1,10,1875),
 (64,22,2,10,1875),
 (65,23,4,100,2800),
 (66,23,5,100,2800),
 (67,23,2,10,1875),
 (68,23,1,10,1875),
 (69,23,3,10,1650),
 (70,23,7,10,2025),
 (71,24,3,10,1650),
 (72,24,1,10,1875),
 (73,24,2,10,1875),
 (74,25,1,20,3750),
 (75,25,2,10,1875),
 (76,26,6,12,480),
 (77,26,8,20,3640),
 (78,27,4,20,560),
 (79,27,5,100,2800),
 (80,27,1,10,1875);
/*!40000 ALTER TABLE `invoicerecord` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`returnrecord`
--

DROP TABLE IF EXISTS `returnrecord`;
CREATE TABLE `returnrecord` (
  `rrno` int(10) NOT NULL auto_increment,
  `invoiceinno` int(10) NOT NULL,
  `bookbookid` int(10) NOT NULL,
  `qty` int(10) default NULL,
  `amount` double default NULL,
  PRIMARY KEY  (`rrno`),
  KEY `FKreturnreco258093` (`invoiceinno`),
  KEY `FKreturnreco488842` (`bookbookid`),
  CONSTRAINT `FKreturnreco258093` FOREIGN KEY (`invoiceinno`) REFERENCES `invoice` (`inno`),
  CONSTRAINT `FKreturnreco488842` FOREIGN KEY (`bookbookid`) REFERENCES `book` (`bookid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`returnrecord`
--

/*!40000 ALTER TABLE `returnrecord` DISABLE KEYS */;
INSERT INTO `returnrecord` (`rrno`,`invoiceinno`,`bookbookid`,`qty`,`amount`) VALUES 
 (1,1,4,12,336),
 (2,1,5,15,420),
 (3,1,2,2,375),
 (4,2,5,7,196),
 (5,3,4,3,84),
 (6,3,3,2,330),
 (7,4,1,5,937.5),
 (8,4,3,6,990),
 (9,5,1,4,750),
 (10,5,2,3,562.5),
 (11,6,1,2,375),
 (12,7,5,12,336),
 (13,7,2,3,562.5),
 (14,8,5,12,336),
 (15,8,2,3,562.5),
 (16,8,3,1,165),
 (17,9,1,3,562.5),
 (18,11,3,2,330),
 (19,12,3,2,330),
 (20,12,4,6,168),
 (21,12,2,3,562.5),
 (22,13,3,2,330),
 (23,14,5,12,336),
 (24,16,3,1,165),
 (25,16,2,2,375),
 (26,16,1,1,187.5),
 (27,16,5,4,112),
 (28,17,1,1,187.5),
 (29,17,3,4,660),
 (30,17,2,3,562.5),
 (31,18,4,12,336),
 (32,20,6,3,120),
 (33,21,1,12,2250),
 (34,22,6,2,80),
 (35,22,7,3,607.5),
 (36,23,1,3,562.5),
 (37,23,2,2,375),
 (38,23,1,4,750),
 (39,23,4,12,336),
 (40,24,6,6,240),
 (41,25,6,8,320),
 (42,26,6,2,80),
 (43,27,2,3,562.5),
 (44,27,3,2,330);
/*!40000 ALTER TABLE `returnrecord` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(10) NOT NULL auto_increment,
  `username` varchar(20) default NULL,
  `password` varchar(20) default NULL,
  `name` varchar(50) default NULL,
  `contactno` varchar(15) default NULL,
  `usertypeutypeid` int(10) NOT NULL,
  `isactive` int(10) default '1',
  `companycompanyid` int(10) NOT NULL,
  PRIMARY KEY  (`userid`),
  KEY `FKuser766785` (`usertypeutypeid`),
  KEY `FKuser345869` (`companycompanyid`),
  CONSTRAINT `FKuser345869` FOREIGN KEY (`companycompanyid`) REFERENCES `company` (`companyid`),
  CONSTRAINT `FKuser766785` FOREIGN KEY (`usertypeutypeid`) REFERENCES `usertype` (`utypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`userid`,`username`,`password`,`name`,`contactno`,`usertypeutypeid`,`isactive`,`companycompanyid`) VALUES 
 (1,'ranga','rg123rg','Ranga Perera','0773544821',1,1,1),
 (2,'gihan','pos123','Gihan Wijesinghe','0772958078',2,1,1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


--
-- Table structure for table `posdata`.`usertype`
--

DROP TABLE IF EXISTS `usertype`;
CREATE TABLE `usertype` (
  `utypeid` int(10) NOT NULL auto_increment,
  `type` varchar(10) NOT NULL,
  PRIMARY KEY  (`utypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `posdata`.`usertype`
--

/*!40000 ALTER TABLE `usertype` DISABLE KEYS */;
INSERT INTO `usertype` (`utypeid`,`type`) VALUES 
 (1,'admin'),
 (2,'user');
/*!40000 ALTER TABLE `usertype` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
