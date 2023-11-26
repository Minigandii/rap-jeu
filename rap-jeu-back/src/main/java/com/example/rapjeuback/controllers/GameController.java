package com.example.rapjeuback.controllers;

import com.example.rapjeuback.models.Game;
import com.example.rapjeuback.models.Question;
import com.example.rapjeuback.models.Rapper;
import com.example.rapjeuback.services.GameService;
import com.example.rapjeuback.services.QuestionService;
import com.example.rapjeuback.services.RapperService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("game")
@RestController
public class GameController {
    private final GameService gameService;
    private final QuestionService questionService;

    private final RapperService rapperService;
    private final String apiUrl = "http://localhost:8080";

    public GameController(GameService gameService, QuestionService questionService, RapperService rapperService) {
        this.gameService = gameService;
        this.questionService = questionService;
        this.rapperService = rapperService;
    }

    @GetMapping("")
    public List<Game> listGames() {
        return gameService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Game>> getGameById(@PathVariable Long id) {
        Optional<Game> game = gameService.getById(id);
        return ResponseEntity.ok(game);
    }

    @GetMapping("/init")
    public RedirectView initGame(HttpSession session, RedirectAttributes attributes) {
        if (session.getAttribute("questionTable") == null) {
            // If not, create a new instance and store it in the session
            List<Question> questionTable = questionService.getQuestionTable(10);

            List<Rapper> rapperTable = rapperService.getRapperTable(2);

            session.setAttribute("questionTable", questionTable);
            session.setAttribute("rapperTable", rapperTable);

            return new RedirectView("/game/sendQuestion");
        }
        return new RedirectView("/");
    }
    @GetMapping("/sendQuestion")
    public RedirectView sendQuestion(HttpSession session) {
        List<Question> questionTable = (List<Question>) session.getAttribute("questionTable");
        List<Rapper> rapperTable = (List<Rapper>) session.getAttribute("rapperTable");

        if (questionTable != null && !questionTable.isEmpty()) {
            if(questionTable.size()%5==0 && rapperTable != null && !rapperTable.isEmpty()){
                Long idRapper = rapperTable.get(0).getId();
                rapperTable.remove(0);
                session.setAttribute("rapperTable", rapperTable);

                return new RedirectView("/questions/guessRapper/"+ idRapper );
            }else {
                Long idQuestion = questionTable.get(0).getId();
                String typeQuestion = questionTable.get(0).getType();
                questionTable.remove(0);
                session.setAttribute("questionTable", questionTable);

                return new RedirectView("/questions/" + typeQuestion + "/" + idQuestion);
            }
        }
        return new RedirectView("/game/end");
    }
}
