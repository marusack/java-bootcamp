use highschool;
<-- this sentence it shows all the teachers of all courses-->
select c.name as name, c.id as idCourse, t.first_name as "teacher's first name",
t.last_name as "teacher's last name"
 from course as c , teacher as t
where c.assigned_teacher=t.id;

<-- this sentence it shows all the teachers of one particulary course-->
select c.name as name, c.id as idCourse, t.first_name as "teacher's first name",
t.last_name as "teacher's last name"
 from course as c , teacher as t
where c.assigned_teacher=t.id and  c.name = "perl";

<-- this sentence shows al the students related to a one particulary course-->
SELECT course.name as name, course.id as idCourse, students.*
FROM studentcourse as sc
INNER JOIN students  ON sc.id_student= students.id
INNER JOIN course ON sc.id_course= course.id
WHERE course.name="perl";



<--  List final course notes for a given student (the input could -->
<-- be last name or the registration number). They should be ordered by highest-->
<--  notes and course name)-->
SELECT  students.*, course.name as name, sc.final_note 
FROM studentcourse as sc
INNER JOIN students  ON sc.id_student= students.id
INNER JOIN course ON sc.id_course= course.id
WHERE students.registration_number= 56
ORDER BY course.name, sc.final_note ASC;

<-- Percentage of students that passed/failed a given course.-->

select c. name, sum(sc.final_note)/count(sc.final_note)as passed
 from course as c 
 INNER JOIN studentcourse as sc ON  c.assigned_teacher=sc.id_course
 WHERE sc.final_note<6 and c.name=".net"
 
 
