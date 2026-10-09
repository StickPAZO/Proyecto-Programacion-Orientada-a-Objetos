package com.mycompany.proyecto.infraestructura;

import java.time.LocalDate;

/** Representa la clase TurnoVoluntario dentro del sistema Huellitas. */
public class TurnoVoluntario extends Turno {
    private String actividad;

    public TurnoVoluntario(String codigo, LocalDate fecha, String horaInicio, String horaFin, String actividad) {
        super(codigo, fecha, horaInicio, horaFin);
        this.actividad = actividad;
    }

    @Override
    public void mostrarTurno() {
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
}
