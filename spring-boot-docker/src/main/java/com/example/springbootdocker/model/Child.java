package com.example.springbootdocker.model;

public class Child {

    private int id_child;
    private int id_father;
    private int id_mother;

    public Child(int id_child, int id_father, int id_mother) {
        this.id_child = id_child;
        this.id_father = id_father;
        this.id_mother = id_mother;
    }

    public int getId_child() {
        return id_child;
    }

    public void setId_child(int id_child) {
        this.id_child = id_child;
    }

    public int getId_father() {
        return id_father;
    }

    public void setId_father(int id_father) {
        this.id_father = id_father;
    }

    public int getId_mother() {
        return id_mother;
    }

    public void setId_mother(int id_mother) {
        this.id_mother = id_mother;
    }
}
