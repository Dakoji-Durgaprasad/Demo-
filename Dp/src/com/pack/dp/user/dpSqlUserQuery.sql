CREATE DATABASE Dp;
USE Dp;

CREATE TABLE User_info( 
Id INT PRIMARY KEY AUTO_INCREMENT,
Name VARCHAR(50) NOT NULL,
Date_Of_Birth DATE NOT NULL,
Address VARCHAR(90) NOT NULL,
Phone_No LONG NOT NULL
);

DESC user_info;

SELECT * FROM User_info;
insert into User_info(Name, Date_Of_Birth, Address, Phone_No) values("Dp","2000-5-25","ppm","8501388");
			