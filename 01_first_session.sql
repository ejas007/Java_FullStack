CREATE DATABASE pentagon;
USE pentagon;

-- Create is use to create the table inside the DB 
CREATE TABLE student(
	StudentId int,
    StudentName varchar(50),
    Branch varchar(20),
    CollegeName varchar(50)
    );

-- Show the tables ie whatever the tables are present 
SHOW TABLES;

-- Show the description of the table 
DESCRIBE STUDENT;

-- To insert the data inside the Table 
INSERT INTO STUDENT VALUES
	(01,"Tejasvi","IT","GGU"),
    (02,"Ritesh","EC","GGU"),
	(03,"Nilesh","CSE","Betul College");

-- For deleting the records use truncate
TRUNCATE STUDENT;

CREATE TABLE Product(
	ProductID int,
    ProductName varchar(30),
    P_Category varchar(20),
    Price double
); 

INSERT INTO Product VALUES 
	(01,"Legion","Laptop",65000),
    (02,"Realme 6","Mobile",17000),
    (03,"Ritesh","Human",15000),
    (04,"Vico Termeric","Cream",200),
    (05,"Pantanjali Sunscreen","Cosmetics",150);
    
SELECT * FROM Product;

-- To remove safe mode 
SET SQL_SAFE_UPDATES = 0;
-- Updating Records
-- Syntax - 
UPDATE Product
SET ProductName = "Marker", P_Category = "Camlin", Price = 100
WHERE ProductID = 03;

CREATE TABLE Employees(
	Employee_ID int,
    Employee_Name varchar(30),
    Salary double,
    Designation varchar(20),
    Department varchar(10),
    Experience double,
    Company_Name varchar(20)
); 

INSERT INTO Employees VALUES 
	-- (01,"Tejasvi",111111118000.50,"Owner","IT",10.5,"Startup"),
-- 	(02,"Ritesh",3000000.50,"CTO","IT",1.5,"Startup"),
-- 	(03,"Nilesh",68000.50,"Software Engineer","IT",10.5,"Startup"),
-- 	(04,"Aastha",100000.50,"CEO","Finance",10.5,"Startup"),
-- 	(05,"Sukhanya",68000.50,"Software Engineer","IT",10.5,"Startup"),
	(06,"Sukhanya",68000.50,"Software Engineer","IT",10.5,"Startup");
    
SELECT COUNT(Employee_ID)
from Employees
GROUP BY (Employee_Name);