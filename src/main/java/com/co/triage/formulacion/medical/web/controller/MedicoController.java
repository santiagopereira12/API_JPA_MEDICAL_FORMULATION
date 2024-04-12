package com.co.triage.formulacion.medical.web.controller;

import com.co.triage.formulacion.medical.persistence.entity.MedicoEntity;
import com.co.triage.formulacion.medical.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/medico")
public class MedicoController {
    private final MedicoService medicoService;

    @Autowired
    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping
    public ResponseEntity<List<MedicoEntity>> getAll(){
        return ResponseEntity.ok(this.medicoService.getAll());
    }
}
