package com.example.rapjeuback.services;

import java.util.List;
import java.util.Optional;

import com.example.rapjeuback.DTO.QuestionDto;
import com.example.rapjeuback.JPA.JpaQuestionDao;
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

    @Override
    public List<Question> getQuestionTable(int number) {
        return questionDao.getQuestionTable(number);
    }

    @Override
    public void addQuestion(QuestionDto questionDto) {
        Question question = Question.QuestionBuilder.aQuestion()
                .withQuestionText(questionDto.getQuestionText())
                .withPhoto(questionDto.getPhoto())
                .withPoint(questionDto.getPoint())
                .build();
        questionDao.addQuestion(question);
    }


}