package com.co.triage.formulacion.medical.web.controller;

import com.co.triage.formulacion.medical.persistence.entity.FormulacionMedicaEntity;
import com.co.triage.formulacion.medical.service.FormulacionMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formulacion")
public class FormulacionMedicaController {
    private final FormulacionMedicaService formulacionMedicaService;

    @Autowired
    public FormulacionMedicaController(FormulacionMedicaService formulacionMedicaService) {
        this.formulacionMedicaService = formulacionMedicaService;
    }

    @GetMapping
    public ResponseEntity<List<FormulacionMedicaEntity>> getAll(){
        return ResponseEntity.ok(this.formulacionMedicaService.getAll());
    }

    @GetMapping("/{idFormula}")
    public ResponseEntity<FormulacionMedicaEntity> get(@PathVariable long idFormula){
        return ResponseEntity.ok(this.formulacionMedicaService.get(idFormula));
    }

    @PostMapping
    public ResponseEntity<FormulacionMedicaEntity> add(@RequestBody FormulacionMedicaEntity formulacion){
        if (formulacion.getIdFormula() == null || !this.formulacionMedicaService.exists(formulacion.getIdFormula())){
            return ResponseEntity.ok(this.formulacionMedicaService.save(formulacion));
        }
        return ResponseEntity.badRequest().build();
    }
}
