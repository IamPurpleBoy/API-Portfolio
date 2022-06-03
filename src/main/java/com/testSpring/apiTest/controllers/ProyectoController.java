
package com.testSpring.apiTest.controllers;

import com.testSpring.apiTest.models.Proyecto;
import com.testSpring.apiTest.service.IProyectoService;
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
public class ProyectoController {
    
    
    @Autowired
    private IProyectoService proyService;
    
    
    List<Proyecto> proyecto = new ArrayList<Proyecto>();
    
    @GetMapping("/api/proyecto")
    public List<Proyecto> getAll(){
        
        return proyService.verProyecto();
        
    }
    
    @PostMapping("/api/newProyecto")
    public void agregarProyecto(@RequestBody Proyecto pyt){
       
        proyService.crearProyecto(pyt);
    
    }
    
    @PostMapping("/api/proyectoPost")
    public List<Proyecto> getAllPost(){
     
        return proyService.verProyecto();
    
    }
    
    @GetMapping("/api/proyecto/{id}")
    public Proyecto buscarProyecto(@PathVariable Long id){
        
        return proyService.buscarProyecto(id);
    }
    
    @DeleteMapping("/api/deleteProy/{id}")
    public void borrarProyecto (@PathVariable Long id){
        
        proyService.borrarProyecto(id);
    }
    
    @PutMapping("/api/proyecto/edit/{id}")
    public Proyecto modificarProyecto(@PathVariable Long id,
                          @RequestParam("nombre") String nuevoNombre,
                          @RequestParam("anio") int nuevoAnio,
                          @RequestParam("descripcion") String nuevaDescripcion,
                          @RequestParam("imagen") String nuevaImagen
                          
                          
                          ){
        Proyecto proyecto = proyService.buscarProyecto(id);
        
        proyecto.setNombre(nuevoNombre);
        proyecto.setAnio(nuevoAnio);
        proyecto.setAnio(nuevoAnio);
        proyecto.setImagen(nuevaImagen);
        
        proyService.modificarProyecto(proyecto);
        return proyecto;
    }
}
