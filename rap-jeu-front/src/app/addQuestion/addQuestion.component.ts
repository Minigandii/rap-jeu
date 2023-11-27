import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { GameService } from '../services/game.service';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-addQuestion',
  templateUrl: './addQuestion.component.html',
  styleUrls: ['./addQuestion.component.scss'],
})
export class AddQuestionComponent {

  addQuestionForm: FormGroup;
  constructor(private fb: FormBuilder, private http: HttpClient, private router: Router) {
    this.addQuestionForm = this.fb.group({
      photo: null,
      point: [0, Validators.min(0)], // Add validators as needed
      questionText: ['', Validators.required],
      type: ['', Validators.required],
    });
  }

  onSubmit(): void {
    if (this.addQuestionForm.valid) {
      const questionData = this.addQuestionForm.value;

      // Replace 'backendUrl' with your actual backend URL
      const backendUrl = 'http://localhost:8080/questions/add';

      this.http.post(backendUrl, questionData).subscribe(() => this.router.navigate([""]));

      console.log("abc");
    }
  }

}
