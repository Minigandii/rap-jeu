package com.example.rapjeuback.JPA;

import com.example.rapjeuback.models.User;
import com.example.rapjeuback.repositories.UserDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class JpaUserDao implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User findByUsername(String username) {
        return entityManager.createQuery("FROM User u WHERE u.username = :username", User.class)
                .setParameter("username", username)
                .getResultList()
                .stream()
                .findFirst()
                .orElse(null);
    }

    @Override
    public User findByEmail(String email) {
        return entityManager.createQuery("FROM User u WHERE u.email = :email", User.class)
                .setParameter("email", email)
                .getResultList()
                .stream()
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> findAll() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public Optional<User> getById(Long id) {
        return Optional.ofNullable(entityManager.find(User.class, id));
    }

    @Override
    public User save(User user) {
        if (user.getId() == null) {
            entityManager.persist(user);
        } else {
            user = entityManager.merge(user);
        }
        return user;
    }

    @Override
    public void deleteById(Long id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
        }
    }
}
