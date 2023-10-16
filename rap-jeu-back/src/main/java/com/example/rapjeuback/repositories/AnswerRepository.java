package com.example.rapjeuback.repositories;

import com.example.rapjeuback.models.Answer;
import com.example.rapjeuback.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> findAll();
    List<Answer> findByGoodAnswer(boolean goodAnswer);
    List<Answer> findByQuestion(Question question);

}
