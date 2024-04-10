package com.co.triage.formulacion.medical.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "formulacionmedica")
public class FormulacionMedicaEntity {
    @Id
    @Column(name = "idFormula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFormula;
    @Column(name = "idMedico")
    private String idMedico;
    @Column(name = "idPaciente")
    private String idPaciente;
    @Column(name = "idMedicamento")
    private String idMedicamento;
    @Column(name = "intCantidad")
    private Integer intCantidad;
    @Column(name = "strObservacion")
    private String strObservacion;
    @Column(name = "dtFechaFormulario")
    private Date dtFechaFormulario;

    @ManyToOne
    @JoinColumn(name = "idMedico", referencedColumnName = "idMedico", insertable = false, updatable = false)
    private MedicoEntity medico;

    @ManyToOne
    @JoinColumn(name = "idPaciente", referencedColumnName = "idPaciente", insertable = false, updatable = false)
    private PacienteEntity paciente;

    @ManyToOne
    @JoinColumn(name = "idMedicamento", referencedColumnName = "id_Medicamento", insertable = false, updatable = false)
    private MedicamentosEntity medicamentos;
}
