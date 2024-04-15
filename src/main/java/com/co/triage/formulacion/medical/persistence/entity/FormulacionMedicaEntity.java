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

    public long getIdFormula() {
        return idFormula;
    }

    public void setIdFormula(long idFormula) {
        this.idFormula = idFormula;
    }

    public Integer getIntCantidad() {
        return intCantidad;
    }

    public void setIntCantidad(Integer intCantidad) {
        this.intCantidad = intCantidad;
    }

    public String getStrObservacion() {
        return strObservacion;
    }

    public void setStrObservacion(String strObservacion) {
        this.strObservacion = strObservacion;
    }

    public Date getDtFechaFormularcion() {
        return dtFechaFormularcion;
    }

    public void setDtFechaFormularcion(Date dtFechaFormularcion) {
        this.dtFechaFormularcion = dtFechaFormularcion;
    }

    public MedicoEntity getMedico() {
        return medico;
    }

    public void setMedico(MedicoEntity medico) {
        this.medico = medico;
    }

    public PacienteEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteEntity paciente) {
        this.paciente = paciente;
    }

    public MedicamentosEntity getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(MedicamentosEntity medicamentos) {
        this.medicamentos = medicamentos;
    }
}
