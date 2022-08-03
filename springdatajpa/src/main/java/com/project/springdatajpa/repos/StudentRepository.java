package com.project.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
