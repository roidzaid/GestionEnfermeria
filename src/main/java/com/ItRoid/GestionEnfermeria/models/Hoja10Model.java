package com.ItRoid.GestionEnfermeria.models;

public class Hoja10Model {

//VACUNAS NIÑOS/AS 2 MESES (por dosis)
    private int PENTAVALENTE_D1;
    private int VCN_13_D1;
    private int ROTAVIRUS_D1;
    private int IPV_SALK_D1;
//VACUNA ANTIMENINGOCÓCICA (3 Y 5 MESES)  (por dosis)
    private int MENINGOCOCO_D1;
    private int MENINGOCOCO_D2;
//VACUNAS NIÑOS/AS 4 MESES  (por dosis)
    private int PENTAVALENTE_D2;
    private int VCN_13_D2;
    private int ROTAVIRUS_D2;
    private int IPV_SALK_D2;
//VACUNAS NIÑOS/AS 6 MESES  (por dosis)
    private int PENTAVALENTE_D3;
    private int IPV_SALK_D3;
//VACUNAS NIÑOS/AS 12 MESES
    private int VCN_13_R;
    private int HEP_A;
    private int TRIPLE_VIRAL_D1;
    //****filtrar por edad las dosis 1, 2 y UD
    private int ANTIGRIPAL_6M_12M;
//VACUNAS NIÑOS/AS 15 MESES
    private int MENINGOCOCO_D3;
    private int VARICELA;
//VACUNAS NIÑOS/AS 18 MESES
    private int PENTAVALENTE_R;
    //****filtrar por edad las dosis 1, 2 y UD
    private int ANTIGRIPAL_12M_24M;
//TRIPLE VIRAL NIÑOS/AS 2 A 4 AÑOS
    //****filtrar por edad
    private int TRIPLE_VIRAL_2A_4A;
//PENTAVALENTE EN NIÑOS/AS DE 2 A 4 AÑOS
    //****filtrar por edad
    private int PENTAVALENTE_2A_4A;
//VACUNAS NIÑOS/AS INGRESO ESCOLAR
    private int IPV_SALK_R_IE;
    private int TRIPLE_VIRAL_D2_IE;
    private int DPT_R_IE;
    //****filtrar por edad
    private int DT_7A_9A_D1;
    private int DT_7A_9A_D2;
    private int DT_7A_9A_D3;
//VACUNAS NIÑOS/AS 11 AÑOS
    private int MENINGOCOCO_R_11A;
    private int DTP_AC_11A;
    private int HPV_M_D1;
    private int HPV_M_D2;
    private int HPV_V_D1;
    private int HPV_V_D2;
//VACUNAS EN EL EMBARAZO
    private int ANTIGRIPAL_EMB;
    private int DTP_AC_EMB;
    private int HEP_B_EMB_D1;
    private int HEP_B_EMB_D2;
    private int HEP_B_EMB_D3;
    private int DT_EMB_D1;
    private int DT_EMB_D2;
    private int DT_EMB_D3;
//VACUNAS EN EL PUERPERIO
    private int ANTIGRIPAL_PUER;
    private int DTP_AC_PUER;
//VACUNAS ADULTXS
    //****filtrar por edad
    private int HEP_B_21A_40A_D1;
    private int HEP_B_21A_40A_D2;
    private int HEP_B_21A_40A_D3;
    private int HEP_B_MAYOR_40A_D1;
    private int HEP_B_MAYOR_40A_D2;
    private int HEP_B_MAYOR_40A_D3;
    private int DT_MAYOR_17A_D1;
    private int DT_MAYOR_17A_D2;
    private int DT_MAYOR_17A_D3;
    private int TRIPLE_VIRAL_18A_D1;
    private int TRIPLE_VIRAL_18A_D2;
    private int TRIPLE_VIRAL_R_CAMP;
//VACUNAS PERSONAL DE SALUD
    private int HEP_B_PS;
    private int ANTIGRIPAL_PS;
    private int DTP_AC_PS;
//VACUNAS ADULTXS MAYORES DE 65 AÑOS
    private int VCN_13_M65;
    private int N_23_M65;
    private int ANTIGRIPAL_M65;
//VACUNAS PERSONAS DENTRO GRUPO DE RIESGOS
    private int VCN_13_FR;
    private int N_23_FR;
    private int ANTIGRIPAL_FR;
//OTRAS VACUNAS
    private int TRIPLE_VIRAL_7A_18A_D1;
    private int TRIPLE_VIRAL_7A_18A_D2;
    private int TRIPLE_VIRAL_7A_18A_R_CAMP;
    //****filtrar por edad
    private int HEP_B_2A_4A_D1;
    private int HEP_B_2A_4A_D2;
    private int HEP_B_2A_4A_D3;
    private int HEP_B_5A_9A_D1;
    private int HEP_B_5A_9A_D2;
    private int HEP_B_5A_9A_D3;
    private int HEP_B_10A_12A_D1;
    private int HEP_B_10A_12A_D2;
    private int HEP_B_10A_12A_D3;
    private int HEP_B_13A_20A_D1;
    private int HEP_B_13A_20A_D2;
    private int HEP_B_13A_20A_D3;

