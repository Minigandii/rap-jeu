package com.example.rapjeuback.models;

import jakarta.persistence.*;
@Entity
public class Reponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String enonceReponse;
    private boolean bonneReponse;

    @ManyToOne
    private Question question;

    public Reponse() {
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
    public String getEnonceReponse() {
        return enonceReponse;
    }

    public void setEnonceReponse(String enonceReponse) {
        this.enonceReponse = enonceReponse;
    }

    // Getter et Setter pour le champ 'bonneReponse'
    public boolean isBonneReponse() {
        return bonneReponse;
    }

    public void setBonneReponse(boolean bonneReponse) {
        this.bonneReponse = bonneReponse;
    }

    // Getter et Setter pour la relation avec la question
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}