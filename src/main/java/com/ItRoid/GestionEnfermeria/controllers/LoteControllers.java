package com.ItRoid.GestionEnfermeria.controllers;

import com.ItRoid.GestionEnfermeria.models.LoteModel;
import com.ItRoid.GestionEnfermeria.services.LoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("lotes")
public class LoteControllers {

    Logger logger = LoggerFactory.getLogger(LoteControllers.class);

    @Autowired
    private LoteService loteService;

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @PostMapping()
    public void createLote(@RequestBody LoteModel loteModel) throws Exception  {

        logger.info("Se da de alta el lote: " + loteModel.getLote());

        this.loteService.crearLote(loteModel);

    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/{vacuna}/{tipo}")
    public LoteModel findLoteAbierto(@PathVariable("vacuna") String vacuna, @PathVariable("tipo") String tipo) throws Exception{

        logger.info("Busqueda del lote abierto para vacuna: " + vacuna + " tipo: " + tipo);

        return this.loteService.getLoteAbierto(vacuna, tipo);

    }


}
