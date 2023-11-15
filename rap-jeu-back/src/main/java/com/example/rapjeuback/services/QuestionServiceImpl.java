package com.example.rapjeuback.services;

import java.util.List;
import java.util.Optional;

import com.example.rapjeuback.models.Question;
import com.example.rapjeuback.repositories.QuestionDao;

public class QuestionServiceImpl implements QuestionService{
    private final QuestionDao questionDao;

    public QuestionServiceImpl(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    @Override
    public Optional<Question> getQuestionById(Long id) {
        return questionDao.getById(id);
    }

    @Override
    public Question saveQuestion(Question question) {
        return questionDao.save(question);
    }

    @Override
    public void deleteQuestion(Long id) {
        questionDao.deleteById(id);
    }
}