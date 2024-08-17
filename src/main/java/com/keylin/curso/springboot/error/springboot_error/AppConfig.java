package com.keylin.curso.springboot.error.springboot_error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.keylin.curso.springboot.error.springboot_error.models.domain.User;

@Configuration
public class AppConfig {

    @Bean
    List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Kiki", "Jaimes"));
        users.add(new User(2L, "Charlie", "Hernandez"));
        users.add(new User(3L, "Daniela", "Rios"));
        users.add(new User(4L, "Miguel", "Casas"));
        users.add(new User(5L, "Sara", "Rose"));
        return users;
    }
}
