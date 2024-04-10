package com.co.triage.formulacion.medical.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "medicamentos")
public class MedicamentosEntity {
    @Id
    @Column(name = "id_medicamento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idMedicamentos;
    @Column(name = "nombre_medicamento")
    private String nombreMedicamento;
    @Column(name = "url")
    private String url;
}
