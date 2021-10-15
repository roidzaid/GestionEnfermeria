package com.ItRoid.GestionEnfermeria.repositories;

import com.ItRoid.GestionEnfermeria.entities.MarcasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarcaRepository extends JpaRepository<MarcasEntity, Long> {

    @Query(
            value = "SELECT m.marca FROM marcas m",
            nativeQuery = true)
    List<String> findMarcas();

}
