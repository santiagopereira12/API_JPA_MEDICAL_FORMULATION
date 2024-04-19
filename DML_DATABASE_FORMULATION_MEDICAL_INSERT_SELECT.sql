INSERT INTO medico (id_medico, nombre, apellido) VALUES ('13590','Valeria','Sanchez'),('26847','Nicole','Rengifo');
INSERT INTO paciente (id_paciente, nombre, apellido) VALUES ('31795','Santiago','Pereira'),('24860','Josefino','Gonzalez');

INSERT INTO formulacionMedica (id_medico, id_paciente, id_medicamento, int_cantidad, str_observacion, dt_fecha_formulacion) VALUES ('13590','31795', 9, 15, 'Primer Dato','2024-4-15'),
('26847','24860', 15, 15, 'Segundo Dato','2024-4-15');

SELECT * FROM medico;
SELECT * FROM paciente;
SELECT * FROM medicamentos;
SELECT * FROM formulacionmedica;
SELECT * FROM medicamentos WHERE id_medicamento = 15;
SELECT * FROM medicamentos WHERE id_medicamento = 9;

SELECT
P.nombre AS Paciente,
M.nombre as Medico,
FM.id_formula,
FM.id_medico AS Cedula_Doctor,
FM.id_paciente AS Cedula_Paciente,
MED.nombre_medicamento AS Medicamento,
FM.int_cantidad AS Cantidad,
FM.str_observacion AS Observacion,
FM.dt_fecha_formulacion AS Fecha
FROM formulacionmedica FM
INNER JOIN medico M ON M.id_medico = FM.id_medico
INNER JOIN paciente P ON P.id_paciente = FM.id_paciente
INNER JOIN medicamentos MED ON MED.id_medicamento = FM.id_medicamento;
