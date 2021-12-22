package com.ItRoid.GestionEnfermeria.models;

public class RecuperosModel {

    private String varon;
    private String mujer;
    private String edad;
    private String nacimiento;
    private String vacuna;
    private String dosis1;
    private String dosis2;
    private String dosis3;
    private String dosisR;

    public RecuperosModel() {
    }

    public RecuperosModel(String varon, String mujer, String edad, String nacimiento, String vacuna, String dosis1, String dosis2, String dosis3, String dosisR) {
        this.varon = varon;
        this.mujer = mujer;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.vacuna = vacuna;
        this.dosis1 = dosis1;
        this.dosis2 = dosis2;
        this.dosis3 = dosis3;
        this.dosisR = dosisR;
    }

    public String getVaron() {
        return varon;
    }

    public void setVaron(String varon) {
        this.varon = varon;
    }

    public String getMujer() {
        return mujer;
    }

    public void setMujer(String mujer) {
        this.mujer = mujer;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public String getDosis1() {
        return dosis1;
    }

    public void setDosis1(String dosis1) {
        this.dosis1 = dosis1;
    }

    public String getDosis2() {
        return dosis2;
    }

    public void setDosis2(String dosis2) {
        this.dosis2 = dosis2;
    }

    public String getDosis3() {
        return dosis3;
    }

    public void setDosis3(String dosis3) {
        this.dosis3 = dosis3;
    }

    public String getDosisR() {
        return dosisR;
    }

    public void setDosisR(String dosisR) {
        this.dosisR = dosisR;
    }
}
