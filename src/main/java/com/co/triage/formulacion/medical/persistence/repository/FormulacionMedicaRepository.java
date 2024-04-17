package com.co.triage.formulacion.medical.persistence.repository;

import com.co.triage.formulacion.medical.persistence.entity.FormulacionMedicaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface FormulacionMedicaRepository extends ListCrudRepository<FormulacionMedicaEntity,Long> {
}
