package com.ItRoid.GestionEnfermeria.models;

public class LoteModel {


    private String fechaAlta;
    private String vacuna;
    private String marca;
    private String lote;
    private String estado;
    private String usuarioModif;


    public LoteModel() {
    }

    public LoteModel(String fechaAlta, String vacuna, String tipo, String lote, String estado) {
        this.fechaAlta = fechaAlta;
        this.vacuna = vacuna;
        this.marca = tipo;
        this.lote = lote;
        this.estado = estado;
        this.usuarioModif = usuarioModif;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public String getUsuarioModif() {
        return usuarioModif;
    }

    public void setUsuarioModif(String usuarioModif) {
        this.usuarioModif = usuarioModif;
    }
}
