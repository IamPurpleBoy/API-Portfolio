
package com.testSpring.apiTest.controllers;

import com.testSpring.apiTest.models.Skill;
import com.testSpring.apiTest.service.ISkillService;
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
public class SkillController {
    
    @Autowired
    private ISkillService skillService;
    
    
    List<Skill> skill = new ArrayList<Skill>();
    
     @GetMapping("/api/skill")
    public List<Skill> getAll(){
        
        return skillService.verSkill();
        
    }
    
    @PostMapping("/api/newSkill")
    public void agregarSkill(@RequestBody Skill skl){
       
        skillService.crearSkill(skl);
    
    }
    
    @PostMapping("/api/skillPost")
    public List<Skill> getAllPost(){
     
        return skillService.verSkill();
    
    }
    
    @GetMapping("/api/skill/{id}")
    public Skill buscarSkill(@PathVariable Long id){
        
        return skillService.buscarSkill(id);
    }
    
    @DeleteMapping("/api/deleteSkill/{id}")
    public void borrarSkill (@PathVariable Long id){
        
        skillService.borrarSkill(id);
    }
    
    @PutMapping("/api/skill/edit/{id}")
    public Skill modificarSkill(@PathVariable Long id,
                          @RequestParam("nombre") String nuevoNombre,
                          @RequestParam("nivel") int nuevoNivel,
                          @RequestParam("imagen") String nuevaImagen
                          
                          
                          ){
        Skill skill = skillService.buscarSkill(id);
        
        skill.setNombre(nuevoNombre);
        skill.setNivel(nuevoNivel);
        skill.setImagen(nuevaImagen);
        
        skillService.modificarSkill(skill);
        return skill;
    }
}
