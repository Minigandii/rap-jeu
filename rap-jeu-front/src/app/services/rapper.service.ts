import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Rapper} from "../models/rapper.model";

@Injectable({
  providedIn: 'root'
})
export class RapperService {
  constructor(private http: HttpClient) { }

  private apiUrl = 'http://localhost:8080/';
  getById(id: number): Observable<Rapper> {
    return this.http.get<Rapper>(`${this.apiUrl}rappers/${id}`);
  }
}
