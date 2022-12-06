package com.libreriapoli.libreriapoli.interfaces;
import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

import com.libreriapoli.libreriapoli.modelos.Genero;



public interface CrudRepositorygenero extends CrudRepository< Genero, Id> {
    
}
