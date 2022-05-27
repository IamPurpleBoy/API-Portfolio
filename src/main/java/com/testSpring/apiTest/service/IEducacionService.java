
package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    public void crearEducacion (Educacion edu);
    public void borrarEducacion (Long id);
    public Educacion buscarEducacion (Long id);   
    public Educacion modificarEducacion(Educacion edu);
    
}
