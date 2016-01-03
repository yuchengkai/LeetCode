#------------------------data
create table if not exists Customers (
    Id int,
	Name varchar(20)
);
create table if not exists Orders (
    Id int,
	CustomerId int
);
insert into Customers values(1,'Joe'),
(2,'Henry'),(3,'Sam'),(4,'Max');

insert into Orders values(1,3),
(2,1);
#--------------------------------------------------------
SELECT Name
FROM Customers
WHERE Customers.Id NOT IN
    (SELECT CustomerId
     FROM Orders);