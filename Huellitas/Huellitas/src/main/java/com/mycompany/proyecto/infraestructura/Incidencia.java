package com.mycompany.proyecto.infraestructura;

import java.time.LocalDate;

/** Representa la clase Incidencia dentro del sistema Huellitas. */
public abstract class Incidencia {
    private String codigo;
    private LocalDate fecha;
    private String descripcion;
    private String nivelPrioridad;
    private String estado;

    public Incidencia(String codigo, LocalDate fecha, String descripcion, String nivelPrioridad, String estado) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.nivelPrioridad = nivelPrioridad;
        this.estado = estado;
    }

    public void mostrarIncidencia() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(String nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
