package com.ItRoid.GestionEnfermeria.entities;

import javax.persistence.*;

@Entity
@TableGenerator(name = "seq", initialValue = 0, allocationSize = 1)
@Table(name = "usuarioRoles")
public class UsuarioRolEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.TABLE, generator = "seq")
    private Long id;

    private Long idUsuario;

    private Long idRol;


    public UsuarioRolEntity() {
    }


    public UsuarioRolEntity(Long idUsuario, Long idRol) {
        this.idRol = idRol;
        this.idUsuario = idUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }
}
