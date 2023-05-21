-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 31, 2022 at 07:25 AM
-- Server version: 5.5.32
-- PHP Version: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `school`
--
CREATE DATABASE IF NOT EXISTS `school` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `school`;

-- --------------------------------------------------------

--
-- Table structure for table `attandance`
--

CREATE TABLE IF NOT EXISTS `attandance` (
  `s_no` int(11) NOT NULL,
  `roll_number` int(25) NOT NULL,
  `name` varchar(50) NOT NULL,
  `date` varchar(20) NOT NULL,
  `subject` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attandance`
--

INSERT INTO `attandance` (`s_no`, `roll_number`, `name`, `date`, `subject`, `status`) VALUES
(1, 208, 'Priyanka ', '31-05-2022', 'Hindi', 'present'),
(2, 212, 'Shiddharth Gupta ', '31-05-2022', 'Hindi', 'present'),
(3, 12402, 'Aman', '31-05-2022', 'Hindi', 'present'),
(1, 207, 'Tarun', '31-05-2022', 'Science', 'present'),
(1, 206, 'Sachin Sharma', '31-05-2022', 'Hindi', 'present'),
(1, 216, 'Bunty', '31-05-2022', 'Hindi', 'present');

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE IF NOT EXISTS `faculty` (
  `faculty_name` varchar(40) NOT NULL,
  `faculty_id` bigint(7) NOT NULL,
  `email` varchar(40) NOT NULL,
  `address` varchar(40) NOT NULL,
  `gender` varchar(40) NOT NULL,
  `position` varchar(40) NOT NULL,
  `dob` varchar(40) NOT NULL,
  `qualification` varchar(40) NOT NULL,
  `experience` varchar(40) NOT NULL,
  `phone_number` varchar(14) NOT NULL,
  `join_date` varchar(40) NOT NULL,
  `photo` varchar(40) NOT NULL,
  PRIMARY KEY (`faculty_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`faculty_name`, `faculty_id`, `email`, `address`, `gender`, `position`, `dob`, `qualification`, `experience`, `phone_number`, `join_date`, `photo`) VALUES
