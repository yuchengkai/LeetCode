#------------------------data
create table if not exists Employee (
    Id int,
	Name varchar(20),
	Salary int,
	ManagerId int
);
insert into Employee values(1,'Joe',70000,3),
(2,'Henry',80000,4),(3,'Sam',60000,NULL),
(4,'Max',90000,NULL);
#--------------------------------------------------------
SELECT a.Name AS Employee
FROM Employee a,
     Employee b
WHERE a.Salary >b.Salary
  AND a.ManagerId=b.Id