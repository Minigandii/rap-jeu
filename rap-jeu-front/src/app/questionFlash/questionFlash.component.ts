import {Component, Injectable} from "@angular/core"
import {ActivatedRoute} from "@angular/router";
import {Observable, map} from "rxjs";
import {Rapper} from "../models/rapper.model";
import {Question} from "../models/question.model";
import {GuessRapperService} from "../services/guessRapper.service";
import {QuestionFlashService} from "../services/questionFlash.service";


@Injectable({
  providedIn: "root",
})
@Component({
  selector: "app-game",
  templateUrl: "./questionFlash.component.html",
  styleUrls: ["./questionFlash.component.scss"],
})
export class QuestionFlashComponent {

  question$: Observable<Question> | undefined

  constructor(
    private questionFlashService: QuestionFlashService,
    private route: ActivatedRoute
  ) {
    this.route.paramMap.subscribe(params => {
      const idQuestion = +params.get('idQuestion')!;

      // Utilisez les valeurs obtenues pour appeler les services
      this.question$ = this.questionFlashService.getQuestionFlash(idQuestion);
    });
  }
}