    public Hoja10Model() {
    }

    public Hoja10Model(int PENTAVALENTE_D1, int VCN_13_D1, int ROTAVIRUS_D1, int IPV_SALK_D1, int MENINGOCOCO_D1, int MENINGOCOCO_D2, int PENTAVALENTE_D2, int VCN_13_D2, int ROTAVIRUS_D2, int IPV_SALK_D2, int PENTAVALENTE_D3, int IPV_SALK_D3, int VCN_13_R, int HEP_A, int TRIPLE_VIRAL_D1, int ANTIGRIPAL_6M_12M, int MENINGOCOCO_D3, int VARICELA, int PENTAVALENTE_R, int ANTIGRIPAL_12M_24M, int TRIPLE_VIRAL_2A_4A, int PENTAVALENTE_2A_4A, int IPV_SALK_R_IE, int TRIPLE_VIRAL_D2_IE, int DPT_R_IE, int DT_7A_9A_D1, int DT_7A_9A_D2, int DT_7A_9A_D3, int MENINGOCOCO_R_11A, int DTP_AC_11A, int HPV_M_D1, int HPV_M_D2, int HPV_V_D1, int HPV_V_D2, int ANTIGRIPAL_EMB, int DTP_AC_EMB, int HEP_B_EMB_D1, int HEP_B_EMB_D2, int HEP_B_EMB_D3, int DT_EMB_D1, int DT_EMB_D2, int DT_EMB_D3, int ANTIGRIPAL_PUER, int DTP_AC_PUER, int HEP_B_21A_40A_D1, int HEP_B_21A_40A_D2, int HEP_B_21A_40A_D3, int HEP_B_MAYOR_40A_D1, int HEP_B_MAYOR_40A_D2, int HEP_B_MAYOR_40A_D3, int DT_MAYOR_17A_D1, int DT_MAYOR_17A_D2, int DT_MAYOR_17A_D3, int TRIPLE_VIRAL_18A_D1, int TRIPLE_VIRAL_18A_D2, int TRIPLE_VIRAL_R_CAMP, int HEP_B_PS, int ANTIGRIPAL_PS, int DTP_AC_PS, int VCN_13_M65, int n_23_M65, int ANTIGRIPAL_M65, int VCN_13_FR, int n_23_FR, int ANTIGRIPAL_FR, int TRIPLE_VIRAL_7A_18A_D1, int TRIPLE_VIRAL_7A_18A_D2, int TRIPLE_VIRAL_7A_18A_R_CAMP, int HEP_B_2A_4A_D1, int HEP_B_2A_4A_D2, int HEP_B_2A_4A_D3, int HEP_B_5A_9A_D1, int HEP_B_5A_9A_D2, int HEP_B_5A_9A_D3, int HEP_B_10A_12A_D1, int HEP_B_10A_12A_D2, int HEP_B_10A_12A_D3, int HEP_B_13A_20A_D1, int HEP_B_13A_20A_D2, int HEP_B_13A_20A_D3) {
        this.PENTAVALENTE_D1 = PENTAVALENTE_D1;
        this.VCN_13_D1 = VCN_13_D1;
        this.ROTAVIRUS_D1 = ROTAVIRUS_D1;
        this.IPV_SALK_D1 = IPV_SALK_D1;
        this.MENINGOCOCO_D1 = MENINGOCOCO_D1;
        this.MENINGOCOCO_D2 = MENINGOCOCO_D2;
        this.PENTAVALENTE_D2 = PENTAVALENTE_D2;
        this.VCN_13_D2 = VCN_13_D2;
        this.ROTAVIRUS_D2 = ROTAVIRUS_D2;
        this.IPV_SALK_D2 = IPV_SALK_D2;
        this.PENTAVALENTE_D3 = PENTAVALENTE_D3;
        this.IPV_SALK_D3 = IPV_SALK_D3;
        this.VCN_13_R = VCN_13_R;
        this.HEP_A = HEP_A;
        this.TRIPLE_VIRAL_D1 = TRIPLE_VIRAL_D1;
        this.ANTIGRIPAL_6M_12M = ANTIGRIPAL_6M_12M;
        this.MENINGOCOCO_D3 = MENINGOCOCO_D3;
        this.VARICELA = VARICELA;
        this.PENTAVALENTE_R = PENTAVALENTE_R;
        this.ANTIGRIPAL_12M_24M = ANTIGRIPAL_12M_24M;
        this.TRIPLE_VIRAL_2A_4A = TRIPLE_VIRAL_2A_4A;
        this.PENTAVALENTE_2A_4A = PENTAVALENTE_2A_4A;
        this.IPV_SALK_R_IE = IPV_SALK_R_IE;
        this.TRIPLE_VIRAL_D2_IE = TRIPLE_VIRAL_D2_IE;
        this.DPT_R_IE = DPT_R_IE;
        this.DT_7A_9A_D1 = DT_7A_9A_D1;
        this.DT_7A_9A_D2 = DT_7A_9A_D2;
        this.DT_7A_9A_D3 = DT_7A_9A_D3;
        this.MENINGOCOCO_R_11A = MENINGOCOCO_R_11A;
        this.DTP_AC_11A = DTP_AC_11A;
        this.HPV_M_D1 = HPV_M_D1;
        this.HPV_M_D2 = HPV_M_D2;
        this.HPV_V_D1 = HPV_V_D1;
        this.HPV_V_D2 = HPV_V_D2;
        this.ANTIGRIPAL_EMB = ANTIGRIPAL_EMB;
        this.DTP_AC_EMB = DTP_AC_EMB;
        this.HEP_B_EMB_D1 = HEP_B_EMB_D1;
        this.HEP_B_EMB_D2 = HEP_B_EMB_D2;
        this.HEP_B_EMB_D3 = HEP_B_EMB_D3;
        this.DT_EMB_D1 = DT_EMB_D1;
        this.DT_EMB_D2 = DT_EMB_D2;
        this.DT_EMB_D3 = DT_EMB_D3;
        this.ANTIGRIPAL_PUER = ANTIGRIPAL_PUER;
        this.DTP_AC_PUER = DTP_AC_PUER;
        this.HEP_B_21A_40A_D1 = HEP_B_21A_40A_D1;
        this.HEP_B_21A_40A_D2 = HEP_B_21A_40A_D2;
        this.HEP_B_21A_40A_D3 = HEP_B_21A_40A_D3;
        this.HEP_B_MAYOR_40A_D1 = HEP_B_MAYOR_40A_D1;
        this.HEP_B_MAYOR_40A_D2 = HEP_B_MAYOR_40A_D2;
        this.HEP_B_MAYOR_40A_D3 = HEP_B_MAYOR_40A_D3;
        this.DT_MAYOR_17A_D1 = DT_MAYOR_17A_D1;
        this.DT_MAYOR_17A_D2 = DT_MAYOR_17A_D2;
        this.DT_MAYOR_17A_D3 = DT_MAYOR_17A_D3;
        this.TRIPLE_VIRAL_18A_D1 = TRIPLE_VIRAL_18A_D1;
        this.TRIPLE_VIRAL_18A_D2 = TRIPLE_VIRAL_18A_D2;
        this.TRIPLE_VIRAL_R_CAMP = TRIPLE_VIRAL_R_CAMP;
        this.HEP_B_PS = HEP_B_PS;
        this.ANTIGRIPAL_PS = ANTIGRIPAL_PS;
        this.DTP_AC_PS = DTP_AC_PS;
        this.VCN_13_M65 = VCN_13_M65;
        N_23_M65 = n_23_M65;
        this.ANTIGRIPAL_M65 = ANTIGRIPAL_M65;
        this.VCN_13_FR = VCN_13_FR;
        N_23_FR = n_23_FR;
        this.ANTIGRIPAL_FR = ANTIGRIPAL_FR;
        this.TRIPLE_VIRAL_7A_18A_D1 = TRIPLE_VIRAL_7A_18A_D1;
        this.TRIPLE_VIRAL_7A_18A_D2 = TRIPLE_VIRAL_7A_18A_D2;
        this.TRIPLE_VIRAL_7A_18A_R_CAMP = TRIPLE_VIRAL_7A_18A_R_CAMP;
        this.HEP_B_2A_4A_D1 = HEP_B_2A_4A_D1;
        this.HEP_B_2A_4A_D2 = HEP_B_2A_4A_D2;
        this.HEP_B_2A_4A_D3 = HEP_B_2A_4A_D3;
        this.HEP_B_5A_9A_D1 = HEP_B_5A_9A_D1;
        this.HEP_B_5A_9A_D2 = HEP_B_5A_9A_D2;
        this.HEP_B_5A_9A_D3 = HEP_B_5A_9A_D3;
        this.HEP_B_10A_12A_D1 = HEP_B_10A_12A_D1;
        this.HEP_B_10A_12A_D2 = HEP_B_10A_12A_D2;
        this.HEP_B_10A_12A_D3 = HEP_B_10A_12A_D3;
        this.HEP_B_13A_20A_D1 = HEP_B_13A_20A_D1;
        this.HEP_B_13A_20A_D2 = HEP_B_13A_20A_D2;
        this.HEP_B_13A_20A_D3 = HEP_B_13A_20A_D3;
    }

