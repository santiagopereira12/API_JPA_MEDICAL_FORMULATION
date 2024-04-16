package com.co.triage.formulacion.medical.persistence.repository;

import com.co.triage.formulacion.medical.persistence.entity.PacienteEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PacienteRepository extends ListCrudRepository<PacienteEntity, Long> {
}
