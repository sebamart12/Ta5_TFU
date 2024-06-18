CREATE DATABASE IF NOT EXISTS Olimpiadas;
USE Olimpiadas;

CREATE TABLE Persona (
    id INT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    correo VARCHAR(50),
    fecha_nacimiento DATE
);

CREATE TABLE Categoria (
    id INT PRIMARY KEY,
    nombre VARCHAR(50),
    sexo VARCHAR(50),
    cant_max_atletas INT
);

CREATE TABLE Deporte (
    id INT PRIMARY KEY,
    nombre VARCHAR(50),
    categoria_id INT,
    FOREIGN KEY (categoria_id) REFERENCES Categoria(id)
);


CREATE TABLE Atleta (
    id INT PRIMARY KEY,
    deporte_participa INT,
    categoria_participa INT,
    FOREIGN KEY (id) REFERENCES Persona(id),
    FOREIGN KEY (deporte_participa) REFERENCES Deporte(id),
    FOREIGN KEY (categoria_participa) REFERENCES Categoria(id)
);

CREATE TABLE Juez (
    id INT PRIMARY KEY,
    deporte_juzga INT,
    FOREIGN KEY (id) REFERENCES Persona(id),
    FOREIGN KEY (deporte_juzga) REFERENCES Deporte(id)
);
