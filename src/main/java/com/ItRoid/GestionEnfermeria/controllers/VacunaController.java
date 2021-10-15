package com.ItRoid.GestionEnfermeria.controllers;

import com.ItRoid.GestionEnfermeria.models.LoteModel;
import com.ItRoid.GestionEnfermeria.services.VacunaService;
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
@RequestMapping("vacunas")
public class VacunaController {

    Logger logger = LoggerFactory.getLogger(VacunaController.class);

    @Autowired
    private VacunaService vacunaService;

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping()
    public ResponseEntity<?> findNombreVacunas() throws Exception{

        logger.info("Se listan vacunas para el combo");

        try {

            List<String> list = this.vacunaService.getVacunas();

            return new ResponseEntity<List<String>>(list, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/{vacuna}")
    public ResponseEntity<?> findNombreDosis(@PathVariable("vacuna") String vacuna) throws Exception{

        logger.info("Se listan dosis para el combo");

        try {

            List<String> list = this.vacunaService.getDosis(vacuna);

            return new ResponseEntity<List<String>>(list, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
