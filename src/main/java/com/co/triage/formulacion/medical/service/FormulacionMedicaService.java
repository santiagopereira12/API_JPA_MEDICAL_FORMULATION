package com.co.triage.formulacion.medical.service;

import com.co.triage.formulacion.medical.persistence.entity.FormulacionMedicaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormulacionMedicaService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public FormulacionMedicaService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<FormulacionMedicaEntity> getAll(){
        return this.jdbcTemplate.query("SELECT * FROM formulacionmedica", new BeanPropertyRowMapper<>(FormulacionMedicaEntity.class));
    }
}
