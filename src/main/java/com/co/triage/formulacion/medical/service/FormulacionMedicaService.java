package com.co.triage.formulacion.medical.service;

import com.co.triage.formulacion.medical.persistence.entity.FormulacionMedicaEntity;
import com.co.triage.formulacion.medical.persistence.repository.FormulacionMedicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormulacionMedicaService {
    private final FormulacionMedicaRepository formulacionMedicaRepository;

    @Autowired
    public FormulacionMedicaService(FormulacionMedicaRepository formulacionMedicaRepository) {
        this.formulacionMedicaRepository = formulacionMedicaRepository;
    }

    public List<FormulacionMedicaEntity> getAll(){
        List<FormulacionMedicaEntity> formulacion = this.formulacionMedicaRepository.findAll();
        formulacion.forEach(o -> System.out.println(o.getMedico().getNombre()));
        return formulacion;
    }

    public FormulacionMedicaEntity get(long idFormula){
        return this.formulacionMedicaRepository.findById(idFormula).orElse(null);
    }

    public FormulacionMedicaEntity save(FormulacionMedicaEntity formulacion){
        return this.formulacionMedicaRepository.save(formulacion);
    }



    public boolean exists(long idFormula){
        return this.formulacionMedicaRepository.existsById(idFormula);
    }
}
