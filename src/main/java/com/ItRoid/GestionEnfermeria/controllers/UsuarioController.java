package com.ItRoid.GestionEnfermeria.controllers;

import com.ItRoid.GestionEnfermeria.models.RolModel;
import com.ItRoid.GestionEnfermeria.models.UsuarioModel;
import com.ItRoid.GestionEnfermeria.security.JwtService;
import com.ItRoid.GestionEnfermeria.services.RolService;
import com.ItRoid.GestionEnfermeria.services.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private RolService rolService;

    @Autowired
    private JwtService jwtService;


    @GetMapping("/login")
    public String login(@AuthenticationPrincipal User usuario) {

        logger.info("El usuario: " + usuario.getUsername() + " se autentico correctamente");

        List<String> rolesList = usuario
                .getAuthorities()
                .stream()
                .map(authority -> authority.getAuthority())
                .collect(Collectors.toList());

        return jwtService.createToken(usuario.getUsername(), rolesList);

    }



    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping()
    public void createUsuario(@RequestBody UsuarioModel usuarioModel) throws Exception  {

        logger.info("Se da de alta el usuario: " + usuarioModel.getUsuario());

        this.usuarioService.createUsuario(usuarioModel);

    }

    @PostMapping("/rol")
    public void createRol(@RequestBody RolModel rol) throws Exception  {

        logger.info("Se da de alta el rol: " + rol.getRol());

        this.rolService.createRol(rol);

    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/{usuario}")
    public UsuarioModel findUsuario(@PathVariable("usuario") String usuario) throws Exception{

        logger.info("se loguea el usuario" + usuario);

        return this.usuarioService.findByUsuario(usuario);

    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PutMapping("/{usuario}")
    public void addRoles(@PathVariable("usuario") String usuario, @RequestBody RolModel rol) throws Exception {

        logger.info("Se agrega rol " + rol.getRol() +  " a usuario: " + usuario);

        this.usuarioService.addRoles(usuario, rol);

    }


}
