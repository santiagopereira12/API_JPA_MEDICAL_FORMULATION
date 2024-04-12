package com.co.triage.formulacion.medical.persistence.repository;

import com.co.triage.formulacion.medical.persistence.entity.MedicoEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface MedicoRepository extends ListCrudRepository<MedicoEntity, Long> {
}
