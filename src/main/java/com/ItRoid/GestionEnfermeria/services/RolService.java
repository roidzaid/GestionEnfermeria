package com.ItRoid.GestionEnfermeria.services;

import com.ItRoid.GestionEnfermeria.entities.RolEntity;
import com.ItRoid.GestionEnfermeria.models.RolModel;

import java.util.List;

public interface RolService<T> {

    void createRol(RolModel rolModel) throws Exception;
    RolModel findByRol(String rol) throws Exception;
    String findByRolId(Long id) throws Exception;
    RolEntity findByRolEntity(String rol) throws Exception;
    List<RolModel> findAll() throws Exception;

    void updateRol(RolModel rolModel) throws Exception ;
    void deleteRol(String Rol) throws Exception;


}
