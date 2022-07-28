package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Educacion;
import com.testSpring.apiTest.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository educacionRepo;

    @Override
    public List<Educacion> verEducacion() {
        return educacionRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        educacionRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        educacionRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return educacionRepo.findById(id).orElse(null);
    }

    @Override
    public Educacion modificarEducacion(Educacion edu) {
        return educacionRepo.save(edu);
    }

}
