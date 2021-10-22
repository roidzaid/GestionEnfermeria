package com.ItRoid.GestionEnfermeria.repositories;

import com.ItRoid.GestionEnfermeria.entities.PracticaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PracticasRepository extends JpaRepository<PracticaEntity, Long> {


    @Query(
            value = "SELECT * FROM practicas p WHERE p.id_practica = ?1 ORDER BY p.id_practica",
            nativeQuery = true)
    PracticaEntity findByIdPractica(Long idPractica);

    @Query(
            value = "SELECT * FROM practicas p WHERE p.dni = ?1 ORDER BY p.id_practica",
            nativeQuery = true)
    List<PracticaEntity> findByXPaciente(int dni);

    @Query(
            value = "SELECT * FROM practicas p WHERE p.dni = ?1 AND p.fecha BETWEEN ?2 AND ?3 ORDER BY p.id_practica",
            nativeQuery = true)
    List<PracticaEntity> findByXPacienteFecha(int dni, Date fechaDesde, Date fechaHasta);

    @Query(
            value = "SELECT * FROM practicas p WHERE p.vacuna = ?1 ORDER BY p.id_practica",
            nativeQuery = true)
    List<PracticaEntity> findByXVacuna(String vacuna);

    @Query(
            value = "SELECT * FROM practicas p WHERE p.vacuna = ?1 AND p.fecha >= ?2 AND p.fecha <= ?3 ORDER BY p.id_practica",
            nativeQuery = true)
    List<PracticaEntity> findByXVacunaFecha(String vacuna, Date fechaDesde, Date fechaHasta);


    @Query(
            value = "SELECT * FROM practicas p WHERE p.tipo_practica = ?1 ORDER BY p.id_practica",
            nativeQuery = true)
    List<PracticaEntity> findByXTipoPractica(String tipoPractica);

    @Query(
            value = "SELECT * FROM practicas p WHERE p.tipo_practica = ?1 AND p.fecha >= ?2 AND p.fecha <= ?3 ORDER BY p.id_practica",
            nativeQuery = true)
    List<PracticaEntity> findByXTipoPracticaFecha(String tipoPractica, Date fechaDesde, Date fechaHasta);

    @Query(
            value = "SELECT * FROM practicas p WHERE p.fecha >= ?1 AND p.fecha <= ?2 ORDER BY p.id_practica",
            nativeQuery = true)
    List<PracticaEntity> findByXFecha(Date fechaDesde, Date fechaHasta);

    @Query(
            value = "SELECT * FROM practicas p WHERE p.fecha <= ?1 AND p.usuario_modif = ?2 ORDER BY p.id_practica",
            nativeQuery = true)
    List<PracticaEntity> findByXUsuario(Date fecha, String usuarioModif);

    @Query(
            value = "SELECT count(*) FROM practicas p WHERE p.localidad = ?1 AND TO_CHAR(fecha,'YYYY-MM')= ?2",
            nativeQuery = true)
    int countByLocalidad(String localidad, String anioMes);

    @Query(
            value = "SELECT count(*) FROM practicas p WHERE p.obra_social = ?1 AND TO_CHAR(fecha,'YYYY-MM')= ?2",
            nativeQuery = true)
    int countByOS(String obra_social, String anioMes);

    @Query(
            value = "SELECT count(*) FROM practicas p WHERE p.edad >= ?1 AND p.edad <= ?2 AND p.sexo = ?3  AND TO_CHAR(fecha,'YYYY-MM')= ?4",
            nativeQuery = true)
    int countByEdad(int edadMin, int edadMax, String sexo, String anioMes);



}
