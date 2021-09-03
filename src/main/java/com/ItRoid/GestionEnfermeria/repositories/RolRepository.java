package com.ItRoid.GestionEnfermeria.repositories;

import com.ItRoid.GestionEnfermeria.entities.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<RolEntity, Long> {

    @Query(
            value = "SELECT * FROM roles r WHERE r.rol = ?1",
            nativeQuery = true)
    RolEntity findByRol(String rol);

}
