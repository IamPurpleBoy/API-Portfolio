package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Proyecto;
import java.util.List;

public interface IProyectoService {

    public List<Proyecto> verProyecto();

    public void crearProyecto(Proyecto pyt);

    public void borrarProyecto(Long id);

    public Proyecto buscarProyecto(Long id);

    public Proyecto modificarProyecto(Proyecto pyt);
}
