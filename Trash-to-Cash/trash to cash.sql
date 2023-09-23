-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 20, 2022 at 12:41 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trash to cash`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_access`
--

CREATE TABLE `admin_access` (
  `name` varchar(20) NOT NULL,
  `position` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin_access`
--

INSERT INTO `admin_access` (`name`, `position`, `username`, `password`) VALUES
('Tirso', 'Owner', 'cutietirso', 'password'),
('Tirso', 'Owner', 'cutietirso', 'password');

-- --------------------------------------------------------

--
-- Table structure for table `datarecord`
--

CREATE TABLE `datarecord` (
  `no.` int(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `barangay` varchar(30) NOT NULL,
  `sector` varchar(10) NOT NULL,
  `controlno` int(10) NOT NULL,
  `plastic_kilos` double NOT NULL,
  `plastic_points` double NOT NULL,
  `tela_kilos` double NOT NULL,
  `tela_points` double NOT NULL,
  `residual_points` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datarecord`
--
ALTER TABLE `datarecord`
  ADD PRIMARY KEY (`no.`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `datarecord`
--
ALTER TABLE `datarecord`
  MODIFY `no.` int(20) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
