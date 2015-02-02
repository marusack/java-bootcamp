

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


CREATE TABLE IF NOT EXISTS `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `assigned_teacher` int(11) NOT NULL,
  `hours_week` int(11) NOT NULL,
  `schedule_time` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `assigned_teacher` (`assigned_teacher`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;



INSERT INTO `course` (`id`, `name`, `assigned_teacher`, `hours_week`, `schedule_time`) VALUES
(1, 'php FTW', 2, 4, 'sabados y lunes'),
(2, 'java op', 2, 24, 'mondays'),
(3, '.net ', 1, 5, 'tuesday'),
(4, 'software engineer', 2, 12, 'monday tuesday and saturday'),
(5, 'perl', 3, 8, 'Monday and Wednesday');



CREATE TABLE IF NOT EXISTS `studentcourse` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_student` int(11) NOT NULL,
  `id_course` int(11) NOT NULL,
  `note1` float NOT NULL,
  `note2` float NOT NULL,
  `note3` float NOT NULL,
  `final_note` float NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_student` (`id_student`),
  KEY `id_course` (`id_course`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=101 ;



INSERT INTO `studentcourse` (`id`, `id_student`, `id_course`, `note1`, `note2`, `note3`, `final_note`) VALUES
(1, 13, 4, 4, 6, 9, 8),
(2, 1, 4, 5, 5, 5, 5),
(3, 2, 4, 6, 6, 6, 6),
(4, 3, 4, 6, 7, 8, 9),
(5, 4, 4, 6, 9, 8, 8),
(6, 5, 1, 8, 8, 8, 8),
(7, 6, 1, 7, 7, 7, 7),
(8, 7, 1, 7, 8, 8, 8),
(9, 9, 1, 6, 6, 6, 6),
(10, 10, 1, 5, 5, 5, 5),
(11, 11, 1, 8, 9, 9, 9),
(12, 12, 1, 9, 9, 9, 9),
(13, 14, 1, 8, 8, 8, 8),
(14, 12, 1, 9, 9, 9, 9),
(15, 14, 1, 8, 8, 8, 8),
(16, 15, 1, 7, 7, 7, 7),
(17, 16, 1, 7, 7, 7, 7),
(18, 65, 1, 5, 5, 5, 5),
(19, 66, 1, 8, 9, 8, 9),
(20, 67, 1, 6, 6, 6, 6),
(21, 15, 1, 7, 7, 7, 7),
(22, 16, 1, 7, 7, 7, 7),
(23, 65, 1, 5, 5, 5, 5),
(24, 66, 1, 8, 9, 8, 9),
(25, 67, 1, 6, 6, 6, 6),
(26, 83, 2, 7, 8, 9, 9),
(27, 84, 2, 6, 6, 6, 6),
(28, 85, 2, 8, 8, 8, 8),
(29, 86, 2, 5, 5, 5, 5),
(30, 87, 2, 6, 2, 6, 5),
(31, 88, 2, 6, 6, 6, 6),
(32, 89, 2, 8, 9, 4, 6),
(33, 90, 2, 6, 6, 6, 6),
(34, 97, 2, 6, 7, 7, 7),
(35, 98, 2, 8, 7, 8, 8),
(36, 99, 2, 6, 6, 6, 6),
(37, 100, 2, 9, 9, 9, 10),
(38, 101, 2, 6, 5, 7, 6),
(39, 102, 2, 9, 9, 9, 9),
(40, 103, 2, 8, 8, 8, 8),
(41, 104, 2, 7, 7, 7, 7),
(42, 105, 2, 5, 6, 5, 5),
(43, 106, 2, 8, 7, 9, 8),
(44, 107, 2, 9, 7, 8, 9),
(45, 108, 2, 6, 6, 6, 6),
(46, 83, 3, 7, 8, 9, 9),
(47, 84, 3, 6, 6, 6, 6),
(48, 85, 3, 8, 8, 8, 8),
(49, 86, 3, 5, 5, 5, 5),
(50, 87, 3, 6, 2, 6, 5),
(51, 88, 3, 6, 6, 6, 6),
(52, 89, 3, 8, 9, 4, 6),
(53, 90, 3, 6, 6, 6, 6),
(54, 97, 3, 6, 7, 7, 7),
(55, 98, 3, 8, 7, 8, 8),
(56, 99, 3, 6, 6, 6, 6),
(57, 100, 3, 9, 9, 9, 10),
(58, 101, 3, 6, 5, 7, 6),
(59, 102, 3, 9, 9, 9, 9),
(60, 103, 3, 8, 8, 8, 8),
(61, 104, 3, 7, 7, 7, 7),
(62, 105, 3, 5, 6, 5, 5),
(63, 106, 3, 8, 7, 9, 8),
(64, 107, 3, 9, 7, 8, 9),
(65, 108, 3, 6, 6, 6, 6),
(66, 70, 4, 7, 0, 0, 0),
(67, 70, 4, 6, 6, 6, 6),
(68, 71, 4, 5, 6, 5, 6),
(69, 70, 4, 6, 6, 6, 6),
(70, 71, 4, 5, 6, 5, 6),
(71, 73, 4, 6, 6, 6, 6),
(72, 74, 4, 9, 0, 0, 0),
(73, 73, 4, 6, 6, 6, 6),
(74, 74, 4, 9, 9, 9, 9),
(75, 75, 4, 6, 6, 6, 6),
(76, 76, 4, 2, 5, 4, 5),
(77, 75, 4, 6, 6, 6, 6),
(78, 76, 4, 2, 5, 4, 5),
(79, 15, 4, 9, 9, 9, 9),
(80, 66, 4, 6, 6, 6, 6),
(81, 1, 5, 8, 8, 8, 8),
(82, 2, 5, 6, 6, 7, 7),
(83, 3, 5, 6, 6, 6, 6),
(84, 4, 5, 6, 4, 7, 6),
(85, 5, 5, 9, 9, 9, 9),
(86, 6, 5, 9, 6, 9, 8),
(87, 7, 5, 6, 6, 6, 6),
(88, 9, 5, 6, 6, 6, 6),
(89, 10, 5, 8, 8, 8, 8),
(90, 11, 5, 7, 6, 7, 6),
(91, 68, 5, 6, 6, 6, 6),
(92, 67, 5, 5, 5, 5, 5),
(93, 66, 5, 6, 4, 6, 5),
(94, 65, 5, 9, 9, 9, 9),
(95, 16, 5, 5, 0, 0, 0),
(96, 68, 5, 6, 6, 6, 6),
(97, 67, 5, 5, 5, 5, 5),
(98, 66, 5, 6, 4, 6, 5),
(99, 65, 5, 9, 9, 9, 9),
(100, 16, 5, 5, 5, 5, 5);



CREATE TABLE IF NOT EXISTS `students` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `registration_number` int(11) NOT NULL,
  `date_birth` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `registration_number` (`registration_number`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=109 ;



INSERT INTO `students` (`id`, `first_name`, `last_name`, `registration_number`, `date_birth`) VALUES
(1, 'romi', 'sanchez', 4578, '2015-01-08'),
(2, 'lucio', 'gbardinni', 78456, '2015-01-31'),
(3, 'augusto', 'info', 471, '2015-01-15'),
(4, 'josie', 'info', 95, '2015-01-15'),
(5, 'flor', 'cassoni', 1234, '2015-01-22'),
(6, 'rosario', 'janna', 451, '2015-01-11'),
(7, 'jose', 'gomez', 123, '2015-01-27'),
(9, 'lucia', 'lescano', 1247, '2015-01-08'),
(10, 'jorge', 'chapelo', 45, '2015-01-09'),
(11, 'julio', 'acosta', 78, '2015-01-23'),
(12, 'nuria', 'gomez', 96, '2015-01-30'),
(13, 'luciano', 'gomez', 25, '2015-01-23'),
(14, 'raul', 'suarez', 26, '2015-01-20'),
(15, 'paula', 'dure', 454, '2015-01-08'),
(16, 'jorge', 'raffo', 75, '2015-01-21'),
(65, 'ramiro', 'info', 41, '2015-01-08'),
(66, 'marina', 'romero', 13, '2015-01-08'),
(67, 'susana', 'roble', 14, '2015-01-08'),
(68, 'ramon', 'info', 15, '2015-01-08'),
(69, 'ramona', 'info', 16, '2015-01-08'),
(70, 'merida', 'santos', 17, '2015-01-08'),
(71, 'clara', 'info', 18, '2015-01-08'),
(72, 'mariel', 'info', 19, '2015-01-08'),
(73, 'rocio', 'sack', 20, '2015-01-08'),
(74, 'claudia', 'maricioni', 21, '2015-01-08'),
(75, 'marina', 'clara', 27, '2015-01-08'),
(76, 'emma', 'saul', 28, '2015-01-08'),
(77, 'hugo', 'sack', 42, '2015-01-08'),
(78, 'raul', 'romea', 30, '2015-01-08'),
(79, 'raul', 'info', 29, '2015-01-08'),
(80, 'clara', 'soria', 32, '2015-01-08'),
(81, 'natli', 'ramos', 33, '2015-01-08'),
(82, 'claudia', 'info', 34, '2015-01-08'),
(83, 'saul', 'gomez', 35, '2015-01-08'),
(84, 'migue', 'info', 36, '2015-01-08'),
(85, 'romina', 'info', 37, '2015-01-08'),
(86, 'raul', 'santino', 38, '2015-01-08'),
(87, 'maru', 'sanches', 39, '2015-01-08'),
(88, 'nicolas', 'flesler', 40, '2015-01-08'),
(89, 'julia', 'romea', 46, '2015-01-08'),
(90, 'julio', 'ramirez', 47, '2015-01-08'),
(97, 'julia', 'romea', 48, '2015-01-08'),
(98, 'julio', 'ramirez', 49, '2015-01-08'),
(99, 'gabi', 'santos', 50, '2015-01-08'),
(100, 'gabriel', 'pedrozo', 51, '2015-01-08'),
(101, 'gabriela', 'sanchez', 52, '2015-01-08'),
(102, 'ludmila', 'defunes', 53, '2015-01-08'),
(103, 'richard', 'gomez', 54, '2015-01-08'),
(104, 'pablo', 'romero', 55, '2015-01-08'),
(105, 'paula', 'sack', 56, '2015-01-08'),
(106, 'ema', 'sack', 57, '2015-01-08'),
(107, 'guille', 'sack', 58, '2015-01-08'),
(108, 'mauricio', 'info', 59, '2015-01-08');



CREATE TABLE IF NOT EXISTS `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `date_birth` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;



INSERT INTO `teacher` (`id`, `first_name`, `last_name`, `date_birth`) VALUES
(1, 'maru', 'sack ceppi', '2015-01-28'),
(2, 'gusti', 'gimenez', '2015-01-13'),
(3, 'gilda', 'romero', '2015-01-20');


ALTER TABLE `course`
  ADD CONSTRAINT `course_teacher` FOREIGN KEY (`assigned_teacher`) REFERENCES `teacher` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;


ALTER TABLE `studentcourse`
  ADD CONSTRAINT `studencourse_fkidcourse` FOREIGN KEY (`id_course`) REFERENCES `course` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `studencourse_fkidstudent` FOREIGN KEY (`id_student`) REFERENCES `students` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

