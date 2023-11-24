import { Component } from "@angular/core"
import {RapperService} from "../services/rapper.service";
import {ActivatedRoute} from "@angular/router";
import {Observable, map} from "rxjs";
import {Rapper} from "../models/rapper.model";
import {Question} from "../models/question.model";
import {QuestionService} from "../services/question.service";

@Component({
  selector: "app-game",
  templateUrl: "./game.component.html",
  styleUrls: ["./game.component.scss"],
})
export class GameComponent {

  rapper$: Observable<Rapper> | undefined
  question$: Observable<Question> | undefined

  constructor(private rapperService: RapperService, private questionService: QuestionService) {
    this.rapper$ = this.rapperService.getById(1)
    this.question$ = this.questionService.getById(1)
  }
}
