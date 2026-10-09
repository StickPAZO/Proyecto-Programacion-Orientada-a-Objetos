package com.mycompany.proyecto.procesos;

import java.time.LocalDate;

/** Representa la clase Visita dentro del sistema Huellitas. */
public abstract class Visita {
    private String codigo;
    private LocalDate fecha;
    private String responsable;
    private String observaciones;

    public Visita(String codigo, LocalDate fecha, String responsable, String observaciones) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.responsable = responsable;
        this.observaciones = observaciones;
    }

    public void mostrarVisita() {
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

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
