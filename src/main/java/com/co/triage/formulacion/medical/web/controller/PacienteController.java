package com.co.triage.formulacion.medical.web.controller;

import com.co.triage.formulacion.medical.persistence.entity.PacienteEntity;
import com.co.triage.formulacion.medical.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {
    private final PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public ResponseEntity<List<PacienteEntity>> getAll(){
        return ResponseEntity.ok(this.pacienteService.getAll());
    }

    @GetMapping("/{idPaciente}")
    public ResponseEntity<PacienteEntity> get(@PathVariable long idPaciente){
        return ResponseEntity.ok(this.pacienteService.get(idPaciente));
    }

    @PostMapping
    public ResponseEntity<PacienteEntity> add(@RequestBody PacienteEntity paciente){
        if (paciente.getIdPaciente() == null || !this.pacienteService.exists(paciente.getIdPaciente())){
            return ResponseEntity.ok(this.pacienteService.save(paciente));
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping
    public ResponseEntity<PacienteEntity> update(@RequestBody PacienteEntity paciente){
        if(paciente.getIdPaciente() != null && this.pacienteService.exists(paciente.getIdPaciente())){
            return ResponseEntity.ok(this.pacienteService.save(paciente));
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/{idPaciente}")
    public ResponseEntity<Void> delete(@PathVariable long idPaciente){
        if(this.pacienteService.exists(idPaciente)){
            this.pacienteService.delete(idPaciente);
        }
        return ResponseEntity.badRequest().build();
    }
}
