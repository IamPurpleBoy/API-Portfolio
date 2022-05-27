
package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Idioma;
import com.testSpring.apiTest.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomaService implements IIdiomaService{

    
    @Autowired
    public IdiomaRepository idiomaRepo;
    @Override
    public List<Idioma> verIdioma() {
       return idiomaRepo.findAll();
    }

    @Override
    public void crearIdioma(Idioma idm) {
       idiomaRepo.save(idm);
    }

    @Override
    public void borrarIdioma(Long id) {
       idiomaRepo.deleteById(id);
    }

    @Override
    public Idioma buscarIdioma(Long id) {
        return idiomaRepo.findById(id).orElse(null);
    }

    @Override
    public Idioma modificarIdioma(Idioma idm) {
        return idiomaRepo.save(idm);
    }
    
}
