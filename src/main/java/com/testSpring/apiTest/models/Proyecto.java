package com.testSpring.apiTest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private int anio;
    private String descripcion;
    private String imagen1;
    private String imagen2;
    private String imagen3;
    private String imagen4;
    private String imagen5;
    private String imagen6;

    public Proyecto() {
    }

    public Proyecto(String nombre, int anio, String descripcion, String imagen1, String imagen2, String imagen3, String imagen4, String imagen5, String imagen6) {
        this.nombre = nombre;
        this.anio = anio;
        this.descripcion = descripcion;
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
        this.imagen4 = imagen4;
        this.imagen5 = imagen5;
        this.imagen6 = imagen6;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen1() {
        return imagen1;
    }

    public void setImagen1(String imagen1) {
        this.imagen1 = imagen1;
    }

    public String getImagen2() {
        return imagen2;
    }

    public void setImagen2(String imagen2) {
        this.imagen2 = imagen2;
    }

    public String getImagen3() {
        return imagen3;
    }

    public void setImagen3(String imagen3) {
        this.imagen3 = imagen3;
    }

    public String getImagen4() {
        return imagen4;
    }

    public void setImagen4(String imagen4) {
        this.imagen4 = imagen4;
    }

    public String getImagen5() {
        return imagen5;
    }

    public void setImagen5(String imagen5) {
        this.imagen5 = imagen5;
    }

    public String getImagen6() {
        return imagen6;
    }

    public void setImagen6(String imagen6) {
        this.imagen6 = imagen6;
    }

    @Override
    public String toString() {
        return "proyecto{" + "nombre=" + nombre + ", anio=" + anio + '}';
    }
}
