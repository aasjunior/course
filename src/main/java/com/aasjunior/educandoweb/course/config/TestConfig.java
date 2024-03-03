package com.aasjunior.educandoweb.course.config;

import com.aasjunior.educandoweb.course.entities.*;
import com.aasjunior.educandoweb.course.entities.enums.OrderStatus;
import com.aasjunior.educandoweb.course.repositories.*;
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
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

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

        OrderItem oi1 = new OrderItem(order1, p1, 2, p1.getPrice());
        OrderItem oi2 = new OrderItem(order1, p3, 1, p3.getPrice());
        OrderItem oi3 = new OrderItem(order2, p3, 2, p3.getPrice());
        OrderItem oi4 = new OrderItem(order3, p5, 2, p5.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));
    }
}
