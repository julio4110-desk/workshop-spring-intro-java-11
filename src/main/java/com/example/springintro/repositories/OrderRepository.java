package com.example.springintro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springintro.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
