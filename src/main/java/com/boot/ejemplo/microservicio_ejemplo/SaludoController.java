package com.boot.ejemplo.microservicio_ejemplo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class SaludoController {

    @GetMapping(value="saludo", produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludo()
    {
        return "Microservicio Spring Boot";
    }
    
}
