package com.libreriapoli.libreriapoli.modelos;

import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="Categoria")
public class Categorias implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private long id;
    private String Categorias;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCategorias() {
        return Categorias;
    }
    public void setCategorias(String categorias) {
        Categorias = categorias;
    }
    
}
