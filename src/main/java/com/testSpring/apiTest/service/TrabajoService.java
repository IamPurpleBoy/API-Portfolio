package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Trabajo;
import com.testSpring.apiTest.repository.TrabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajoService implements ITrabajoService {

    @Autowired
    public TrabajoRepository trabajoRepo;

    @Override
    public List<Trabajo> verTrabajos() {
        return trabajoRepo.findAll();
    }

    @Override
    public void crearTrabajo(Trabajo job) {
        trabajoRepo.save(job);
    }

    @Override
    public void borrarTrabajo(Long id) {
        trabajoRepo.deleteById(id);
    }

    @Override
    public Trabajo buscarTrabajo(Long id) {
        return trabajoRepo.findById(id).orElse(null);
    }

    public Trabajo modificarTrabajo(Trabajo job) {
        return trabajoRepo.save(job);
    }
}
