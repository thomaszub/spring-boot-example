package com.example.demo.admin;

import org.springframework.data.repository.CrudRepository;

public interface FlywaySchemaHistoryRepository extends CrudRepository<FlywaySchemaHistory, Integer> {
}
