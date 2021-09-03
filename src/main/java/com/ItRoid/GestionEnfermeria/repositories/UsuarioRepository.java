package com.ItRoid.GestionEnfermeria.repositories;

import com.ItRoid.GestionEnfermeria.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    @Query(
            value = "SELECT * FROM usuarios u WHERE u.usuario = ?1",
            nativeQuery = true)
    UsuarioEntity findByUsuario(String usuario);
}
