package com.mycompany.proyecto.mascotas;

import java.time.LocalDate;

/** Representa la clase Registro dentro del sistema Huellitas. */
public abstract class Registro {
    private String codigo;
    private LocalDate fecha;
    private String observacion;

    public Registro(String codigo, LocalDate fecha, String observacion) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.observacion = observacion;
    }

    public void mostrarRegistro() {
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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
