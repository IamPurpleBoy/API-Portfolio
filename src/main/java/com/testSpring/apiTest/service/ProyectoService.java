
package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Proyecto;
import com.testSpring.apiTest.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectoRepository proyectoRepo;
    
    @Override
    public List<Proyecto> verProyecto() {
        return proyectoRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto pyt) {
        proyectoRepo.save(pyt);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyectoRepo.findById(id).orElse(null);
    }

    @Override
    public Proyecto modificarProyecto(Proyecto pyt) {
        return proyectoRepo.save(pyt);
    }
    
}
