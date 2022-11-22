package com.libreriapoli.libreriapoli.interfacesServicios;

import java.util.List;
import java.util.Optional;

import com.libreriapoli.libreriapoli.modelos.ModeloPrueba;

public interface IModeloPruebaService {
    
    public List<ModeloPrueba> ListarModelos();

    public Optional<ModeloPrueba> ListarPorId(int id);

    public int Save(ModeloPrueba modelo);

    public void Delete(int id);
}