    public int getPENTAVALENTE_D1() {
        return PENTAVALENTE_D1;
    }

    public void setPENTAVALENTE_D1(int PENTAVALENTE_D1) {
        this.PENTAVALENTE_D1 = PENTAVALENTE_D1;
    }

    public int getVCN_13_D1() {
        return VCN_13_D1;
    }

    public void setVCN_13_D1(int VCN_13_D1) {
        this.VCN_13_D1 = VCN_13_D1;
    }

    public int getROTAVIRUS_D1() {
        return ROTAVIRUS_D1;
    }

    public void setROTAVIRUS_D1(int ROTAVIRUS_D1) {
        this.ROTAVIRUS_D1 = ROTAVIRUS_D1;
    }

    public int getIPV_SALK_D1() {
        return IPV_SALK_D1;
    }

    public void setIPV_SALK_D1(int IPV_SALK_D1) {
        this.IPV_SALK_D1 = IPV_SALK_D1;
    }

    public int getMENINGOCOCO_D1() {
        return MENINGOCOCO_D1;
    }

    public void setMENINGOCOCO_D1(int MENINGOCOCO_D1) {
        this.MENINGOCOCO_D1 = MENINGOCOCO_D1;
    }

    public int getMENINGOCOCO_D2() {
        return MENINGOCOCO_D2;
    }

