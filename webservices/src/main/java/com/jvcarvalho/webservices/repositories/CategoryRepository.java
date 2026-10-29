package com.jvcarvalho.webservices.repositories;

import com.jvcarvalho.webservices.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
