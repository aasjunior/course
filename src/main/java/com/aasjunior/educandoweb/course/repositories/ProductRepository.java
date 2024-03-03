package com.aasjunior.educandoweb.course.repositories;

import com.aasjunior.educandoweb.course.entities.Category;
import com.aasjunior.educandoweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
