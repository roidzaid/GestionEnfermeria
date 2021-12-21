package com.ItRoid.GestionEnfermeria.services.impl;

import com.ItRoid.GestionEnfermeria.entities.PracticaEntity;
import com.ItRoid.GestionEnfermeria.models.PracticaModel;
import com.ItRoid.GestionEnfermeria.models.RecuperosModel;
import com.ItRoid.GestionEnfermeria.models.ResaproModel;
import com.ItRoid.GestionEnfermeria.models.ResaproModelBD;
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
import java.time.format.DateTimeFormatterBuilder;
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


        String[] parts = practicasModel.getFechaNac().split("-");

        String fn = parts[0] + parts[1] + parts[2];

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNac = LocalDate.parse(fn, DateTimeFormatter.BASIC_ISO_DATE);
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
                    Timestamp.from(Instant.now()),
                    practicasModel.getEsqAtrasado());

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
                        e.getLote(),
                        e.getUsuarioModif(),
                        e.getEsqAtrasado()))
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
                            e.getLote(),
                            e.getUsuarioModif(),
                            e.getEsqAtrasado()
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
                            e.getLote(),
                            e.getUsuarioModif(),
                            e.getEsqAtrasado()))
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
                            e.getLote(),
                            e.getUsuarioModif(),
                            e.getEsqAtrasado()))
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
                            e.getLote(),
                            e.getUsuarioModif(),
                            e.getEsqAtrasado()))
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
                            e.getLote(),
                            e.getUsuarioModif(),
                            e.getEsqAtrasado()))
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
                            e.getLote(),
                            e.getUsuarioModif(),
                            e.getEsqAtrasado()))
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
                            e.getLote(),
                            e.getUsuarioModif(),
                            e.getEsqAtrasado()))
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
                            e.getLote(),
                            e.getUsuarioModif(),
                            e.getEsqAtrasado()))
                    .collect(Collectors.toList());

            return list;
        }else{
            throw new Exception("No se han realizado practicas en las fechas indicadas");

        }
    }

    @Override
    public List<PracticaModel> findPracticasXUsuario(String usuario) throws Exception {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date fecha = cal.getTime();

        List<PracticaModel> lista = null;

        List<PracticaEntity> listEntity = this.practicasRepository.findByXUsuario(fecha, usuario);

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
                            e.getLote(),
                            e.getUsuarioModif(),
                            e.getEsqAtrasado()))
                    .collect(Collectors.toList());

            lista = list;
        }


        return lista;
    }

    @Override
    public List<PracticaModel> findPracticasXRecupero(String fechaDesde, String fechaHasta) throws Exception {

        fechaDesde = fechaDesde + " 00:00:00";
        fechaHasta = fechaHasta + " 23:59:59";

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date fechaDesdeFormat = formato.parse(fechaDesde);
        Date fechaHastaFormat = formato.parse(fechaHasta);

        List<PracticaModel> lista = null;

        List<PracticaEntity> listEntity = this.practicasRepository.findByRecupero("Esq. Atrasado", fechaDesdeFormat, fechaHastaFormat);

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
                            e.getLote(),
                            e.getUsuarioModif(),
                            e.getEsqAtrasado()))
                    .collect(Collectors.toList());

            lista = list;
        }

        return lista;

    }


    @Override
    public List<RecuperosModel> findPracticasXRecuperoModel(String fechaDesde, String fechaHasta) throws Exception {

        fechaDesde = fechaDesde + " 00:00:00";
        fechaHasta = fechaHasta + " 23:59:59";

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date fechaDesdeFormat = formato.parse(fechaDesde);
        Date fechaHastaFormat = formato.parse(fechaHasta);

        List<RecuperosModel> lista = new ArrayList<>();

        List<PracticaEntity> listEntity = this.practicasRepository.findByRecupero("Esq. Atrasado", fechaDesdeFormat, fechaHastaFormat);

        for (int i=0;i<listEntity.size();i++) {

            RecuperosModel recuperosModel = new RecuperosModel("", "", 0, "", "", "", "", "", "");

            if (listEntity.get(i).getSexo().equals("masculino")){
                recuperosModel.setVaron("X");
            }else{
                recuperosModel.setMujer("X");
            };

            /*String[] parts = listEntity.get(i).getFechaNac().split("-");

            String fecha = parts[0] + parts[1] + parts[2];

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fechaNac = LocalDate.parse(fecha, DateTimeFormatter.BASIC_ISO_DATE);
            LocalDate ahora = LocalDate.now();

            Period periodo = Period.between(fechaNac, ahora);*/
            recuperosModel.setEdad(listEntity.get(i).getEdadAños());

            recuperosModel.setNacimiento(listEntity.get(i).getFechaNac());
            recuperosModel.setVacuna(listEntity.get(i).getVacuna());


            switch (listEntity.get(i).getDosis()) {

                case "N/A":
                case "+18A(1ra)":
                case "<65 FR":
                case ">65":
                case "11A":
                case "1ra":
                case "7-18A(1ra)":
                case "EMB":
                case "EMB 1ra":
                case "P.E":
                case "P.S":
                case "PREMA":
                case "PUER":
                case "UD":

                    recuperosModel.setDosis1("X");

                    break;

                case "+18A(2da)":
                case "2da":
                case "2da/IE":
                case "7-18A(2da)":
                case "EMB 2da":

                    recuperosModel.setDosis2("X");

                    break;

                case "3ra":
                case "EMB 3ra":

                    recuperosModel.setDosis3("X");

                    break;

                case "+18A R/Camp":
                case "3ra/R":
                case "7-18A R/Camp":
                case "R/11A":
                case "R/IE":

                    recuperosModel.setDosisR("X");

                    break;

                default:

                    recuperosModel.setDosis1("X");

                    break;

            }
            lista.add(recuperosModel);
        }
        return lista;
    }

    @Override
    public List<ResaproModel> findResapro(String fechaDesde, String fechaHasta) throws Exception {

        fechaDesde = fechaDesde + " 00:00:00";
        fechaHasta = fechaHasta + " 23:59:59";

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date fechaDesdeFormat = formato.parse(fechaDesde);
        Date fechaHastaFormat = formato.parse(fechaHasta);

        List<ResaproModel> listaResapro = new ArrayList<>();

        String espacios = "";

       /* List<ResaproModelBD> lista = this.practicasRepository.findResapro(espacios, fechaDesdeFormat, fechaHastaFormat);*/

        List<PracticaEntity> lista = this.practicasRepository.findByXFecha(fechaDesdeFormat, fechaHastaFormat);

        /*for (int i=0;i<lista.size();i++) {*/

        int i=0;
        while (lista.size() > i) {

            ResaproModel resaproModel = new ResaproModel("","",0,"","",0,0,"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","");
            int dniAnt = lista.get(i).getDni();

            while (lista.size() > i && dniAnt == lista.get(i).getDni()) {

                if (lista.get(i).getVacuna() != "" && lista.get(i).getObservaciones() == "") {

                    resaproModel.setNomyApe(lista.get(i).getNombre()+", "+ lista.get(i).getApellido());
                    resaproModel.setDomicilio(lista.get(i).getDireccion());
                    resaproModel.setDni(lista.get(i).getDni());
                    resaproModel.setFechaNac(lista.get(i).getFechaNac());

                    if(lista.get(i).getNombreResponsable() != null && lista.get(i).getNombreResponsable() != "" && lista.get(i).getDniResponsable() != 0) {
                        resaproModel.setNomyApeResponsable(lista.get(i).getNombreResponsable() + ", " + lista.get(i).getApellidoResponsable());
                    }else{
                        resaproModel.setNomyApeResponsable("");
                    }

                    resaproModel.setDniResponsable(lista.get(i).getDniResponsable());

                    resaproModel.setSexo(lista.get(i).getSexo());

                    resaproModel.setEdad(lista.get(i).getEdadAños());
                    resaproModel.setObraSocial(lista.get(i).getObraSocial());


                    if (lista.get(i).getVacuna().equals("BCG")) {
                        resaproModel.setBCG("X");
                    }

                    if (lista.get(i).getVacuna().equals("HEP.B")) {
                        switch (lista.get(i).getDosis()) {
                            case "1ra":
                                resaproModel.setHep_B_1("X");
                                break;
                            case "EMB 1ra":
                                resaproModel.setHep_B_1("X-" + lista.get(i).getDosis());
                                break;
                            case "2da":
                                resaproModel.setHep_B_2("X");
                                break;
                            case "EMB 2da":
                                resaproModel.setHep_B_2("X-" + lista.get(i).getDosis());
                                break;
                            case "3ra":
                                resaproModel.setHep_B_3("X");
                                break;
                            case "EMB 3ra":
                                resaproModel.setHep_B_3("X-" + lista.get(i).getDosis());
                                break;
                            default:
                                resaproModel.setHep_B_1("X-" + lista.get(i).getDosis());
                                break;
                        }
                    }

                    if (lista.get(i).getVacuna().equals("VCN 13")) {
                        switch (lista.get(i).getDosis()) {
                            case "1ra":
                                resaproModel.setVCN_13_1("X");
                                break;
                            case "2da":
                                resaproModel.setVCN_13_2("X");
                                break;
                            case "3ra/R":
                                resaproModel.setVCN_13_3("X");
                                break;
                            default:
                                resaproModel.setVCN_13_1("X-" + lista.get(i).getDosis());
                                break;
                        }
                    }

                    if (lista.get(i).getVacuna().equals("N23")) {
                        resaproModel.setVCN_13_1("X-N23");
                    }


                    if (lista.get(i).getVacuna().equals("PENTAVALENTE")) {
                        switch (lista.get(i).getDosis()) {
                            case "1ra":
                                resaproModel.setPentavalente_1("X");
                                break;
                            case "2da":
                                resaproModel.setPentavalente_2("X");
                                break;
                            case "3ra":
                                resaproModel.setPentavalente_3("X");
                                break;
                            default:
                                resaproModel.setPentavalente_1("X-" + lista.get(i).getDosis());
                                break;
                        }
                    }

                    if (lista.get(i).getVacuna().equals("SALK-IPV")) {
                        switch (lista.get(i).getDosis()) {
                            case "1ra":
                                resaproModel.setSALK_IPV_1("X");
                                break;
                            case "2da":
                                resaproModel.setSALK_IPV_2("X");
                                break;
                            case "3ra":
                                resaproModel.setSALK_IPV_3("X");
                                break;
                            case "R/IE":
                                resaproModel.setSALK_IPV_R("X");
                                break;
                            default:
                                resaproModel.setSALK_IPV_1("X-" + lista.get(i).getDosis());
                                break;
                        }
                    }

                    if (lista.get(i).getVacuna().equals("ROTAVIRUS")) {
                        switch (lista.get(i).getDosis()) {
                            case "1ra":
                                resaproModel.setRotavirus_1("X");
                                break;
                            case "2da":
                                resaproModel.setRotavirus_2("X");
                                break;
                            default:
                                resaproModel.setRotavirus_1("X-" + lista.get(i).getDosis());
                                break;
                        }
                    }

                    if (lista.get(i).getVacuna().equals("MENINGOCOCO")) {
                        switch (lista.get(i).getDosis()) {
                            case "1ra":
                                resaproModel.setMeningococo_1("X");
                                break;
                            case "2da":
                                resaproModel.setMeningococo_2("X");
                                break;
                            case "3ra":
                                resaproModel.setMeningococo_3("X");
                                break;
                            case "R/11A":
                                resaproModel.setMeningococo_R("X");
                                break;
                            default:
                                resaproModel.setMeningococo_1("X-" + lista.get(i).getDosis());
                                break;
                        }
                    }

                    if (lista.get(i).getVacuna().equals("ANTIGRIPAL")) {
                        resaproModel.setAntigripal("X-" + lista.get(i).getDosis());
                    }

                    if (lista.get(i).getVacuna().equals("TRIPLE VIRAL")) {
                        switch (lista.get(i).getDosis()) {
                            case "1ra":
                                resaproModel.setTriple_Viral_1("X");
                                break;
                            case "7-18A(1ra)":
                            case "+18A(1ra)":
                                resaproModel.setTriple_Viral_1("X-" + lista.get(i).getDosis());
                                break;
                            case "2da/IE":
                                resaproModel.setTriple_Viral_2("X");
                                break;
                            case "7-18A(2da)":
                            case "+18A(2da)":
                                resaproModel.setTriple_Viral_2("X-" + lista.get(i).getDosis());
                                break;
                            default:
                                resaproModel.setTriple_Viral_1("X-" + lista.get(i).getDosis());
                                break;
                        }
                    }

                    if (lista.get(i).getVacuna().equals("HEP.A")) {
                        resaproModel.setHep_A("X");
                    }

                    if (lista.get(i).getVacuna().equals("VARICELA")) {
                        resaproModel.setVaricela("X");
                    }

                    if (lista.get(i).getVacuna().equals("DTP Hib")) {
                        resaproModel.setDTP_Hib("X");
                    }

                    if (lista.get(i).getVacuna().equals("DTP")) {
                        resaproModel.setDTP("X-" + lista.get(i).getDosis());
                    }

                    if (lista.get(i).getVacuna().equals("DTP Ac.")) {
                        resaproModel.setDTP_Ac("X");
                    }

                    if (lista.get(i).getVacuna().equals("HPV")) {
                        switch (lista.get(i).getDosis()) {
                            case "1ra":
                                resaproModel.setHPV_1("X");
                                break;
                            case "2da":
                                resaproModel.setHPV_2("X");
                                break;
                            default:
                                resaproModel.setHPV_1("X-" + lista.get(i).getDosis());
                                break;
                        }
                    }

                    if (lista.get(i).getVacuna().equals("DT")) {
                        resaproModel.setDT("X-" + lista.get(i).getDosis());
                    }

                    if (lista.get(i).getVacuna().equals("S.R")) {
                        resaproModel.setSR("X");
                    }
                }
                i++;
            }
            listaResapro.add(resaproModel);



        }

        return listaResapro;
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
