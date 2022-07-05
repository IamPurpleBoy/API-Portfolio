
package com.testSpring.apiTest.controllers;

import com.testSpring.apiTest.models.Educacion;

import com.testSpring.apiTest.service.IEducacionService;
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
public class EducacionController {
    
     @Autowired
    private IEducacionService educacionServ;
    
    List <Educacion> educacion = new ArrayList <Educacion>(); 
    
    @GetMapping("/api/educacion")
    public List<Educacion> getAll(){
        
        return educacionServ.verEducacion();
        
    }
    
    @PostMapping("/api/newEducacion")
    public void agregarTrabajo(@RequestBody Educacion edu){
       
        educacionServ.crearEducacion(edu);
    
    }
    
    @PostMapping("/api/eduPost")
    public List<Educacion> getAllPost(){
     
        return educacionServ.verEducacion();
    
    }
    
    @GetMapping("/api/educacion/{id}")
    public Educacion buscarEducacion(@PathVariable Long id){
        
        return educacionServ.buscarEducacion(id);
    }
    
    @DeleteMapping("/api/deleteEdu/{id}")
    public void borrarEducacion (@PathVariable Long id){
        
        educacionServ.borrarEducacion(id);
    }
    
    @PutMapping("/api/educacion/edit/{id}")
    public Educacion modificarEducacion(@PathVariable Long id,
                          @RequestParam("institucion") String nuevaInstitucion,
                          @RequestParam("titulo") String nuevoTitulo,
                          @RequestParam("estado") String nuevoEstado,
                          //@RequestParam ("anoInicio")int nuevoAnoInicio,
                          @RequestParam("anoFin") int nuevoAnoFin,
                          @RequestParam("modalidad") String nuevaModalidad,
                          @RequestParam("descripcion") String nuevaDescripcion
                          
                          ){
        Educacion educacion = educacionServ.buscarEducacion(id);
        
        educacion.setInstitucion(nuevaInstitucion);
        educacion.setTitulo(nuevoTitulo);
        educacion.setEstado(nuevoEstado);
        //educacion.setAnoInicio(nuevoAnoInicio);
        educacion.setAnoFin(nuevoAnoFin);
        educacion.setModalidad(nuevaModalidad);
        educacion.setDescripcion(nuevaDescripcion);
        
        educacionServ.modificarEducacion(educacion);
        return educacion;
    }
    
    
}
