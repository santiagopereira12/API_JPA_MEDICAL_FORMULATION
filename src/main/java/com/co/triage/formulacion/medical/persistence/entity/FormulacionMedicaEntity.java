package com.co.triage.formulacion.medical.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "formulacionmedica")
public class FormulacionMedicaEntity {
    @Id
    @Column(name = "id_formula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormula;

    @Column(name = "id_medico")
    private Integer idMedico;
    @Column(name = "id_paciente")
    private Integer idPaciente;
    @Column(name = "id_medicamento")
    private Integer idMedicamento;
    @Column(name = "int_cantidad")
    private Integer intCantidad;
    @Column(name = "str_observacion")
    private String strObservacion;
    @Column(name = "dt_fecha_formulacion")
    private Date dtFechaFormularcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medico", referencedColumnName = "id_medico", insertable = false, updatable = false)
    @JsonIgnore
    private MedicoEntity medico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente", insertable = false, updatable = false)
    @JsonIgnore
    private PacienteEntity paciente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_medicamento", referencedColumnName = "id_medicamento", insertable = false, updatable = false)
    private MedicamentosEntity medicamentos;

    public Long getIdFormula() {
        return idFormula;
    }

    public void setIdFormula(Long idFormula) {
        this.idFormula = idFormula;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(Integer idMedicamento) {
        this.idMedicamento = idMedicamento;
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
