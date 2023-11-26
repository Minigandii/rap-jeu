import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Rapper} from "../models/rapper.model";
import {Question} from "../models/question.model";

@Injectable({
  providedIn: 'root'
})
export class QuestionFlashService {
  constructor(private http: HttpClient) { }

  private apiUrl = 'http://localhost:8080/questions/';
  getQuestionFlash(idQuestion: number): Observable<Question> {
    return this.http.get<Question>(`${this.apiUrl}questionFlash/${idQuestion}`);
  }
}
