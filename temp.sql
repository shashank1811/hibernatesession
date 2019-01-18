create database hibernate;
use hibernate;
create table address (
	id int not null auto_increment,
	city varchar(15),
	streetno varchar(15),
	createdat timestamp default current_timestamp,
	updatedat timestamp default current_timestamp on update current_timestamp ,
	primary key (id)
);

create table employee (
	EmpId int not null auto_increment,
	name varchar(15),
	age int,
	CId int,
	Crat timestamp default current_timestamp,
	upat timestamp default current_timestamp on update current_timestamp,
	addressid int,
	primary key (EmpId)
);

create table phone(
	id int not null auto_increment,
	phoneno varchar(15),
	employeeid int,
	primary key (id)
);

ALTER TABLE employee ADD constraint fk_emp_add foreign key (EmpId) REFERENCES address(id);

ALTER table phone add constraint fk_phone_emp foreign key (id) REFERENCES EmpId;