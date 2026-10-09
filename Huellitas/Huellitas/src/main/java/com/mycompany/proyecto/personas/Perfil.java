package com.mycompany.proyecto.personas;

import java.time.LocalDate;

/** Representa la clase Perfil dentro del sistema Huellitas. */
public abstract class Perfil {
    private String codigo;
    private LocalDate fechaCreacion;

    public Perfil(String codigo, LocalDate fechaCreacion) {
        this.codigo = codigo;
        this.fechaCreacion = fechaCreacion;
    }

    public void mostrarPerfil() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
