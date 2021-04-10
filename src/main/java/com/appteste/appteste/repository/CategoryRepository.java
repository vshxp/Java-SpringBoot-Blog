package com.appteste.appteste.repository;

import com.appteste.appteste.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
