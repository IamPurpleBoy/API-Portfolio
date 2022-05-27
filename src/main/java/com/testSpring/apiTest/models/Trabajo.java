package com.testSpring.apiTest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String empresa;
    private String cargo;
    private String telefono;
    private int anoInicio;
    private int anoFin;
    private String descripcion;

    public Trabajo() {
    }

    public Trabajo(String empresa, String cargo, String telefono, int anoInicio, int anoFin, String descripcion) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.telefono = telefono;
        this.anoInicio = anoInicio;
        this.anoFin = anoFin;
        this.descripcion = descripcion;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public int getAnoFin() {
        return anoFin;
    }

    public void setAnoFin(int anoFin) {
        this.anoFin = anoFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "trabajo{" + "empresa=" + empresa + ", cargo=" + cargo + '}';
    }
}
