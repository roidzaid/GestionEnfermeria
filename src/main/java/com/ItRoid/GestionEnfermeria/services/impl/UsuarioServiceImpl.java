package com.ItRoid.GestionEnfermeria.services.impl;

import com.ItRoid.GestionEnfermeria.entities.RolEntity;
import com.ItRoid.GestionEnfermeria.entities.UsuarioEntity;
import com.ItRoid.GestionEnfermeria.entities.UsuarioRolEntity;
import com.ItRoid.GestionEnfermeria.models.RolModel;
import com.ItRoid.GestionEnfermeria.models.UsuarioModel;
import com.ItRoid.GestionEnfermeria.repositories.UsuarioRepository;
import com.ItRoid.GestionEnfermeria.repositories.UsuarioRolRepository;
import com.ItRoid.GestionEnfermeria.services.RolService;
import com.ItRoid.GestionEnfermeria.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements UsuarioService<UsuarioModel> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioRolRepository usuarioRolRepository;

    @Autowired
    private RolService rolService;


    @Autowired
    private PasswordEncoder encoder;

    @Override
    public void createUsuario(UsuarioModel usuarioModel) throws Exception {

        UsuarioEntity u = this.usuarioRepository.findByUsuario(usuarioModel.getUsuario());

        if (u == null){

            UsuarioEntity usuarioEntity = new UsuarioEntity(
                    Date.from(Instant.now()),
                    usuarioModel.getNombre(),
                    usuarioModel.getApellido(),
                    usuarioModel.getMail(),
                    usuarioModel.getUsuario(),
                    encoder.encode(usuarioModel.getClave()),
                    Date.from(Instant.now())
            );

            this.usuarioRepository.save(usuarioEntity);

        }else{
            throw new Exception("Ya existe usuario: " + usuarioModel.getUsuario());
        }


    }

    @Override
    public UsuarioModel findByUsuario(String usuario) throws Exception {

        UsuarioEntity u = this.usuarioRepository.findByUsuario(usuario);

        List<String> roles = findRolesXUsuario(u.getUsuario());

        if(u != null){

            UsuarioModel usuarioModel = new UsuarioModel(
                    u.getNombre(),
                    u.getApellido(),
                    u.getMail(),
                    u.getUsuario(),
                    u.getClave(),
                    roles
            );

            return usuarioModel;
        }else{

            throw new Exception("No existe usuario: " + usuario);
        }

    }

    @Override
    public UsuarioEntity findByUsuarioEntity(String usuario) throws Exception {

        UsuarioEntity usuarioEntity = this.usuarioRepository.findByUsuario(usuario);

        if(usuarioEntity != null){

            return usuarioEntity;

        }else{

            throw new Exception("No existe usuario: " + usuario);
        }

    }

    @Override
    public List<UsuarioModel> findAll() throws Exception {

        List<UsuarioModel> list = this.usuarioRepository
                .findAll()
                .stream()
                .map((e) -> new UsuarioModel(
                        e.getNombre(),
                        e.getApellido(),
                        e.getMail(),
                        e.getUsuario(),
                        e.getClave()))
                .collect(Collectors.toList());

        return list;

    }


    @Override
    public void addRoles(String usuario, RolModel rol) throws Exception {

        UsuarioEntity usuarioEntity = findByUsuarioEntity(usuario);

        RolEntity rolEntity =  this.rolService.findByRolEntity(rol.getRol());

        UsuarioRolEntity usuarioRolesEntity = new UsuarioRolEntity(usuarioEntity.getIdUsuario(), rolEntity.getIdRol());

        this.usuarioRolRepository.save(usuarioRolesEntity);


    }


    @Override
    public List<String> findRolesXUsuario(String usuario) throws Exception {

        UsuarioEntity usuarioEntity = findByUsuarioEntity(usuario);

        List<UsuarioRolEntity> relaciones = this.usuarioRolRepository.findByIdUsuario(usuarioEntity.getIdUsuario());


        List<String> rolesNames = new ArrayList<>();


        for (UsuarioRolEntity relacion: relaciones) {

            String rol = this.rolService.findByRolId(relacion.getIdRol());

            rolesNames.add(rol);

        }

        return rolesNames;
    }


    @Override
    public void updateUsuario(UsuarioModel usuarioModel) throws Exception {

    }

    @Override
    public void deleteUsuario(String Usuario) throws Exception {

    }

}
