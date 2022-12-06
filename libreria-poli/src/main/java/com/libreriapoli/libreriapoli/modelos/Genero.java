package com.libreriapoli.libreriapoli.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.libreriapoli.libreriapoli.interfacesServicios.genero;


@Entity
@Table (name="Generos")

public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private String Genero;
    public Genero(int id, String genero) {
        this.id = id;
        Genero = genero;
    }
    /**
     * @return
     */
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String genero) {
        Genero = genero;
    }
    /*public int Save(igeneroservice generoservice) {
       int res=0;
       genero genero=generoservice.data.Save(this);
       if(genero.equals(null)){
        res=1;
       }
        return 0;
    }*/
    
    

    
}
