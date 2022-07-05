-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 01, 2021 at 07:23 PM
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
-- Table structure for table `finance_management`
--

DROP TABLE IF EXISTS `finance_management`;
CREATE TABLE IF NOT EXISTS `finance_management` (
  `ExpenditureID` int(11) NOT NULL AUTO_INCREMENT,
  `Expenditure` varchar(255) NOT NULL,
  `Rent` int(11) NOT NULL,
  `WaterElectricityBill` int(11) NOT NULL,
  `TelephoneBill` int(11) NOT NULL,
  `SalaryPayment` int(11) NOT NULL,
  `Date` date NOT NULL,
  `ExpenditureDescription` varchar(255) NOT NULL,
  `Amount` int(11) NOT NULL,
  PRIMARY KEY (`ExpenditureID`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `finance_management`
--

INSERT INTO `finance_management` (`ExpenditureID`, `Expenditure`, `Rent`, `WaterElectricityBill`, `TelephoneBill`, `SalaryPayment`, `Date`, `ExpenditureDescription`, `Amount`) VALUES
(1, 'Fixed expenditure', 45, 45, 45, 45, '2021-04-07', 'ldfhosd dlfjhsj', 458),
(2, 'Fixed expenditure', 4568, 25478, 3265, 125447, '2021-04-02', 'yigd bsudgiau sgtdiqg', 2564),
(3, 'Other expenditure', 45, 45, 45, 45, '2021-04-07', 'Appata siri', 458),
(8, 'Other expenditure', 45, 45, 45, 45, '2021-04-07', 'Appata siri', 458),
(9, 'Other expenditure', 4568, 25478, 3265, 125447, '2021-04-02', 'yigd bsudgiau sgtdiqg', 2564);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
