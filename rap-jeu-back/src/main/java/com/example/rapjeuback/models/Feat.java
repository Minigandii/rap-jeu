package com.example.rapjeuback.models;


import javax.persistence.*;

@Entity
@Table(name="feat")
public class Feat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idRapper1")
    private Rapper rapper1;

    @ManyToOne
    @JoinColumn(name = "idRapper2")
    private Rapper rapper2;

    public Feat() {
        // Default constructor
    }

    // Getter and Setter for the 'id' field
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for the relationship with the first rapper (idRapper1)
    public Rapper getRapper1() {
        return rapper1;
    }

    public void setRapper1(Rapper rapper1) {
        this.rapper1 = rapper1;
    }

    // Getter and Setter for the relationship with the second rapper (idRapper2)
    public Rapper getRapper2() {
        return rapper2;
    }

    public void setRapper2(Rapper rapper2) {
        this.rapper2 = rapper2;
    }
}
