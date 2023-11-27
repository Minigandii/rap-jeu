import {Component, Injectable} from "@angular/core"
import {ActivatedRoute, Router} from "@angular/router";
import {Observable, map} from "rxjs";
import {Rapper} from "../models/rapper.model";
import {Question} from "../models/question.model";
import {GuessRapperService} from "../services/guessRapper.service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {HttpClient} from "@angular/common/http";


@Injectable({
  providedIn: "root",
})
@Component({
  selector: "app-guessRapper",
  templateUrl: "./guessRapper.component.html",
  styleUrls: ["./guessRapper.component.scss"],
})
export class GuessRapperComponent {

  rapper$: Observable<Rapper> | undefined
  rapperNameForm: FormGroup;

  constructor(
    private fb: FormBuilder,
    private guessRapperService: GuessRapperService,
    private route: ActivatedRoute,
    private router: Router,
    private http: HttpClient
  ) {
    this.rapperNameForm = this.fb.group({
      rapperNameInput: ['', Validators.required],
    });

    this.route.paramMap.subscribe(params => {
      const idRapper = +params.get('idRapper')!;

      // Utilisez les valeurs obtenues pour appeler les services
      this.rapper$ = this.guessRapperService.getGuessRapper(idRapper);
    });
  }

  onSubmit(): void {
    if (this.rapperNameForm.valid) {
      const rapperName = this.rapperNameForm.value;

      // Replace 'backendUrl' with your actual backend URL
      const backendUrl = 'http://localhost:8080/answers/rapper/1';

      this.http.post(backendUrl, rapperName).subscribe(() => this.router.navigate([""]));

    }
  }
}
