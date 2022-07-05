-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 01, 2021 at 07:22 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rblas`
--

-- --------------------------------------------------------

--
-- Table structure for table `cr`
--

DROP TABLE IF EXISTS `cr`;
CREATE TABLE IF NOT EXISTS `cr` (
  `CustomerID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) NOT NULL,
  `IDnumber` int(15) NOT NULL,
  `PhoneNumber` int(12) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `Address` varchar(511) NOT NULL,
  PRIMARY KEY (`CustomerID`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cr`
--

INSERT INTO `cr` (`CustomerID`, `Name`, `IDnumber`, `PhoneNumber`, `Email`, `Gender`, `Address`) VALUES
(1, 'Asiri Wickramarathne', 930451274, 776965507, 'Asirimadu8@gmail.com', 'Male', 'pahala kottaramulla'),
(2, 'Samith Wickramarathne', 93045125, 776965507, 'samith8@gmail.com', 'Male', 'pahala kottaramulla'),
(3, 'Asanka Wickramarathne', 930451458, 776954587, 'yasantha8@gmail.com', 'Male', 'ihala kottaramulla'),
(7, 'Tharanga Wickramarathne', 930451274, 776965507, 'Tharanga8@gmail.com', 'Male', 'pahala kottaramulla');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
