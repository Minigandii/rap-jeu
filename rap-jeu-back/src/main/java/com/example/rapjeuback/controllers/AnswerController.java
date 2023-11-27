package com.example.rapjeuback.controllers;


import com.example.rapjeuback.DTO.AnswerDto;
import com.example.rapjeuback.DTO.QuestionDto;
import com.example.rapjeuback.models.Answer;
import com.example.rapjeuback.models.Question;
import com.example.rapjeuback.services.AnswerService;
import com.example.rapjeuback.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("answers")
@RestController
public class AnswerController {
    private final AnswerService answerService;
    private final QuestionService questionService;

    public AnswerController(AnswerService answerService, QuestionService questionService) {
        this.answerService = answerService;
        this.questionService = questionService;
    }

    @GetMapping("")
    public List<Answer> listAnswers() {
        return answerService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Answer> getAnswerById(@PathVariable Long id) {
        return answerService.getById(id);
    }

    @GetMapping("/{idAnswer}/{idQuestion}")
    public void verifyAnswer(@PathVariable Long idAnswer, @PathVariable Long idQuestion, HttpSession session) {
        Answer answer = answerService.getById(idAnswer).get();
        Question question = questionService.getById(idQuestion).get();

        if(answer.isGoodAnswer()){
            int score = (int) session.getAttribute("score");
            score+=question.getPoint();

            session.setAttribute("score",score);
        }


    }
    @DeleteMapping("/{id}")
    public void deleteAnswer(@PathVariable Long id) {
        answerService.delete(id);
    }
    @PostMapping("/add")
    public void addAnswer(@RequestBody AnswerDto answerDto) {
        answerService.addAnswer(answerDto);
    }
}