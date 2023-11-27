package com.example.rapjeuback.JPA;

import com.example.rapjeuback.models.Rapper;
import com.example.rapjeuback.repositories.RapperDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
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

    @Override
    public List<Rapper> getRapperTable(int number) {
        TypedQuery<Rapper> query = entityManager.createQuery(
                        "SELECT r FROM Rapper r ORDER BY RAND()", Rapper.class)
                .setMaxResults(number);

        return query.getResultList();
    }
}
