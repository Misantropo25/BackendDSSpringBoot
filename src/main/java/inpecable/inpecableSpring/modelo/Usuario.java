package inpecable.inpecableSpring.modelo;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nomUsuario")
    private String nomUsuario;
    @Column(name = "contrasenia")
    private String contrasenia;
    @Column(name = "usuarioValidado")
    private Boolean usuarioValidado;

    @OneToOne(mappedBy = "tieneUsuario")
    @JsonBackReference
    private Empleado tieneUsuario;

    @OneToOne(mappedBy = "tiene_Usuario")
    @JsonBackReference
    private Cliente tiene_Usuario;


    public Usuario() {
    }

    public Usuario(String nomUsuario, String contrasenia, Boolean usuarioValidado, Empleado tieneUsuario, Cliente tiene_Usuario) {
        this.nomUsuario = nomUsuario;
        this.contrasenia = contrasenia;
        this.usuarioValidado = usuarioValidado;
        this.tieneUsuario = tieneUsuario;
        this.tiene_Usuario = tiene_Usuario;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Boolean getUsuarioValidado() {
        return usuarioValidado;
    }

    public void setUsuarioValidado(Boolean usuarioValidado) {
        this.usuarioValidado = usuarioValidado;
    }

    public Empleado getTieneUsuario() {
        return tieneUsuario;
    }

    public void setTieneUsuario(Empleado tieneUsuario) {
        this.tieneUsuario = tieneUsuario;
    }

    public Cliente getTiene_Usuario() {
        return tiene_Usuario;
    }

    public void setTiene_Usuario(Cliente tiene_Usuario) {
        this.tiene_Usuario = tiene_Usuario;
    }
}
