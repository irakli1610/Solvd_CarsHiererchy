-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `carowner`
--

DROP TABLE IF EXISTS `carowner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carowner` (
  `car_owner_id` int NOT NULL,
  `number_of_cars` varchar(45) DEFAULT NULL,
  `person_id` int NOT NULL,
  PRIMARY KEY (`car_owner_id`),
  KEY `fk_CAR_OWNER_PERSON1_idx` (`person_id`),
  CONSTRAINT `fk_CAR_OWNER_PERSON1` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carowner`
--

LOCK TABLES `carowner` WRITE;
/*!40000 ALTER TABLE `carowner` DISABLE KEYS */;
INSERT INTO `carowner` VALUES (1,'much',4),(2,'few',2),(3,'few',6),(4,'much',9);
/*!40000 ALTER TABLE `carowner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carparts`
--

DROP TABLE IF EXISTS `carparts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carparts` (
  `car_parts_id` int NOT NULL,
  `engine_id` int NOT NULL,
  `gearbox_id` int NOT NULL,
  `tire_id` int NOT NULL,
  PRIMARY KEY (`car_parts_id`),
  KEY `fk_CAR_PARTS_ENGINE1_idx` (`engine_id`),
  KEY `fk_CAR_PARTS_GEARBOX1_idx` (`gearbox_id`),
  KEY `fk_CAR_PARTS_TIRES1_idx` (`tire_id`),
  CONSTRAINT `fk_CAR_PARTS_ENGINE1` FOREIGN KEY (`engine_id`) REFERENCES `engine` (`engine_id`),
  CONSTRAINT `fk_CAR_PARTS_GEARBOX1` FOREIGN KEY (`gearbox_id`) REFERENCES `gearbox` (`gearbox_id`),
  CONSTRAINT `fk_CAR_PARTS_TIRES1` FOREIGN KEY (`tire_id`) REFERENCES `tires` (`tire_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carparts`
--

LOCK TABLES `carparts` WRITE;
/*!40000 ALTER TABLE `carparts` DISABLE KEYS */;
INSERT INTO `carparts` VALUES (1,5,5,4),(2,2,3,4),(3,12,3,3),(4,4,4,3),(5,6,4,5),(6,9,1,5),(7,9,2,5),(8,4,1,2);
/*!40000 ALTER TABLE `carparts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carservices`
--

DROP TABLE IF EXISTS `carservices`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carservices` (
  `car_service_id` int NOT NULL,
  `car_service_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`car_service_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carservices`
--

LOCK TABLES `carservices` WRITE;
/*!40000 ALTER TABLE `carservices` DISABLE KEYS */;
INSERT INTO `carservices` VALUES (1,'Wrench_King'),(2,'Marvel_Autos'),(3,'Ignition_Kingdom'),(4,'Car_Medic'),(5,'Wheels_Doc'),(6,'Ignition_Kingdom'),(7,'Wrench_King'),(8,'Wheels_Doc');
/*!40000 ALTER TABLE `carservices` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carshops`
--

DROP TABLE IF EXISTS `carshops`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carshops` (
  `car_shops_id` int NOT NULL,
  `car_shop_name` varchar(45) DEFAULT NULL,
  `sold_cars_number` int DEFAULT NULL,
  PRIMARY KEY (`car_shops_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carshops`
--

LOCK TABLES `carshops` WRITE;
/*!40000 ALTER TABLE `carshops` DISABLE KEYS */;
INSERT INTO `carshops` VALUES (1,'volvo',29),(2,'volvo',96),(3,'volvo',65),(4,'Car Intel.',4921),(5,'Car Medic.',7139),(6,'Marvel Autos',279),(7,'Car Fixers.',761),(8,'Wrench King.',1687);
/*!40000 ALTER TABLE `carshops` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carslist`
--

DROP TABLE IF EXISTS `carslist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carslist` (
  `cars_list_id` int NOT NULL,
  `car_model` varchar(45) DEFAULT NULL,
  `relase_year` year DEFAULT NULL,
  `cars_systems_id` int NOT NULL,
  `car_parts_id` int NOT NULL,
  `car_shops_id` int NOT NULL,
  `car_owner_id` int NOT NULL,
  PRIMARY KEY (`cars_list_id`),
  KEY `fk_CARS_LIST_CAR_SYSTEMS1_idx` (`cars_systems_id`),
  KEY `fk_CARS_LIST_CAR_PARTS1_idx` (`car_parts_id`),
  KEY `fk_CARS_LIST_CAR_SHOPS1_idx` (`car_shops_id`),
  KEY `fk_CARS_LIST_CAR_OWNER1_idx` (`car_owner_id`),
  CONSTRAINT `fk_CARS_LIST_CAR_OWNER1` FOREIGN KEY (`car_owner_id`) REFERENCES `carowner` (`car_owner_id`),
  CONSTRAINT `fk_CARS_LIST_CAR_PARTS1` FOREIGN KEY (`car_parts_id`) REFERENCES `carparts` (`car_parts_id`),
  CONSTRAINT `fk_CARS_LIST_CAR_SHOPS1` FOREIGN KEY (`car_shops_id`) REFERENCES `carshops` (`car_shops_id`),
  CONSTRAINT `fk_CARS_LIST_CAR_SYSTEMS1` FOREIGN KEY (`cars_systems_id`) REFERENCES `carsystems` (`car_systems_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carslist`
--

LOCK TABLES `carslist` WRITE;
/*!40000 ALTER TABLE `carslist` DISABLE KEYS */;
INSERT INTO `carslist` VALUES (1,'Audi A3 Cabriolet.',2010,5,3,2,2),(2,'Audi A3 Cabriolet.',2000,3,1,1,3),(3,'Audi A3 Cabriolet.',1985,3,1,2,1),(4,'Audi A3 Cabriolet.',2013,5,1,4,1),(5,'Audi A3 Cabriolet.',2007,2,3,5,2),(6,'Audi A3 Cabriolet.',2005,1,5,2,4);
/*!40000 ALTER TABLE `carslist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carsystems`
--

DROP TABLE IF EXISTS `carsystems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carsystems` (
  `car_systems_id` int NOT NULL,
  `lights_id` int NOT NULL,
  `heating_cooling_id` int NOT NULL,
  PRIMARY KEY (`car_systems_id`),
  KEY `fk_CAR_SYSTEMS_LIGHTS1_idx` (`lights_id`),
  KEY `fk_CAR_SYSTEMS_HEATING_COOLING1_idx` (`heating_cooling_id`),
  CONSTRAINT `fk_CAR_SYSTEMS_HEATING_COOLING1` FOREIGN KEY (`heating_cooling_id`) REFERENCES `heatingcooling` (`heating_cooling_id`),
  CONSTRAINT `fk_CAR_SYSTEMS_LIGHTS1` FOREIGN KEY (`lights_id`) REFERENCES `lights` (`lights_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carsystems`
--

LOCK TABLES `carsystems` WRITE;
/*!40000 ALTER TABLE `carsystems` DISABLE KEYS */;
INSERT INTO `carsystems` VALUES (1,1,6),(2,4,5),(3,1,6),(4,2,1),(5,1,3),(6,5,1);
/*!40000 ALTER TABLE `carsystems` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `engine`
--

DROP TABLE IF EXISTS `engine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `engine` (
  `engine_id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `horsepower` int DEFAULT NULL,
  `consumption` int DEFAULT NULL,
  PRIMARY KEY (`engine_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `engine`
--

LOCK TABLES `engine` WRITE;
/*!40000 ALTER TABLE `engine` DISABLE KEYS */;
INSERT INTO `engine` VALUES (1,'Kryotec 2-litre turbocharged diesel engine',485,11),(2,'1.3-Litre turbocharged petrol engine',385,7),(3,'Smartstream G 1.4-litre turbo GDI',425,12),(4,'1.5-litre i-VTEC',235,6),(5,'Smartstream G 1.4-litre turbo GDI',425,12),(6,'1.3-Litre turbocharged',385,7),(7,'1.5-litre i-VTEC',235,6),(8,'1.2-litre Revotron turbocharged',285,6),(9,'1-litre Kappa turbocharged GDi',225,5),(10,'Smartstream G 1.4-litre turbo GDI',425,12),(11,'1-litre Kappa turbocharged GDi',225,5),(12,'1.2-litre Revotron turbocharged',285,6);
/*!40000 ALTER TABLE `engine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gearbox`
--

DROP TABLE IF EXISTS `gearbox`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gearbox` (
  `gearbox_id` int NOT NULL,
  `number_of_gears` tinyint DEFAULT NULL,
  `type_of_gearbox` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`gearbox_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gearbox`
--

LOCK TABLES `gearbox` WRITE;
/*!40000 ALTER TABLE `gearbox` DISABLE KEYS */;
INSERT INTO `gearbox` VALUES (1,5,'Manual Transmission'),(2,6,'Torque Converter Automatic'),(3,5,'CVT Automatic'),(4,5,'DCT Automatic'),(5,6,'AMT');
/*!40000 ALTER TABLE `gearbox` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `heatingcooling`
--

DROP TABLE IF EXISTS `heatingcooling`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `heatingcooling` (
  `heating_cooling_id` int NOT NULL,
  `steering_wheel_heating` tinyint DEFAULT NULL,
  `seats_heating` tinyint DEFAULT NULL,
  `interier_heating` tinyint DEFAULT NULL,
  `interier_cooling` tinyint DEFAULT NULL,
  PRIMARY KEY (`heating_cooling_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `heatingcooling`
--

LOCK TABLES `heatingcooling` WRITE;
/*!40000 ALTER TABLE `heatingcooling` DISABLE KEYS */;
INSERT INTO `heatingcooling` VALUES (1,1,1,1,1),(2,0,1,1,1),(3,0,0,1,0),(4,0,1,1,0),(5,0,0,1,1),(6,1,1,1,1);
/*!40000 ALTER TABLE `heatingcooling` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lights`
--

DROP TABLE IF EXISTS `lights`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lights` (
  `lights_id` int NOT NULL,
  `front_lights` tinyint DEFAULT NULL,
  `back_lights` tinyint DEFAULT NULL,
  `turn_lights` tinyint DEFAULT NULL,
  `stop_lights` tinyint DEFAULT NULL,
  `fog_lights` tinyint DEFAULT NULL,
  PRIMARY KEY (`lights_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lights`
--

LOCK TABLES `lights` WRITE;
/*!40000 ALTER TABLE `lights` DISABLE KEYS */;
INSERT INTO `lights` VALUES (1,1,1,1,1,0),(2,1,0,1,1,0),(3,1,1,1,1,1),(4,1,1,0,1,0),(5,1,1,1,1,1),(6,1,1,0,1,1);
/*!40000 ALTER TABLE `lights` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person` (
  `person_id` int NOT NULL,
  `first_name` varchar(55) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `age` int DEFAULT NULL,
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1,'shio','makatsaria',26),(2,'giorgi','afshilava',48),(3,'beqa','dzagania',21),(4,'nodari','marabdeli',19),(5,'irakli','nacvlishvili',25),(6,'miriani','mukeria',29),(7,'giorgi','ghulatava',46),(8,'shota','shiolashvili',63),(9,'nika','baratashvili',46),(10,'achi','sherozia',35),(11,'erekle','gulia',27),(12,'sulxani','bzikadze',32),(13,'bachi','nadareishvili',34),(14,'genadi','natelashvili',18),(15,'zviadi','gorgiladze',24);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicedcars`
--

DROP TABLE IF EXISTS `servicedcars`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servicedcars` (
  `serviced_cars_id` varchar(45) NOT NULL,
  `car_service_id` int NOT NULL,
  `cars_list_id` int NOT NULL,
  `price` int DEFAULT NULL,
  PRIMARY KEY (`serviced_cars_id`,`car_service_id`,`cars_list_id`),
  KEY `fk_CAR_SERVICES_has_CARS_LIST_CARS_LIST1_idx` (`cars_list_id`),
  KEY `fk_CAR_SERVICES_has_CARS_LIST_CAR_SERVICES1_idx` (`car_service_id`),
  CONSTRAINT `fk_CAR_SERVICES_has_CARS_LIST_CAR_SERVICES1` FOREIGN KEY (`car_service_id`) REFERENCES `carservices` (`car_service_id`),
  CONSTRAINT `fk_CAR_SERVICES_has_CARS_LIST_CARS_LIST1` FOREIGN KEY (`cars_list_id`) REFERENCES `carslist` (`cars_list_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicedcars`
--

LOCK TABLES `servicedcars` WRITE;
/*!40000 ALTER TABLE `servicedcars` DISABLE KEYS */;
INSERT INTO `servicedcars` VALUES ('1',2,6,900),('2',3,2,200),('3',3,1,800),('4',3,5,500),('5',2,6,280);
/*!40000 ALTER TABLE `servicedcars` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `serviceemployee`
--

DROP TABLE IF EXISTS `serviceemployee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `serviceemployee` (
  `service_employee_id` int NOT NULL,
  `working_experience` int DEFAULT NULL,
  `ServicedCars` int DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  `person_id` int NOT NULL,
  `car_service_id` int NOT NULL,
  PRIMARY KEY (`service_employee_id`),
  KEY `fk_SERVICE_EMPLOYEE_PERSON1_idx` (`person_id`),
  KEY `fk_SERVICE_EMPLOYEE_CAR_SERVICES1_idx` (`car_service_id`),
  CONSTRAINT `fk_SERVICE_EMPLOYEE_CAR_SERVICES1` FOREIGN KEY (`car_service_id`) REFERENCES `carservices` (`car_service_id`),
  CONSTRAINT `fk_SERVICE_EMPLOYEE_PERSON1` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `serviceemployee`
--

LOCK TABLES `serviceemployee` WRITE;
/*!40000 ALTER TABLE `serviceemployee` DISABLE KEYS */;
INSERT INTO `serviceemployee` VALUES (1,3,89,'mechanic',2,2),(2,3,75,'mechanic',2,3),(3,2,59,'mechanic',4,5),(4,2,89,'mechanic',1,1),(5,5,128,'mechanic',7,8),(6,4,111,'mechanic',11,7),(7,3,97,'mechanic',12,3),(8,1,43,'mechanic',14,5),(9,1,40,'mechanic',5,5);
/*!40000 ALTER TABLE `serviceemployee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shopemployee`
--

DROP TABLE IF EXISTS `shopemployee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shopemployee` (
  `shop_employee_id` int NOT NULL,
  `working_experience` int DEFAULT NULL,
  `sold_cars` int DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  `car_shops_id` int NOT NULL,
  `person_id` int NOT NULL,
  PRIMARY KEY (`shop_employee_id`),
  KEY `fk_SHOP EMPLOYEE_CAR_SHOPS1_idx` (`car_shops_id`),
  KEY `fk_SHOP EMPLOYEE_PERSON1_idx` (`person_id`),
  CONSTRAINT `fk_SHOP EMPLOYEE_CAR_SHOPS1` FOREIGN KEY (`car_shops_id`) REFERENCES `carshops` (`car_shops_id`),
  CONSTRAINT `fk_SHOP EMPLOYEE_PERSON1` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shopemployee`
--

LOCK TABLES `shopemployee` WRITE;
/*!40000 ALTER TABLE `shopemployee` DISABLE KEYS */;
INSERT INTO `shopemployee` VALUES (1,2,4,'manager',2,7),(2,6,56,'salesman',2,14),(4,2,56,'storage_guy',1,12),(5,6,19,'salesman',2,13),(6,1,5,'storage_guy',1,11),(7,4,27,'consultant',2,6),(8,3,22,'chief',1,2),(9,6,38,'chiefs_firsthand',2,5),(10,2,19,'servicer',1,3),(11,6,38,'salesman',2,4),(12,2,19,'salesman',1,9);
/*!40000 ALTER TABLE `shopemployee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tires`
--

DROP TABLE IF EXISTS `tires`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tires` (
  `tire_id` int NOT NULL,
  `number_of_tires` tinyint DEFAULT NULL,
  `tire_size` smallint DEFAULT NULL,
  `tire_brand` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`tire_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tires`
--

LOCK TABLES `tires` WRITE;
/*!40000 ALTER TABLE `tires` DISABLE KEYS */;
INSERT INTO `tires` VALUES (1,4,195,'michlen'),(2,4,195,'Continental'),(3,4,200,'Bridgestone'),(4,4,200,'Bridgestone'),(5,4,190,'FiGoodyearrestone'),(6,4,190,'michlen');
/*!40000 ALTER TABLE `tires` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-15 16:47:27
