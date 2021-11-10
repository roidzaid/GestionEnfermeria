package com.ItRoid.GestionEnfermeria.services.impl;

import com.ItRoid.GestionEnfermeria.entities.PracticaEntity;
import com.ItRoid.GestionEnfermeria.models.PacientesModel;
import com.ItRoid.GestionEnfermeria.models.PracticaModel;
import com.ItRoid.GestionEnfermeria.repositories.PracticasRepository;
import com.ItRoid.GestionEnfermeria.services.PacientesService;
import com.ItRoid.GestionEnfermeria.services.PracticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class PracticaServiceImple implements PracticaService<PracticaModel> {

    @Autowired
    private PracticasRepository practicasRepository;

    @Autowired
    private PacientesService pacientesService;


    @Override
    public void createPractica(PracticaModel practicasModel) throws Exception {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNac = LocalDate.parse(practicasModel.getFechaNac(), fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);

        int meses = (periodo.getYears() * 12) + periodo.getMonths();

            PracticaEntity practicaEntity = new PracticaEntity(
                    Date.from(Instant.now()),
                    practicasModel.getNombre(),
                    practicasModel.getApellido(),
                    practicasModel.getDni(),
                    practicasModel.getFechaNac(),
                    periodo.getYears(),
                    meses,
                    practicasModel.getSexo(),
                    practicasModel.getObraSocial(),
                    practicasModel.getLocalidad(),
                    practicasModel.getDireccion(),
                    practicasModel.getNombreResponsable(),
                    practicasModel.getApellidoResponsable(),
                    practicasModel.getDniResponsable(),
                    practicasModel.getObservaciones(),
                    practicasModel.getVacuna(),
                    practicasModel.getDosis(),
                    practicasModel.getTipoVacuna(),
                    practicasModel.getLote(),
                    practicasModel.getUsuarioModif(),
                    Timestamp.from(Instant.now()));

            this.practicasRepository.save(practicaEntity);

        //}else{

        //    throw new Exception("Ya existe practica para: " + practicasModel.getDni());

        //}

    }

    @Override
    public List<PracticaModel> findAll() throws Exception {

        List<PracticaModel> list = this.practicasRepository.findAll()
                .stream()
                .map((e) -> new PracticaModel(
                        e.getIdPractica(),
                        e.getFecha(),
                        e.getNombre(),
                        e.getApellido(),
                        e.getDni(),
                        e.getFechaNac(),
                        e.getSexo(),
                        e.getObraSocial(),
                        e.getLocalidad(),
                        e.getDireccion(),
                        e.getNombreResponsable(),
                        e.getApellidoResponsable(),
                        e.getDniResponsable(),
                        e.getObservaciones(),
                        e.getVacuna(),
                        e.getDosis(),
                        e.getTipoVacuna(),
                        e.getLote()))
                .collect(Collectors.toList());

        return list;
    }

    @Override
    public PracticaModel findIdPractica(Long idPractica) throws Exception {

        PracticaEntity e = this.practicasRepository.findByIdPractica(idPractica);

        if(e != null) {

            PracticaModel practicaModel = new PracticaModel(
                            e.getIdPractica(),
                            e.getFecha(),
                            e.getNombre(),
                            e.getApellido(),
                            e.getDni(),
                            e.getFechaNac(),
                            e.getSexo(),
                            e.getObraSocial(),
                            e.getLocalidad(),
                            e.getDireccion(),
                            e.getNombreResponsable(),
                            e.getApellidoResponsable(),
                            e.getDniResponsable(),
                            e.getObservaciones(),
                            e.getVacuna(),
                            e.getDosis(),
                            e.getTipoVacuna(),
                            e.getLote()
            );

            return practicaModel;

        }else{
            throw new Exception("No existe practica: " + idPractica);
        }

    }

    @Override
    public List<PracticaModel> findPracticaXPacienteXFecha(int dni, String fechaDesde, String fechaHasta) throws Exception {

        List<PracticaEntity> listEntity = new ArrayList<>();

        fechaDesde = fechaDesde + " 00:00:00";
        fechaHasta = fechaHasta + " 23:59:59";

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date fechaDesdeFormat = formato.parse(fechaDesde);
        Date fechaHastaFormat = formato.parse(fechaHasta);

        listEntity = this.practicasRepository.findByXPacienteFecha(dni, fechaDesdeFormat, fechaHastaFormat);

        if(listEntity != null) {
            List<PracticaModel> list = listEntity
                    .stream()
                    .map((e) -> new PracticaModel(
                            e.getIdPractica(),
                            e.getFecha(),
                            e.getNombre(),
                            e.getApellido(),
                            e.getDni(),
                            e.getFechaNac(),
                            e.getSexo(),
                            e.getObraSocial(),
                            e.getLocalidad(),
                            e.getDireccion(),
                            e.getNombreResponsable(),
                            e.getApellidoResponsable(),
                            e.getDniResponsable(),
                            e.getObservaciones(),
                            e.getVacuna(),
                            e.getDosis(),
                            e.getTipoVacuna(),
                            e.getLote()))
                    .collect(Collectors.toList());

            return list;
        }else{
            throw new Exception("No existe practica para el paciente: " + dni);

    }


    }

    @Override
    public List<PracticaModel> findPracticaXPaciente(int dni) throws Exception {

        List<PracticaEntity> listEntity = new ArrayList<>();

        listEntity = this.practicasRepository.findByXPaciente(dni);

        if(listEntity != null) {
            List<PracticaModel> list = listEntity
                    .stream()
                    .map((e) -> new PracticaModel(
                            e.getIdPractica(),
                            e.getFecha(),
                            e.getNombre(),
                            e.getApellido(),
                            e.getDni(),
                            e.getFechaNac(),
                            e.getSexo(),
                            e.getObraSocial(),
                            e.getLocalidad(),
                            e.getDireccion(),
                            e.getNombreResponsable(),
                            e.getApellidoResponsable(),
                            e.getDniResponsable(),
                            e.getObservaciones(),
                            e.getVacuna(),
                            e.getDosis(),
                            e.getTipoVacuna(),
                            e.getLote()))
                    .collect(Collectors.toList());

            return list;
        }else{
            throw new Exception("No existe practica para el paciente: " + dni);

        }


    }

    @Override
    public List<PracticaModel> findPracticaXVacuna(String vacuna) throws Exception {

        List<PracticaEntity> listEntity = new ArrayList<>();

        listEntity = this.practicasRepository.findByXVacuna(vacuna);

        if(listEntity != null) {
            List<PracticaModel> list = listEntity
                    .stream()
                    .map((e) -> new PracticaModel(
                            e.getIdPractica(),
                            e.getFecha(),
                            e.getNombre(),
                            e.getApellido(),
                            e.getDni(),
                            e.getFechaNac(),
                            e.getSexo(),
                            e.getObraSocial(),
                            e.getLocalidad(),
                            e.getDireccion(),
                            e.getNombreResponsable(),
                            e.getApellidoResponsable(),
                            e.getDniResponsable(),
                            e.getObservaciones(),
                            e.getVacuna(),
                            e.getDosis(),
                            e.getTipoVacuna(),
                            e.getLote()))
                    .collect(Collectors.toList());

            return list;
        }else{
            throw new Exception("No se ha aplicado esta vacuna " + vacuna + "en las fechas indicadas");

        }
    }

    @Override
    public List<PracticaModel> findPracticaXVacunaXFecha(String vacuna, String fechaDesde, String fechaHasta) throws Exception {

        List<PracticaEntity> listEntity = new ArrayList<>();

        fechaDesde = fechaDesde + " 00:00:00";
        fechaHasta = fechaHasta + " 23:59:59";

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date fechaDesdeFormat = formato.parse(fechaDesde);
        Date fechaHastaFormat = formato.parse(fechaHasta);

        listEntity = this.practicasRepository.findByXVacunaFecha(vacuna, fechaDesdeFormat, fechaHastaFormat);


        if(listEntity != null) {
            List<PracticaModel> list = listEntity
                    .stream()
                    .map((e) -> new PracticaModel(
                            e.getIdPractica(),
                            e.getFecha(),
                            e.getNombre(),
                            e.getApellido(),
                            e.getDni(),
                            e.getFechaNac(),
                            e.getSexo(),
                            e.getObraSocial(),
                            e.getLocalidad(),
                            e.getDireccion(),
                            e.getNombreResponsable(),
                            e.getApellidoResponsable(),
                            e.getDniResponsable(),
                            e.getObservaciones(),
                            e.getVacuna(),
                            e.getDosis(),
                            e.getTipoVacuna(),
                            e.getLote()))
                    .collect(Collectors.toList());

            return list;
        }else{
            throw new Exception("No se ha aplicado esta vacuna " + vacuna + "en las fechas indicadas");

        }
    }

    @Override
    public List<PracticaModel> findPracticasXTipoPractica(String tipoPractica) throws Exception {

        List<PracticaEntity> listEntity = new ArrayList<>();

        listEntity = this.practicasRepository.findByXTipoPractica(tipoPractica);

        if(listEntity != null) {
            List<PracticaModel> list = listEntity
                    .stream()
                    .map((e) -> new PracticaModel(
                            e.getIdPractica(),
                            e.getFecha(),
                            e.getNombre(),
                            e.getApellido(),
                            e.getDni(),
                            e.getFechaNac(),
                            e.getSexo(),
                            e.getObraSocial(),
                            e.getLocalidad(),
                            e.getDireccion(),
                            e.getNombreResponsable(),
                            e.getApellidoResponsable(),
                            e.getDniResponsable(),
                            e.getObservaciones(),
                            e.getVacuna(),
                            e.getDosis(),
                            e.getTipoVacuna(),
                            e.getLote()))
                    .collect(Collectors.toList());

            return list;
        }else{
            throw new Exception("No se ha realizado este tipo de practica " + tipoPractica + "en las fechas indicadas");

        }
    }

    @Override
    public List<PracticaModel> findPracticasXTipoPracticaXFecha(String tipoPractica, String fechaDesde, String fechaHasta) throws Exception {

        List<PracticaEntity> listEntity = new ArrayList<>();

        fechaDesde = fechaDesde + " 00:00:00";
        fechaHasta = fechaHasta + " 23:59:59";

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date fechaDesdeFormat = formato.parse(fechaDesde);
        Date fechaHastaFormat = formato.parse(fechaHasta);

        listEntity = this.practicasRepository.findByXTipoPracticaFecha(tipoPractica, fechaDesdeFormat, fechaHastaFormat);


        if(listEntity != null) {
            List<PracticaModel> list = listEntity
                    .stream()
                    .map((e) -> new PracticaModel(
                            e.getIdPractica(),
                            e.getFecha(),
                            e.getNombre(),
                            e.getApellido(),
                            e.getDni(),
                            e.getFechaNac(),
                            e.getSexo(),
                            e.getObraSocial(),
                            e.getLocalidad(),
                            e.getDireccion(),
                            e.getNombreResponsable(),
                            e.getApellidoResponsable(),
                            e.getDniResponsable(),
                            e.getObservaciones(),
                            e.getVacuna(),
                            e.getDosis(),
                            e.getTipoVacuna(),
                            e.getLote()))
                    .collect(Collectors.toList());

            return list;
        }else{
            throw new Exception("No se ha realizado este tipo de practica " + tipoPractica + "en las fechas indicadas");

        }
    }


    @Override
    public List<PracticaModel> findPracticasXFecha(String fechaDesde, String fechaHasta) throws Exception {

        fechaDesde = fechaDesde + " 00:00:00";
        fechaHasta = fechaHasta + " 23:59:59";

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date fechaDesdeFormat = formato.parse(fechaDesde);
        Date fechaHastaFormat = formato.parse(fechaHasta);

        List<PracticaEntity> listEntity = this.practicasRepository.findByXFecha(fechaDesdeFormat, fechaHastaFormat);

        if(listEntity != null) {
            List<PracticaModel> list = listEntity
                    .stream()
                    .map((e) -> new PracticaModel(
                            e.getIdPractica(),
                            e.getFecha(),
                            e.getNombre(),
                            e.getApellido(),
                            e.getDni(),
                            e.getFechaNac(),
                            e.getSexo(),
                            e.getObraSocial(),
                            e.getLocalidad(),
                            e.getDireccion(),
                            e.getNombreResponsable(),
                            e.getApellidoResponsable(),
                            e.getDniResponsable(),
                            e.getObservaciones(),
                            e.getVacuna(),
                            e.getDosis(),
                            e.getTipoVacuna(),
                            e.getLote()))
                    .collect(Collectors.toList());

            return list;
        }else{
            throw new Exception("No se han realizado practicas en las fechas indicadas");

        }
    }

    @Override
    public List<PracticaModel> findPracticasXUsuario(String usuario) throws Exception {

        List<PracticaModel> lista = null;

        List<PracticaEntity> listEntity = this.practicasRepository.findByXUsuario(Date.from(Instant.now()), usuario);

        if(listEntity != null) {
            List<PracticaModel> list = listEntity
                    .stream()
                    .map((e) -> new PracticaModel(
                            e.getIdPractica(),
                            e.getFecha(),
                            e.getNombre(),
                            e.getApellido(),
                            e.getDni(),
                            e.getFechaNac(),
                            e.getSexo(),
                            e.getObraSocial(),
                            e.getLocalidad(),
                            e.getDireccion(),
                            e.getNombreResponsable(),
                            e.getApellidoResponsable(),
                            e.getDniResponsable(),
                            e.getObservaciones(),
                            e.getVacuna(),
                            e.getDosis(),
                            e.getTipoVacuna(),
                            e.getLote()))
                    .collect(Collectors.toList());

            lista = list;
        }


        return lista;
    }

    @Override
    public void updatePractica(PracticaModel practicasModel) throws Exception {

        PracticaEntity p = this.practicasRepository.findByIdPractica(practicasModel.getIdPractica());

        if(p != null) {

                p.setFecha(practicasModel.getFecha());
                p.setNombre(practicasModel.getNombre());
                p.setApellido(practicasModel.getApellido());
                p.setDni(practicasModel.getDni());
                p.setFechaNac(practicasModel.getFechaNac());
                p.setSexo(practicasModel.getSexo());
                p.setObraSocial(practicasModel.getObraSocial());
                p.setLocalidad(practicasModel.getLocalidad());
                p.setDireccion(practicasModel.getDireccion());
                p.setNombreResponsable(practicasModel.getNombreResponsable());
                p.setApellidoResponsable(practicasModel.getApellidoResponsable());
                p.setDniResponsable(practicasModel.getDniResponsable());
                p.setObservaciones(practicasModel.getObservaciones());
                p.setVacuna(practicasModel.getVacuna());
                p.setDosis(practicasModel.getDosis());
                p.setTipoVacuna(practicasModel.getTipoVacuna());
                p.setLote(practicasModel.getLote());

            this.practicasRepository.save(p);

        }else{

            throw new Exception("No existe practica que intenta modificar: " + practicasModel.getIdPractica());

        }

    }

    @Override
    public void deletePractica(Long idPractica) throws Exception {

        PracticaEntity p = this.practicasRepository.findByIdPractica(idPractica);

        if(p != null) {

            this.practicasRepository.delete(p);

        }else{

            throw new Exception("No existe practica que intenta eliminar: " + idPractica);

        }

    }
}
