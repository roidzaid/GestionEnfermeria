package com.ItRoid.GestionEnfermeria.services;

import com.ItRoid.GestionEnfermeria.models.RolModel;
import com.ItRoid.GestionEnfermeria.models.UsuarioModel;
import com.ItRoid.GestionEnfermeria.entities.UsuarioEntity;

import java.util.List;

public interface UsuarioService<T> {

    void createUsuario(UsuarioModel usuarioModel) throws Exception;
    UsuarioModel findByUsuario(String usuario) throws Exception;
    UsuarioEntity findByUsuarioEntity(String usuario) throws Exception;
    List<UsuarioModel> findAll() throws Exception;

    void updateUsuario(UsuarioModel usuarioModel) throws Exception;
    void deleteUsuario(String usuario) throws Exception;

    void addRoles(String usuario, RolModel rol) throws Exception;
    List<String> findRolesXUsuario(String usuario) throws Exception;
}
