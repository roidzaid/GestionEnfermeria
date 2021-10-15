package com.ItRoid.GestionEnfermeria.models;

public class VacunaModel {

    private String vacuna;
    private String dosis;

    public VacunaModel() {
    }

    public VacunaModel(String vacuna, String dosis) {
        this.vacuna = vacuna;
        this.dosis = dosis;
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
