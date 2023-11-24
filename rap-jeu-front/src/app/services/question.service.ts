import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Question} from "../models/question.model";

@Injectable({
  providedIn: 'root'
})
export class QuestionService {
  constructor(private http: HttpClient) { }

  private apiUrl = 'http://localhost:8080/';
  getById(id: number): Observable<Question> {
    return this.http.get<Question>(`${this.apiUrl}questions/${id}`);
  }
}
