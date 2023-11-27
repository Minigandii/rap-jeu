import { Component, OnInit } from '@angular/core';
import { GameService } from '../services/game.service';

@Component({
  selector: 'app-guess-rapper',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.scss'],
})
export class GameComponent implements OnInit {
  constructor(private gameService: GameService) {}

  ngOnInit(): void {
    // Utilisez le service pour initialiser le jeu
    this.gameService.initGame();
  }
}
