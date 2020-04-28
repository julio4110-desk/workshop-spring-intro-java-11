package com.example.springintro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springintro.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
