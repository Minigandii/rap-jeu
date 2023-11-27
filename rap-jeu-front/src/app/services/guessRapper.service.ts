import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Question} from "../models/question.model";
import {Rapper} from "../models/rapper.model";

@Injectable({
  providedIn: 'root'
})
export class GuessRapperService {
  constructor(private http: HttpClient) { }

  private apiUrl = 'http://localhost:8080/questions/';

  getGuessRapper(idRapper: number): Observable<Rapper> {
    return this.http.get<Rapper>(`${this.apiUrl}guessRapper/${idRapper}`);
  }
}
