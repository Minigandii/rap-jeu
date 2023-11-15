package com.example.rapjeuback.jpa;

import com.example.rapjeuback.models.Rapper;
import com.example.rapjeuback.repositories.RapperDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class JpaRapperDao implements RapperDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Rapper> findAll() {
        return entityManager.createQuery("FROM Rapper", Rapper.class).getResultList();
    }

    @Override
    public Optional<Rapper> getById(Long id) {
        return Optional.ofNullable(entityManager.find(Rapper.class, id));
    }

    @Override
    public Rapper save(Rapper rapper) {
        if (rapper.getId() == null) {
            entityManager.persist(rapper);
        } else {
            rapper = entityManager.merge(rapper);
        }
        return rapper;
    }

    @Override
    public void deleteById(Long id) {
        Rapper rapper = entityManager.find(Rapper.class, id);
        if (rapper != null) {
            entityManager.remove(rapper);
        }
    }
}
