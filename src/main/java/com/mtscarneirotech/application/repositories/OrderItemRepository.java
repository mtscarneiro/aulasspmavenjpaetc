package com.mtscarneirotech.application.repositories;

import com.mtscarneirotech.application.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
