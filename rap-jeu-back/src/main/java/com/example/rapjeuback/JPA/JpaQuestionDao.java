package com.example.rapjeuback.JPA;

import com.example.rapjeuback.models.Question;
import com.example.rapjeuback.repositories.QuestionDao;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class JpaQuestionDao implements QuestionDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Question> findAll() {
        String jpql = "SELECT q FROM Question q";
        TypedQuery<Question> query = entityManager.createQuery(jpql, Question.class);
        return query.getResultList();
    }


    @Override
    public Question save(Question answer) {
        return null;
    }


    @Override
    public Optional<Question> getById(Long id) {
        return entityManager.createQuery("FROM Question q WHERE q.id = :id", Question.class)
                .setParameter("id", id)
                .getResultList()
                .stream()
                .findFirst();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Question> getQuestionTable(int number) {
        TypedQuery<Question> query = entityManager.createQuery(
                        "SELECT q FROM Question q ORDER BY RAND()", Question.class)
                .setMaxResults(number);

        return query.getResultList();
    }

    @Override
    public void addQuestion(Question question) {
        entityManager.persist(question);
    }
}