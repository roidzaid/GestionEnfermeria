package com.ItRoid.GestionEnfermeria.services;

import com.ItRoid.GestionEnfermeria.models.PracticaModel;

import java.util.List;

public interface PracticaService <T>{

    void createPractica(PracticaModel practicasModel) throws Exception;

    List<PracticaModel> findAll() throws Exception;
    PracticaModel findIdPractica(Long idPractica) throws Exception;

    List<PracticaModel> findPracticaXPacienteXFecha(int dni, String fechaDesde, String fechaHasta) throws Exception;
    List<PracticaModel> findPracticaXPaciente(int dni) throws Exception;

    List<PracticaModel> findPracticaXVacunaXFecha(String vacuna, String fechaDesde, String fechaHasta) throws Exception;
    List<PracticaModel> findPracticaXVacuna(String vacuna) throws Exception;

    List<PracticaModel> findPracticasXTipoPracticaXFecha(String tipoPractica, String fechaDesde, String fechaHasta) throws Exception;
    List<PracticaModel> findPracticasXTipoPractica(String tipoPractica) throws Exception;

    List<PracticaModel> findPracticasXFecha(String fechaDesde, String fechaHasta) throws Exception;


    void updatePractica(PracticaModel practicasModel) throws Exception;
    void deletePractica(Long idPractica) throws Exception;


}
