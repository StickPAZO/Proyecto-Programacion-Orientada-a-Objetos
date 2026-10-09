package com.mycompany.proyecto.procesos;

import java.time.LocalDate;

/** Representa la clase VisitaPostAdopcion dentro del sistema Huellitas. */
public class VisitaPostAdopcion extends Visita {
    private String estadoMascota;
    private String estadoConvivencia;

    public VisitaPostAdopcion(String codigo, LocalDate fecha, String responsable, String observaciones, String estadoMascota, String estadoConvivencia) {
        super(codigo, fecha, responsable, observaciones);
        this.estadoMascota = estadoMascota;
        this.estadoConvivencia = estadoConvivencia;
    }

    @Override
    public void mostrarVisita() {
    }

    public String getEstadoMascota() {
        return estadoMascota;
    }

    public void setEstadoMascota(String estadoMascota) {
        this.estadoMascota = estadoMascota;
    }

    public String getEstadoConvivencia() {
        return estadoConvivencia;
    }

    public void setEstadoConvivencia(String estadoConvivencia) {
        this.estadoConvivencia = estadoConvivencia;
    }
}
