import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from "./home/home.component"
import {GuessRapperComponent} from "./guessRapper/guessRapper.component";
import {QuestionFlashComponent} from "./questionFlash/questionFlash.component";
import {GameComponent} from "./game/game.component";
import {AddQuestionComponent} from "./addQuestion/addQuestion.component";

const routes: Routes = [

  { path: "", component: HomeComponent },
  { path: 'questions/guessRapper/:idRapper', component: GuessRapperComponent },
  { path: 'game/questionFlash/:idQuestion/:idRapper', component: QuestionFlashComponent},
  { path: "addQuestion", component: AddQuestionComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
