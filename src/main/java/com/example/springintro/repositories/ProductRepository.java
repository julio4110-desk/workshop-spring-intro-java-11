package com.example.springintro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springintro.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
