package com.ItRoid.GestionEnfermeria.models;

import java.util.List;

public class UsuarioModel {

    private String nombre;
    private String apellido;
    private String mail;
    private String usuario;
    private String clave;
    private List<String> roles;


    public UsuarioModel() {
    }

    public UsuarioModel(String nombre, String apellido, String mail, String usuario, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.usuario = usuario;
        this.clave = clave;
    }

    public UsuarioModel(String nombre, String apellido, String mail, String usuario, String clave, List<String> roles) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.usuario = usuario;
        this.clave = clave;
        this.roles = roles;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {this.usuario = usuario; }

    public String getClave() {return clave; }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
