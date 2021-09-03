package com.ItRoid.GestionEnfermeria.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@TableGenerator(name = "seq", initialValue = 100, allocationSize = 1)
@Table(name = "lotes")
public class LoteEntity {

    @Id
    @Column(name="idlote")
    @GeneratedValue(strategy= GenerationType.TABLE, generator = "seq")
    private Long idlote;

    @Column(name = "fechaAlta")
    private Date fechaAlta;

    @Column(name = "vacuna")
    private String vacuna;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "lote")
    private String lote;

    @Column(name = "estado")
    private String estado;

    @Column(name = "usuarioModif")
    private String usuarioModif;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    public LoteEntity() {
    }

    public LoteEntity(Date fechaAlta, String vacuna, String tipo, String lote, String estado, String usuarioModif, Timestamp timestamp) {
        this.fechaAlta = fechaAlta;
        this.vacuna = vacuna;
        this.tipo = tipo;
        this.lote = lote;
        this.estado = estado;
        this.usuarioModif = usuarioModif;
        this.timestamp = timestamp;
    }

    public Long getIdlote() {
        return idlote;
    }

    public void setIdlote(Long idlote) {
        this.idlote = idlote;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
