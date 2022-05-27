package com.testSpring.apiTest.controllers;

import com.testSpring.apiTest.models.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("")
    public String inicio() {
        return "Hola Spring!";
    }
    @GetMapping ("/saludar")
    public String saludar(@RequestParam String nombre, @RequestParam String apellido){
        
        return "Hola " + nombre + " " + apellido + "!!!" ;
    }

    @GetMapping("/saludar/{nombre}/{apellido}")
    public String saludarPath(@PathVariable String nombre, @PathVariable String apellido) {
        return "Hola! " + nombre + " " + apellido ;
    }
    
    @PostMapping("/saludar")
    public String saludarPost(@RequestBody Persona  body){
            return "Hola " + body.getNombre() +" "+ body.getApellido();
    }
}
