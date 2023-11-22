package com.example.rapjeuback.services;

import com.example.rapjeuback.models.Answer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AnswerService {
    List<Answer> findAll();
    Optional<Answer> getAnswerById(Long id);
    Answer saveAnswer(Answer answer) ;
    void deleteAnswer(Long id) ;
}