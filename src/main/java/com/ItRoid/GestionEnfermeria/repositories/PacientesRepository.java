package com.ItRoid.GestionEnfermeria.repositories;

import com.ItRoid.GestionEnfermeria.entities.PacientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PacientesRepository extends JpaRepository<PacientesEntity, Long> {

    @Query(
       value = "SELECT * FROM pacientes p WHERE p.dni = ?1",
       nativeQuery = true)
    PacientesEntity findByDni(int dni);
}
