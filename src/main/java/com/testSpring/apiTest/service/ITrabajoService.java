
package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Trabajo;
import java.util.List;

public interface ITrabajoService {
    
    public List<Trabajo> verTrabajos();
    public void crearTrabajo (Trabajo job);
    public void borrarTrabajo (Long id);
    public Trabajo buscarTrabajo (Long id);
    public Trabajo modificarTrabajo(Trabajo job);
    
}
