package com.ItRoid.GestionEnfermeria.models;

public class ResaproModelBD {

    private String nombre;
    private String apellido;
    private String dni;
    private String fechaNac;
    private String nombreResponsable;
    private String ApellidoResponsable;
    private String dniResponsable;
    private int edad;
    private String sexo;
    private String obraSocial;
    private String vacuna;
    private String dosis;

    public ResaproModelBD() {
    }

    public ResaproModelBD(String nombre, String apellido, String dni, String fechaNac, String nombreResponsable, String apellidoResponsable, String dniResponsable, int edad, String sexo, String obraSocial, String vacuna, String dosis) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.nombreResponsable = nombreResponsable;
        ApellidoResponsable = apellidoResponsable;
        this.dniResponsable = dniResponsable;
        this.edad = edad;
        this.sexo = sexo;
        this.obraSocial = obraSocial;
        this.vacuna = vacuna;
        this.dosis = dosis;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
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

    public String getDniResponsable() {
        return dniResponsable;
    }

    public void setDniResponsable(String dniResponsable) {
        this.dniResponsable = dniResponsable;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
}
