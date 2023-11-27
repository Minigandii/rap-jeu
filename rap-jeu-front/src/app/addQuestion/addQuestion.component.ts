import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { GameService } from '../services/game.service';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-addQuestion',
  templateUrl: './addQuestion.component.html',
  styleUrls: ['./addQuestion.component.scss'],
})
export class AddQuestionComponent {

  addQuestionForm: FormGroup;
  constructor(private fb: FormBuilder, private gameService: GameService, private http: HttpClient) {
    this.addQuestionForm = this.fb.group({
      questionText: ['', Validators.required],
      point: [0, Validators.min(0)], // Add validators as needed
      type: ['', Validators.required],
    });
  }

  onSubmit(): void {
    if (this.addQuestionForm.valid) {
      const questionData = this.addQuestionForm.value;

      // Replace 'backendUrl' with your actual backend URL
      const backendUrl = 'http://localhost:8080/questions/add';

      this.http.post(backendUrl, questionData);
    }
  }

}
