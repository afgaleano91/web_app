package com.example.springbootdocker.model;

import javax.persistence.*;

@Entity
@Table (name = "child")
public class Child {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id_child;

    public Child(int id_child) {
        this.id_child = id_child;
    }

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_child")
    private Persona person;

    @ManyToOne
    @PrimaryKeyJoinColumn
    private Father father;

    public Persona getPerson() {
        return person;
    }

    public void setPerson(Persona person) {
        this.person = person;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    @ManyToOne
    @PrimaryKeyJoinColumn
    private Mother mother;

    public int getId_child() {
        return id_child;
    }

    public void setId_child(int id_child) {
        this.id_child = id_child;
    }

}
