package com.ItRoid.GestionEnfermeria.models;

import java.util.Date;

public class PracticaModel {

    private Long idPractica;
    private Date fecha;
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
    private int telefono;
    private String mail;
    private String tipoPractica;
    private String observacion;
    private String vacuna;
    private String dosis;
    private String tipoVacuna;
    private String lote;


    public PracticaModel() {
    }

    public PracticaModel(Long idPractica, Date fecha, String nombre, String apellido, int dni, String fechaNac, String sexo, String obraSocial, String localidad, String direccion, String nombreResponsable, String apellidoResponsable, int dniResponsable, int telefono, String mail, String tipoPractica, String observacion, String vacuna, String dosis, String tipoVacuna, String lote) {
        this.idPractica = idPractica;
        this.fecha = fecha;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.obraSocial = obraSocial;
        this.localidad = localidad;
        this.direccion = direccion;
        this.nombreResponsable = nombreResponsable;
        ApellidoResponsable = apellidoResponsable;
        this.dniResponsable = dniResponsable;
        this.telefono = telefono;
        this.mail = mail;
        this.tipoPractica = tipoPractica;
        this.observacion = observacion;
        this.vacuna = vacuna;
        this.dosis = dosis;
        this.tipoVacuna = tipoVacuna;
        this.lote = lote;
    }

    public PracticaModel(String nombre, String apellido, int dni, String fechaNac, String sexo, String obraSocial, String localidad, String direccion, String nombreResponsable, String apellidoResponsable, int dniResponsable, int telefono, String mail, String tipoPractica, String observacion, String vacuna, String dosis, String tipoVacuna, String lote) {
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
        this.telefono = telefono;
        this.mail = mail;
        this.tipoPractica = tipoPractica;
        this.observacion = observacion;
        this.vacuna = vacuna;
        this.dosis = dosis;
        this.tipoVacuna = tipoVacuna;
        this.lote = lote;
    }



    public Long getIdPractica() {
        return idPractica;
    }

    public void setIdPractica(Long idPractica) {
        this.idPractica = idPractica;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTipoPractica() {
        return tipoPractica;
    }

    public void setTipoPractica(String tipoPractica) {
        this.tipoPractica = tipoPractica;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
}
