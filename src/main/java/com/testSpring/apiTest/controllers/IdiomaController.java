
package com.testSpring.apiTest.controllers;

import com.testSpring.apiTest.models.Idioma;
import com.testSpring.apiTest.service.IIdiomaService;
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
public class IdiomaController {
    
    
    @Autowired
    private IIdiomaService idiomaService;
    
    
    List<Idioma> idioma = new ArrayList<Idioma>();
    
     @GetMapping("/ver/idioma")
    public List<Idioma> getAll(){
        
        return idiomaService.verIdioma();
        
    }
    
    @PostMapping("new/idioma")
    public void agregarIdioma(@RequestBody Idioma idm){
       
        idiomaService.crearIdioma(idm);
    
    }
    
    @PostMapping("/ver/idiomaPost")
    public List<Idioma> getAllPost(){
     
        return idiomaService.verIdioma();
    
    }
    
    @GetMapping("ver/idioma/{id}")
    public Idioma buscarIdioma(@PathVariable Long id){
        
        return idiomaService.buscarIdioma(id);
    }
    
    @DeleteMapping("/deleteIdioma/{id}")
    public void borrarIdioma (@PathVariable Long id){
        
        idiomaService.borrarIdioma(id);
    }
    
    @PutMapping("/idioma/edit/{id}")
    public Idioma modificarIdioma(@PathVariable Long id,
                          @RequestParam("nombre") String nuevoNombre,
                          @RequestParam("nivel") int nuevoNivel,
                          @RequestParam("imagen") String nuevaImagen
                          
                          
                          ){
        Idioma idioma = idiomaService.buscarIdioma(id);
        
        idioma.setNombre(nuevoNombre);
        idioma.setNivel(nuevoNivel);
        idioma.setImagen(nuevaImagen);
        
        idiomaService.modificarIdioma(idioma);
        return idioma;
    }
    
}
