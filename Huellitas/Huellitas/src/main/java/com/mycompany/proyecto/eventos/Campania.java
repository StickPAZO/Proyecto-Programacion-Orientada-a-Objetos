package com.mycompany.proyecto.eventos;

import java.time.LocalDate;

/** Representa la clase Campania dentro del sistema Huellitas. */
public abstract class Campania extends Evento {
    private String objetivo;
    private String responsable;

    public Campania(String codigo, String nombre, LocalDate fecha, String lugar, String estado, String objetivo, String responsable) {
        super(codigo, nombre, fecha, lugar, estado);
        this.objetivo = objetivo;
        this.responsable = responsable;
    }

    @Override
    public void mostrarEvento() {
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}
