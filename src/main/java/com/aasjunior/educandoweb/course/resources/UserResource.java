package com.aasjunior.educandoweb.course.resources;

import com.aasjunior.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Maria", "maria@gmail.com", "99999999999", "12345");
        return ResponseEntity.ok().body(user);
    }
}
