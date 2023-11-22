package com.example.rapjeuback.services;

import java.util.List;
import java.util.Optional;

import com.example.rapjeuback.jpa.JpaQuestionDao;
import com.example.rapjeuback.models.Question;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService{
    private final JpaQuestionDao questionDao;

    public QuestionServiceImpl(JpaQuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    @Override
    public List<Question> findAll() {
        return questionDao.findAll();
    }

    @Override
    public Optional<Question> getById(Long id) {
        return questionDao.getById(id);
    }

    @Override
    public Question save(Question question) {
        return questionDao.save(question);
    }

    @Override
    public void delete(Long id) {
        questionDao.deleteById(id);
    }
}