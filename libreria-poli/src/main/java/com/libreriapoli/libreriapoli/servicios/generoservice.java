package com.libreriapoli.libreriapoli.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreriapoli.libreriapoli.interfaces.iGenero;
import com.libreriapoli.libreriapoli.interfacesServicios.genero;
import com.libreriapoli.libreriapoli.interfacesServicios.igeneroservices;
import com.libreriapoli.libreriapoli.interfacesServicios.list;
import com.libreriapoli.libreriapoli.modelos.Genero;
@Service
public class generoservice implements igeneroservices{

    @Autowired
    public iGenero data;

    
    public iGenero getData() {
        return data;
    }

    public void setData(iGenero data) {
        this.data = data;
    }

    @Override
    public list<Genero> listar(int id) {
       
        return (list<Genero>) data.findAll();
    }

        
    
    @Override
    public void delete(int id) {
        
    }

    @Override
    public int Save(Genero g) {
        
        return 0;
    }

    @Override
    public List<Genero> listar() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
