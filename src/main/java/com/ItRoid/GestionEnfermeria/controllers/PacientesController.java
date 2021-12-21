package com.ItRoid.GestionEnfermeria.controllers;

import com.ItRoid.GestionEnfermeria.models.LoteModel;
import com.ItRoid.GestionEnfermeria.models.PacientesModel;
import com.ItRoid.GestionEnfermeria.services.PacientesService;
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
@RequestMapping("pacientes")
public class PacientesController {

    Logger logger = LoggerFactory.getLogger(PacientesController.class);

    @Autowired
    private PacientesService pacientesService;

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/{dni}")
    public PacientesModel findPaciente(@PathVariable("dni") int dni) throws Exception{

        logger.info("Busqueda del paciente con dni: " + dni);

        return this.pacientesService.findByDni(dni);

    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/all")
    public ResponseEntity<?> findAll() throws Exception{

        logger.info("Se listan todos los clientes");

        return new ResponseEntity<List<PacientesModel>>(this.pacientesService.findAll(),HttpStatus.OK);

    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @PostMapping()
    public ResponseEntity<?> createPaciente(@RequestBody PacientesModel pacientesModel) throws Exception  {

        logger.info("Se da de alta el paciente: " + pacientesModel.getDni());

        try {

            this.pacientesService.createPaciente(pacientesModel);

            return new ResponseEntity<PacientesModel>(pacientesModel, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<PacientesModel>(pacientesModel, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }


    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_COORDINACION')")
    @PutMapping()
    public ResponseEntity<?> updatePaciente(@RequestBody PacientesModel pacientesModel) throws Exception {

        logger.info("Se modifica el paciente: " + pacientesModel.getDni());

        try {
            this.pacientesService.updatePaciente(pacientesModel);
            return new ResponseEntity<PacientesModel>(pacientesModel, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<PacientesModel>(pacientesModel, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_COORDINACION')")
    @DeleteMapping("/{dni}")
    public void deletePaciente(@PathVariable("dni") int dni) throws Exception {

        logger.info("se elimina el paciente: " + dni);

        this.pacientesService.deletePaciente(dni);

    }

}
