package com.example.springintro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springintro.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
