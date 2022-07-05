package com.testSpring.apiTest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String institucion;
    private String titulo;
    private String estado;
    //private int anoInicio;
    private int anoFin;
    private String modalidad;
    private String descripcion;
    
    
    public Educacion(){
    }
    
    public Educacion(String institucion, String titulo, String estado,
                     /*int anoInicio,*/ int anoFin, String modalidad,
                     String descripcion){
    
        this.institucion = institucion;
        this.titulo = titulo;
        this.estado = estado;
        //this.anoInicio = anoInicio;
        this.anoFin = anoFin;
        this.modalidad = modalidad;
        this.descripcion = descripcion;
    
    
    }

    public Long getIdEdu() {
        return id;
    }

    public void setIdEdu(Long id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /*public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }*/

    public int getAnoFin() {
        return anoFin;
    }

    public void setAnoFin(int anoFin) {
        this.anoFin = anoFin;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return "educacion{" + "isntitucion=" + institucion + ", titulo=" + titulo + '}';
    }
    
}
