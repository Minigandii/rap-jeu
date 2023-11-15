package com.example.rapjeuback.models;


import javax.persistence.*;

@Entity
@Table(name="rapper")
public class Rapper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nickname;

    @Column(name = "nb_album")
    private int nbAlbum;

    @Column(name = "nb_feat")
    private int nbFeat;

    @Column(name = "nb_gold_disc")
    private int nbGoldDisc;

    @Column(name = "nb_platinum_disc")
    private int nbPlatinumDisc;

    public Rapper() {
        // Default constructor
    }

    // Getter and Setter for the 'id' field
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for the 'name' field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for the 'nickname' field
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    // Getter and Setter for the 'nbAlbum' field
    public int getNbAlbum() {
        return nbAlbum;
    }

    public void setNbAlbum(int nbAlbum) {
        this.nbAlbum = nbAlbum;
    }

    // Getter and Setter for the 'nbFeat' field
    public int getNbFeat() {
        return nbFeat;
    }

    public void setNbFeat(int nbFeat) {
        this.nbFeat = nbFeat;
    }

    // Getter and Setter for the 'nbGoldDisc' field
    public int getNbGoldDisc() {
        return nbGoldDisc;
    }

    public void setNbGoldDisc(int nbGoldDisc) {
        this.nbGoldDisc = nbGoldDisc;
    }

    // Getter and Setter for the 'nbPlatinumDisc' field
    public int getNbPlatinumDisc() {
        return nbPlatinumDisc;
    }

    public void setNbPlatinumDisc(int nbPlatinumDisc) {
        this.nbPlatinumDisc = nbPlatinumDisc;
    }
}
