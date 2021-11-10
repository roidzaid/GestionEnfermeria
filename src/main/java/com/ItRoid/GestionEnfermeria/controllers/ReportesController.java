package com.ItRoid.GestionEnfermeria.controllers;

import com.ItRoid.GestionEnfermeria.models.Hoja10Model;
import com.ItRoid.GestionEnfermeria.models.Hoja2Model;
import com.ItRoid.GestionEnfermeria.models.PracticaModel;
import com.ItRoid.GestionEnfermeria.services.Hoja10Service;
import com.ItRoid.GestionEnfermeria.services.Hoja2Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("reportes")
public class ReportesController {

    Logger logger = LoggerFactory.getLogger(ReportesController.class);

    @Autowired
    private Hoja2Service hoja2Service;

    @Autowired
    private Hoja10Service hoja10Service;


    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/hoja2/{anioMes}")
    public ResponseEntity<?> hoja2(@PathVariable("anioMes") String anioMes) throws Exception{

        logger.info("Se consulta reporte Hoja 2");

        return new ResponseEntity<Hoja2Model>(this.hoja2Service.reporteHoja2(anioMes), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/hoja10/{anioMes}")
    public ResponseEntity<?> hoja10(@PathVariable("anioMes") String anioMes) throws Exception{

        logger.info("Se consulta reporte Hoja 10");

        return new ResponseEntity<Hoja10Model>(this.hoja10Service.reporteHoja10(anioMes), HttpStatus.OK);
    }

}
