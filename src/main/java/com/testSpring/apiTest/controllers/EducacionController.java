package com.testSpring.apiTest.controllers;

import com.testSpring.apiTest.models.Educacion;
import com.testSpring.apiTest.service.IEducacionService;
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
public class EducacionController {

    @Autowired
    private IEducacionService educacionServ;

    List<Educacion> educacion = new ArrayList<Educacion>();

    @GetMapping("/api/educacion")
    public List<Educacion> getAll() {

        return educacionServ.verEducacion();

    }

    @PostMapping("/api/newEducacion")
    public void agregarTrabajo(@RequestBody Educacion edu) {

        educacionServ.crearEducacion(edu);

    }

    @PostMapping("/api/eduPost")
    public List<Educacion> getAllPost() {

        return educacionServ.verEducacion();

    }

    @GetMapping("/api/educacion/{id}")
    public Educacion buscarEducacion(@PathVariable Long id) {

        return educacionServ.buscarEducacion(id);
    }

    @DeleteMapping("/api/deleteEdu/{id}")
    public void borrarEducacion(@PathVariable Long id) {

        educacionServ.borrarEducacion(id);
    }

    @PutMapping("/api/educacion/edit")
    public ResponseEntity<Educacion> modificarEducacion(@RequestBody Educacion edu) {
        Educacion modificarEducacion = educacionServ.modificarEducacion(edu);
        return new ResponseEntity<>(modificarEducacion, HttpStatus.OK);
    }
}
