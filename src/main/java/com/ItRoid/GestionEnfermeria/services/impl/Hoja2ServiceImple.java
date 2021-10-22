package com.ItRoid.GestionEnfermeria.services.impl;


import com.ItRoid.GestionEnfermeria.models.Hoja2Model;
import com.ItRoid.GestionEnfermeria.repositories.PracticasRepository;
import com.ItRoid.GestionEnfermeria.services.Hoja2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Hoja2ServiceImple implements Hoja2Service<Hoja2Model> {

    @Autowired
    private PracticasRepository practicasRepository;


    @Override
    public Hoja2Model reporteHoja2(String anioMes) throws Exception {




        Hoja2Model hoja2Model = new Hoja2Model(
                this.practicasRepository.countByLocalidad("Moron", anioMes),
                this.practicasRepository.countByLocalidad("La Matanza", anioMes),
                this.practicasRepository.countByLocalidad("Merlo", anioMes),
                this.practicasRepository.countByLocalidad("Otros", anioMes),
                this.practicasRepository.countByOS("si", anioMes),
                this.practicasRepository.countByOS("no", anioMes),
                this.practicasRepository.countByEdad(0, 0, "masculino", anioMes),
                this.practicasRepository.countByEdad(0, 0, "femenino", anioMes),
                this.practicasRepository.countByEdad(1, 4, "masculino", anioMes),
                this.practicasRepository.countByEdad(1, 4, "femenino", anioMes),
                this.practicasRepository.countByEdad(5, 9, "masculino", anioMes),
                this.practicasRepository.countByEdad(5, 9, "femenino", anioMes),
                this.practicasRepository.countByEdad(10, 14, "masculino", anioMes),
                this.practicasRepository.countByEdad(10, 14, "femenino", anioMes),
                this.practicasRepository.countByEdad(15, 19, "masculino", anioMes),
                this.practicasRepository.countByEdad(15, 19, "femenino", anioMes),
                this.practicasRepository.countByEdad(20, 34, "masculino", anioMes),
                this.practicasRepository.countByEdad(20, 34, "femenino", anioMes),
                this.practicasRepository.countByEdad(35, 49, "masculino", anioMes),
                this.practicasRepository.countByEdad(35, 49, "femenino", anioMes),
                this.practicasRepository.countByEdad(50, 64, "masculino", anioMes),
                this.practicasRepository.countByEdad(50, 64, "femenino", anioMes),
                this.practicasRepository.countByEdad(65, 999, "masculino", anioMes),
                this.practicasRepository.countByEdad(65, 999, "femenino", anioMes));

        return hoja2Model;
    }
}
