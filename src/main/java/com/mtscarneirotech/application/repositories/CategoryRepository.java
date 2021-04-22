package com.mtscarneirotech.application.repositories;

import com.mtscarneirotech.application.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