    public void setMENINGOCOCO_D2(int MENINGOCOCO_D2) {
        this.MENINGOCOCO_D2 = MENINGOCOCO_D2;
    }

    public int getPENTAVALENTE_D2() {
        return PENTAVALENTE_D2;
    }

    public void setPENTAVALENTE_D2(int PENTAVALENTE_D2) {
        this.PENTAVALENTE_D2 = PENTAVALENTE_D2;
    }

    public int getVCN_13_D2() {
        return VCN_13_D2;
    }

    public void setVCN_13_D2(int VCN_13_D2) {
        this.VCN_13_D2 = VCN_13_D2;
    }

    public int getROTAVIRUS_D2() {
        return ROTAVIRUS_D2;
    }

    public void setROTAVIRUS_D2(int ROTAVIRUS_D2) {
        this.ROTAVIRUS_D2 = ROTAVIRUS_D2;
    }

    public int getIPV_SALK_D2() {
        return IPV_SALK_D2;
    }

    public void setIPV_SALK_D2(int IPV_SALK_D2) {
        this.IPV_SALK_D2 = IPV_SALK_D2;
    }

    public int getPENTAVALENTE_D3() {
        return PENTAVALENTE_D3;
    }

    public void setPENTAVALENTE_D3(int PENTAVALENTE_D3) {
        this.PENTAVALENTE_D3 = PENTAVALENTE_D3;
    }

    public int getIPV_SALK_D3() {
        return IPV_SALK_D3;
    }

    public void setIPV_SALK_D3(int IPV_SALK_D3) {
        this.IPV_SALK_D3 = IPV_SALK_D3;
    }

    public int getVCN_13_R() {
        return VCN_13_R;
    }

    public void setVCN_13_R(int VCN_13_R) {
        this.VCN_13_R = VCN_13_R;
    }

    public int getHEP_A() {
        return HEP_A;
    }

    public void setHEP_A(int HEP_A) {
        this.HEP_A = HEP_A;
    }

    public int getTRIPLE_VIRAL_D1() {
        return TRIPLE_VIRAL_D1;
    }

    public void setTRIPLE_VIRAL_D1(int TRIPLE_VIRAL_D1) {
        this.TRIPLE_VIRAL_D1 = TRIPLE_VIRAL_D1;
    }

