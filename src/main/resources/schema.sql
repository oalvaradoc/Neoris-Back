DROP TABLE IF EXISTS PERSONAS;

CREATE TABLE PERSONAS (
  id int(11) auto_increment NOT NULL,
  name varchar(255) NOT NULL,
  apellidos varchar(255) NOT NULL,
  Procesado bit(1) NOT NULL
)

