package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        if (userRepository.users.isEmpty()) {
            userRepository.save(new User(null, "Ivan", "Ivanov", "ii@gmail.com"));
            userRepository.save(new User(null, "Petr", "Petrov", "ii@mail.ru"));
            userRepository.save(new User(null, "Aleksey", "Alekseev", "aa@yandex.ru"));
        }
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

}