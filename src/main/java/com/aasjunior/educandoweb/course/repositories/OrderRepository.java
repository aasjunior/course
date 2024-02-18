package com.aasjunior.educandoweb.course.repositories;

import com.aasjunior.educandoweb.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
