package com.ItRoid.GestionEnfermeria.entities;

import javax.persistence.*;

@Entity
@TableGenerator(name = "seq", initialValue = 100, allocationSize = 1)
@Table(name = "roles")
public class RolEntity {

    @Id
    @Column(name="idRol")
    @GeneratedValue(strategy= GenerationType.TABLE, generator = "seq")
    private Long idRol;

    @Column(name="rol")
    private String rol;


    public RolEntity() {
    }

    public RolEntity(String rol) {
        this.rol = rol;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


}
