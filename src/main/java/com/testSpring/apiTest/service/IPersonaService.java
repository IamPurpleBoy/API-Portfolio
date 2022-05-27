/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Persona;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public interface IPersonaService {
    
    public List <Persona> verPersonas();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id);
    public Persona modificarPersona(Persona per);
}
