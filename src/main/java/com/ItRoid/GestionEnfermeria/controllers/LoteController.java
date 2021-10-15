package com.ItRoid.GestionEnfermeria.controllers;

import com.ItRoid.GestionEnfermeria.models.LoteModel;
import com.ItRoid.GestionEnfermeria.services.LoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("lotes")
public class LoteController {

    Logger logger = LoggerFactory.getLogger(LoteController.class);

    @Autowired
    private LoteService loteService;

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @PostMapping()
    public ResponseEntity<?> createLote(@RequestBody LoteModel loteModel) throws Exception  {

        logger.info("Se da de alta el lote: " + loteModel.getLote());

        try {

            this.loteService.crearLote(loteModel);

            return new ResponseEntity<LoteModel>(loteModel, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/{vacuna}/{tipo}")
    public ResponseEntity<?>  findLoteAbierto(@PathVariable("vacuna") String vacuna, @PathVariable("tipo") String tipo) throws Exception{

        logger.info("Busqueda del lote abierto para vacuna: " + vacuna + " tipo: " + tipo);

        try {

            LoteModel loteModel = this.loteService.getLoteAbierto(vacuna, tipo);

            return new ResponseEntity<LoteModel>(loteModel, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping()
    public ResponseEntity<?> findAllLotes() throws Exception{

        logger.info("Se listar todo los lotes");

        try {

            List<LoteModel> list = this.loteService.getAll();

            return new ResponseEntity<List<LoteModel>>(list, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }


}
