package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Usuario;
import java.util.List;

public interface IUsuarioService {

    public List<Usuario> verUsuario();

    public Usuario buscarUsuario(Integer id);
}
