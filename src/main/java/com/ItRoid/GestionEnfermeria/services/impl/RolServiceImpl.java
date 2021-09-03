package com.ItRoid.GestionEnfermeria.services.impl;

import com.ItRoid.GestionEnfermeria.entities.RolEntity;
import com.ItRoid.GestionEnfermeria.models.RolModel;
import com.ItRoid.GestionEnfermeria.repositories.RolRepository;
import com.ItRoid.GestionEnfermeria.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RolServiceImpl implements RolService<RolModel> {


    @Autowired
    private RolRepository rolRepository;

    @Override
    public void createRol(RolModel rolModel) throws Exception {

        RolEntity rolEntity = this.rolRepository.findByRol(rolModel.getRol());

        if (rolEntity == null) {

            RolEntity rol = new RolEntity(rolModel.getRol());

            this.rolRepository.save(rol);

        }else{
            throw new Exception("Ya existe rol: " + rolModel.getRol());
        }

    }

    @Override
    public RolModel findByRol(String rol) throws Exception {

        RolEntity rolEntity = this.rolRepository.findByRol(rol);

        RolModel rolModel = new RolModel();

        if(rolEntity != null){

            rolModel.setRol(rolEntity.getRol());

        }else{

            throw new Exception("No existe rol: " + rol);
        }


        return rolModel;
    }

    @Override
    public RolEntity findByRolEntity(String rol) throws Exception {

        RolEntity rolEntity = this.rolRepository.findByRol(rol);

        if(rolEntity != null){

            return rolEntity;

        }else{

            throw new Exception("No existe rol: " + rol);
        }

    }

    @Override
    public String findByRolId(Long id) throws Exception {

        RolEntity rolEntity = this.rolRepository.findById(id).get();

        if(rolEntity != null){

            return rolEntity.getRol();

        }else{

            throw new Exception("No existe rol: " + id);
        }

    }


    @Override
    public List<RolModel> findAll() throws Exception {

        List<RolModel> list = this.rolRepository
                .findAll()
                .stream()
                .map((e) -> new RolModel(
                        e.getRol()))
                .collect(Collectors.toList());

        return list;
    }

    @Override
    public void updateRol(RolModel rolModel) throws Exception {

    }

    @Override
    public void deleteRol(String Rol) throws Exception {

    }


}
