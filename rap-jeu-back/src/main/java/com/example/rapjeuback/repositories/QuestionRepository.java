package com.example.rapjeuback.repositories;

import com.example.rapjeuback.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findAll();
}