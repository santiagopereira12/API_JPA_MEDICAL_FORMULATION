package com.co.triage.formulacion.medical.web.controller;

import com.co.triage.formulacion.medical.persistence.entity.MedicoEntity;
import com.co.triage.formulacion.medical.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{idMedico}")
    public ResponseEntity<MedicoEntity> get(@PathVariable long idMedico){
        return ResponseEntity.ok(this.medicoService.get(idMedico));
    }

    @PostMapping
    public ResponseEntity<MedicoEntity> add(@RequestBody MedicoEntity medico){
        if (medico.getIdMedico() == null || !this.medicoService.exists(medico.getIdMedico())){
            return ResponseEntity.ok(this.medicoService.save(medico));
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping
    public ResponseEntity<MedicoEntity> update(@RequestBody MedicoEntity medico){
        if (medico.getIdMedico() != null && this.medicoService.exists(medico.getIdMedico())){
            return ResponseEntity.ok(this.medicoService.save(medico));
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/{idMedico}")
    public ResponseEntity<Void> delete(@PathVariable long idMedico){
        if(this.medicoService.exists(idMedico)){
            this.medicoService.delete(idMedico);
            //return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
