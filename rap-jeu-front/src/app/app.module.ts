import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { HomeComponent } from './home/home.component';
import { GuessRapperComponent } from './guessRapper/guessRapper.component';
import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import {QuestionFlashComponent} from "./questionFlash/questionFlash.component";

@NgModule({
  declarations: [
    HomeComponent,
    GuessRapperComponent,
    QuestionFlashComponent,
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
