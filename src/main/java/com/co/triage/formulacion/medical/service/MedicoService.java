package com.co.triage.formulacion.medical.service;

import com.co.triage.formulacion.medical.persistence.entity.MedicoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MedicoService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<MedicoEntity> getAll(){
        return this.jdbcTemplate.query("SELECT * FROM medico", new BeanPropertyRowMapper<>(MedicoEntity.class));
    }
}
