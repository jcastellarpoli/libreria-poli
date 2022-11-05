package com.libreriapoli.libreriapoli.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.libreriapoli.libreriapoli.modelos.*;

@Repository
public interface ModeloPruebaRepository extends CrudRepository<ModeloPrueba, Integer> {
    
}
