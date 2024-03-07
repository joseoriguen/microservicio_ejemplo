package com.boot.ejemplo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class SaludoController {

    @GetMapping(value="saludo", produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludo()
    {
        return "Microservicio Spring Boot";
    }

    @GetMapping(value="saludo/{name}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludo(@PathVariable("name") String nombre)
    {
        return "Bienvenido al servicio " + nombre;
    }

    @GetMapping(value="saludopersonal", produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludo(@RequestParam("name") String nombre, @RequestParam("edad") int edad)
    {
        return "Bienvenido al servicio " + nombre + " tienes: " + edad;
    }
    
}
