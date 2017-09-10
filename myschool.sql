-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 10, 2017 at 08:54 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `myschool`
--

-- --------------------------------------------------------

--
-- Table structure for table `clazz`
--

CREATE TABLE `clazz` (
  `ID` bigint(20) NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `TEACHERID` bigint(20) NOT NULL,
  `SUBTEACHERID` bigint(20) NOT NULL,
  `GRADE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `parents`
--

CREATE TABLE `parents` (
  `ID` bigint(20) NOT NULL,
  `FIRSTNAME` varchar(30) NOT NULL,
  `MIDNAME` varchar(30) NOT NULL,
  `LASTNAME` varchar(30) NOT NULL,
  `ACCOUNTID` bigint(20) NOT NULL,
  `PHONE` varchar(15) NOT NULL,
  `EMAIL` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `ID` bigint(20) NOT NULL,
  `CONTENT` varchar(700) NOT NULL,
  `ANSWER` varchar(100) NOT NULL,
  `GUIDE` varchar(1500) NOT NULL,
  `UPDATEBY` varchar(100) NOT NULL,
  `LASTUPDATE` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `ID` bigint(20) NOT NULL,
  `FIRSTNAME` varchar(30) NOT NULL,
  `MIDNAME` varchar(30) NOT NULL,
  `LASTNAME` varchar(30) NOT NULL,
  `CLAZZID` bigint(20) NOT NULL,
  `LEVEL` int(11) NOT NULL,
  `ACCOUNTID` bigint(20) NOT NULL,
  `STATUS` int(11) NOT NULL,
  `PARENTID` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `teachers`
--

CREATE TABLE `teachers` (
  `ID` bigint(20) NOT NULL,
  `FIRSTNAME` varchar(30) NOT NULL,
  `MIDNAME` varchar(30) NOT NULL,
  `LASTNAME` varchar(30) NOT NULL,
  `CLAZZID` bigint(20) NOT NULL,
  `LEVEL` int(11) NOT NULL,
  `ACCOUNTID` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `userrole`
--

CREATE TABLE `userrole` (
  `ID` int(11) NOT NULL,
  `ROLE` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userrole`
--

INSERT INTO `userrole` (`ID`, `ROLE`) VALUES
(1, 'ADMIN'),
(2, 'SUPER_ADMIN'),
(3, 'STUDENT'),
(4, 'TEACHER'),
(5, 'SUB_TEACHER'),
(6, 'PARENT');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `ID` bigint(20) NOT NULL,
  `USERNAME` varchar(100) NOT NULL,
  `PASSWORD` varchar(100) NOT NULL,
  `TYPE` varchar(30) NOT NULL,
  `ISADMIN` tinyint(1) NOT NULL,
  `STATUS` int(11) NOT NULL,
  `ISONLINE` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `USERNAME`, `PASSWORD`, `TYPE`, `ISADMIN`, `STATUS`, `ISONLINE`) VALUES
(1, 'admin', 'admin', 'ADMIN', 1, 1, 1),
(4, 'parent_test', 'test', 'PARENT', 0, 1, 0),
(5, 'student_test', 'test', 'STUDENT', 0, 0, 0),
(6, 'sub_teacher_test', 'test', 'SUBTEACHER', 0, 1, 0),
(7, 'teacher_test', 'test', 'TEACHER', 0, 1, 0),
(8, 'super_admin_test', 'test', 'SUPERADMIN', 1, 1, 0),
(9, 'student 2', 'test', 'STUDENT', 0, 1, 0),
(10, 'student 3', 'test', 'STUDENT', 0, 1, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clazz`
--
ALTER TABLE `clazz`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID` (`ID`),
  ADD KEY `TEACHERID` (`TEACHERID`),
  ADD KEY `SUBTEACHERID` (`SUBTEACHERID`);

--
-- Indexes for table `parents`
--
ALTER TABLE `parents`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID` (`ID`),
  ADD KEY `ACCOUNTID` (`ACCOUNTID`);

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID` (`ID`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID` (`ID`),
  ADD KEY `ACCOUNTID` (`ACCOUNTID`),
  ADD KEY `PARENTID` (`PARENTID`);

--
-- Indexes for table `teachers`
--
ALTER TABLE `teachers`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID` (`ID`),
  ADD KEY `ACCOUNTID` (`ACCOUNTID`),
  ADD KEY `CLAZZID` (`CLAZZID`);

--
-- Indexes for table `userrole`
--
ALTER TABLE `userrole`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID` (`ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID` (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `parents`
--
ALTER TABLE `parents`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `questions`
--
ALTER TABLE `questions`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `teachers`
--
ALTER TABLE `teachers`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `userrole`
--
ALTER TABLE `userrole`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
