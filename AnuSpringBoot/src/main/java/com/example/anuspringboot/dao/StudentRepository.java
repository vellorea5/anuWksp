package com.example.anuspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.anuspringboot.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
