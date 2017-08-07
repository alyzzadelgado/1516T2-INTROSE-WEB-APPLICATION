CREATE DATABASE  IF NOT EXISTS `ovpeadb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ovpeadb`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win32 (x86)
--
-- Host: localhost    Database: ovpeadb
-- ------------------------------------------------------
-- Server version	5.6.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `colleges`
--

DROP TABLE IF EXISTS `colleges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `colleges` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `description` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colleges`
--

LOCK TABLES `colleges` WRITE;
/*!40000 ALTER TABLE `colleges` DISABLE KEYS */;
INSERT INTO `colleges` VALUES ('c001','CCS','College of Computer Studies'),('c002','CED','College of Education'),('c003','CLA','College of Liberal Arts'),('c004','COB','Ramon V. del Rosario College of Business'),('c005','COS','College of Science'),('c006','GCOE','Gokongwei College of Engineering'),('c007','SOE','School of Economics');
/*!40000 ALTER TABLE `colleges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `country` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `code` char(2) NOT NULL DEFAULT '',
  `name` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=501 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` VALUES (1,'AD','Andorra'),(2,'AE','United Arab Emirates'),(3,'AF','Afghanistan'),(4,'AG','Antigua and Barbuda'),(5,'AI','Anguilla'),(6,'AL','Albania'),(7,'AM','Armenia'),(8,'AO','Angola'),(9,'AQ','Antarctica'),(10,'AR','Argentina'),(11,'AS','American Samoa'),(12,'AT','Austria'),(13,'AU','Australia'),(14,'AW','Aruba'),(15,'AX','Åland'),(16,'AZ','Azerbaijan'),(17,'BA','Bosnia and Herzegovina'),(18,'BB','Barbados'),(19,'BD','Bangladesh'),(20,'BE','Belgium'),(21,'BF','Burkina Faso'),(22,'BG','Bulgaria'),(23,'BH','Bahrain'),(24,'BI','Burundi'),(25,'BJ','Benin'),(26,'BL','Saint Barthélemy'),(27,'BM','Bermuda'),(28,'BN','Brunei'),(29,'BO','Bolivia'),(30,'BQ','Bonaire'),(31,'BR','Brazil'),(32,'BS','Bahamas'),(33,'BT','Bhutan'),(34,'BV','Bouvet Island'),(35,'BW','Botswana'),(36,'BY','Belarus'),(37,'BZ','Belize'),(38,'CA','Canada'),(39,'CC','Cocos [Keeling] Islands'),(40,'CD','Democratic Republic of the Congo'),(41,'CF','Central African Republic'),(42,'CG','Republic of the Congo'),(43,'CH','Switzerland'),(44,'CI','Ivory Coast'),(45,'CK','Cook Islands'),(46,'CL','Chile'),(47,'CM','Cameroon'),(48,'CN','China'),(49,'CO','Colombia'),(50,'CR','Costa Rica'),(51,'CU','Cuba'),(52,'CV','Cape Verde'),(53,'CW','Curacao'),(54,'CX','Christmas Island'),(55,'CY','Cyprus'),(56,'CZ','Czech Republic'),(57,'DE','Germany'),(58,'DJ','Djibouti'),(59,'DK','Denmark'),(60,'DM','Dominica'),(61,'DO','Dominican Republic'),(62,'DZ','Algeria'),(63,'EC','Ecuador'),(64,'EE','Estonia'),(65,'EG','Egypt'),(66,'EH','Western Sahara'),(67,'ER','Eritrea'),(68,'ES','Spain'),(69,'ET','Ethiopia'),(70,'FI','Finland'),(71,'FJ','Fiji'),(72,'FK','Falkland Islands'),(73,'FM','Micronesia'),(74,'FO','Faroe Islands'),(75,'FR','France'),(76,'GA','Gabon'),(77,'GB','United Kingdom'),(78,'GD','Grenada'),(79,'GE','Georgia'),(80,'GF','French Guiana'),(81,'GG','Guernsey'),(82,'GH','Ghana'),(83,'GI','Gibraltar'),(84,'GL','Greenland'),(85,'GM','Gambia'),(86,'GN','Guinea'),(87,'GP','Guadeloupe'),(88,'GQ','Equatorial Guinea'),(89,'GR','Greece'),(90,'GS','South Georgia and the South Sandwich Islands'),(91,'GT','Guatemala'),(92,'GU','Guam'),(93,'GW','Guinea-Bissau'),(94,'GY','Guyana'),(95,'HK','Hong Kong'),(96,'HM','Heard Island and McDonald Islands'),(97,'HN','Honduras'),(98,'HR','Croatia'),(99,'HT','Haiti'),(100,'HU','Hungary'),(101,'ID','Indonesia'),(102,'IE','Ireland'),(103,'IL','Israel'),(104,'IM','Isle of Man'),(105,'IN','India'),(106,'IO','British Indian Ocean Territory'),(107,'IQ','Iraq'),(108,'IR','Iran'),(109,'IS','Iceland'),(110,'IT','Italy'),(111,'JE','Jersey'),(112,'JM','Jamaica'),(113,'JO','Jordan'),(114,'JP','Japan'),(115,'KE','Kenya'),(116,'KG','Kyrgyzstan'),(117,'KH','Cambodia'),(118,'KI','Kiribati'),(119,'KM','Comoros'),(120,'KN','Saint Kitts and Nevis'),(121,'KP','North Korea'),(122,'KR','South Korea'),(123,'KW','Kuwait'),(124,'KY','Cayman Islands'),(125,'KZ','Kazakhstan'),(126,'LA','Laos'),(127,'LB','Lebanon'),(128,'LC','Saint Lucia'),(129,'LI','Liechtenstein'),(130,'LK','Sri Lanka'),(131,'LR','Liberia'),(132,'LS','Lesotho'),(133,'LT','Lithuania'),(134,'LU','Luxembourg'),(135,'LV','Latvia'),(136,'LY','Libya'),(137,'MA','Morocco'),(138,'MC','Monaco'),(139,'MD','Moldova'),(140,'ME','Montenegro'),(141,'MF','Saint Martin'),(142,'MG','Madagascar'),(143,'MH','Marshall Islands'),(144,'MK','Macedonia'),(145,'ML','Mali'),(146,'MM','Myanmar [Burma]'),(147,'MN','Mongolia'),(148,'MO','Macao'),(149,'MP','Northern Mariana Islands'),(150,'MQ','Martinique'),(151,'MR','Mauritania'),(152,'MS','Montserrat'),(153,'MT','Malta'),(154,'MU','Mauritius'),(155,'MV','Maldives'),(156,'MW','Malawi'),(157,'MX','Mexico'),(158,'MY','Malaysia'),(159,'MZ','Mozambique'),(160,'NA','Namibia'),(161,'NC','New Caledonia'),(162,'NE','Niger'),(163,'NF','Norfolk Island'),(164,'NG','Nigeria'),(165,'NI','Nicaragua'),(166,'NL','Netherlands'),(167,'NO','Norway'),(168,'NP','Nepal'),(169,'NR','Nauru'),(170,'NU','Niue'),(171,'NZ','New Zealand'),(172,'OM','Oman'),(173,'PA','Panama'),(174,'PE','Peru'),(175,'PF','French Polynesia'),(176,'PG','Papua New Guinea'),(177,'PH','Philippines'),(178,'PK','Pakistan'),(179,'PL','Poland'),(180,'PM','Saint Pierre and Miquelon'),(181,'PN','Pitcairn Islands'),(182,'PR','Puerto Rico'),(183,'PS','Palestine'),(184,'PT','Portugal'),(185,'PW','Palau'),(186,'PY','Paraguay'),(187,'QA','Qatar'),(188,'RE','Réunion'),(189,'RO','Romania'),(190,'RS','Serbia'),(191,'RU','Russia'),(192,'RW','Rwanda'),(193,'SA','Saudi Arabia'),(194,'SB','Solomon Islands'),(195,'SC','Seychelles'),(196,'SD','Sudan'),(197,'SE','Sweden'),(198,'SG','Singapore'),(199,'SH','Saint Helena'),(200,'SI','Slovenia'),(201,'SJ','Svalbard and Jan Mayen'),(202,'SK','Slovakia'),(203,'SL','Sierra Leone'),(204,'SM','San Marino'),(205,'SN','Senegal'),(206,'SO','Somalia'),(207,'SR','Suriname'),(208,'SS','South Sudan'),(209,'ST','São Tomé and Príncipe'),(210,'SV','El Salvador'),(211,'SX','Sint Maarten'),(212,'SY','Syria'),(213,'SZ','Swaziland'),(214,'TC','Turks and Caicos Islands'),(215,'TD','Chad'),(216,'TF','French Southern Territories'),(217,'TG','Togo'),(218,'TH','Thailand'),(219,'TJ','Tajikistan'),(220,'TK','Tokelau'),(221,'TL','East Timor'),(222,'TM','Turkmenistan'),(223,'TN','Tunisia'),(224,'TO','Tonga'),(225,'TR','Turkey'),(226,'TT','Trinidad and Tobago'),(227,'TV','Tuvalu'),(228,'TW','Taiwan'),(229,'TZ','Tanzania'),(230,'UA','Ukraine'),(231,'UG','Uganda'),(232,'UM','U.S. Minor Outlying Islands'),(233,'US','United States'),(234,'UY','Uruguay'),(235,'UZ','Uzbekistan'),(236,'VA','Vatican City'),(237,'VC','Saint Vincent and the Grenadines'),(238,'VE','Venezuela'),(239,'VG','British Virgin Islands'),(240,'VI','U.S. Virgin Islands'),(241,'VN','Vietnam'),(242,'VU','Vanuatu'),(243,'WF','Wallis and Futuna'),(244,'WS','Samoa'),(245,'XK','Kosovo'),(246,'YE','Yemen'),(247,'YT','Mayotte'),(248,'ZA','South Africa'),(249,'ZM','Zambia'),(250,'ZW','Zimbabwe'),(251,'AD','Andorra'),(252,'AE','United Arab Emirates'),(253,'AF','Afghanistan'),(254,'AG','Antigua and Barbuda'),(255,'AI','Anguilla'),(256,'AL','Albania'),(257,'AM','Armenia'),(258,'AO','Angola'),(259,'AQ','Antarctica'),(260,'AR','Argentina'),(261,'AS','American Samoa'),(262,'AT','Austria'),(263,'AU','Australia'),(264,'AW','Aruba'),(265,'AX','Åland'),(266,'AZ','Azerbaijan'),(267,'BA','Bosnia and Herzegovina'),(268,'BB','Barbados'),(269,'BD','Bangladesh'),(270,'BE','Belgium'),(271,'BF','Burkina Faso'),(272,'BG','Bulgaria'),(273,'BH','Bahrain'),(274,'BI','Burundi'),(275,'BJ','Benin'),(276,'BL','Saint Barthélemy'),(277,'BM','Bermuda'),(278,'BN','Brunei'),(279,'BO','Bolivia'),(280,'BQ','Bonaire'),(281,'BR','Brazil'),(282,'BS','Bahamas'),(283,'BT','Bhutan'),(284,'BV','Bouvet Island'),(285,'BW','Botswana'),(286,'BY','Belarus'),(287,'BZ','Belize'),(288,'CA','Canada'),(289,'CC','Cocos [Keeling] Islands'),(290,'CD','Democratic Republic of the Congo'),(291,'CF','Central African Republic'),(292,'CG','Republic of the Congo'),(293,'CH','Switzerland'),(294,'CI','Ivory Coast'),(295,'CK','Cook Islands'),(296,'CL','Chile'),(297,'CM','Cameroon'),(298,'CN','China'),(299,'CO','Colombia'),(300,'CR','Costa Rica'),(301,'CU','Cuba'),(302,'CV','Cape Verde'),(303,'CW','Curacao'),(304,'CX','Christmas Island'),(305,'CY','Cyprus'),(306,'CZ','Czech Republic'),(307,'DE','Germany'),(308,'DJ','Djibouti'),(309,'DK','Denmark'),(310,'DM','Dominica'),(311,'DO','Dominican Republic'),(312,'DZ','Algeria'),(313,'EC','Ecuador'),(314,'EE','Estonia'),(315,'EG','Egypt'),(316,'EH','Western Sahara'),(317,'ER','Eritrea'),(318,'ES','Spain'),(319,'ET','Ethiopia'),(320,'FI','Finland'),(321,'FJ','Fiji'),(322,'FK','Falkland Islands'),(323,'FM','Micronesia'),(324,'FO','Faroe Islands'),(325,'FR','France'),(326,'GA','Gabon'),(327,'GB','United Kingdom'),(328,'GD','Grenada'),(329,'GE','Georgia'),(330,'GF','French Guiana'),(331,'GG','Guernsey'),(332,'GH','Ghana'),(333,'GI','Gibraltar'),(334,'GL','Greenland'),(335,'GM','Gambia'),(336,'GN','Guinea'),(337,'GP','Guadeloupe'),(338,'GQ','Equatorial Guinea'),(339,'GR','Greece'),(340,'GS','South Georgia and the South Sandwich Islands'),(341,'GT','Guatemala'),(342,'GU','Guam'),(343,'GW','Guinea-Bissau'),(344,'GY','Guyana'),(345,'HK','Hong Kong'),(346,'HM','Heard Island and McDonald Islands'),(347,'HN','Honduras'),(348,'HR','Croatia'),(349,'HT','Haiti'),(350,'HU','Hungary'),(351,'ID','Indonesia'),(352,'IE','Ireland'),(353,'IL','Israel'),(354,'IM','Isle of Man'),(355,'IN','India'),(356,'IO','British Indian Ocean Territory'),(357,'IQ','Iraq'),(358,'IR','Iran'),(359,'IS','Iceland'),(360,'IT','Italy'),(361,'JE','Jersey'),(362,'JM','Jamaica'),(363,'JO','Jordan'),(364,'JP','Japan'),(365,'KE','Kenya'),(366,'KG','Kyrgyzstan'),(367,'KH','Cambodia'),(368,'KI','Kiribati'),(369,'KM','Comoros'),(370,'KN','Saint Kitts and Nevis'),(371,'KP','North Korea'),(372,'KR','South Korea'),(373,'KW','Kuwait'),(374,'KY','Cayman Islands'),(375,'KZ','Kazakhstan'),(376,'LA','Laos'),(377,'LB','Lebanon'),(378,'LC','Saint Lucia'),(379,'LI','Liechtenstein'),(380,'LK','Sri Lanka'),(381,'LR','Liberia'),(382,'LS','Lesotho'),(383,'LT','Lithuania'),(384,'LU','Luxembourg'),(385,'LV','Latvia'),(386,'LY','Libya'),(387,'MA','Morocco'),(388,'MC','Monaco'),(389,'MD','Moldova'),(390,'ME','Montenegro'),(391,'MF','Saint Martin'),(392,'MG','Madagascar'),(393,'MH','Marshall Islands'),(394,'MK','Macedonia'),(395,'ML','Mali'),(396,'MM','Myanmar [Burma]'),(397,'MN','Mongolia'),(398,'MO','Macao'),(399,'MP','Northern Mariana Islands'),(400,'MQ','Martinique'),(401,'MR','Mauritania'),(402,'MS','Montserrat'),(403,'MT','Malta'),(404,'MU','Mauritius'),(405,'MV','Maldives'),(406,'MW','Malawi'),(407,'MX','Mexico'),(408,'MY','Malaysia'),(409,'MZ','Mozambique'),(410,'NA','Namibia'),(411,'NC','New Caledonia'),(412,'NE','Niger'),(413,'NF','Norfolk Island'),(414,'NG','Nigeria'),(415,'NI','Nicaragua'),(416,'NL','Netherlands'),(417,'NO','Norway'),(418,'NP','Nepal'),(419,'NR','Nauru'),(420,'NU','Niue'),(421,'NZ','New Zealand'),(422,'OM','Oman'),(423,'PA','Panama'),(424,'PE','Peru'),(425,'PF','French Polynesia'),(426,'PG','Papua New Guinea'),(427,'PH','Philippines'),(428,'PK','Pakistan'),(429,'PL','Poland'),(430,'PM','Saint Pierre and Miquelon'),(431,'PN','Pitcairn Islands'),(432,'PR','Puerto Rico'),(433,'PS','Palestine'),(434,'PT','Portugal'),(435,'PW','Palau'),(436,'PY','Paraguay'),(437,'QA','Qatar'),(438,'RE','Réunion'),(439,'RO','Romania'),(440,'RS','Serbia'),(441,'RU','Russia'),(442,'RW','Rwanda'),(443,'SA','Saudi Arabia'),(444,'SB','Solomon Islands'),(445,'SC','Seychelles'),(446,'SD','Sudan'),(447,'SE','Sweden'),(448,'SG','Singapore'),(449,'SH','Saint Helena'),(450,'SI','Slovenia'),(451,'SJ','Svalbard and Jan Mayen'),(452,'SK','Slovakia'),(453,'SL','Sierra Leone'),(454,'SM','San Marino'),(455,'SN','Senegal'),(456,'SO','Somalia'),(457,'SR','Suriname'),(458,'SS','South Sudan'),(459,'ST','São Tomé and Príncipe'),(460,'SV','El Salvador'),(461,'SX','Sint Maarten'),(462,'SY','Syria'),(463,'SZ','Swaziland'),(464,'TC','Turks and Caicos Islands'),(465,'TD','Chad'),(466,'TF','French Southern Territories'),(467,'TG','Togo'),(468,'TH','Thailand'),(469,'TJ','Tajikistan'),(470,'TK','Tokelau'),(471,'TL','East Timor'),(472,'TM','Turkmenistan'),(473,'TN','Tunisia'),(474,'TO','Tonga'),(475,'TR','Turkey'),(476,'TT','Trinidad and Tobago'),(477,'TV','Tuvalu'),(478,'TW','Taiwan'),(479,'TZ','Tanzania'),(480,'UA','Ukraine'),(481,'UG','Uganda'),(482,'UM','U.S. Minor Outlying Islands'),(483,'US','United States'),(484,'UY','Uruguay'),(485,'UZ','Uzbekistan'),(486,'VA','Vatican City'),(487,'VC','Saint Vincent and the Grenadines'),(488,'VE','Venezuela'),(489,'VG','British Virgin Islands'),(490,'VI','U.S. Virgin Islands'),(491,'VN','Vietnam'),(492,'VU','Vanuatu'),(493,'WF','Wallis and Futuna'),(494,'WS','Samoa'),(495,'XK','Kosovo'),(496,'YE','Yemen'),(497,'YT','Mayotte'),(498,'ZA','South Africa'),(499,'ZM','Zambia'),(500,'ZW','Zimbabwe');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `languages`
--

DROP TABLE IF EXISTS `languages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `languages` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `languages`
--

LOCK TABLES `languages` WRITE;
/*!40000 ALTER TABLE `languages` DISABLE KEYS */;
INSERT INTO `languages` VALUES ('l001','English'),('l002','Filipino');
/*!40000 ALTER TABLE `languages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opportunity`
--

DROP TABLE IF EXISTS `opportunity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `opportunity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `type_name` varchar(100) NOT NULL,
  `country` varchar(45) NOT NULL,
  `description` varchar(200) NOT NULL,
  `contact_person` varchar(45) NOT NULL,
  `contact_number` varchar(45) NOT NULL,
  `contact_landline` varchar(45) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `email` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  `age` varchar(45) DEFAULT NULL,
  `degree` varchar(45) DEFAULT NULL,
  `work_experience` int(11) DEFAULT NULL,
  `field_experience` varchar(200) DEFAULT NULL,
  `skills` varchar(200) DEFAULT NULL,
  `language` varchar(200) DEFAULT NULL,
  `proficiency` varchar(200) DEFAULT NULL,
  `requirements` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opportunity`
--

LOCK TABLES `opportunity` WRITE;
/*!40000 ALTER TABLE `opportunity` DISABLE KEYS */;
INSERT INTO `opportunity` VALUES (15,'Opp 1','Academe','Academe 1','Philippines','Sample','Someone','777','888','2016-03-27','2016-03-25','email@yc.com','close','18-20','Something',2,'Something','','','',''),(17,'Opp 3','Company','Company 1','Philippines','Something','Someone','444','888','2016-03-30','2016-04-08','x@sm.com','open','21','Something',1,'Something','Something','Something','Something','Something'),(18,'Your time','Academe','Academe 2','Yemen','Lorem','Anthony','123123','123213','2016-04-08','2016-05-08','kjsda@kjasd','open','123','21',1,'asds','','','',''),(19,'Test2','Company','null','Zimbabwe','assa','dsad','213123','321','2016-04-13','2016-06-14','asdasd@asdasd','open','32','dsad',1,'asd','','','asdsdsa','lorem'),(20,'Sample Acad','Academe','Academe 3','Philippines','something','hhh','020202','02020202','2016-04-12','2016-05-15','something@yh.com','open','','',1,'','','','','');
/*!40000 ALTER TABLE `opportunity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opportunity_item`
--

DROP TABLE IF EXISTS `opportunity_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `opportunity_item` (
  `opp_id` int(11) NOT NULL,
  `item_id` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opportunity_item`
--

LOCK TABLES `opportunity_item` WRITE;
/*!40000 ALTER TABLE `opportunity_item` DISABLE KEYS */;
INSERT INTO `opportunity_item` VALUES (15,'c001'),(15,'c006'),(15,'s002'),(15,'s006'),(15,'l001'),(15,'l002'),(15,'p003'),(15,'p004'),(15,'r002'),(15,'r005'),(17,'c002'),(17,'c004'),(17,'c007'),(17,'s002'),(17,'s005'),(17,'l001'),(17,'l002'),(17,'p001'),(17,'p005'),(17,'r001'),(17,'r002'),(17,'r005'),(18,'c001'),(18,'c002'),(18,'c003'),(18,'c004'),(18,'c005'),(18,'c006'),(18,'c007'),(18,'s006'),(18,'l001'),(18,'p003'),(18,'r003'),(19,'c001'),(19,'c002'),(19,'c003'),(19,'c004'),(19,'c005'),(19,'c006'),(19,'c007'),(19,'s003'),(19,'l001'),(20,'c006'),(20,'c007'),(20,'s002'),(20,'s005'),(20,'l001'),(20,'p002'),(20,'r002');
/*!40000 ALTER TABLE `opportunity_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proficiencies`
--

DROP TABLE IF EXISTS `proficiencies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proficiencies` (
  `id` varchar(45) NOT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proficiencies`
--

LOCK TABLES `proficiencies` WRITE;
/*!40000 ALTER TABLE `proficiencies` DISABLE KEYS */;
INSERT INTO `proficiencies` VALUES ('p001','Microsoft Word, Excel, PowerPoint'),('p002','Microsoft Access, MySQL'),('p003','HTML, CSS, Javascript, PHP, ASP'),('p004','C, C++, Java, Python'),('p005','Adobe Photoshop, Dreamweaver');
/*!40000 ALTER TABLE `proficiencies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `requirements`
--

DROP TABLE IF EXISTS `requirements`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `requirements` (
  `id` varchar(45) NOT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requirements`
--

LOCK TABLES `requirements` WRITE;
/*!40000 ALTER TABLE `requirements` DISABLE KEYS */;
INSERT INTO `requirements` VALUES ('r001','Birth Certificate (Original / Photocopy)'),('r002','Resume or Curriculum Vitae'),('r003','Cover Letter'),('r004','Recommendation Letter'),('r005','Transcript of Records');
/*!40000 ALTER TABLE `requirements` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resmanager`
--

DROP TABLE IF EXISTS `resmanager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resmanager` (
  `rm_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `account_name` varchar(45) NOT NULL,
  `last_login` datetime NOT NULL,
  PRIMARY KEY (`rm_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resmanager`
--

LOCK TABLES `resmanager` WRITE;
/*!40000 ALTER TABLE `resmanager` DISABLE KEYS */;
INSERT INTO `resmanager` VALUES (1,'12345678','1994135354','Ms. Research Manager','2016-04-07 09:48:10'),(2,'12398765','-1344438996','Mr. Research Manager','2016-03-03 21:00:42'),(3,'alyzza','introse','Mr. Research Manager','2016-03-03 21:00:42'),(4,'allen','introse','Mr. Research Manager','2016-03-03 21:00:42'),(5,'joem','introse','Mr. Research Manager','2016-03-03 21:00:42');
/*!40000 ALTER TABLE `resmanager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `skills`
--

DROP TABLE IF EXISTS `skills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `skills` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `skills`
--

LOCK TABLES `skills` WRITE;
/*!40000 ALTER TABLE `skills` DISABLE KEYS */;
INSERT INTO `skills` VALUES ('s001','Analytical or Research'),('s002','Communication'),('s003','Interpersonal'),('s004','Leadership or Management'),('s005','Presentation'),('s006','Technical or Computer');
/*!40000 ALTER TABLE `skills` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-11 21:29:38
