package com.ItRoid.GestionEnfermeria.services;

import com.ItRoid.GestionEnfermeria.models.PacientesModel;

import java.util.List;

public interface PacientesService<T> {

      void createPaciente(PacientesModel paciente) throws Exception;
      PacientesModel findByDni(int dni) throws Exception;
      void updatePaciente(PacientesModel paciente) throws Exception ;
      void deletePaciente(int dni) throws Exception;
      List<PacientesModel> findAll() throws Exception;

}
