package com.dc18669.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class JdbcTemplateService {

    private static final String SELECT_SQL_1 = "SELECT NAME FROM USER WHERE ID = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getName(int id) {
        return jdbcTemplate.queryForObject(SELECT_SQL_1, String.class, id);
    }
}
