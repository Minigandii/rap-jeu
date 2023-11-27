package com.example.rapjeuback.JPA;

import com.example.rapjeuback.models.Game;
import com.example.rapjeuback.repositories.GameDao;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class JpaGameDao implements GameDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Game> findAll() {
        String jpql = "SELECT q FROM Game q";
        TypedQuery<Game> query = entityManager.createQuery(jpql, Game.class);
        return query.getResultList();
    }


    @Override
    public Game save(Game answer) {
        return null;
    }


    @Override
    public Optional<Game> getById(Long id) {
        return entityManager.createQuery("FROM Game q WHERE q.id = :id", Game.class)
                .setParameter("id", id)
                .getResultList()
                .stream()
                .findFirst();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Game> findBestGames() {
        return entityManager.createQuery("SELECT g FROM Game g ORDER BY g.score DESC").getResultList();
    }
}