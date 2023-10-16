package com.example.rapjeuback.models;

import jakarta.persistence.*;
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String answerTextQuestion;
    private boolean goodAnswer;

    @ManyToOne
    private Question question;

    public Answer() {
        // Constructeur par défaut
    }

    // Getter et Setter pour le champ 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter et Setter pour le champ 'enonceReponse'
    public String getAnswerTextQuestion() {
        return answerTextQuestion;
    }

    public void setAnswerTextQuestion(String enonceReponse) {
        this.answerTextQuestion = enonceReponse;
    }

    // Getter et Setter pour le champ 'bonneReponse'
    public boolean isGoodAnswer() {
        return goodAnswer;
    }

    public void setGoodAnswer(boolean bonneReponse) {
        this.goodAnswer = bonneReponse;
    }

    // Getter et Setter pour la relation avec la question
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}