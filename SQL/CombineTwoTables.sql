#------------------------data
create table if not exists Person (
    PersonId int,
    FirstName varchar(10),
    LastName varchar(10)
);
create table if not exists Address (
    AddressId int,
    PersonId int,
    City varchar(10),
    State varchar(10)
);
insert into Person values(1,'person1','lastname1'),
(2,'person2','lastname2'),(3,'person3','lastname3');

insert into Address values(1,1,'city1','state1'),
(2,2,'city2','state2'),(3,3,'city3','state3');
#--------------------------------------------------------
select 
    FirstName, LastName, City, State
from
    Person
        left join
    Address ON Person.PersonId = Address.PersonId;