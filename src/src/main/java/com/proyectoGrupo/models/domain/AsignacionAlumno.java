/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyectoGrupo.models.domain;
import java.sql.Date;
import java.sql.Time;
/**
 *
 * @author Hugo Daniel Velasquez Patzan
 * Codigo Tecnico IN5BV 
 * @date 30-ago-2021
 * @time 15:58:08
 */
public class AsignacionAlumno {
    private String idAsignacion;
    private String carne; 
    private int idCurso; 
    private Date fechaAsignacion;

    public AsignacionAlumno() {
    }

    public AsignacionAlumno(String idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public AsignacionAlumno(String carne, int idCurso, Date fechaAsignacion) {
        this.carne = carne;
        this.idCurso = idCurso;
        this.fechaAsignacion = fechaAsignacion;
    }

    public AsignacionAlumno(String idAsignacion, String carne, int idCurso, Date fechaAsignacion) {
        this.idAsignacion = idAsignacion;
        this.carne = carne;
        this.idCurso = idCurso;
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(String idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    @Override
    public String toString() {
        return "AsignacionAlumno{" + "idAsignacion=" + idAsignacion + ", carne=" + carne + ", idCurso=" + idCurso + ", fechaAsignacion=" + fechaAsignacion + '}';
    }

    
    
    
    
}
