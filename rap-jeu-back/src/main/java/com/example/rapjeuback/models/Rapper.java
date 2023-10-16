package com.example.rapjeuback.models;

import jakarta.persistence.*;

@Entity
public class Rapper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nickname;
    private int nbAlbum;
    private int nbFeat;
    private int nbGoldDisc;
    private int nbPlatiniumDisc;

    public Rapper() {
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
    public String getName() {
        return name;
    }

    public void setName(String nom) {
        this.name = nom;
    }

    // Getter et Setter pour le champ 'surnom'
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String surnom) {
        this.nickname = surnom;
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
    public int getNbGoldDisc() {
        return nbGoldDisc;
    }

    public void setNbGoldDisc(int nbDisqueOr) {
        this.nbGoldDisc = nbDisqueOr;
    }

    // Getter et Setter pour le champ 'nbDisquePlatine'
    public int getNbPlatiniumDisc() {
        return nbPlatiniumDisc;
    }

    public void setNbPlatiniumDisc(int nbDisquePlatine) {
        this.nbPlatiniumDisc = nbDisquePlatine;
    }
}
