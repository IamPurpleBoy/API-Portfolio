
package com.testSpring.apiTest.controllers;

import com.testSpring.apiTest.models.Persona;
import com.testSpring.apiTest.service.IPersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;
    
    List<Persona> personas = new ArrayList<Persona>();

    @GetMapping("/api/personas")
    public List<Persona> getAll() {

        return persoServ.verPersonas();
    }
    
    @PostMapping("/api/newPersona")
    public void agregarPersona(@RequestBody Persona per) {

        persoServ.crearPersona(per);
        
    }
    
    @PostMapping("/api/personaPost")
    public List <Persona> getAllPost() {

        return persoServ.verPersonas();
        
    }
    
    
    
    @GetMapping("/api/personas/{id}")
    public Persona buscarPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }

    @DeleteMapping("/api/delete/{id}")
    public void borrarPersona(@PathVariable Long id) {

        persoServ.borrarPersona(id);
    }

    @PutMapping("/api/personas/edit/{id}")
    public Persona modificarPersona(@PathVariable Long id,
                          @RequestParam("nombre") String nuevoNombre,
                          @RequestParam("apellido") String nuevoApellido,
                          @RequestParam("telefono") String nuevoTelefono,
                          @RequestParam ("email") String nuevoEmail,
                          @RequestParam("password") String nuevoPassword
                          ){
        Persona persona = persoServ.buscarPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setTelefono(nuevoTelefono);
        persona.setEmail(nuevoEmail);
        persona.setPassword(nuevoPassword);
        
        persoServ.modificarPersona(persona);
        return persona;
    }
}
