

CREATE TABLE `school`.`StudentDetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `studentName` varchar(45) NOT NULL,
  `age` int(11) NOT NULL,
  `classtsd` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=u;

SELECT `student_details`.`id`,
    `student_details`.`student_name`,
    `student_details`.`age`,
    `student_details`.`classtsd`
FROM `school`.`student_details`
LIMIT 0, 1000

-- Date: 2021-04-27 10:04

INSERT INTO `` (`id`,`student_name`,`age`,`classtsd`) VALUES (3,'Dilip',7,2);
INSERT INTO `` (`id`,`student_name`,`age`,`classtsd`) VALUES (4,'Sam',6,1);
INSERT INTO `` (`id`,`student_name`,`age`,`classtsd`) VALUES (5,'John',10,6);
INSERT INTO `` (`id`,`student_name`,`age`,`classtsd`) VALUES (6,'Rohit',8,3);
