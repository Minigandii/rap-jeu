package com.example.rapjeuback.controllers;


import com.example.rapjeuback.models.Question;
import com.example.rapjeuback.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("questions")
@RestController
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("")
    public List<Question> listQuestions() {
        return questionService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Question> getQuestionById(@PathVariable Long id) {
        return Optional.ofNullable(questionService.getById(id).orElse(null));
    }

    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable Long id) {
        questionService.delete(id);
    }
    /*
    @PostMapping("")
    public void addQuestion(@RequestBody QuestionDto questionDto) {
        questionService.addQuestion(questionDto);
    }

    @PostMapping("/{id}")
    public void updateQuestion(@RequestBody QuestionDto questionDto, @PathVariable Long id) {
        questionService.updateQuestion(questionDto, id);
    }*/
}