START TRANSACTION;

CREATE TABLE employee
(
id serial PRIMARY KEY,
job_title varchar(32) NOT NULL,
last_name varchar(64) NOT NULL,
first_name varchar(64),
gender varchar(32),
date_of_birth DATE,
hire_date DATE,
depart_number int
);



CREATE TABLE department
(
depart_id serial PRIMARY KEY,
depart_name varchar(64)


);
CREATE TABLE employee_project (
employee_id int ,
project_id int,
CONSTRAINT pk PRIMARY KEY (employee_id, project_id)
);

CREATE TABLE project
(
project_num int,
project_name varchar(64),
start_date DATE,
emp_id int PRIMARY KEY
);


INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, hire_date, depart_number)
VALUES ('chef', 'drew', 'michael', 'm', '10/14/1981', '1/10/12', 2);
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, hire_date, depart_number)
VALUES ('bartender', 'drew', 'katie', 'f', '11/22/1986', '2/11/18', 1);
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, hire_date, depart_number)
VALUES ('baker', 'drew', 'jackson', 'm', '02/08/2020', '02/09/2020', 3);
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, hire_date, depart_number)
VALUES ('chef', 'drew', 'stuart', 'm', '04/28/2018', '04/29/2018', 2);
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, hire_date, depart_number)
VALUES ('baker', 'drew', 'olivia', 'f', '07/01/2017', '07/02/2017', 3);
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, hire_date, depart_number)
VALUES ('bartender', 'drew', 'jaxson', 'f', '12/25/2008', '12/26/2008', 1);
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, hire_date, depart_number)
VALUES ('bartender', 'eidelberg', 'neil', 'm', '10/30/50', '01/01/2020', 1);
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, hire_date, depart_number)
VALUES ('chef', 'eidelberg', 'linda', 'f', '10/6/50', '01/01/2020', 2);


INSERT INTO department(depart_name)
VALUES ('bar');
INSERT INTO department(depart_name)
VALUES ('kitchen');
INSERT INTO department(depart_name)
VALUES ('bakery');

INSERT INTO employee_project(employee_id, project_id)
VALUES (1, 2);
INSERT INTO employee_project(employee_id, project_id)
VALUES (2, 4);
INSERT INTO employee_project(employee_id, project_id)
VALUES (3, 3);
INSERT INTO employee_project(employee_id, project_id)
VALUES (4, 1);
INSERT INTO employee_project(employee_id, project_id)
VALUES (5, 3);
INSERT INTO employee_project(employee_id, project_id)
VALUES (6, 4);
INSERT INTO employee_project(employee_id, project_id)
VALUES (7, 4);
INSERT INTO employee_project(employee_id, project_id)
VALUES (8, 1);



INSERT INTO project (project_num, project_name, start_date, emp_id)
VALUES (1, 'apps', '01/01/2020', 4);
INSERT INTO project (project_num,project_name, start_date, emp_id)
VALUES (2, 'dinner', '02/01/2020', 1);
INSERT INTO project (project_num,project_name, start_date, emp_id)
VALUES (3, 'dessert', '03/01/2020', 3);
INSERT INTO project (project_num,project_name, start_date, emp_id)
VALUES (4, 'cocktails', '04/01/2020', 2);
INSERT INTO project (project_num,project_name, start_date, emp_id)
VALUES (1, 'apps', '01/01/2020', 8);
INSERT INTO project (project_num,project_name, start_date, emp_id)
VALUES (3, 'dessert', '03/01/2020', 5);
INSERT INTO project (project_num,project_name, start_date, emp_id)
VALUES (4, 'cocktails', '04/01/2020', 6);
INSERT INTO project (project_num,project_name, start_date, emp_id)
VALUES (4, 'cocktails', '04/01/2020', 7);

ALTER TABLE employee_project
ADD CONSTRAINT fk_emp_id_id FOREIGN KEY (employee_id) REFERENCES employee(id),
ADD CONSTRAINT fk_project_id FOREIGN KEY (employee_id) REFERENCES project(emp_id);


ALTER TABLE employee
ADD CONSTRAINT fkx FOREIGN KEY (depart_number) REFERENCES department(depart_id);


SELECT * FROM employee;
SELECT * FROM department;
SELECT * FROM project;
SELECT * FROM employee_project;
SELECT *
FROM employee
JOIN project ON employee.id = project.emp_id
JOIN department ON employee.depart_number = department.depart_id
JOIN employee_project ON employee_project.employee_id=employee.id;

ROLLBACK;