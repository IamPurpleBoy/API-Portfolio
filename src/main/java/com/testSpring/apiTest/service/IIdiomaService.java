
package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Idioma;
import java.util.List;


public interface IIdiomaService {
    
    public List<Idioma> verIdioma();
    public void crearIdioma (Idioma idm);
    public void borrarIdioma (Long id);
    public Idioma buscarIdioma (Long id);   
    public Idioma modificarIdioma(Idioma idm);
    
}
