package com.ItRoid.GestionEnfermeria.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@TableGenerator(name = "seq", initialValue = 100, allocationSize = 1)
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    @Column(name="idUsuario")
    @GeneratedValue(strategy= GenerationType.TABLE, generator = "seq")
    private Long idUsuario;

    @Column(name = "fechaAlta")
    private Date fechaAlta;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "mail")
    private String mail;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "clave")
    private String clave;

    @Column(name = "fechaModif")
    private Date fechaModif;


    public UsuarioEntity() {
    }

    public UsuarioEntity(Date fechaAlta, String nombre, String apellido, String mail, String usuario, String clave, Date fechaModif) {
        this.fechaAlta = fechaAlta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.usuario = usuario;
        this.clave = clave;
        this.fechaModif = fechaModif;

    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getFechaModif() {
        return fechaModif;
    }

    public void setFechaModif(Date fechaModif) {
        this.fechaModif = fechaModif;
    }

}
