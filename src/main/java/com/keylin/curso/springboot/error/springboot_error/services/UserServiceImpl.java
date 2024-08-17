package com.keylin.curso.springboot.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.keylin.curso.springboot.error.springboot_error.exceptions.UserNotFoundException;
import com.keylin.curso.springboot.error.springboot_error.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Kiki", "Jaimes"));
        users.add(new User(2L, "Charlie", "Hernandez"));
        users.add(new User(3L, "Daniela", "Rios"));
        users.add(new User(4L, "Miguel", "Casas"));
        users.add(new User(5L, "Sara", "Rose"));

    };

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(Long id) {
        User user = null;
        for (User u : users) {
            if (u.getId().equals(id)) {
                user = u;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("Error, el usuario no existe!");
        }
        return user;
    }

}
