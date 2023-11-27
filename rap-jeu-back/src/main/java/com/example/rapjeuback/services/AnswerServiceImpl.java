package com.example.rapjeuback.services;

import com.example.rapjeuback.DTO.AnswerDto;
import com.example.rapjeuback.models.Answer;
import com.example.rapjeuback.repositories.AnswerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerServiceImpl implements AnswerService{

    final
    AnswerDao answerDao;

    final QuestionService questionService;

    public AnswerServiceImpl(AnswerDao answerDao, QuestionService questionService) {
        this.answerDao = answerDao;
        this.questionService = questionService;
    }

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

    @Override
    public void addAnswer(AnswerDto answerDto) {
        Answer answer = Answer.AnswerBuilder.anAnswer()
                .withGoodAnswer(answerDto.isGoodAnswer())
                .withAnswerTextQuestion(answerDto.getAnswerTextQuestion())
                .withQuestion(questionService.getById(answerDto.getId()).get())
                .build();
        answerDao.addAnswer(answer);
    }
}
