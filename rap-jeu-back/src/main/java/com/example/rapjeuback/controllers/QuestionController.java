package com.example.rapjeuback.controllers;


import com.example.rapjeuback.DTO.QuestionDto;
import com.example.rapjeuback.models.Question;
import com.example.rapjeuback.models.Rapper;
import com.example.rapjeuback.services.QuestionService;
import com.example.rapjeuback.services.RapperService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("questions")
@RestController
public class QuestionController {
    private final QuestionService questionService;

    private final RapperService rapperService;

    public QuestionController(QuestionService questionService, RapperService rapperService) {
        this.questionService = questionService;
        this.rapperService = rapperService;
    }

    @GetMapping("")
    public List<Question> listQuestions() {
        return questionService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Question> getQuestionById(@PathVariable Long id) {
        return Optional.ofNullable(questionService.getById(id).orElse(null));
    }
    @GetMapping("/guessRapper/{id}")
    public Optional<Rapper> getRapperById(@PathVariable Long id) {
        return rapperService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable Long id) {
        questionService.delete(id);
    }

    @PostMapping("/add")
    public void addQuestion(@RequestBody QuestionDto questionDto) {
        questionService.addQuestion(questionDto);
    }

}