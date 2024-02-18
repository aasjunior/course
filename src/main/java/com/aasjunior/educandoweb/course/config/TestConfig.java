package com.aasjunior.educandoweb.course.config;

import com.aasjunior.educandoweb.course.entities.User;
import com.aasjunior.educandoweb.course.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
@RequiredArgsConstructor
public class TestConfig implements CommandLineRunner {
    private final UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(
                null,
                "Maria Brown",
                "maria@gmail.com",
                "98888888888",
                "123456"
        );

        User user2 = new User(
                null,
                "Alex Green",
                "alex@gmail.com",
                "97777777777",
                "123456"
        );

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
