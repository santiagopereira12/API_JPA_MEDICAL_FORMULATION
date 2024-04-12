package com.co.triage.formulacion.medical.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "medico")
public class MedicoEntity {
    @Id
    @Column(name = "id_medico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMedico;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;

}