    public int getANTIGRIPAL_6M_12M() {
        return ANTIGRIPAL_6M_12M;
    }

    public void setANTIGRIPAL_6M_12M(int ANTIGRIPAL_6M_12M) {
        this.ANTIGRIPAL_6M_12M = ANTIGRIPAL_6M_12M;
    }

    public int getMENINGOCOCO_D3() {
        return MENINGOCOCO_D3;
    }

    public void setMENINGOCOCO_D3(int MENINGOCOCO_D3) {
        this.MENINGOCOCO_D3 = MENINGOCOCO_D3;
    }

    public int getVARICELA() {
        return VARICELA;
    }

    public void setVARICELA(int VARICELA) {
        this.VARICELA = VARICELA;
    }

    public int getPENTAVALENTE_R() {
        return PENTAVALENTE_R;
    }

    public void setPENTAVALENTE_R(int PENTAVALENTE_R) {
        this.PENTAVALENTE_R = PENTAVALENTE_R;
    }

    public int getANTIGRIPAL_12M_24M() {
        return ANTIGRIPAL_12M_24M;
    }

    public void setANTIGRIPAL_12M_24M(int ANTIGRIPAL_12M_24M) {
        this.ANTIGRIPAL_12M_24M = ANTIGRIPAL_12M_24M;
    }

    public int getTRIPLE_VIRAL_2A_4A() {
        return TRIPLE_VIRAL_2A_4A;
    }

    public void setTRIPLE_VIRAL_2A_4A(int TRIPLE_VIRAL_2A_4A) {
        this.TRIPLE_VIRAL_2A_4A = TRIPLE_VIRAL_2A_4A;
    }

    public int getPENTAVALENTE_2A_4A() {
        return PENTAVALENTE_2A_4A;
    }

    public void setPENTAVALENTE_2A_4A(int PENTAVALENTE_2A_4A) {
        this.PENTAVALENTE_2A_4A = PENTAVALENTE_2A_4A;
    }

    public int getIPV_SALK_R_IE() {
        return IPV_SALK_R_IE;
    }

    public void setIPV_SALK_R_IE(int IPV_SALK_R_IE) {
        this.IPV_SALK_R_IE = IPV_SALK_R_IE;
    }

    public int getTRIPLE_VIRAL_D2_IE() {
        return TRIPLE_VIRAL_D2_IE;
    }

    public void setTRIPLE_VIRAL_D2_IE(int TRIPLE_VIRAL_D2_IE) {
        this.TRIPLE_VIRAL_D2_IE = TRIPLE_VIRAL_D2_IE;
    }

    public int getDPT_R_IE() {
        return DPT_R_IE;
    }

    public void setDPT_R_IE(int DPT_R_IE) {
        this.DPT_R_IE = DPT_R_IE;
    }

    public int getDT_7A_9A_D1() {
        return DT_7A_9A_D1;
    }

    public void setDT_7A_9A_D1(int DT_7A_9A_D1) {
        this.DT_7A_9A_D1 = DT_7A_9A_D1;
    }

    public int getDT_7A_9A_D2() {
        return DT_7A_9A_D2;
    }

    public void setDT_7A_9A_D2(int DT_7A_9A_D2) {
        this.DT_7A_9A_D2 = DT_7A_9A_D2;
    }

    public int getDT_7A_9A_D3() {
        return DT_7A_9A_D3;
    }

    public void setDT_7A_9A_D3(int DT_7A_9A_D3) {
        this.DT_7A_9A_D3 = DT_7A_9A_D3;
    }

    public int getMENINGOCOCO_R_11A() {
        return MENINGOCOCO_R_11A;
    }

    public void setMENINGOCOCO_R_11A(int MENINGOCOCO_R_11A) {
        this.MENINGOCOCO_R_11A = MENINGOCOCO_R_11A;
    }

    public int getDTP_AC_11A() {
        return DTP_AC_11A;
    }

    public void setDTP_AC_11A(int DTP_AC_11A) {
        this.DTP_AC_11A = DTP_AC_11A;
    }

    public int getHPV_M_D1() {
        return HPV_M_D1;
    }

    public void setHPV_M_D1(int HPV_M_D1) {
        this.HPV_M_D1 = HPV_M_D1;
    }

    public int getHPV_M_D2() {
        return HPV_M_D2;
    }

    public void setHPV_M_D2(int HPV_M_D2) {
        this.HPV_M_D2 = HPV_M_D2;
    }

