package com.libreriapoli.libreriapoli.configuracion;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;

import org.springframework.web.multipart.MultipartFile;

import com.libreriapoli.libreriapoli.modelo.Libros;

public class ManejadorImagenes {
    
    public static String RutaImagenes = "C://libreria-poli/imagenes/";

    public static String GuardarArchivoImagen(MultipartFile imagen, boolean nuevo, String rutaLibroActual) throws Exception
    {
        int indiceExtension;
        String extension;
        String nombreArchivo;
        Path rutaAbsoluta;

        try 
        {
            ValidarCrearRutaImagenes();

            extension = "";            
            indiceExtension = imagen.getOriginalFilename().indexOf(".");

            extension = "." + imagen.getOriginalFilename().substring(indiceExtension + 1);

            nombreArchivo = Calendar.getInstance().getTimeInMillis() + extension;

            if(nuevo)
            {
                rutaAbsoluta = Paths.get(RutaImagenes + "//" + nombreArchivo);
            }
            else
            {
                rutaAbsoluta = Paths.get(RutaImagenes + "//" + rutaLibroActual);
            }

            if(!imagen.isEmpty())
            {
                Files.write(rutaAbsoluta, imagen.getBytes());
            }

            return rutaAbsoluta.toString();
        } 
        catch (Exception e) 
        {
            throw new Exception(e.getMessage(), e.getCause());
        }
    }

    public static void ValidarCrearRutaImagenes() throws Exception
    {
        Path path;

        try 
        {
            path = Paths.get(RutaImagenes);

            if(Files.notExists(path))
            {
                Files.createDirectories(path);
            }
        } 
        catch (Exception e) 
        {
            throw new Exception(e.getMessage(), e.getCause());
        }
    }
}
