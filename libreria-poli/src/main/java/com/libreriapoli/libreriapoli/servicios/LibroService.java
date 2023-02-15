package com.libreriapoli.libreriapoli.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreriapoli.libreriapoli.interfaces.ILibros;
import com.libreriapoli.libreriapoli.interfacesServicios.ILibroService;
import com.libreriapoli.libreriapoli.modelos.Libros;


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
        return data.findById(id);
     
    }

    @Override
    public int save(Libros l) {
        int res=0;
        Libros  libros=data.save(l);
        if(!libros.equals(null)) {
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
       data.deleteById(id);
        
    }
    
}
