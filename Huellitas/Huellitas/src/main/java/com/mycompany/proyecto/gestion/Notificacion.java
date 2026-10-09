package com.mycompany.proyecto.gestion;

import java.time.LocalDate;

/** Representa la clase Notificacion dentro del sistema Huellitas. */
public abstract class Notificacion {
    private String codigo;
    private LocalDate fecha;
    private String mensaje;
    private String estado;

    public Notificacion(String codigo, LocalDate fecha, String mensaje, String estado) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.mensaje = mensaje;
        this.estado = estado;
    }

    public void mostrarNotificacion() {
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
