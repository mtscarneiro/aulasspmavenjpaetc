package com.mtscarneirotech.application.repositories;

import com.mtscarneirotech.application.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
