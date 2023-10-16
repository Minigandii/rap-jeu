package com.example.rapjeuback.models;

import jakarta.persistence.*;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String enonce;
    private String photo;
    private int nbPoint;
    private String type;

    public Question() {
        // Constructeur par défaut
    }

    // Getter et Setter pour le champ 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter et Setter pour le champ 'enonce'
    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    // Getter et Setter pour le champ 'photo'
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    // Getter et Setter pour le champ 'nbPoint'
    public int getNbPoint() {
        return nbPoint;
    }

    public void setNbPoint(int nbPoint) {
        this.nbPoint = nbPoint;
    }

    // Getter et Setter pour le champ 'type'
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
