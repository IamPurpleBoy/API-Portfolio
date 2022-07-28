package com.testSpring.apiTest.controllers;

import com.testSpring.apiTest.models.Usuario;
import com.testSpring.apiTest.service.IUsuarioService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private IUsuarioService usuarioRepo;

    List<Usuario> usuarios = new ArrayList<Usuario>();

    @GetMapping("/api/usuario")
    public List<Usuario> getAll() {

        return usuarioRepo.verUsuario();
    }

    @GetMapping("/api/usuario/{id}")
    public ResponseEntity<Usuario> buscarUsuario(@PathVariable("id") Integer id) {
        Usuario usuario = usuarioRepo.buscarUsuario(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
}
