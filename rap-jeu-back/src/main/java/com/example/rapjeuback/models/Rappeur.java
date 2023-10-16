package com.example.rapjeuback.models;

import jakarta.persistence.*;

@Entity
public class Rappeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String surnom;
    private int nbAlbum;
    private int nbFeat;
    private int nbDisqueOr;
    private int nbDisquePlatine;

    public Rappeur() {
        // Constructeur par défaut
    }

    // Getter et Setter pour le champ 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter et Setter pour le champ 'nom'
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter et Setter pour le champ 'surnom'
    public String getSurnom() {
        return surnom;
    }

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }

    // Getter et Setter pour le champ 'nbAlbum'
    public int getNbAlbum() {
        return nbAlbum;
    }

    public void setNbAlbum(int nbAlbum) {
        this.nbAlbum = nbAlbum;
    }

    // Getter et Setter pour le champ 'nbFeat'
    public int getNbFeat() {
        return nbFeat;
    }

    public void setNbFeat(int nbFeat) {
        this.nbFeat = nbFeat;
    }

    // Getter et Setter pour le champ 'nbDisqueOr'
    public int getNbDisqueOr() {
        return nbDisqueOr;
    }

    public void setNbDisqueOr(int nbDisqueOr) {
        this.nbDisqueOr = nbDisqueOr;
    }

    // Getter et Setter pour le champ 'nbDisquePlatine'
    public int getNbDisquePlatine() {
        return nbDisquePlatine;
    }

    public void setNbDisquePlatine(int nbDisquePlatine) {
        this.nbDisquePlatine = nbDisquePlatine;
    }
}
