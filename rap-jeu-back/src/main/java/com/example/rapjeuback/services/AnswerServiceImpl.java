package com.example.rapjeuback.services;

import com.example.rapjeuback.models.Answer;
import com.example.rapjeuback.repositories.AnswerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerServiceImpl implements AnswerService{

    @Autowired
    AnswerDao answerDao;
    @Override
    public List<Answer> findAll() {
        return answerDao.findAll();
    }

    @Override
    public Optional<Answer> getById(Long id) {
        return answerDao.getById(id);
    }

    @Override
    public Answer save(Answer answer) {
        return answerDao.save(answer);
    }

    @Override
    public void delete(Long id) {
        answerDao.deleteById(id);
    }
}