('Ramesh Pandit', 549, 'ramesh66@gmail.com', 'New Delhi', 'Male', 'Data Structure', '21-04-1991', 'B.TECH', '5 yr', '12215456', '13-04-2022', 'faculty3.jpg'),
('Priya Yadav', 561, 'priya43@gmail.com', 'Noida', 'Female', 'Hindi', '08-12-1991', 'B.Ed', '5 years', '819856414', '17-04-2022', 'faculty4.jpg'),
('Rachna Verma', 562, 'rachna840@gmail.com', 'New Delhi', 'Female', 'English', '13-10-1887', 'B.Ed', '4 years', '819857751', '17-04-2022', 'faculty1.jpg'),
('Virat Pal Singh', 565, 'virat250@gmail.com', 'Greater Noida', 'Male', 'Mathematics', '20-07-1992', 'B.sc, M.sc', '1 years', '81085621', '15-05-2022', 'faculty4.jpg'),
('Anuj Pandit', 566, 'anuj15@gmail.com', 'New Delhi', 'Male', 'Python, Database', '03-10-1995', 'B.Ed, BCA,MCA', '3 years', '45257406', '30-03-2022', 'faculty2.jpg'),
('Himanshu Gupta', 567, 'himanshu360@gmail.com', 'Banglore', 'Male', 'Python, Django', '06-10-1991', 'B.TECH, M.TECH', '4 years', '91915001', '15-05-2022', 'faculty4.jpg'),
('Mansi Yadav', 568, 'mansi200@gmail.com', 'Aligarh', 'Female', 'English', '15-08-1992', 'B.ed, M.ed', '2 years', '91905041', '15-05-2022', 'img4.jpg'),
('Raju Patel', 569, 'raju650@gmail.com', 'Noida', 'Male', 'Computer Network', '05-03-1988', 'B.TECH', '4 years', '91915001', '15-05-2022', 'img4.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE IF NOT EXISTS `marks` (
  `roll_number` bigint(10) NOT NULL,
  `date` varchar(30) NOT NULL,
  `subject1` varchar(30) NOT NULL,
  `subject2` varchar(30) NOT NULL,
  `subject3` varchar(30) NOT NULL,
  `subject4` varchar(30) NOT NULL,
  `subject5` varchar(30) NOT NULL,
  `marks1` int(20) NOT NULL,
  `marks2` int(20) NOT NULL,
  `marks3` int(20) NOT NULL,
  `marks4` int(20) NOT NULL,
  `marks5` int(20) NOT NULL,
  PRIMARY KEY (`roll_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`roll_number`, `date`, `subject1`, `subject2`, `subject3`, `subject4`, `subject5`, `marks1`, `marks2`, `marks3`, `marks4`, `marks5`) VALUES
(205, '31-03-2022', 'Hindi', 'English', 'Mathematics', 'Science', 'S.S.T', 73, 55, 57, 81, 64),
(206, '02-04-2022', 'English', 'Maths', 'Hindi', 'Science', 'Computer', 85, 67, 60, 55, 77),
(207, '1-4-2022', 'Hindi', 'English', 'Maths', 'Science', 'S.S..T.', 76, 81, 63, 17, 42),
(208, '01-03-2022', 'English', 'Hindi', 'Maths', 'Science', 'Computer', 69, 71, 65, 77, 85),
(12402, '04/09/2022', 'Economics', 'Bussniss studies', 'Statistic', 'Principal of Management', 'Accounts', 89, 98, 50, 56, 99);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `name` varchar(40) NOT NULL,
  `roll_number` int(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(40) NOT NULL,
  `age` varchar(40) NOT NULL,
  `class` int(10) NOT NULL,
  `admission_date` varchar(40) NOT NULL,
  `dob` varchar(40) NOT NULL,
  `father_name` varchar(40) NOT NULL,
  `mother_name` varchar(40) NOT NULL,
  `phone_number` varchar(14) NOT NULL,
  `stream` varchar(40) NOT NULL,
  `gender` varchar(40) NOT NULL,
  `session_year` varchar(40) NOT NULL,
  `photo` varchar(250) NOT NULL,
  PRIMARY KEY (`roll_number`),
  UNIQUE KEY `phone_no` (`phone_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`name`, `roll_number`, `address`, `email`, `age`, `class`, `admission_date`, `dob`, `father_name`, `mother_name`, `phone_number`, `stream`, `gender`, `session_year`, `photo`) VALUES
('Avinahsh', 101, 'Aligarh', 'ansh21321@gmail.com', '12', 3, '30/12/1989', '12/12/1989', 'Shrivastav', 'Naina', '983789876', 'Arts', 'male', '2022', 'student8.jpg'),
('anil', 122, 'aligarh', 'anil@gmail.com', '22', 7, '21-12-22', '12-2-2000', 'mr. xyz', 'mrs. xyz', '48544545', 'Science', 'Male', '2022', 'student1.jpg'),
('Sachin Sharma', 206, 'Aligarh', 'sachin431@gmail.com', '23', 10, '22-03-2022', '12-04-1998', 'Mr. Anil Sharma', 'Mrs. Sheetal Thakur', '9845678530', 'Commerce', 'Male', '2022', 'student2.jpg'),
('Tarun', 207, 'Noida', 'tarun431@gmail.com', '22', 11, '25-03-2022', '14-01-1999', 'Mr. Prasoon ', 'Mrs. Anjali ', '864528963', 'Science', 'Male', '2022', 'student4.jpg'),
('Priyanka ', 208, 'Gurugram', 'priyanka250@gmail.com', '19', 12, '27-03-2022', '13-11-1999', 'Mr. Rakesh', 'Mrs. Payal', '81985641', 'Science', 'Female', '2022-2023', 'student3.jpg'),
('Rohit', 209, 'Banglore', 'rohit191@gmail.com', '25', 8, '30-03-2022', '05-04-2000', 'Mr. Dinesh Sharma', 'Mrs. Deepti', '51517893', 'Science', 'Male', '2022-2023', 'student5.jpg'),
('Shiddharth Gupta ', 212, 'Gurugram', 'siddharth26@gmail.com', '22', 12, '09-04-2022', '19-01-1998', 'Mr. Satish', 'Mrs. Monika', '7777114', 'Science', 'Male', '2022', 'student6.jpg'),
('Bunty', 216, 'Mumbai', 'bunty67@gmail.com', '16', 9, '13-04-2022', '12-06-2002', 'Mr. Narendra', 'Mrs. Anita', '8965451235', 'None', 'Male', '2022', 'student7.jpg'),
('Aman', 12402, 'Aligarh', 'aman02@gmail.com', '17', 12, '09/04/2022', '06/05/2003', 'Ankit Chorasiya', 'Any Chorasiya', '987564123', 'Arts', 'M', '2022-20223', 'student6.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `student_fee`
--

CREATE TABLE IF NOT EXISTS `student_fee` (
  `s_no` int(10) NOT NULL AUTO_INCREMENT,
  `roll_number` int(20) NOT NULL,
  `student_name` varchar(50) NOT NULL,
  `father_name` varchar(50) NOT NULL,
  `class` int(20) NOT NULL,
  `date` varchar(50) NOT NULL,
  `amount` int(20) NOT NULL,
  PRIMARY KEY (`s_no`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `student_fee`
--

INSERT INTO `student_fee` (`s_no`, `roll_number`, `student_name`, `father_name`, `class`, `date`, `amount`) VALUES
(1, 205, 'Rajat Agrawal', 'Mr. Harish Gupta', 12, '08-04-2022', 3000),
(2, 206, 'tarun', 'Mr. Sandeep', 11, '08-04-2022', 1800),
(3, 209, 'Priyanka', 'Mr. Amit', 10, '08-04-2022', 1500);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
