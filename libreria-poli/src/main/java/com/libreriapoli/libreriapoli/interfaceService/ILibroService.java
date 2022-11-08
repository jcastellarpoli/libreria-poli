package com.libreriapoli.libreriapoli.interfaceService;

import java.util.List;
import java.util.Optional;
import com.libreriapoli.libreriapoli.modelo.Libros;


public interface ILibroService {
    public List<Libros>listar();
    public Optional<Libros>listarId(int id);
    public int save(Libros l);
    public void delete(int id);
}
