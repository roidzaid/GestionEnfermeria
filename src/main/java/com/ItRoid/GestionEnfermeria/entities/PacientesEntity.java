package com.ItRoid.GestionEnfermeria.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@TableGenerator(name = "seq", initialValue = 100, allocationSize = 1)
@Table(name = "pacientes")
public class PacientesEntity {

    @Id
    @Column(name="idPaciente")
    @GeneratedValue(strategy= GenerationType.TABLE, generator = "seq")
    private Long idPaciente;

    @Column(name = "fechaAlta")
    private Date fechaAlta;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private int dni;

    @Column(name = "fechaNac")
    private String fechaNac;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "obraSocial")
    private String obraSocial;

    @Column(name = "localidad")
    private String localidad;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "nombreResponsable")
    private String nombreResponsable;

    @Column(name = "ApellidoResponsable")
    private String ApellidoResponsable;

    @Column(name = "dniResponsable")
    private int dniResponsable;

    @Column(name = "telefono")
    private int telefono;

    @Column(name = "mail")
    private String mail;

    @Column(name = "usuarioModif")
    private String usuarioModif;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    public PacientesEntity() {
    }

    public PacientesEntity(Date fechaAlta, String nombre, String apellido, int dni, String fechaNac, String sexo, String obraSocial, String localidad, String direccion, String nombreResponsable, String apellidoResponsable, int dniResponsable, int telefono, String mail, String usuarioModif, Timestamp timestamp) {
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
        this.telefono = telefono;
        this.mail = mail;
        this.usuarioModif = usuarioModif;
        this.timestamp = timestamp;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
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
        this.ApellidoResponsable = apellidoResponsable;
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

    public String getUsuarioModif() {
        return usuarioModif;
    }

    public void setUsuarioModif(String usuarioModif) {
        this.usuarioModif = usuarioModif;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
