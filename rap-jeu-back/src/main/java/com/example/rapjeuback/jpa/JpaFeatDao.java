package com.example.rapjeuback.jpa;

import com.example.rapjeuback.models.Feat;
import com.example.rapjeuback.models.Feat;
import com.example.rapjeuback.repositories.FeatDao;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class JpaFeatDao implements FeatDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Feat> findAll() {
        String jpql = "SELECT q FROM Feat q";
        TypedQuery<Feat> query = entityManager.createQuery(jpql, Feat.class);
        return query.getResultList();
    }


    @Override
    public Feat save(Feat answer) {
        return null;
    }


    @Override
    public Optional<Feat> getById(Long id) {
        return entityManager.createQuery("FROM Feat q WHERE q.id = :id", Feat.class)
                .setParameter("id", id)
                .getResultList()
                .stream()
                .findFirst();
    }

    @Override
    public void deleteById(Long id) {

    }
}