package com.example.springbootdocker.model;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String full_name;
    private String birth;

    public Persona() {
    }

    public Persona(int id, String full_name, String birth) {
        this.id = id;
        this.full_name = full_name;
        this.birth = birth;
    }



    /**
    * Función pendiente por definir
    *
    *  public void adopt(Persona persona){

    }
    */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


   /* public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }*/

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
