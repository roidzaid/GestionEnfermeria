package com.ItRoid.GestionEnfermeria.services.impl;

import com.ItRoid.GestionEnfermeria.entities.PacientesEntity;
import com.ItRoid.GestionEnfermeria.models.PacientesModel;
import com.ItRoid.GestionEnfermeria.repositories.PacientesRepository;
import com.ItRoid.GestionEnfermeria.services.PacientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PacientesServiceImpl implements PacientesService<PacientesModel> {

    @Autowired
    private PacientesRepository pacientesRepository;

    @Override
    public void createPaciente(PacientesModel paciente) throws Exception {

        PacientesEntity p = this.pacientesRepository.findByDni(paciente.getDni());

        if (p == null) {

            PacientesEntity pacientesEntity = new PacientesEntity(
                    Date.from(Instant.now()),
                    paciente.getNombre(),
                    paciente.getApellido(),
                    paciente.getDni(),
                    paciente.getFechaNac(),
                    paciente.getSexo(),
                    paciente.getObraSocial(),
                    paciente.getLocalidad(),
                    paciente.getDireccion(),
                    paciente.getNombreResponsable(),
                    paciente.getApellidoResponsable(),
                    paciente.getDniResponsable(),
                    paciente.getTelefono(),
                    paciente.getMail(),
                    "PRIMER ALTA",
                    Timestamp.from(Instant.now())

            );

            this.pacientesRepository.save(pacientesEntity);

        } else{
            throw new Exception("Ya existe paciente con DNI: " + paciente.getDni());
        }



    }

    @Override
    public PacientesModel findByDni(int dni) throws Exception{

        PacientesEntity pacientesEntity = this.pacientesRepository.findByDni(dni);

        if(pacientesEntity != null){

            PacientesModel pacientesModel = new PacientesModel(
                    pacientesEntity.getFechaAlta(),
                    pacientesEntity.getNombre(),
                    pacientesEntity.getApellido(),
                    pacientesEntity.getDni(),
                    pacientesEntity.getFechaNac(),
                    pacientesEntity.getSexo(),
                    pacientesEntity.getObraSocial(),
                    pacientesEntity.getLocalidad(),
                    pacientesEntity.getDireccion(),
                    pacientesEntity.getNombreResponsable(),
                    pacientesEntity.getApellidoResponsable(),
                    pacientesEntity.getDniResponsable(),
                    pacientesEntity.getTelefono(),
                    pacientesEntity.getMail());

            return pacientesModel;

        }else{

            throw new Exception("No existe paciente con DNI: " + dni);
        }
    }

    @Override
    public List<PacientesModel> findAll() throws Exception {

        List<PacientesModel> list = this.pacientesRepository
                .findAll()
                .stream()
                .map((e) -> new PacientesModel(
                        e.getFechaAlta(),
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
                        e.getTelefono(),
                        e.getMail()))
                .collect(Collectors.toList());

        return list;

    }

    @Override
    public void updatePaciente(PacientesModel paciente) throws Exception {

        PacientesEntity pacientesEntity = this.pacientesRepository.findByDni(paciente.getDni());

        if(pacientesEntity != null) {

            pacientesEntity.setNombre(paciente.getNombre());
            pacientesEntity.setApellido(paciente.getApellido());
            pacientesEntity.setDni(paciente.getDni());
            pacientesEntity.setFechaNac(paciente.getFechaNac());
            pacientesEntity.setSexo(paciente.getSexo());
            pacientesEntity.setObraSocial(paciente.getObraSocial());
            pacientesEntity.setLocalidad(paciente.getLocalidad());
            pacientesEntity.setDireccion(paciente.getDireccion());
            pacientesEntity.setNombreResponsable(paciente.getNombreResponsable());
            pacientesEntity.setApellidoResponsable(paciente.getApellidoResponsable());
            pacientesEntity.setDniResponsable(paciente.getDniResponsable());
            pacientesEntity.setTelefono(paciente.getTelefono());
            pacientesEntity.setMail(paciente.getMail());
            pacientesEntity.setUsuarioModif("MODIFICADO");
            pacientesEntity.setTimestamp(Timestamp.from(Instant.now()));

            this.pacientesRepository.save(pacientesEntity);

        }else{
            throw new Exception("No existe paciente que intenta modificar");
        }

    }

    @Override
    public void deletePaciente(int dni) throws Exception {

        PacientesEntity pacientesEntity = this.pacientesRepository.findByDni(dni);

        if(pacientesEntity != null){

            this.pacientesRepository.delete(pacientesEntity);

        }else{
            throw new Exception("No existe paciente que intenta eliminar");
        }

    }



}
