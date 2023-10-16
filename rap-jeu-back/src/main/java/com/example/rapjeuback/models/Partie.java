package com.example.rapjeuback.models;

import jakarta.persistence.*;
@Entity
public class Partie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int score;
    private int dureePartie;

    public Partie() {
        // Constructeur par défaut
    }

    // Getter et Setter pour le champ 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter et Setter pour le champ 'score'
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Getter et Setter pour le champ 'dureePartie'
    public int getDureePartie() {
        return dureePartie;
    }

    public void setDureePartie(int dureePartie) {
        this.dureePartie = dureePartie;
    }
}