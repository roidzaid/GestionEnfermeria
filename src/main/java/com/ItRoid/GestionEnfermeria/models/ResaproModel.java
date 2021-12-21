package com.ItRoid.GestionEnfermeria.models;

public class ResaproModel {


    private String nomyApe;
    private String domicilio;
    private int dni;
    private String fechaNac;
    private String nomyApeResponsable;
    private int dniResponsable;
    private int edad;
    private String sexo;
    private String obraSocial;

    private String BCG;

    private String Hep_B_1;
    private String Hep_B_2;
    private String Hep_B_3;

    private String VCN_13_1;
    private String VCN_13_2;
    private String VCN_13_3;

    private String Pentavalente_1;
    private String Pentavalente_2;
    private String Pentavalente_3;

    private String SALK_IPV_1;
    private String SALK_IPV_2;
    private String SALK_IPV_3;
    private String SALK_IPV_R;

    private String Rotavirus_1;
    private String Rotavirus_2;

    private String Meningococo_1;
    private String Meningococo_2;
    private String Meningococo_3;
    private String Meningococo_R;

    private String Antigripal;

    private String Triple_Viral_1;
    private String Triple_Viral_2;

    private String Hep_A;

    private String Varicela;

    private String DTP_Hib;

    private String DTP;

    private String DTP_Ac;

    private String HPV_1;
    private String HPV_2;

    private String DT;

    private String SR;

    public ResaproModel() {
    }

    public ResaproModel(String nomyApe, String domicilio, int dni, String fechaNac, String nomyApeResponsable, int dniResponsable, int edad, String sexo, String obraSocial, String BCG, String hep_B_1, String hep_B_2, String hep_B_3, String VCN_13_1, String VCN_13_2, String VCN_13_3, String pentavalente_1, String pentavalente_2, String pentavalente_3, String SALK_IPV_1, String SALK_IPV_2, String SALK_IPV_3, String SALK_IPV_R, String rotavirus_1, String rotavirus_2, String meningococo_1, String meningococo_2, String meningococo_3, String meningococo_R, String antigripal, String triple_Viral_1, String triple_Viral_2, String hep_A, String varicela, String DTP_Hib, String DTP, String DTP_Ac, String HPV_1, String HPV_2, String DT, String SR) {
        this.nomyApe = nomyApe;
        this.domicilio = domicilio;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.nomyApeResponsable = nomyApeResponsable;
        this.dniResponsable = dniResponsable;
        this.edad = edad;
        this.sexo = sexo;
        this.obraSocial = obraSocial;
        this.BCG = BCG;
        this.Hep_B_1 = hep_B_1;
        this.Hep_B_2 = hep_B_2;
        this.Hep_B_3 = hep_B_3;
        this.VCN_13_1 = VCN_13_1;
        this.VCN_13_2 = VCN_13_2;
        this.VCN_13_3 = VCN_13_3;
        this.Pentavalente_1 = pentavalente_1;
        this.Pentavalente_2 = pentavalente_2;
        this.Pentavalente_3 = pentavalente_3;
        this.SALK_IPV_1 = SALK_IPV_1;
        this.SALK_IPV_2 = SALK_IPV_2;
        this.SALK_IPV_3 = SALK_IPV_3;
        this.SALK_IPV_R = SALK_IPV_R;
        this.Rotavirus_1 = rotavirus_1;
        this.Rotavirus_2 = rotavirus_2;
        this.Meningococo_1 = meningococo_1;
        this.Meningococo_2 = meningococo_2;
        this.Meningococo_3 = meningococo_3;
        this.Meningococo_R = meningococo_R;
        this.Antigripal = antigripal;
        this.Triple_Viral_1 = triple_Viral_1;
        this.Triple_Viral_2 = triple_Viral_2;
        this.Hep_A = hep_A;
        this.Varicela = varicela;
        this.DTP_Hib = DTP_Hib;
        this.DTP = DTP;
        this.DTP_Ac = DTP_Ac;
        this.HPV_1 = HPV_1;
        this.HPV_2 = HPV_2;
        this.DT = DT;
        this.SR = SR;
    }

    public String getNomyApe() {
        return nomyApe;
    }

    public void setNomyApe(String nomyApe) {
        this.nomyApe = nomyApe;
    }

    public String getNomyApeResponsable() {
        return nomyApeResponsable;
    }

