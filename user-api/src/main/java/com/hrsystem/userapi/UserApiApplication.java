package com.hrsystem.userapi;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hrsystem.userapi.domain.User;
import com.hrsystem.userapi.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class UserApiApplication implements CommandLineRunner {
    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(
                List.of(new User(null, "Willyan Ferdinando", "willyan@mail.com",
                                "123", 20.0),
                        new User(null, "José Antonio", "jose@mail.com",
                                "123", 20.0)));
    }

}
