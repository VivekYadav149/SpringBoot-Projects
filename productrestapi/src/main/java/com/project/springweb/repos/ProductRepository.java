package com.project.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
