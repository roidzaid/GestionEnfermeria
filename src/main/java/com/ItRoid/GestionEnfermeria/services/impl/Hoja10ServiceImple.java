package com.ItRoid.GestionEnfermeria.services.impl;


import com.ItRoid.GestionEnfermeria.models.Hoja10Model;
import com.ItRoid.GestionEnfermeria.models.Hoja2Model;
import com.ItRoid.GestionEnfermeria.repositories.PracticasRepository;
import com.ItRoid.GestionEnfermeria.services.Hoja10Service;
import com.ItRoid.GestionEnfermeria.services.Hoja2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Hoja10ServiceImple implements Hoja10Service<Hoja10Model> {

    @Autowired
    private PracticasRepository practicasRepository;


    @Override
    public Hoja10Model reporteHoja10(String anioMes) throws Exception {


        Hoja10Model hoja10Model = new Hoja10Model(
        //VACUNAS NIÑOS/AS 2 MESES
            //PENTAVALENTE DOSIS 1
                this.practicasRepository.countByVDMIM("PENTAVALENTE", "1ra", 2, anioMes, "Esq. Atrasado"),
            //PREVENAR 13 DOSIS 1  = VCN 13
                this.practicasRepository.countByVDMIM("VCN 13", "1ra", 2, anioMes, "Esq. Atrasado"),
            //ROTAVIRUS DOSIS 1
                this.practicasRepository.countByVDMIM("ROTAVIRUS", "1ra", 2, anioMes, "Esq. Atrasado"),
            //IPV - SALK DOSIS 1
                this.practicasRepository.countByVDMIM("SALK-IPV", "1ra", 2, anioMes, "Esq. Atrasado"),
        //VACUNA ANTIMENINGOCÓCICA (3 Y 5 MESES)
            //MENINGOCOCO ACYW DOSIS 1
                this.practicasRepository.countByVDEM("MENINGOCOCO", "1ra", 3, 5, anioMes, "Esq. Atrasado"),
            //MENINGOCOCO ACYW DOSIS 2
                this.practicasRepository.countByVDEM("MENINGOCOCO", "2da", 3, 5, anioMes, "Esq. Atrasado"),
        //VACUNAS NIÑOS/AS 4 MESES
            //PENTAVALENTE DOSIS 2
                this.practicasRepository.countByVDIM("PENTAVALENTE", "2da", 4, anioMes, "Esq. Atrasado"),
            //PREVENAR 13 DOSIS 2  = VCN 13
                this.practicasRepository.countByVDIM("VCN 13", "2da", 4, anioMes, "Esq. Atrasado"),
            //ROTAVIRUS DOSIS 2
                this.practicasRepository.countByVDIM("ROTAVIRUS", "2da", 4, anioMes, "Esq. Atrasado"),
            //IPV - SALK DOSIS 2
                this.practicasRepository.countByVDIM("SALK-IPV", "2da", 4, anioMes, "Esq. Atrasado"),
        //VACUNAS NIÑOS/AS 6 MESES
            //PENTAVALENTE DOSIS 3							vacuna + dosis + igual meses
                this.practicasRepository.countByVDIM("PENTAVALENTE", "3ra", 6, anioMes, "Esq. Atrasado"),
            //IPV SALK DOSIS 3							vacuna + dosis + igual meses
                this.practicasRepository.countByVDIM("SALK-IPV", "3ra", 6, anioMes, "Esq. Atrasado"),
        //VACUNAS NIÑOS/AS 12 MESES
            //PREVENAR 13 (REFUERZO)
                this.practicasRepository.countByVD("VCN 13", "3ra/R", anioMes, "Esq. Atrasado"),
            //HEPATITIS A (ÚNICA DOSIS)
                this.practicasRepository.countByVD("HEP.A", "N/A", anioMes, "Esq. Atrasado"),
            //TRIPLE VIRAL - SRP DOSIS 1
                this.practicasRepository.countByVDIM("TRIPLE VIRAL", "1ra", 12, anioMes, "Esq. Atrasado"),
            // ANTIGRIPAL (NIÑOS/AS 6 A 12 MESES) 1+2+ud
                this.practicasRepository.countByVDIM("ANTIGRIPAL", "1ra", 12, anioMes, "Esq. Atrasado") + this.practicasRepository.countByVDIM("ANTIGRIPAL", "2da", 12, anioMes, "Esq. Atrasado") + this.practicasRepository.countByVDIM("ANTIGRIPAL", "UD", 12, anioMes, "Esq. Atrasado"),
        //VACUNAS NIÑOS/AS 15 MESES
            //MENINGOCOCO ACYW (REFUERZO)  3 dosis
                this.practicasRepository.countByVDIM("MENINGOCOCO", "3ra", 15, anioMes, "Esq. Atrasado"),
            //VARICELA (ÚNICA DOSIS)
                this.practicasRepository.countByVDIM("VARICELA", "N/A", 15, anioMes, "Esq. Atrasado"),
        //VACUNAS NIÑOS/AS 18 MESES                       				vacuna + dosis + igual meses
            //PENTAVALENTE (REFUERZO)
                this.practicasRepository.countByVDIM("PENTAVALENTE", "3ra", 18, anioMes, "Esq. Atrasado"),
        //ANTIGRIPAL (NIÑOS/AS DE 12 A24 MESES) 1+2+ud
                this.practicasRepository.countByVDEM("ANTIGRIPAL", "1ra", 12,24, anioMes, "Esq. Atrasado") + this.practicasRepository.countByVDEM("ANTIGRIPAL", "2da", 12, 24, anioMes, "Esq. Atrasado") + this.practicasRepository.countByVDEM("ANTIGRIPAL", "UD", 12, 24, anioMes, "Esq. Atrasado"),
        //TRIPLE VIRAL NIÑOS/AS 2 A 4 AÑOS
                this.practicasRepository.countByVA("TRIPLE VIRAL", 2, 4, anioMes, "Esq. Atrasado"),
        //PENTAVALENTE EN NIÑOS/AS DE 2 A 4 AÑOS
                this.practicasRepository.countByVA("PENTAVALENTE", 2, 4, anioMes, "Esq. Atrasado"),
        //VACUNAS NIÑOS/AS INGRESO ESCOLAR
            //IPV - SALK (REFUERZO)
                this.practicasRepository.countByVD("SALK-IPV", "R/IE", anioMes, "Esq. Atrasado"),
            //TRIPLE VIRAL - SRP DOSIS 2 (Agregar IE)
                this.practicasRepository.countByVD("TRIPLE VIRAL", "2da/IE", anioMes, "Esq. Atrasado"),
            //TRIPLE BACTERIANA - DPT (REFUERZO) - DTP
                this.practicasRepository.countByVD("DTP", "R/IE", anioMes, "Esq. Atrasado"),
            //DOBLE BACTERIANA NIÑOS/AS 7 A 9 AÑOS 1 - DT
                this.practicasRepository.countByVDEA("DT", "1ra", 7, 9, anioMes, "Esq. Atrasado"),
            //DOBLE BACTERIANA NIÑOS/AS 7 A 9 AÑOS 2 - DT
                this.practicasRepository.countByVDEA("DT", "2da", 7, 9, anioMes, "Esq. Atrasado"),
            //DOBLE BACTERIANA NIÑOS/AS 7 A 9 AÑOS 3 - DT
                this.practicasRepository.countByVDEA("DT", "3ra", 7, 9, anioMes, "Esq. Atrasado"),
        //VACUNAS NIÑOS/AS 11 AÑOS
            //MENINGOCOCO ACYW (ÚNICA DOSIS) refuerzo 11 Año
                this.practicasRepository.countByVD("MENINGOCOCO", "R/11A", anioMes, "Esq. Atrasado"),
            //TRIPLE BACTERIANA ACELULAR - dTpa (REFUERZO) DTP Ac - 11a
                this.practicasRepository.countByVD("DTP Ac", "11A", anioMes, "Esq. Atrasado"),
            //HPV MUJERES - DOSIS 1
                this.practicasRepository.countByVDS("HPV", "1ra", "femenino",  anioMes, "Esq. Atrasado"),
            //HPV MUJERES - DOSIS 2
                this.practicasRepository.countByVDS("HPV", "2da", "femenino",  anioMes, "Esq. Atrasado"),
            //HPV VARONES - DOSIS 1
                this.practicasRepository.countByVDS("HPV", "1ra", "masculino",  anioMes, "Esq. Atrasado"),
            //HPV VARONES - DOSIS 2
                this.practicasRepository.countByVDS("HPV", "2da", "masculino",  anioMes, "Esq. Atrasado"),
        //VACUNAS EN EL EMBARAZO
            //ANTIGRIPAL
                this.practicasRepository.countByVD("ANTIGRIPAL", "EMB", anioMes, "Esq. Atrasado"),
            //TRIPLE BACTERIANA ACELULAR - dTpa
                this.practicasRepository.countByVD("DTP Ac", "EMB", anioMes, "Esq. Atrasado"),
            //HEPATITIS B 1
                this.practicasRepository.countByVD("HEP.B", "EMB 1ra", anioMes, "Esq. Atrasado"),
            //HEPATITIS B 2
                this.practicasRepository.countByVD("HEP.B", "EMB 2da", anioMes, "Esq. Atrasado"),
            //HEPATITIS B 3
                this.practicasRepository.countByVD("HEP.B", "EMB 3ra", anioMes, "Esq. Atrasado"),
            //DOBLE ADULTXS EMBARAZADAS 1 DT
                this.practicasRepository.countByVD("DT", "EMB 1ra", anioMes, "Esq. Atrasado"),
            //DOBLE ADULTXS EMBARAZADAS 2 Dt
                this.practicasRepository.countByVD("DT", "EMB 2da", anioMes, "Esq. Atrasado"),
            //DOBLE ADULTXS EMBARAZADAS 3 Dt
                this.practicasRepository.countByVD("DT", "EMB 3ra", anioMes, "Esq. Atrasado"),
        //VACUNAS EN EL PUERPERIO
            //ANTIGRIPAL  PUER
                this.practicasRepository.countByVD("ANTIGRIPAL", "PUER", anioMes, "Esq. Atrasado"),
            //TRIPLE BACTERIANA ACELULAR - dTpa PUER
                this.practicasRepository.countByVD("DTP Ac", "PUER", anioMes, "Esq. Atrasado"),
        //VACUNAS ADULTXS
            //HEPATITIS B 21 A 40 AÑOS 1
                this.practicasRepository.countByVDEA("HEP.B", "1ra", 21, 40, anioMes, "Esq. Atrasado"),
            //HEPATITIS B 21 A 40 AÑOS 2
                this.practicasRepository.countByVDEA("HEP.B", "2da", 21, 40, anioMes, "Esq. Atrasado"),
            //HEPATITIS B 21 A 40 AÑOS 3
                this.practicasRepository.countByVDEA("HEP.B", "3ra", 21, 40, anioMes, "Esq. Atrasado"),
            //HEPATITIS B + 40 AÑOS 1
                this.practicasRepository.countByVDMA("HEP.B", "1ra", 40, anioMes, "Esq. Atrasado"),
            //HEPATITIS B + 40 AÑOS 2
                this.practicasRepository.countByVDMA("HEP.B", "2da", 40, anioMes, "Esq. Atrasado"),
            //HEPATITIS B + 40 AÑOS 3
                this.practicasRepository.countByVDMA("HEP.B", "3ra", 40, anioMes, "Esq. Atrasado"),
            //DOBLE ADULTXS + 17 años 1 DT
                this.practicasRepository.countByVDMA("DT", "1ra", 17, anioMes, "Esq. Atrasado"),
            //DOBLE ADULTXS + 17 años 2 Dt
                this.practicasRepository.countByVDMA("DT", "2da", 17, anioMes, "Esq. Atrasado"),
            //DOBLE ADULTXS + 17 años 3 Dt
                this.practicasRepository.countByVDMA("DT", "3ra", 17, anioMes, "Esq. Atrasado"),
            //TRIPLE VIRAL 1 +18
                this.practicasRepository.countByVD("TRIPLE VIRAL", "+18A(1ra)", anioMes, "Esq. Atrasado"),
            //TRIPLE VIRAL 2 +18
                this.practicasRepository.countByVD("TRIPLE VIRAL", "+18A(2da)", anioMes, "Esq. Atrasado"),
            //TRIPLE VIRAL 3 +18
                this.practicasRepository.countByVD("TRIPLE VIRAL", "+18A R/Camp", anioMes, "Esq. Atrasado"),
        //VACUNAS PERSONAL DE SALUD
            //HEPATITIS B
                this.practicasRepository.countByVD("HEP.B", "P.S", anioMes, "Esq. Atrasado"),
            //ANTIGRIPAL
                this.practicasRepository.countByVD("ANTIGRIPAL", "P.S", anioMes, "Esq. Atrasado"),
            //TRIPLE BACTERIANA ACELULAR - dTpa
                this.practicasRepository.countByVD("DTP Ac", "P.S", anioMes, "Esq. Atrasado"),
        //VACUNAS ADULTXS MAYORES DE 65 AÑOS
            //PREVENAR 13
                this.practicasRepository.countByVD("VCN 13", ">65", anioMes, "Esq. Atrasado"),
            //NEUMO 23 > 65
                this.practicasRepository.countByVD("N23", ">65", anioMes, "Esq. Atrasado"),
            //ANTIGRIPAL
                this.practicasRepository.countByVD("ANTIGRIPAL", ">65", anioMes, "Esq. Atrasado"),
        //VACUNAS PERSONAS DENTRO GRUPO DE RIESGOS
            //PREVENAR 13 (cambiar -65 por FR)
                this.practicasRepository.countByVD("VCN 13", "<65 FR", anioMes, "Esq. Atrasado"),
            //NEUMO 23 (cambiar -65 por FR)
                this.practicasRepository.countByVD("N23", "<65 FR", anioMes, "Esq. Atrasado"),
            //ANTIGRIPAL (cambiar -65 por FR)
                this.practicasRepository.countByVD("ANTIGRIPAL", "<65 FR", anioMes, "Esq. Atrasado"),
        //OTRAS VACUNAS
            //TRIPLE VIRAL 7 A 18 AÑOS 1 (Agregar)					vacuna + dosis
                this.practicasRepository.countByVD("TRIPLE VIRAL", "7-18A(1ra)", anioMes, "Esq. Atrasado"),
            //TRIPLE VIRAL 7 A 18 AÑOS 2 (Agregar)					vacuna + dosis
                this.practicasRepository.countByVD("TRIPLE VIRAL", "7-18A(2da)", anioMes, "Esq. Atrasado"),
            //TRIPLE VIRAL 7 A 18 AÑOS R (Agregar)					vacuna + dosis
                this.practicasRepository.countByVD("TRIPLE VIRAL", "7-18A(3ra)", anioMes, "Esq. Atrasado"),
            //HEPATITIS B 2 A 4 AÑOS 1 						vacuna + dosis + entre años
                this.practicasRepository.countByVDEA("HEP.B", "1ra", 2, 4, anioMes, "Esq. Atrasado"),
            //HEPATITIS B 2 A 4 AÑOS 2						vacuna + dosis + entre años
                this.practicasRepository.countByVDEA("HEP.B", "2da", 2, 4, anioMes, "Esq. Atrasado"),
            //HEPATITIS B 2 A 4 AÑOS 3						vacuna + dosis + entre años
                this.practicasRepository.countByVDEA("HEP.B", "3ra", 2, 4, anioMes, "Esq. Atrasado"),
            //HEPATITIS B 5 A 9 AÑOS 1 						vacuna + dosis + entre años
                this.practicasRepository.countByVDEA("HEP.B", "1ra", 5, 9, anioMes, "Esq. Atrasado"),
            //HEPATITIS B 5 A 9 AÑOS 2						vacuna + dosis + entre años
                this.practicasRepository.countByVDEA("HEP.B", "2da", 5, 9, anioMes, "Esq. Atrasado"),
            //HEPATITIS B 5 A 9 AÑOS 3						vacuna + dosis + entre años
                this.practicasRepository.countByVDEA("HEP.B", "3ra", 5, 9, anioMes, "Esq. Atrasado"),
            //HEPATITIS B 10 A 12 AÑOS 1 						vacuna + dosis + entre años
                this.practicasRepository.countByVDEA("HEP.B", "1ra", 10, 12, anioMes, "Esq. Atrasado"),
            //HEPATITIS B 10 A 12 AÑOS 2						vacuna + dosis + entre años
                this.practicasRepository.countByVDEA("HEP.B", "2da", 10, 12, anioMes, "Esq. Atrasado"),
            //HEPATITIS B 10 A 12 AÑOS 3						vacuna + dosis + entre años
                this.practicasRepository.countByVDEA("HEP.B", "3ra", 10, 12, anioMes, "Esq. Atrasado"),
            //HEPATITIS B 13 A 20 AÑOS 1 						vacuna + dosis + entre años
                this.practicasRepository.countByVDEA("HEP.B", "1ra", 13, 20, anioMes, "Esq. Atrasado"),
            //HEPATITIS B 13 A 20 AÑOS 2						vacuna + dosis + entre años
                this.practicasRepository.countByVDEA("HEP.B", "2da", 13, 20, anioMes, "Esq. Atrasado"),
            //HEPATITIS B 13 A 20 AÑOS 3						vacuna + dosis + entre años
                this.practicasRepository.countByVDEA("HEP.B", "3ra", 13, 20, anioMes, "Esq. Atrasado")
        );

        return hoja10Model;
    }
}
