package com.aasjunior.educandoweb.course.repositories;

import com.aasjunior.educandoweb.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
