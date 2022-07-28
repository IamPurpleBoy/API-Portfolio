package com.testSpring.apiTest.service;

import com.testSpring.apiTest.models.Usuario;
import com.testSpring.apiTest.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepo;

    @Override
    public List<Usuario> verUsuario() {
        return usuarioRepo.findAll();
    }

    @Override
    public Usuario buscarUsuario(Integer id) {
        return usuarioRepo.findById(id).orElse(null);
    }

}
