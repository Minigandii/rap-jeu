package com.example.rapjeuback.models;

import jakarta.persistence.*;
@Entity
public class Feat {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idRapper1")
    private Rapper rapper1;

    @ManyToOne
    @JoinColumn(name = "idRapper2")
    private Rapper rapper2;

    public Feat() {
        // Constructeur par défaut
    }

    // Getter et Setter pour le champ 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter et Setter pour la relation avec le premier rappeur (idRapper1)
    public Rapper getRapper1() {
        return rapper1;
    }

    public void setRapper1(Rapper rapper1) {
        this.rapper1 = rapper1;
    }

    // Getter et Setter pour la relation avec le deuxième rappeur (idRapper2)
    public Rapper getRapper2() {
        return rapper2;
    }

    public void setRapper2(Rapper rapper2) {
        this.rapper2 = rapper2;
    }
}
