package com.libreriapoli.libreriapoli.interfacesServicios;

import java.util.List;

import com.libreriapoli.libreriapoli.modelos.Categorias;

public interface ICategoriasService {

    public List<Categorias> listarTodos();
    public void guardar(Categorias categorias);
    public Categorias buscarPorId(Long id);
    public void eliminar(Long id);


    
}
