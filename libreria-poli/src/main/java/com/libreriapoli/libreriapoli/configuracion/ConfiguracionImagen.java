package com.libreriapoli.libreriapoli.configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfiguracionImagen implements WebMvcConfigurer{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/imagenes/**").addResourceLocations("file:///C:/libreria-poli/imagenes/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
