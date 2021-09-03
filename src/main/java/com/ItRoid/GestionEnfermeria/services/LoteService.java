package com.ItRoid.GestionEnfermeria.services;

import com.ItRoid.GestionEnfermeria.models.LoteModel;

import java.util.List;

public interface LoteService<T> {

    void crearLote(LoteModel loteModel) throws Exception;
    LoteModel getLote(String lote) throws Exception;
    LoteModel getLoteAbierto(String vacuna, String tipo) throws Exception;
    List<LoteModel> getAll() throws Exception;
    void updateLote(LoteModel loteModel) throws Exception;
    void deleteLote(String lote) throws Exception;

}
