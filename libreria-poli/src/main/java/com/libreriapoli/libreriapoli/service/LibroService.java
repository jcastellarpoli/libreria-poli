package com.libreriapoli.libreriapoli.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreriapoli.libreriapoli.interfaceService.ILibroService;
import com.libreriapoli.libreriapoli.interfaces.ILibros;
import com.libreriapoli.libreriapoli.modelo.Libros;


@Service
public class LibroService implements ILibroService{

    @Autowired
    private ILibros data;

    @Override
    public List<Libros> listar() {
        
        return (List<Libros>)data.findAll();
    }

    @Override
    public Optional<Libros> listarId(int id) {
        
        return Optional.empty();
    }

    @Override
    public int save(Libros l) {
        
        return 0;
    }

    @Override
    public void delete(int id) {
       
        
    }
    
}
