package com.ItRoid.GestionEnfermeria.models;

import java.util.Date;

public class LoteModel {


    private Date fechaAlta;
    private String vacuna;
    private String tipo;
    private String lote;
    private String estado;


    public LoteModel() {
    }

    public LoteModel(String vacuna, String tipo, String lote) {
        this.vacuna = vacuna;
        this.tipo = tipo;
        this.lote = lote;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
