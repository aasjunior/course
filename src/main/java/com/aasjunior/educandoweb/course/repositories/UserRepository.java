package com.aasjunior.educandoweb.course.repositories;

import com.aasjunior.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
