CREATE table products(
	product_id serial,
	product_name varchar UNIQUE NOT NULL,
	category varchar,
	price real,
	stock int
);


Insert into products values (default, 'Egg', 'Food', 45.50, 200);
Insert into products values (default, 'Shampoo', 'Hygiene', 20.90, 500);
Insert into products values (default, 'Napkin', 'Hygiene', 5.50, 2000);
Insert into products values (default, 'Orange', 'Food', 12.00, 300);
Insert into products values (default, 'Beans', 'Food', 16.90, 900);

CREATE TABLE admins(
	username varchar(10) UNIQUE NOT NULL,
	password varchar(10) NOT NULL
)

Insert into admins values ('osman', '123');
Insert into admins values ('hakan', '345');


CREATE TABLE customers(
	customer_id serial,
	customerFirstName varchar(20) NOT NULL,
	customerLastName varchar(20) NOT NULL,
	mailAdress varchar(30) UNIQUE NOT NULL,
	userName varchar(20) UNIQUE NOT NULL,
	password varchar(20) NOT NULL
)

INSERT INTO customers VALUES (0001, 'Osman', 'Dogan', 'iosmandogan@gmail.com', 'osmandgn', '1234');