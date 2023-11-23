import { Component } from "@angular/core"
import {RapperService} from "../services/rapper.service";
import {ActivatedRoute} from "@angular/router";
import {Observable, map} from "rxjs";
import {Rapper} from "../models/rapper.model";

@Component({
  selector: "app-game",
  templateUrl: "./game.component.html",
  styleUrls: ["./game.component.scss"],
})
export class GameComponent {

  rapper$: Observable<Rapper> | undefined

  constructor(private rapperService: RapperService) {
    this.rapper$ = this.rapperService.getById(1)
  }
}
