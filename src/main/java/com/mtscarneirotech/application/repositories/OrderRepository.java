package com.mtscarneirotech.application.repositories;

import com.mtscarneirotech.application.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
