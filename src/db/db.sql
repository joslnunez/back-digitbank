CREATE DATABASE IF NOT EXISTS digitbank;

USE digitbank;

DROP TABLE usuarios;

CREATE TABLE IF NOT EXISTS usuarios (
    id int(11) PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(32) NOT NULL,
    apellido varchar(32) NOT NULL,
    email varchar(72) NOT NULL UNIQUE KEY,
    contrasenia varchar(255) NOT NULL
);