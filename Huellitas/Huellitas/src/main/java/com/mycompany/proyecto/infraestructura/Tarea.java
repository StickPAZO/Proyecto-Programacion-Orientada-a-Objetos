package com.mycompany.proyecto.infraestructura;

import java.time.LocalDate;

/** Representa la clase Tarea dentro del sistema Huellitas. */
public abstract class Tarea {
    private String codigo;
    private String descripcion;
    private LocalDate fecha;
    private String estado;

    public Tarea(String codigo, String descripcion, LocalDate fecha, String estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
    }

    public void mostrarTarea() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
