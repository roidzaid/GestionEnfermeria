package com.ItRoid.GestionEnfermeria.controllers;

import com.ItRoid.GestionEnfermeria.services.MarcaService;
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
@RequestMapping("marcas")
public class MarcasController {

    Logger logger = LoggerFactory.getLogger(MarcasController.class);

    @Autowired
    private MarcaService marcaService;

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping()
    public ResponseEntity<?> findMarcas() throws Exception{

        logger.info("Se listan marcas");

        try {

            List<String> list = this.marcaService.getMarcas();

            return new ResponseEntity<List<String>>(list, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
