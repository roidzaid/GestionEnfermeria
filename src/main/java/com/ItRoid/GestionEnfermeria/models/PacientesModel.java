package com.ItRoid.GestionEnfermeria.models;

import java.util.Date;

public class PacientesModel {


    private Date fechaAlta;
    private String nombre;
    private String apellido;
    private int dni;
    private String fechaNac;
    private String sexo;
    private String obraSocial;
    private String localidad;
    private String direccion;
    private String nombreResponsable;
    private String ApellidoResponsable;
    private int dniResponsable;
    private String usuarioModif;

    public PacientesModel() {
    }

    public PacientesModel(Date fechaAlta, String nombre, String apellido, int dni, String fechaNac, String sexo, String obraSocial, String localidad, String direccion, String nombreResponsable, String apellidoResponsable, int dniResponsable) {
        this.fechaAlta = fechaAlta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.obraSocial = obraSocial;
        this.localidad = localidad;
        this.direccion = direccion;
        this.nombreResponsable = nombreResponsable;
        this.ApellidoResponsable = apellidoResponsable;
        this.dniResponsable = dniResponsable;
        this.usuarioModif = usuarioModif;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getApellidoResponsable() {
        return ApellidoResponsable;
    }

    public void setApellidoResponsable(String apellidoResponsable) {
        ApellidoResponsable = apellidoResponsable;
    }

    public int getDniResponsable() {
        return dniResponsable;
    }

    public void setDniResponsable(int dniResponsable) {
        this.dniResponsable = dniResponsable;
    }

    public String getUsuarioModif() {
        return usuarioModif;
    }

    public void setUsuarioModif(String usuarioModif) {
        this.usuarioModif = usuarioModif;
    }
}
