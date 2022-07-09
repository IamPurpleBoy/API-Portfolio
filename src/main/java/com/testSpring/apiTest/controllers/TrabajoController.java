
package com.testSpring.apiTest.controllers;

import com.testSpring.apiTest.models.Trabajo;
import com.testSpring.apiTest.service.ITrabajoService;
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
public class TrabajoController {
    
    @Autowired
    private ITrabajoService trabajoServ;
    
    List <Trabajo> trabajos = new ArrayList <Trabajo>(); 
    
    @GetMapping("/api/trabajos")
    public List<Trabajo> getAll(){
        
        return trabajoServ.verTrabajos();
        
    }
    
    @PostMapping("/api/newTrabajo")
    public void agregarTrabajo(@RequestBody Trabajo job){
       
        trabajoServ.crearTrabajo(job);
    
    }
    
    @PostMapping("/api/trabajoPost")
    public List<Trabajo> getAllPost(){
     
        return trabajoServ.verTrabajos();
    
    }
    
    @GetMapping("/api/trabajos/{id}")
    public Trabajo buscarTrabajo(@PathVariable Long id){
        
        return trabajoServ.buscarTrabajo(id);
    }
    
    @DeleteMapping("/api/deleteJob/{id}")
    public void borrarTrabajo (@PathVariable Long id){
        
        trabajoServ.borrarTrabajo(id);
    }
    
    @PutMapping("/api/trabajos/edit/{id}")
    public Trabajo modificarTrabajo(@PathVariable Long id,
                          @RequestParam("empresa") String nuevaEmpresa,
                          @RequestParam("logo") String nuevoLogo,
                          @RequestParam("cargo") String nuevoCargo,
                          @RequestParam("telefono") String nuevoTelefono,
                          @RequestParam ("anoInicio")int nuevoAnoInicio,
                          @RequestParam("anoFin") int nuevoAnoFin,
                          @RequestParam("descripcion") String nuevaDescripcion
                          
                          ){
        Trabajo trabajo = trabajoServ.buscarTrabajo(id);
        
        trabajo.setEmpresa(nuevaEmpresa);
        trabajo.setLogo(nuevoLogo);
        trabajo.setCargo(nuevoCargo);
        trabajo.setTelefono(nuevoTelefono);
        trabajo.setAnoInicio(nuevoAnoInicio);
        trabajo.setAnoFin(nuevoAnoFin);
        trabajo.setDescripcion(nuevaDescripcion);
        
        trabajoServ.modificarTrabajo(trabajo);
        return trabajo;
    }
    
    }

