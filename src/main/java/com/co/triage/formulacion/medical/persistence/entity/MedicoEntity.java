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
    @Column(name = "idMedico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idMedico;

    @OneToMany(mappedBy = "medico")
    private List<FormulacionMedicaEntity> formulacion;
}
