package com.example.rapjeuback.jpa;

import com.example.rapjeuback.models.Answer;
import com.example.rapjeuback.models.Question;
import com.example.rapjeuback.repositories.AnswerDao;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class JpaAnswerDao implements AnswerDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Answer> findAll() {
        String jpql = "SELECT a FROM Answer a";
        TypedQuery<Answer> query = entityManager.createQuery(jpql, Answer.class);
        return query.getResultList();
    }

    @Override
    public List<Answer> findByGoodAnswer(boolean goodAnswer) {
        String jpql = "SELECT a FROM Answer a WHERE a.goodAnswer = :goodAnswer";
        TypedQuery<Answer> query = entityManager.createQuery(jpql, Answer.class);
        query.setParameter("goodAnswer", goodAnswer);
        return query.getResultList();
    }

    @Override
    public List<Answer> findByQuestion(Question question) {
        String jpql = "SELECT a FROM Answer a WHERE a.question = :question";
        TypedQuery<Answer> query = entityManager.createQuery(jpql, Answer.class);
        query.setParameter("question", question);
        return query.getResultList();
    }

    @Override
    public Answer save(Answer answer) {
        return null;
    }


    @Override
    public Optional<Answer> getById(Long id) {
        return entityManager.createQuery("FROM Answer a WHERE a.id = :id", Answer.class)
                .setParameter("id", id)
                .getResultList()
                .stream()
                .findFirst();
    }

    @Override
    public void deleteById(Long id) {

    }
}