#------------------------data
create table if not exists Person (
    Id int,
	Email varchar(20)
);
insert into Person values(1,'a@b.com'),
(2,'c@d.com'),(3,'a@b.com');
#--------------------------------------------------------
SELECT Email
FROM
  (SELECT count(*) AS c,
          Email
   FROM Person
   GROUP BY Email) a
WHERE c>1;