CREATE DATABASE `proyectois`;

USE `proyectois`;

CREATE TABLE medico (
id_medico INT AUTO_INCREMENT,
nombre VARCHAR(36),
apellido VARCHAR(36),
PRIMARY KEY(id_medico)
);

CREATE TABLE paciente (
id_paciente INT AUTO_INCREMENT,
nombre VARCHAR(36),
apellido VARCHAR(36),
PRIMARY KEY (id_paciente)
);

CREATE TABLE medicamentos (
    id_medicamento INT NOT NULL AUTO_INCREMENT,
    nombre_medicamento VARCHAR(255) NOT NULL,
    url text(2000),
    PRIMARY KEY (id_medicamento)
);


CREATE TABLE formulacionMedica (
id_formula INT AUTO_INCREMENT,
id_medico INT,
id_paciente INT,
id_medicamento INT,
int_cantidad INT,
str_observacion VARCHAR(255),
dt_fecha_formulacion DATE,
PRIMARY KEY (id_formula)
);

ALTER TABLE formulacionMedica
ADD CONSTRAINT fk_id_medicamento
FOREIGN KEY (id_medicamento) REFERENCES medicamentos(id_medicamento);

ALTER TABLE formulacionmedica
ADD CONSTRAINT fk_id_medico
FOREIGN KEY (id_medico) REFERENCES medico(id_medico);

ALTER TABLE formulacionmedica
ADD CONSTRAINT fk_id_paciente
FOREIGN KEY (id_paciente) REFERENCES paciente(id_paciente);