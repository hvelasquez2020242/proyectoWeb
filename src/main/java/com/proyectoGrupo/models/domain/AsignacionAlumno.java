/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyectoGrupo.models.domain;


import java.sql.Timestamp;
/**
 *
 * @author Hugo Daniel Velasquez Patzan
 * Codigo Tecnico IN5BV 
 * @date 30-ago-2021
 * @time 15:58:08
 */
public class AsignacionAlumno {
    private int idAsignacion;
    private Timestamp fechaAsignacion;
    private String carne; 
    private int idCurso;

    public AsignacionAlumno() {
    }

    public AsignacionAlumno(int idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public AsignacionAlumno(Timestamp fechaAsignacion, String carne, int idCurso) {
        this.fechaAsignacion = fechaAsignacion;
        this.carne = carne;
        this.idCurso = idCurso;
    }

    public AsignacionAlumno(int idAsignacion, Timestamp fechaAsignacion, String carne, int idCurso) {
        this.idAsignacion = idAsignacion;
        this.fechaAsignacion = fechaAsignacion;
        this.carne = carne;
        this.idCurso = idCurso;
    }

    public int getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(int idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public Timestamp getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Timestamp fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
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

    @Override
    public String toString() {
        return "AsignacionAlumno{" + "idAsignacion=" + idAsignacion + ", fechaAsignacion=" + fechaAsignacion + ", carne=" + carne + ", idCurso=" + idCurso + '}';
    }

    
    
        
    }