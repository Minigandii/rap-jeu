import {Component, Injectable} from "@angular/core"
import {ActivatedRoute} from "@angular/router";
import {Observable, map} from "rxjs";
import {Rapper} from "../models/rapper.model";
import {Question} from "../models/question.model";
import {GuessRapperService} from "../services/guessRapper.service";


@Injectable({
  providedIn: "root",
})
@Component({
  selector: "app-game",
  templateUrl: "./guessRapper.component.html",
  styleUrls: ["./guessRapper.component.scss"],
})
export class GuessRapperComponent {

  rapper$: Observable<Rapper> | undefined
  userResponse: string = '';

  constructor(
    private guessRapperService: GuessRapperService,
    private route: ActivatedRoute
  ) {
    this.route.paramMap.subscribe(params => {
      const idRapper = +params.get('idRapper')!;

      // Utilisez les valeurs obtenues pour appeler les services
      this.rapper$ = this.guessRapperService.getGuessRapper(idRapper);
    });
  }

  /*onSubmit() {
    // Vérifiez si la réponse n'est pas vide avant de l'envoyer
    if (this.userResponse.trim() !== '') {
      this.rapper$.subscribe((rapper) => {
        this.question$.subscribe((question) => {
          if (rapper && question) {
            this.guessRapperService.submitGuess(rapper.id, question.id, this.userResponse).subscribe(
              (response) => {
                console.log('Réponse soumise avec succès :', response);
                // Réinitialisez la réponse après la soumission si nécessaire
                this.userResponse = '';
              },
              (error) => {
                console.error('Erreur lors de la soumission de la réponse :', error);
                // Gérez l'erreur selon les besoins
              }
            );
          }
        });
      });
    } else {
      console.warn('La réponse ne peut pas être vide.');
    }
  }*/
}
