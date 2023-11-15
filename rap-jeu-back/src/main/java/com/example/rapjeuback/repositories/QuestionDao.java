package com.example.rapjeuback.repositories;

import com.example.rapjeuback.models.Question;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface QuestionDao {
    List<Question> findAll();

    Optional<Question> getById(Long id);

    Question save(Question question);

    void deleteById(Long id);
}