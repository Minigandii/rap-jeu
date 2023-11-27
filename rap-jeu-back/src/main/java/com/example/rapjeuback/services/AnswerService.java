package com.example.rapjeuback.services;

import com.example.rapjeuback.DTO.AnswerDto;
import com.example.rapjeuback.models.Answer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AnswerService {
    List<Answer> findAll();
    Optional<Answer> getById(Long id);
    Answer save(Answer answer) ;
    void delete(Long id) ;

    void addAnswer(AnswerDto answerDto);
}