    public void setNomyApeResponsable(String nomyApeResponsable) {
        this.nomyApeResponsable = nomyApeResponsable;
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

    public int getDniResponsable() {
        return dniResponsable;
    }

    public void setDniResponsable(int dniResponsable) {
        this.dniResponsable = dniResponsable;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getBCG() {
        return BCG;
    }

    public void setBCG(String BCG) {
        this.BCG = BCG;
    }

    public String getHep_B_1() {
        return Hep_B_1;
    }

    public void setHep_B_1(String hep_B_1) {
        Hep_B_1 = hep_B_1;
    }

    public String getHep_B_2() {
        return Hep_B_2;
    }

    public void setHep_B_2(String hep_B_2) {
        Hep_B_2 = hep_B_2;
    }

    public String getHep_B_3() {
        return Hep_B_3;
    }

    public void setHep_B_3(String hep_B_3) {
        Hep_B_3 = hep_B_3;
    }

    public String getVCN_13_1() {
        return VCN_13_1;
    }

    public void setVCN_13_1(String VCN_13_1) {
        this.VCN_13_1 = VCN_13_1;
    }

    public String getVCN_13_2() {
        return VCN_13_2;
    }

    public void setVCN_13_2(String VCN_13_2) {
        this.VCN_13_2 = VCN_13_2;
    }

    public String getVCN_13_3() {
        return VCN_13_3;
    }

    public void setVCN_13_3(String VCN_13_3) {
        this.VCN_13_3 = VCN_13_3;
    }

    public String getPentavalente_1() {
        return Pentavalente_1;
    }

    public void setPentavalente_1(String pentavalente_1) {
        Pentavalente_1 = pentavalente_1;
    }

    public String getPentavalente_2() {
        return Pentavalente_2;
    }

    public void setPentavalente_2(String pentavalente_2) {
        Pentavalente_2 = pentavalente_2;
    }

    public String getPentavalente_3() {
        return Pentavalente_3;
    }

    public void setPentavalente_3(String pentavalente_3) {
        Pentavalente_3 = pentavalente_3;
    }

    public String getSALK_IPV_1() {
        return SALK_IPV_1;
    }

    public void setSALK_IPV_1(String SALK_IPV_1) {
        this.SALK_IPV_1 = SALK_IPV_1;
    }

    public String getSALK_IPV_2() {
        return SALK_IPV_2;
    }

    public void setSALK_IPV_2(String SALK_IPV_2) {
        this.SALK_IPV_2 = SALK_IPV_2;
    }

    public String getSALK_IPV_3() {
        return SALK_IPV_3;
    }

    public void setSALK_IPV_3(String SALK_IPV_3) {
        this.SALK_IPV_3 = SALK_IPV_3;
    }

    public String getSALK_IPV_R() {
        return SALK_IPV_R;
    }

    public void setSALK_IPV_R(String SALK_IPV_R) {
        this.SALK_IPV_R = SALK_IPV_R;
    }

    public String getRotavirus_1() {
        return Rotavirus_1;
    }

    public void setRotavirus_1(String rotavirus_1) {
        Rotavirus_1 = rotavirus_1;
    }

    public String getRotavirus_2() {
        return Rotavirus_2;
    }

    public void setRotavirus_2(String rotavirus_2) {
        Rotavirus_2 = rotavirus_2;
    }

    public String getMeningococo_1() {
        return Meningococo_1;
    }

    public void setMeningococo_1(String meningococo_1) {
        Meningococo_1 = meningococo_1;
    }

    public String getMeningococo_2() {
        return Meningococo_2;
    }

    public void setMeningococo_2(String meningococo_2) {
        Meningococo_2 = meningococo_2;
    }

    public String getMeningococo_3() {
        return Meningococo_3;
    }

    public void setMeningococo_3(String meningococo_3) {
        Meningococo_3 = meningococo_3;
    }

    public String getMeningococo_R() {
        return Meningococo_R;
    }

    public void setMeningococo_R(String meningococo_R) {
        Meningococo_R = meningococo_R;
    }

    public String getAntigripal() {
        return Antigripal;
    }

    public void setAntigripal(String antigripal) {
        Antigripal = antigripal;
    }

    public String getTriple_Viral_1() {
        return Triple_Viral_1;
    }

    public void setTriple_Viral_1(String triple_Viral_1) {
        Triple_Viral_1 = triple_Viral_1;
    }

    public String getTriple_Viral_2() {
        return Triple_Viral_2;
    }

    public void setTriple_Viral_2(String triple_Viral_2) {
        Triple_Viral_2 = triple_Viral_2;
    }

    public String getHep_A() {
        return Hep_A;
    }

    public void setHep_A(String hep_A) {
        Hep_A = hep_A;
    }

    public String getVaricela() {
        return Varicela;
    }

    public void setVaricela(String varicela) {
        Varicela = varicela;
    }

    public String getDTP_Hib() {
        return DTP_Hib;
    }

    public void setDTP_Hib(String DTP_Hib) {
        this.DTP_Hib = DTP_Hib;
    }

    public String getDTP() {
        return DTP;
    }

    public void setDTP(String DTP) {
        this.DTP = DTP;
    }

    public String getDTP_Ac() {
        return DTP_Ac;
    }

    public void setDTP_Ac(String DTP_Ac) {
        this.DTP_Ac = DTP_Ac;
    }

    public String getHPV_1() {
        return HPV_1;
    }

    public void setHPV_1(String HPV_1) {
        this.HPV_1 = HPV_1;
    }

    public String getHPV_2() {
        return HPV_2;
    }

    public void setHPV_2(String HPV_2) {
        this.HPV_2 = HPV_2;
    }

    public String getDT() {
        return DT;
    }

    public void setDT(String DT) {
        this.DT = DT;
    }

    public String getSR() {
        return SR;
    }

    public void setSR(String SR) {
        this.SR = SR;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
