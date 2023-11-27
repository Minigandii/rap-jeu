import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { HomeComponent } from './home/home.component';
import { GuessRapperComponent } from './guessRapper/guessRapper.component';
import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import {QuestionFlashComponent} from "./questionFlash/questionFlash.component";
import {AddQuestionComponent} from "./addQuestion/addQuestion.component";
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    HomeComponent,
    GuessRapperComponent,
    QuestionFlashComponent,
    AddQuestionComponent,
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
