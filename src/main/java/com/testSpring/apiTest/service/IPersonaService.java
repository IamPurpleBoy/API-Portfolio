package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Persona;
import java.util.List;

public interface IPersonaService {

    public List<Persona> verPersonas();

    public void crearPersona(Persona per);

    public void borrarPersona(Long id);

    public Persona buscarPersona(Long id);

    public Persona modificarPersona(Persona per);
}
