import { Component, OnInit } from '@angular/core';
import { GameService } from '../services/game.service';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})
export class HomeComponent {
  constructor(private gameService: GameService,private router: Router) {}
  onClickButton() {
    console.log('Bouton cliqué 1');
    this.gameService.initGame().subscribe(() => this.router.navigate(["game/sendQuestion"]));
  }
}
