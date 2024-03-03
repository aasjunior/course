package com.aasjunior.educandoweb.course.config;

import com.aasjunior.educandoweb.course.entities.Order;
import com.aasjunior.educandoweb.course.entities.User;
import com.aasjunior.educandoweb.course.entities.enums.OrderStatus;
import com.aasjunior.educandoweb.course.repositories.OrderRepository;
import com.aasjunior.educandoweb.course.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
@RequiredArgsConstructor
public class TestConfig implements CommandLineRunner {
    private final UserRepository userRepository;
    private final OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(
                null,
                "Maria Brown",
                "maria@gmail.com",
                "98888888888",
                "123456",
                null
        );

        User user2 = new User(
                null,
                "Alex Green",
                "alex@gmail.com",
                "97777777777",
                "123456",
                null
        );

        Order order1 = new Order(
                null,
                Instant.parse("2024-02-16T01:03:07Z"),
                OrderStatus.PAID,
                user1
        );

        Order order2 = new Order(
                null,
                Instant.parse("2024-02-17T01:03:07Z"),
                OrderStatus.WAITING_PAYMENT,
                user2
        );

        Order order3 = new Order(
                null,
                Instant.parse("2024-02-18T01:03:07Z"),
                OrderStatus.WAITING_PAYMENT,
                user1
        );

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
    }
}
