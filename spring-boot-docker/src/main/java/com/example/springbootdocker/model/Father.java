package com.example.springbootdocker.model;

import javax.persistence.*;

@Entity
@Table (name ="father")
public class Father {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id_father;

    public Father(int id_father) {
        this.id_father = id_father;
    }

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_father")
    private Persona person;

    public Persona getPerson() {
        return person;
    }

    public void setPerson(Persona person) {
        this.person = person;
    }

    public int getId_father() {
        return id_father;
    }

    public void setId_father(int id_father) {
        this.id_father = id_father;
    }
}
