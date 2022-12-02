CREATE DATABASE  IF NOT EXISTS `holly_registration` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `holly_registration`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: holly_registration
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ambassador`
--

DROP TABLE IF EXISTS `ambassador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ambassador` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Mobile` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `Ranks` varchar(45) DEFAULT NULL,
  `DOB` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ambassador`
--

LOCK TABLES `ambassador` WRITE;
/*!40000 ALTER TABLE `ambassador` DISABLE KEYS */;
/*!40000 ALTER TABLE `ambassador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `anggrek`
--

DROP TABLE IF EXISTS `anggrek`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `anggrek` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Mobile` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `Ranks` varchar(45) DEFAULT NULL,
  `DOB` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anggrek`
--

LOCK TABLES `anggrek` WRITE;
/*!40000 ALTER TABLE `anggrek` DISABLE KEYS */;
/*!40000 ALTER TABLE `anggrek` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bsd`
--

DROP TABLE IF EXISTS `bsd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bsd` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Mobile` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `Ranks` varchar(45) DEFAULT NULL,
  `DOB` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bsd`
--

LOCK TABLES `bsd` WRITE;
/*!40000 ALTER TABLE `bsd` DISABLE KEYS */;
INSERT INTO `bsd` VALUES (5,'Bernard Wijaya','081219587858','Male','Staff','2022-01-13');
/*!40000 ALTER TABLE `bsd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itc`
--

DROP TABLE IF EXISTS `itc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itc` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Mobile` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `Ranks` varchar(45) DEFAULT NULL,
  `DOB` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itc`
--

LOCK TABLES `itc` WRITE;
/*!40000 ALTER TABLE `itc` DISABLE KEYS */;
/*!40000 ALTER TABLE `itc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `main`
--

DROP TABLE IF EXISTS `main`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `main` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `Mobile` varchar(255) DEFAULT NULL,
  `Gender` varchar(255) DEFAULT NULL,
  `Ranks` varchar(255) DEFAULT NULL,
  `DOB` varchar(255) DEFAULT NULL,
  `Branch` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `main`
--

LOCK TABLES `main` WRITE;
/*!40000 ALTER TABLE `main` DISABLE KEYS */;
INSERT INTO `main` VALUES (3,'Kevin',NULL,NULL,'Staff',NULL,'ITC Mangga Dua'),(4,'ertt45yjhtyj',NULL,NULL,'Customer',NULL,'ITC Mangga Dua'),(5,'Bernard Wijaya',NULL,NULL,'Staff',NULL,'BSD City');
/*!40000 ALTER TABLE `main` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mangdu`
--

DROP TABLE IF EXISTS `mangdu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mangdu` (
  `ID` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Mobile` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `Ranks` varchar(45) DEFAULT NULL,
  `DOB` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mangdu`
--

LOCK TABLES `mangdu` WRITE;
/*!40000 ALTER TABLE `mangdu` DISABLE KEYS */;
INSERT INTO `mangdu` VALUES (3,'Kevin','123123','Male','Staff','2022-01-18'),(4,'ertt45yjhtyj','678678679','Male','Customer','2022-01-11');
/*!40000 ALTER TABLE `mangdu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `puri`
--

DROP TABLE IF EXISTS `puri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `puri` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Mobile` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `Ranks` varchar(45) DEFAULT NULL,
  `DOB` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `puri`
--

LOCK TABLES `puri` WRITE;
/*!40000 ALTER TABLE `puri` DISABLE KEYS */;
/*!40000 ALTER TABLE `puri` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-29  3:01:51
