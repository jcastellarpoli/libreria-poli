package com.libreriapoli.libreriapoli.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity
@Table(name = "modeloprueba")
public class ModeloPrueba implements Serializable {
    
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String Name;

    public ModeloPrueba() { }

    public ModeloPrueba(int id, String name, String email, String nickName) {
        Id = id;
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "ModeloPrueba [Id=" + Id + ", Name=" + Name + "]";
    }    
}
