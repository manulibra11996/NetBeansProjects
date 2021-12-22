package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Opinion;

public interface OpinionRepository extends CrudRepository<Opinion, Long> {

}
