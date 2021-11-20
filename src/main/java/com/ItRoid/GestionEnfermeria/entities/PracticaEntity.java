package com.ItRoid.GestionEnfermeria.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@TableGenerator(name = "seq", initialValue = 100, allocationSize = 1)
@Table(name = "practicas")
public class PracticaEntity {

    @Id
    @Column(name="idPractica")
    @GeneratedValue(strategy= GenerationType.TABLE, generator = "seq")
    private Long idPractica;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private int dni;

    @Column(name = "fechaNac")
    private String fechaNac;

    @Column(name = "edadAños")
    private int edadAños;

    @Column(name = "edadMeses")
    private int edadMeses;

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

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "vacuna")
    private String vacuna;

    @Column(name = "dosis")
    private String dosis;

    @Column(name = "tipoVacuna")
    private String tipoVacuna;

    @Column(name = "lote")
    private String lote;

    @Column(name = "usuarioModif")
    private String usuarioModif;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    @Column(name = "esqAtrasado")
    private String esqAtrasado;

    public PracticaEntity() {
    }

    public PracticaEntity(Date fecha, String nombre, String apellido, int dni, String fechaNac, int edadAños, int edadMeses, String sexo, String obraSocial, String localidad, String direccion, String nombreResponsable, String apellidoResponsable, int dniResponsable, String observaciones, String vacuna, String dosis, String tipoVacuna, String lote, String usuarioModif, Timestamp timestamp, String esqAtrasado) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.edadAños = edadAños;
        this.edadMeses = edadMeses;
        this.sexo = sexo;
        this.obraSocial = obraSocial;
        this.localidad = localidad;
        this.direccion = direccion;
        this.nombreResponsable = nombreResponsable;
        ApellidoResponsable = apellidoResponsable;
        this.dniResponsable = dniResponsable;
        this.observaciones = observaciones;
        this.vacuna = vacuna;
        this.dosis = dosis;
        this.tipoVacuna = tipoVacuna;
        this.lote = lote;
        this.usuarioModif = usuarioModif;
        this.timestamp = timestamp;
        this.esqAtrasado = esqAtrasado;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    public int getEdadAños() {
        return edadAños;
    }

    public void setEdadAños(int edadAños) {
        this.edadAños = edadAños;
    }

    public int getEdadMeses() {
        return edadMeses;
    }

    public void setEdadMeses(int edadMeses) {
        this.edadMeses = edadMeses;
    }

    public String getEsqAtrasado() {
        return esqAtrasado;
    }

    public void setEsqAtrasado(String esqAtrasado) {
        this.esqAtrasado = esqAtrasado;
    }
}
