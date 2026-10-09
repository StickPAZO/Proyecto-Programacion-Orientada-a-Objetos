package com.mycompany.proyecto.eventos;

import java.time.LocalDate;

/** Representa la clase Donacion dentro del sistema Huellitas. */
public abstract class Donacion {
    private String codigo;
    private LocalDate fecha;
    private String descripcion;

    public Donacion(String codigo, LocalDate fecha, String descripcion) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public void mostrarDonacion() {
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
}