    public int getHPV_V_D1() {
        return HPV_V_D1;
    }

    public void setHPV_V_D1(int HPV_V_D1) {
        this.HPV_V_D1 = HPV_V_D1;
    }

    public int getHPV_V_D2() {
        return HPV_V_D2;
    }

    public void setHPV_V_D2(int HPV_V_D2) {
        this.HPV_V_D2 = HPV_V_D2;
    }

    public int getANTIGRIPAL_EMB() {
        return ANTIGRIPAL_EMB;
    }

    public void setANTIGRIPAL_EMB(int ANTIGRIPAL_EMB) {
        this.ANTIGRIPAL_EMB = ANTIGRIPAL_EMB;
    }

    public int getDTP_AC_EMB() {
        return DTP_AC_EMB;
    }

    public void setDTP_AC_EMB(int DTP_AC_EMB) {
        this.DTP_AC_EMB = DTP_AC_EMB;
    }

    public int getHEP_B_EMB_D1() {
        return HEP_B_EMB_D1;
    }

    public void setHEP_B_EMB_D1(int HEP_B_EMB_D1) {
        this.HEP_B_EMB_D1 = HEP_B_EMB_D1;
    }

    public int getHEP_B_EMB_D2() {
        return HEP_B_EMB_D2;
    }

    public void setHEP_B_EMB_D2(int HEP_B_EMB_D2) {
        this.HEP_B_EMB_D2 = HEP_B_EMB_D2;
    }

    public int getHEP_B_EMB_D3() {
        return HEP_B_EMB_D3;
    }

    public void setHEP_B_EMB_D3(int HEP_B_EMB_D3) {
        this.HEP_B_EMB_D3 = HEP_B_EMB_D3;
    }

    public int getDT_EMB_D1() {
        return DT_EMB_D1;
    }

    public void setDT_EMB_D1(int DT_EMB_D1) {
        this.DT_EMB_D1 = DT_EMB_D1;
    }

    public int getDT_EMB_D2() {
        return DT_EMB_D2;
    }

    public void setDT_EMB_D2(int DT_EMB_D2) {
        this.DT_EMB_D2 = DT_EMB_D2;
    }

    public int getDT_EMB_D3() {
        return DT_EMB_D3;
    }

    public void setDT_EMB_D3(int DT_EMB_D3) {
        this.DT_EMB_D3 = DT_EMB_D3;
    }

    public int getANTIGRIPAL_PUER() {
        return ANTIGRIPAL_PUER;
    }

    public void setANTIGRIPAL_PUER(int ANTIGRIPAL_PUER) {
        this.ANTIGRIPAL_PUER = ANTIGRIPAL_PUER;
    }

    public int getDTP_AC_PUER() {
        return DTP_AC_PUER;
    }

    public void setDTP_AC_PUER(int DTP_AC_PUER) {
        this.DTP_AC_PUER = DTP_AC_PUER;
    }

    public int getHEP_B_21A_40A_D1() {
        return HEP_B_21A_40A_D1;
    }

    public void setHEP_B_21A_40A_D1(int HEP_B_21A_40A_D1) {
        this.HEP_B_21A_40A_D1 = HEP_B_21A_40A_D1;
    }

    public int getHEP_B_21A_40A_D2() {
        return HEP_B_21A_40A_D2;
    }

    public void setHEP_B_21A_40A_D2(int HEP_B_21A_40A_D2) {
        this.HEP_B_21A_40A_D2 = HEP_B_21A_40A_D2;
    }

    public int getHEP_B_21A_40A_D3() {
        return HEP_B_21A_40A_D3;
    }

    public void setHEP_B_21A_40A_D3(int HEP_B_21A_40A_D3) {
        this.HEP_B_21A_40A_D3 = HEP_B_21A_40A_D3;
    }

    public int getHEP_B_MAYOR_40A_D1() {
        return HEP_B_MAYOR_40A_D1;
    }

    public void setHEP_B_MAYOR_40A_D1(int HEP_B_MAYOR_40A_D1) {
        this.HEP_B_MAYOR_40A_D1 = HEP_B_MAYOR_40A_D1;
    }

    public int getHEP_B_MAYOR_40A_D2() {
        return HEP_B_MAYOR_40A_D2;
    }

    public void setHEP_B_MAYOR_40A_D2(int HEP_B_MAYOR_40A_D2) {
        this.HEP_B_MAYOR_40A_D2 = HEP_B_MAYOR_40A_D2;
    }

