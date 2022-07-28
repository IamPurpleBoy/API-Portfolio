package com.testSpring.apiTest.controllers;

import com.testSpring.apiTest.models.Idioma;
import com.testSpring.apiTest.service.IIdiomaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdiomaController {

    @Autowired
    private IIdiomaService idiomaService;

    List<Idioma> idioma = new ArrayList<Idioma>();

    @GetMapping("/api/idioma")
    public List<Idioma> getAll() {

        return idiomaService.verIdioma();

    }

    @PostMapping("/api/newIdioma")
    public void agregarIdioma(@RequestBody Idioma idm) {

        idiomaService.crearIdioma(idm);

    }

    @PostMapping("/api/idiomaPost")
    public List<Idioma> getAllPost() {

        return idiomaService.verIdioma();

    }

    @GetMapping("/api/idioma/{id}")
    public Idioma buscarIdioma(@PathVariable Long id) {

        return idiomaService.buscarIdioma(id);
    }

    @DeleteMapping("/api/deleteIdioma/{id}")
    public void borrarIdioma(@PathVariable Long id) {

        idiomaService.borrarIdioma(id);
    }

    @PutMapping("/api/idioma/edit")
    public ResponseEntity<Idioma> modificarEducacion(@RequestBody Idioma idm) {
        Idioma modificarIdioma = idiomaService.modificarIdioma(idm);
        return new ResponseEntity<>(modificarIdioma, HttpStatus.OK);
    }
}
