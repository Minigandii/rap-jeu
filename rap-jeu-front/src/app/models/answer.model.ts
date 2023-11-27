import {Question} from "./question.model";

export interface Answer {
  id: number;
  answerTextQuestion: string;
  goodAnswer: boolean;
  question: Question;
}