    public int getHEP_B_MAYOR_40A_D3() {
        return HEP_B_MAYOR_40A_D3;
    }

    public void setHEP_B_MAYOR_40A_D3(int HEP_B_MAYOR_40A_D3) {
        this.HEP_B_MAYOR_40A_D3 = HEP_B_MAYOR_40A_D3;
    }

    public int getDT_MAYOR_17A_D1() {
        return DT_MAYOR_17A_D1;
    }

    public void setDT_MAYOR_17A_D1(int DT_MAYOR_17A_D1) {
        this.DT_MAYOR_17A_D1 = DT_MAYOR_17A_D1;
    }

    public int getDT_MAYOR_17A_D2() {
        return DT_MAYOR_17A_D2;
    }

    public void setDT_MAYOR_17A_D2(int DT_MAYOR_17A_D2) {
        this.DT_MAYOR_17A_D2 = DT_MAYOR_17A_D2;
    }

    public int getDT_MAYOR_17A_D3() {
        return DT_MAYOR_17A_D3;
    }

    public void setDT_MAYOR_17A_D3(int DT_MAYOR_17A_D3) {
        this.DT_MAYOR_17A_D3 = DT_MAYOR_17A_D3;
    }

    public int getTRIPLE_VIRAL_18A_D1() {
        return TRIPLE_VIRAL_18A_D1;
    }

    public void setTRIPLE_VIRAL_18A_D1(int TRIPLE_VIRAL_18A_D1) {
        this.TRIPLE_VIRAL_18A_D1 = TRIPLE_VIRAL_18A_D1;
    }

    public int getTRIPLE_VIRAL_18A_D2() {
        return TRIPLE_VIRAL_18A_D2;
    }

    public void setTRIPLE_VIRAL_18A_D2(int TRIPLE_VIRAL_18A_D2) {
        this.TRIPLE_VIRAL_18A_D2 = TRIPLE_VIRAL_18A_D2;
    }

    public int getTRIPLE_VIRAL_R_CAMP() {
        return TRIPLE_VIRAL_R_CAMP;
    }

    public void setTRIPLE_VIRAL_R_CAMP(int TRIPLE_VIRAL_R_CAMP) {
        this.TRIPLE_VIRAL_R_CAMP = TRIPLE_VIRAL_R_CAMP;
    }

    public int getHEP_B_PS() {
        return HEP_B_PS;
    }

    public void setHEP_B_PS(int HEP_B_PS) {
        this.HEP_B_PS = HEP_B_PS;
    }

    public int getANTIGRIPAL_PS() {
        return ANTIGRIPAL_PS;
    }

    public void setANTIGRIPAL_PS(int ANTIGRIPAL_PS) {
        this.ANTIGRIPAL_PS = ANTIGRIPAL_PS;
    }

    public int getDTP_AC_PS() {
        return DTP_AC_PS;
    }

    public void setDTP_AC_PS(int DTP_AC_PS) {
        this.DTP_AC_PS = DTP_AC_PS;
    }

    public int getVCN_13_M65() {
        return VCN_13_M65;
    }

    public void setVCN_13_M65(int VCN_13_M65) {
        this.VCN_13_M65 = VCN_13_M65;
    }

    public int getN_23_M65() {
        return N_23_M65;
    }

    public void setN_23_M65(int n_23_M65) {
        N_23_M65 = n_23_M65;
    }

    public int getANTIGRIPAL_M65() {
        return ANTIGRIPAL_M65;
    }

    public void setANTIGRIPAL_M65(int ANTIGRIPAL_M65) {
        this.ANTIGRIPAL_M65 = ANTIGRIPAL_M65;
    }

    public int getVCN_13_FR() {
        return VCN_13_FR;
    }

    public void setVCN_13_FR(int VCN_13_FR) {
        this.VCN_13_FR = VCN_13_FR;
    }

    public int getN_23_FR() {
        return N_23_FR;
    }

    public void setN_23_FR(int n_23_FR) {
        N_23_FR = n_23_FR;
    }

    public int getANTIGRIPAL_FR() {
        return ANTIGRIPAL_FR;
    }

    public void setANTIGRIPAL_FR(int ANTIGRIPAL_FR) {
        this.ANTIGRIPAL_FR = ANTIGRIPAL_FR;
    }

    public int getTRIPLE_VIRAL_7A_18A_D1() {
        return TRIPLE_VIRAL_7A_18A_D1;
    }

    public void setTRIPLE_VIRAL_7A_18A_D1(int TRIPLE_VIRAL_7A_18A_D1) {
        this.TRIPLE_VIRAL_7A_18A_D1 = TRIPLE_VIRAL_7A_18A_D1;
    }

