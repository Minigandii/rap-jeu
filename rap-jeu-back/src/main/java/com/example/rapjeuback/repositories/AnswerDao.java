package com.example.rapjeuback.repositories;

import com.example.rapjeuback.models.Answer;
import com.example.rapjeuback.models.Question;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnswerDao {
    List<Answer> findAll();
    List<Answer> findByGoodAnswer(boolean goodAnswer);
    List<Answer> findByQuestion(Question question);

    Answer save(Answer answer);

    Optional<Answer> getById(Long id);

    void deleteById(Long id);
}
