package com.mycompany.proyecto.procesos;

import java.time.LocalDate;

/** Representa la clase SolicitudRescate dentro del sistema Huellitas. */
public class SolicitudRescate extends Solicitud {
    private String ubicacion;
    private String nivelUrgencia;

    public SolicitudRescate(String codigo, LocalDate fecha, String estado, String descripcion, String ubicacion, String nivelUrgencia) {
        super(codigo, fecha, estado, descripcion);
        this.ubicacion = ubicacion;
        this.nivelUrgencia = nivelUrgencia;
    }

    @Override
    public void mostrarSolicitud() {
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(String nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }
}
