package com.example.rapjeuback.services;

import com.example.rapjeuback.models.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    List<Question> findAll();

    Optional<Question> getById(Long id);

    Question save(Question question);

    void delete(Long id);

    List<Question> getQuestionTable(int number);

    public void addQuestion(Question question);

}
