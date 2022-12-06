package com.libreriapoli.libreriapoli.interfacesServicios;

import java.util.List;

import com.libreriapoli.libreriapoli.modelos.Genero;



public interface igeneroservices {

    public List<Genero>listar();
    public list<Genero>listar(int id);
    /**
     * @return
     */
    public int Save(Genero g);
    /**
     * @param id
     */
    public void delete(int id);

    
}
