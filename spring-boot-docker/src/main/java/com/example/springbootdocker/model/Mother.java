package com.example.springbootdocker.model;

import javax.persistence.*;

@Entity
@Table(name = "mother")
public class Mother {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id_mother;

    public Mother(int id_mother) {
        this.id_mother = id_mother;
    }

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_mother")
    private Persona person;

    public Persona getPerson() {
        return person;
    }

    public void setPerson(Persona person) {
        this.person = person;
    }

    public int getId_mother() {
        return id_mother;
    }

    public void setId_mother(int id_mother) {
        this.id_mother = id_mother;
    }
}
