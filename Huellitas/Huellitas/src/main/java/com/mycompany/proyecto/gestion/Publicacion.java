package com.mycompany.proyecto.gestion;

import java.time.LocalDate;

/** Representa la clase Publicacion dentro del sistema Huellitas. */
public abstract class Publicacion {
    private String codigo;
    private String titulo;
    private String descripcion;
    private LocalDate fechaPublicacion;

    public Publicacion(String codigo, String titulo, String descripcion, LocalDate fechaPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaPublicacion = fechaPublicacion;
    }

    public void mostrarPublicacion() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