    public int getTRIPLE_VIRAL_7A_18A_D2() {
        return TRIPLE_VIRAL_7A_18A_D2;
    }

    public void setTRIPLE_VIRAL_7A_18A_D2(int TRIPLE_VIRAL_7A_18A_D2) {
        this.TRIPLE_VIRAL_7A_18A_D2 = TRIPLE_VIRAL_7A_18A_D2;
    }

    public int getTRIPLE_VIRAL_7A_18A_R_CAMP() {
        return TRIPLE_VIRAL_7A_18A_R_CAMP;
    }

    public void setTRIPLE_VIRAL_7A_18A_R_CAMP(int TRIPLE_VIRAL_7A_18A_R_CAMP) {
        this.TRIPLE_VIRAL_7A_18A_R_CAMP = TRIPLE_VIRAL_7A_18A_R_CAMP;
    }

    public int getHEP_B_2A_4A_D1() {
        return HEP_B_2A_4A_D1;
    }

    public void setHEP_B_2A_4A_D1(int HEP_B_2A_4A_D1) {
        this.HEP_B_2A_4A_D1 = HEP_B_2A_4A_D1;
    }

    public int getHEP_B_2A_4A_D2() {
        return HEP_B_2A_4A_D2;
    }

    public void setHEP_B_2A_4A_D2(int HEP_B_2A_4A_D2) {
        this.HEP_B_2A_4A_D2 = HEP_B_2A_4A_D2;
    }

    public int getHEP_B_2A_4A_D3() {
        return HEP_B_2A_4A_D3;
    }

    public void setHEP_B_2A_4A_D3(int HEP_B_2A_4A_D3) {
        this.HEP_B_2A_4A_D3 = HEP_B_2A_4A_D3;
    }

    public int getHEP_B_5A_9A_D1() {
        return HEP_B_5A_9A_D1;
    }

    public void setHEP_B_5A_9A_D1(int HEP_B_5A_9A_D1) {
        this.HEP_B_5A_9A_D1 = HEP_B_5A_9A_D1;
    }

    public int getHEP_B_5A_9A_D2() {
        return HEP_B_5A_9A_D2;
    }

    public void setHEP_B_5A_9A_D2(int HEP_B_5A_9A_D2) {
        this.HEP_B_5A_9A_D2 = HEP_B_5A_9A_D2;
    }

    public int getHEP_B_5A_9A_D3() {
        return HEP_B_5A_9A_D3;
    }

    public void setHEP_B_5A_9A_D3(int HEP_B_5A_9A_D3) {
        this.HEP_B_5A_9A_D3 = HEP_B_5A_9A_D3;
    }

    public int getHEP_B_10A_12A_D1() {
        return HEP_B_10A_12A_D1;
    }

    public void setHEP_B_10A_12A_D1(int HEP_B_10A_12A_D1) {
        this.HEP_B_10A_12A_D1 = HEP_B_10A_12A_D1;
    }

    public int getHEP_B_10A_12A_D2() {
        return HEP_B_10A_12A_D2;
    }

    public void setHEP_B_10A_12A_D2(int HEP_B_10A_12A_D2) {
        this.HEP_B_10A_12A_D2 = HEP_B_10A_12A_D2;
    }

    public int getHEP_B_10A_12A_D3() {
        return HEP_B_10A_12A_D3;
    }

    public void setHEP_B_10A_12A_D3(int HEP_B_10A_12A_D3) {
        this.HEP_B_10A_12A_D3 = HEP_B_10A_12A_D3;
    }

    public int getHEP_B_13A_20A_D1() {
        return HEP_B_13A_20A_D1;
    }

    public void setHEP_B_13A_20A_D1(int HEP_B_13A_20A_D1) {
        this.HEP_B_13A_20A_D1 = HEP_B_13A_20A_D1;
    }

    public int getHEP_B_13A_20A_D2() {
        return HEP_B_13A_20A_D2;
    }

    public void setHEP_B_13A_20A_D2(int HEP_B_13A_20A_D2) {
        this.HEP_B_13A_20A_D2 = HEP_B_13A_20A_D2;
    }

    public int getHEP_B_13A_20A_D3() {
        return HEP_B_13A_20A_D3;
    }

    public void setHEP_B_13A_20A_D3(int HEP_B_13A_20A_D3) {
        this.HEP_B_13A_20A_D3 = HEP_B_13A_20A_D3;
    }
}
