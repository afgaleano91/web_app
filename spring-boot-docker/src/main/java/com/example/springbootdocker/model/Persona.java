package com.example.springbootdocker.model;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String full_name;
    private String birth;

    public Persona(String full_name, String birth, int id) {
        this.full_name = full_name;
        this.birth = birth;
        this.id = id;
    }

    public void adopt(Persona persona){
    }

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
