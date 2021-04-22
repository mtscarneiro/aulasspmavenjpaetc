package com.mtscarneirotech.application.repositories;

import com.mtscarneirotech.application.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
