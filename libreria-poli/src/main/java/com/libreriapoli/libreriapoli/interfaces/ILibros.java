package com.libreriapoli.libreriapoli.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.libreriapoli.libreriapoli.modelo.Libros;

@Repository
public interface ILibros extends CrudRepository<Libros, Integer> {

  
}
