package com.ItRoid.GestionEnfermeria.controllers;

import com.ItRoid.GestionEnfermeria.models.PacientesModel;
import com.ItRoid.GestionEnfermeria.models.PracticaModel;
import com.ItRoid.GestionEnfermeria.services.PracticaService;
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
@RequestMapping("practicas")
public class PracticaController {

    Logger logger = LoggerFactory.getLogger(PracticaController.class);

    @Autowired
    private PracticaService practicaService;


    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @PostMapping()
    public ResponseEntity<?> createPractica(@RequestBody PracticaModel practicaModel) throws Exception  {

        logger.info("Se da de alta practica para: " + practicaModel.getDni());

        try {
            this.practicaService.createPractica(practicaModel);

            return new ResponseEntity<PracticaModel>(practicaModel, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/all")
    public ResponseEntity<?> findAll() throws Exception{

        logger.info("Se listan todas las practicas");

        return new ResponseEntity<List<PracticaModel>>(this.practicaService.findAll(), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/{idPractica}")
    public ResponseEntity<?> findPractica(@PathVariable("idPractica") Long idPractica) throws Exception{

        logger.info("Se busca la practica: " + idPractica);

        return new ResponseEntity<PracticaModel>(this.practicaService.findIdPractica(idPractica), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/paciente/{dni}/{fechaDesde}/{fechaHasta}")
    public ResponseEntity<?> findPracticaXPaciente(@PathVariable("dni")int dni, @PathVariable("fechaDesde") String fechaDesde, @PathVariable("fechaHasta")String fechaHasta) throws Exception{

        logger.info("Se listan todas las practicas realizadas al paciente: " + dni);

        return new ResponseEntity<List<PracticaModel>>(this.practicaService.findPracticaXPacienteXFecha(dni, fechaDesde, fechaHasta), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/paciente/{dni}")
    public ResponseEntity<?> findPracticaXPaciente(@PathVariable("dni")int dni) throws Exception{

        logger.info("Se listan todas las practicas realizadas al paciente: " + dni);

        return new ResponseEntity<List<PracticaModel>>(this.practicaService.findPracticaXPaciente(dni), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/vacuna/{vacuna}/{fechaDesde}/{fechaHasta}")
    public ResponseEntity<?> findPracticaXVacuna(@PathVariable("vacuna")String vacuna, @PathVariable("fechaDesde")String fechaDesde, @PathVariable("fechaHasta")String fechaHasta) throws Exception{

        logger.info("Se listan todas las aplicacion de la vacuna: " + vacuna);

        return new ResponseEntity<List<PracticaModel>>(this.practicaService.findPracticaXVacunaXFecha(vacuna, fechaDesde, fechaHasta), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/vacuna/{vacuna}")
    public ResponseEntity<?> findPracticaXVacuna(@PathVariable("vacuna")String vacuna) throws Exception{

        logger.info("Se listan todas las aplicacion de la vacuna: " + vacuna);

        return new ResponseEntity<List<PracticaModel>>(this.practicaService.findPracticaXVacuna(vacuna), HttpStatus.OK);
    }




    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/tipo/{tipoPractica}/{fechaDesde}/{fechaHasta}")
    public ResponseEntity<?> findPracticasXTipoPractica(@PathVariable("tipoPractica")String tipoPractica, @PathVariable("fechaDesde")String fechaDesde, @PathVariable("fechaHasta")String fechaHasta) throws Exception{

        logger.info("Se listan todas las practicas: " + tipoPractica);

        return new ResponseEntity<List<PracticaModel>>(this.practicaService.findPracticasXTipoPracticaXFecha(tipoPractica, fechaDesde, fechaHasta), HttpStatus.OK);
    }


    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/tipo/{tipoPractica}")
    public ResponseEntity<?> findPracticasXTipoPractica(@PathVariable("tipoPractica")String tipoPractica) throws Exception{

        logger.info("Se listan todas las practicas: " + tipoPractica);

        return new ResponseEntity<List<PracticaModel>>(this.practicaService.findPracticasXTipoPractica(tipoPractica), HttpStatus.OK);
    }



    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_ENFERMERIA') OR hasRole('ROLE_COORDINACION')")
    @GetMapping("/fecha/{fechaDesde}/{fechaHasta}")
    public ResponseEntity<?> findPracticasXFecha( @PathVariable("fechaDesde")String fechaDesde, @PathVariable("fechaHasta")String fechaHasta) throws Exception{

        logger.info("Se listan todas las practicas entre " + fechaDesde + " y " + fechaHasta);

        return new ResponseEntity<List<PracticaModel>>(this.practicaService.findPracticasXFecha(fechaDesde, fechaHasta), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_COORDINACION')")
    @PutMapping()
    public void updatePractica(@RequestBody PracticaModel practicaModel) throws Exception {

        logger.info("Se modifica la practica: " + practicaModel.getIdPractica());

        this.practicaService.updatePractica(practicaModel);

    }

    @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_COORDINACION')")
    @DeleteMapping("/{idPractica}")
    public void deletePractica(@PathVariable("idPractica") Long idPractica) throws Exception {

        logger.info("se elimina la practica: " + idPractica);

        this.practicaService.deletePractica(idPractica);

    }


}
