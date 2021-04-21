package com.mtscarneirotech.aulas.repositories;

import com.mtscarneirotech.aulas.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
