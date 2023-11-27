package com.example.rapjeuback.repositories;

import com.example.rapjeuback.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao {
    User findByUsername(String username);
    User findByEmail(String email);
    List<User> findAll();

    Optional<User> getById(Long id);

    User save(User user);

    void deleteById(Long id);
}