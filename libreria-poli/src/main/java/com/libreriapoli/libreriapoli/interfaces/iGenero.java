package com.libreriapoli.libreriapoli.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.libreriapoli.libreriapoli.interfacesServicios.genero;
import com.libreriapoli.libreriapoli.modelos.Genero;

@Repository

public interface iGenero extends CrudRepository<Genero, Integer>{

}

    
    
 