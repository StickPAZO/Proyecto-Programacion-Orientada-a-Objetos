package com.mycompany.proyecto.procesos;

import java.time.LocalDate;

/** Representa la clase Solicitud dentro del sistema Huellitas. */
public abstract class Solicitud {
    private String codigo;
    private LocalDate fecha;
    private String estado;
    private String descripcion;

    public Solicitud(String codigo, LocalDate fecha, String estado, String descripcion) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public void mostrarSolicitud() {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
