package com.ItRoid.GestionEnfermeria.entities;

import javax.persistence.*;

@Entity
@Table(name = "vacunas")
public class VacunaEntity {

    @Id
    @Column(name="idVacuna")
    private Long idVacuna;

    @Column(name = "vacuna")
    private String vacuna;

    @Column(name = "dosis")
    private String dosis;


    public VacunaEntity() {
    }

    public VacunaEntity(String vacuna, String dosis) {
        this.vacuna = vacuna;
        this.dosis = dosis;
    }

    public Long getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(Long idVacuna) {
        this.idVacuna = idVacuna;
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
