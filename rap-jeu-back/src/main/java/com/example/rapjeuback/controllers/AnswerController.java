package com.example.rapjeuback.controllers;


import com.example.rapjeuback.DTO.AnswerDto;
import com.example.rapjeuback.models.Answer;
import com.example.rapjeuback.models.Question;
import com.example.rapjeuback.models.Rapper;
import com.example.rapjeuback.services.AnswerService;
import com.example.rapjeuback.services.QuestionService;
import com.example.rapjeuback.services.RapperService;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("answers")
@RestController
public class AnswerController {
    private final AnswerService answerService;
    private final QuestionService questionService;

    private final RapperService rapperService;

    public AnswerController(AnswerService answerService, QuestionService questionService, RapperService rapperService) {
        this.answerService = answerService;
        this.questionService = questionService;
        this.rapperService = rapperService;
    }

    @GetMapping("")
    public List<Answer> listAnswers() {
        return answerService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Answer> getAnswerById(@PathVariable Long id) {
        return answerService.getById(id);
    }

    @PostMapping("/{idAnswer}/{idQuestion}")
    public RedirectView verifyAnswer(@PathVariable Long idAnswer, @PathVariable Long idQuestion, HttpSession session) {
        Answer answer = answerService.getById(idAnswer).get();
        Question question = questionService.getById(idQuestion).get();

        if(answer.isGoodAnswer()){
            int score = (int) session.getAttribute("score");
            score+=question.getPoint();
            session.setAttribute("score",score);

        }

        return new RedirectView("/game/sendQuestion");
    }

    @PostMapping("/rapper/{idRapper}")
    public RedirectView verifyAnswerRapper(@PathVariable Long idRapper, @RequestBody String rapperNameInput, HttpSession session) {
        LevenshteinDistance levenshteinDistance = LevenshteinDistance.getDefaultInstance();

        String rapperName = rapperService.getById(idRapper).get().getName();

        int distance = levenshteinDistance.apply(rapperNameInput.toLowerCase(), rapperName.toLowerCase());

        int similarity =(int) rapperName.length()/5;

        if( distance <= similarity ){

            int score = (int) session.getAttribute("score");

            score+=20;

            session.setAttribute("score",score);

            System.out.println("Bien vu");

        }

        return new RedirectView("/game/sendQuestion");
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