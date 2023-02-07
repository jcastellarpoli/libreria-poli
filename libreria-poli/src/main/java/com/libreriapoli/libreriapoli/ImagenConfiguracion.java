package com.libreriapoli.libreriapoli;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ImagenConfiguracion implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        WebMvcConfigurer.super.addResourceHandlers(registry);
        registry.addResourceHandler("/imagenes/**").addResourceLocations("file:/C:/Users/User/java/libreria-poli/libreria-poli/imagenes/");
    }

}
<<<<<<< HEAD

=======
>>>>>>> c29e00ddd68ba8811b70f9a174e9e571b16be6e8
