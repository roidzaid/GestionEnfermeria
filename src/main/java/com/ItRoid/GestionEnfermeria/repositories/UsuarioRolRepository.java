package com.ItRoid.GestionEnfermeria.repositories;

import com.ItRoid.GestionEnfermeria.entities.UsuarioRolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRolRepository extends JpaRepository<UsuarioRolEntity, Long> {

    public List<UsuarioRolEntity> findByIdUsuario(Long idUsuario);

    public List<UsuarioRolEntity> findByIdRol(Long idRol);

}
