package com.example.rapjeuback.controllers;


import com.example.rapjeuback.models.Answer;
import com.example.rapjeuback.services.AnswerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("answers")
@RestController
public class AnswerController {
    private final AnswerService answerService;

    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping("")
    public List<Answer> listAnswers() {
        return answerService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Answer> getAnswerById(@PathVariable Long id) {
        return Optional.ofNullable(answerService.getById(id).orElse(null));
    }

    @DeleteMapping("/{id}")
    public void deleteAnswer(@PathVariable Long id) {
        answerService.delete(id);
    }
    /*
    @PostMapping("")
    public void addAnswer(@RequestBody AnswerDto answerDto) {
        answerService.add(AanswerDto);
    }

    @PostMapping("/{id}")
    public void updateAnswer(@RequestBody AnswerDto answerDto, @PathVariable Long id) {
        answerService.updateAnswer(answerDto, id);
    }*/
}