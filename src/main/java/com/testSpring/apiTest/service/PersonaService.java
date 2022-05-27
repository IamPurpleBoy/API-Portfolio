/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Persona;
import com.testSpring.apiTest.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Nicolas
 */
@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepo; 
    @Override
    public List<Persona> verPersonas() {
      return  persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
      persoRepo.save(per) ;
    }

    @Override
    public void borrarPersona(Long id) {
       persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
      return  persoRepo.findById(id).orElse(null);
    }
    
    public Persona modificarPersona(Persona per){
       return persoRepo.save(per);
    
}}
