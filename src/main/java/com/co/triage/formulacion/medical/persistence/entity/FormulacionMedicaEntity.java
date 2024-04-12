package com.co.triage.formulacion.medical.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name = "formulacionmedica")
public class FormulacionMedicaEntity {
    @Id
    @Column(name = "id_formula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFormula;
    @Column(name = "int_cantidad")
    private Integer intCantidad;
    @Column(name = "str_observacion")
    private String strObservacion;
    @Column(name = "dt_fecha_formulacion")
    private Date dtFechaFormularcion;

    @ManyToOne
    @JoinColumn(name = "id_medico", referencedColumnName = "id_medico", insertable = false, updatable = false)
    private MedicoEntity medico;

    @ManyToOne
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente", insertable = false, updatable = false)
    private PacienteEntity paciente;

    @ManyToOne
    @JoinColumn(name = "id_medicamento", referencedColumnName = "id_medicamento", insertable = false, updatable = false)
    private MedicamentosEntity medicamentos;
}
