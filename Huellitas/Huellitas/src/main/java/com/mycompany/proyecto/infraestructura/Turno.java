package com.mycompany.proyecto.infraestructura;

import java.time.LocalDate;

/** Representa la clase Turno dentro del sistema Huellitas. */
public abstract class Turno {
    private String codigo;
    private LocalDate fecha;
    private String horaInicio;
    private String horaFin;

    public Turno(String codigo, LocalDate fecha, String horaInicio, String horaFin) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public void mostrarTurno() {
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

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
}
