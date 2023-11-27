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

    @Column(name = "nb_platinium_disc")
    private int nbPlatinumDisc;

    @Override
    public String toString() {
        return "Rapper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", nbAlbum=" + nbAlbum +
                ", nbFeat=" + nbFeat +
                ", nbGoldDisc=" + nbGoldDisc +
                ", nbPlatinumDisc=" + nbPlatinumDisc +
                '}';
    }

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

    public static final class RapperBuilder {
        private Long id;
        private String name;
        private String nickname;
        private int nbAlbum;
        private int nbFeat;
        private int nbGoldDisc;
        private int nbPlatinumDisc;

        private RapperBuilder() {
        }

        public static RapperBuilder aRapper() {
            return new RapperBuilder();
        }

        public RapperBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public RapperBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public RapperBuilder withNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public RapperBuilder withNbAlbum(int nbAlbum) {
            this.nbAlbum = nbAlbum;
            return this;
        }

        public RapperBuilder withNbFeat(int nbFeat) {
            this.nbFeat = nbFeat;
            return this;
        }

        public RapperBuilder withNbGoldDisc(int nbGoldDisc) {
            this.nbGoldDisc = nbGoldDisc;
            return this;
        }

        public RapperBuilder withNbPlatinumDisc(int nbPlatinumDisc) {
            this.nbPlatinumDisc = nbPlatinumDisc;
            return this;
        }

        public Rapper build() {
            Rapper rapper = new Rapper();
            rapper.setId(id);
            rapper.setName(name);
            rapper.setNickname(nickname);
            rapper.setNbAlbum(nbAlbum);
            rapper.setNbFeat(nbFeat);
            rapper.setNbGoldDisc(nbGoldDisc);
            rapper.setNbPlatinumDisc(nbPlatinumDisc);
            return rapper;
        }
    }
}
