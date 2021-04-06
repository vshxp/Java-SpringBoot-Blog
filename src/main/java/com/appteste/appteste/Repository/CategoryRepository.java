package com.appteste.appteste.Repository;

import com.appteste.appteste.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
