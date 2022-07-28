package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Persona;
import com.testSpring.apiTest.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoServ;

    @Override
    public List<Persona> verPersonas() {
        return persoServ.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoServ.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoServ.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoServ.findById(id).orElse(null);
    }

    @Override
    public Persona modificarPersona(Persona per) {
        return persoServ.save(per);

    }
}
