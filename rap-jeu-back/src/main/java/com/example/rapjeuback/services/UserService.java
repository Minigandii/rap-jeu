package com.example.rapjeuback.services;

import com.example.rapjeuback.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User getById(Long id);

    User save(User user);

    void delete(Long id);
}
