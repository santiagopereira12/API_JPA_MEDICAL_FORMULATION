package com.co.triage.formulacion.medical.service;

import com.co.triage.formulacion.medical.persistence.entity.PacienteEntity;
import com.co.triage.formulacion.medical.persistence.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
    private final PacienteRepository pacienteRepository;

    @Autowired
    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public List<PacienteEntity> getAll(){
        return this.pacienteRepository.findAll();
    }

    public PacienteEntity get(long idPaciente){
        return this.pacienteRepository.findById(idPaciente).orElse(null);
    }

    public PacienteEntity save(PacienteEntity paciente){
        return this.pacienteRepository.save(paciente);
    }

    public void delete(long idPaciente){
        this.pacienteRepository.deleteById(idPaciente);
    }

    public boolean exists(long idPaciente){
        return this.pacienteRepository.existsById(idPaciente);
    }
}
