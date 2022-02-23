CREATE SCHEMA `spring_boot_crud`;
USE `spring_boot_crud`;

CREATE TABLE employees (
    id int NOT NULL AUTO_INCREMENT,
    first_name varchar(255),
    last_name varchar(255),
    email varchar(255),
    PRIMARY KEY (id)
);

SELECT * FROM employees;

DROP DATABASE `spring_boot_crud`;