package com.ItRoid.GestionEnfermeria.repositories;

import com.ItRoid.GestionEnfermeria.entities.LoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoteRepository extends JpaRepository<LoteEntity, Long> {


    @Query(
            value = "SELECT * FROM lotes l WHERE l.lote = ?1",
            nativeQuery = true)
    LoteEntity findByLote(String lote);

    @Query(
            value = "SELECT * FROM lotes l WHERE l.vacuna = ?1 and l.tipo= ?2 and l.estado = ?3",
            nativeQuery = true)
    LoteEntity findByLoteAbierto(String vacuna, String tipo, String estado);
}
