package com.ItRoid.GestionEnfermeria.services.impl;

import com.ItRoid.GestionEnfermeria.entities.LoteEntity;
import com.ItRoid.GestionEnfermeria.models.LoteModel;
import com.ItRoid.GestionEnfermeria.repositories.LoteRepository;
import com.ItRoid.GestionEnfermeria.services.LoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoteServiceImpl implements LoteService<LoteModel> {


    @Autowired
    private LoteRepository loteRepository;


    @Override
    public void crearLote(LoteModel loteModel) throws Exception {

        LoteEntity loteEntity = this.loteRepository.findByLote(loteModel.getLote());

        if (loteEntity == null) {

            LoteEntity l = this.loteRepository.findByLoteAbierto(loteModel.getVacuna(), loteModel.getMarca(), "ABIERTO");

            if (l != null){

                l.setEstado("CERRADO");

                this.loteRepository.save(l);

            }

            LoteEntity lE = new LoteEntity(
                    Date.from(Instant.now()),
                    loteModel.getVacuna(),
                    loteModel.getMarca(),
                    loteModel.getLote(),
                    "ABIERTO",
                    loteModel.getUsuarioModif(),
                    Timestamp.from(Instant.now())
            );

            this.loteRepository.save(lE);

        }else{
            throw new Exception("Ya existe lote: " + loteModel.getLote());
        }

    }

    @Override
    public LoteModel getLote(String lote) throws Exception {

        LoteEntity loteEntity = this.loteRepository.findByLote(lote);

        if (loteEntity != null) {

            LoteModel loteModel = new LoteModel(
                    new SimpleDateFormat("dd-MM-yyyy").format(loteEntity.getFechaAlta()),
                    loteEntity.getVacuna(),
                    loteEntity.getMarca(),
                    loteEntity.getLote(),
                    loteEntity.getEstado()
            );

        return loteModel;

        }else{
            throw new Exception("No existe lote: " + lote);
        }

    }

    @Override
    public LoteModel getLoteAbierto(String vacuna, String tipo) throws Exception {

        LoteEntity loteEntity = this.loteRepository.findByLoteAbierto(vacuna, tipo, "ABIERTO");

        if (loteEntity != null) {

            LoteModel loteModel = new LoteModel(
                    new SimpleDateFormat("dd-MM-yyyy").format(loteEntity.getFechaAlta()),
                    loteEntity.getVacuna(),
                    loteEntity.getMarca(),
                    loteEntity.getLote(),
                    loteEntity.getEstado()
            );


            loteModel.setFechaAlta(new SimpleDateFormat("dd-MM-yyyy").format(loteEntity.getFechaAlta()));
            loteModel.setEstado(loteEntity.getEstado());

            return loteModel;

        }else{
            throw new Exception("No hay lote abierto para vacuna " + vacuna + " tipo " + tipo);
        }
    }

    @Override
    public List<LoteModel> getAll() throws Exception {

        List<LoteModel> list = this.loteRepository
                .findAll()
                .stream()
                .map((e) -> new LoteModel(
                        new SimpleDateFormat("dd-MM-yyyy").format(e.getFechaAlta()),
                        e.getVacuna(),
                        e.getMarca(),
                        e.getLote(),
                        e.getEstado()))
                .collect(Collectors.toList());

        return list;

    }

    @Override
    public void updateLote(LoteModel loteModel) throws Exception {

        LoteEntity loteEntity = this.loteRepository.findByLote(loteModel.getLote());

        if (loteEntity != null) {

            loteEntity.setFechaAlta(Date.from(Instant.now()));
            loteEntity.setVacuna(loteModel.getVacuna());
            loteEntity.setMarca(loteModel.getMarca());
            loteEntity.setLote(loteModel.getLote());
            loteEntity.setEstado(loteModel.getEstado());
            loteEntity.setUsuarioModif("AUTOMATICO");
            loteEntity.setTimestamp(Timestamp.from(Instant.now()));

            this.loteRepository.save(loteEntity);

        }else{
            throw new Exception("No existe lote: " + loteModel.getLote());
        }



    }

    @Override
    public void deleteLote(String lote) throws Exception {

        LoteEntity loteEntity = this.loteRepository.findByLote(lote);

        if (loteEntity != null) {

            this.loteRepository.delete(loteEntity);

        }else{
            throw new Exception("No existe lote: " + lote);
        }

    }
}
