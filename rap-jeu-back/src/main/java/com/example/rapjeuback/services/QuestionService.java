package com.example.rapjeuback.services;

import com.example.rapjeuback.models.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    List<Question> getAllQuestions();

    Optional<Question> getQuestionById(Long id);

    Question saveQuestion(Question question);

    void deleteQuestion(Long id);
}
