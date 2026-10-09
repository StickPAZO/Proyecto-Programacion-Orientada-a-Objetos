package com.mycompany.proyecto.procesos;

import java.time.LocalDate;

/** Representa la clase Seguimiento dentro del sistema Huellitas. */
public abstract class Seguimiento {
    private String codigo;
    private LocalDate fechaInicio;
    private String estado;
    private String observaciones;

    public Seguimiento(String codigo, LocalDate fechaInicio, String estado, String observaciones) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.observaciones = observaciones;
    }

    public void mostrarSeguimiento() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
