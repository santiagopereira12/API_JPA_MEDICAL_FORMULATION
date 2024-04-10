package com.co.triage.formulacion.medical.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "paciente")
public class PacienteEntity {
    @Id
    @Column(name = "idPaciente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idPaciente;
}
