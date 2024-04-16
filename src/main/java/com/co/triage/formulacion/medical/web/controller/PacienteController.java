package com.co.triage.formulacion.medical.web.controller;

import com.co.triage.formulacion.medical.persistence.entity.PacienteEntity;
import com.co.triage.formulacion.medical.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
