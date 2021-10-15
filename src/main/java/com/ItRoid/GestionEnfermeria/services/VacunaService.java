package com.ItRoid.GestionEnfermeria.services;

import com.ItRoid.GestionEnfermeria.models.LoteModel;

import java.util.List;

public interface VacunaService<T>{

    List<String> getVacunas() throws Exception;

    List<String> getDosis(String vacuna) throws Exception;
}
