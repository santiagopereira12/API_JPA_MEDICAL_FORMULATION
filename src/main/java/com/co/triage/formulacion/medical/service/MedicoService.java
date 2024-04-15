package com.co.triage.formulacion.medical.service;

import com.co.triage.formulacion.medical.persistence.entity.MedicoEntity;
import com.co.triage.formulacion.medical.persistence.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {
    private final MedicoRepository medicoRepository;

    @Autowired
    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public List<MedicoEntity> getAll(){
        return this.medicoRepository.findAll();
    }

    public MedicoEntity get(long idMedico){
        return this.medicoRepository.findById(idMedico).orElse(null);
    }

    public MedicoEntity save(MedicoEntity medico){
        return this.medicoRepository.save(medico);
    }

    public void delete(long idMedico){
        this.medicoRepository.deleteById(idMedico);
    }

    public boolean exists(long idMedico){
        return this.medicoRepository.existsById(idMedico);
    }


}
