package com.co.triage.formulacion.medical.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "medico")
public class MedicoEntity {
    @Id
    @Column(name = "idMedico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idMedico;
}
