package com.libreriapoli.libreriapoli.modelos;

import java.util.List;

import org.hibernate.internal.util.type.PrimitiveWrapperHelper.LongDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreriapoli.libreriapoli.interfacesServicios.ICategoriasService;

@Service
public class CategoriasServicelmpl implements ICategoriasService {
    
    @Autowired
    private CategoriasRepository categoriasRepository;

    @Override
    public List<Categorias> listarTodos()  {
        return (List<Categorias>)categoriasRepository.findAll();
    }

    @Override
    public void guardar(Categorias categorias) {
        categoriasRepository.save(categorias);

    }   

    @Override
    public Categorias buscarPorId(Long Id) {
        return categoriasRepository.findById(Id).orElse(null);

    }   

    @Override
    public void eliminar (Long Id) {
        categoriasRepository.deleteById(Id);

}   
        
    
        } 


