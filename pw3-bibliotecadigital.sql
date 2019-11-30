use master;
go
CREATE DATABASE pw3_bibliotecadigital
go
use pw3_bibliotecadigital;
go
CREATE TABLE editora(
	id_editora		INT			NOT NULL	IDENTITY(1,1)		PRIMARY KEY,
	nm_editora		VARCHAR(70) NOT NULL,	
);
GO