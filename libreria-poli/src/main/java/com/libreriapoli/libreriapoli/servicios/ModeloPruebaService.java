package com.libreriapoli.libreriapoli.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreriapoli.libreriapoli.interfaces.ModeloPruebaRepository;
import com.libreriapoli.libreriapoli.interfacesServicios.IModeloPruebaService;
import com.libreriapoli.libreriapoli.modelos.ModeloPrueba;


@Service
public class ModeloPruebaService implements IModeloPruebaService {

    @Autowired
    private ModeloPruebaRepository modeloPruebaContext;

    @Override
    public List<ModeloPrueba> ListarModelos() {
        
        return (List<ModeloPrueba>)modeloPruebaContext.findAll();
    }

    @Override
    public Optional<ModeloPrueba> ListarPorId(int id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public int Save(ModeloPrueba modelo) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void Delete(int id) {
        // TODO Auto-generated method stub
        
    }
    
}
