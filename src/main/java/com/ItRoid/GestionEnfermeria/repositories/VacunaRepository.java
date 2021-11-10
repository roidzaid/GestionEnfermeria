package com.ItRoid.GestionEnfermeria.repositories;

import com.ItRoid.GestionEnfermeria.entities.LoteEntity;
import com.ItRoid.GestionEnfermeria.entities.VacunaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VacunaRepository extends JpaRepository<VacunaEntity, Long> {

    @Query(
            value = "SELECT v.vacuna FROM vacunas v group by v.vacuna ORDER BY v.vacuna",
            nativeQuery = true)
    List<String> findVacunas();

    @Query(
            value = "SELECT v.dosis FROM vacunas v WHERE v.vacuna = ?1",
            nativeQuery = true)
    List<String> findDosis(String vacuna);
}
