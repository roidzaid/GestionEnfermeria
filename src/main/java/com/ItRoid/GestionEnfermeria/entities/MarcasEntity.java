package com.ItRoid.GestionEnfermeria.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marcas")
public class MarcasEntity {

    @Id
    @Column(name="idMarca")
    private Long idMarca;

    @Column(name = "marca")
    private String marca;

    public MarcasEntity() {
    }

    public MarcasEntity(String marca) {
        this.marca = marca;
    }

    public Long getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Long idMarca) {
        this.idMarca = idMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
