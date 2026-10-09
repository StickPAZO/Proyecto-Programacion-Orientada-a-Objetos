package com.mycompany.proyecto.gestion;

import com.mycompany.proyecto.procesos.Solicitud;
import java.util.List;

/** Representa la clase GestorSolicitudes dentro del sistema Huellitas. */
public class GestorSolicitudes extends Gestor {
    // Agregacion: solicitudes puede existir independientemente de GestorSolicitudes.
    private List<Solicitud> solicitudes;

    public GestorSolicitudes(String codigo, String nombre, List<Solicitud> solicitudes) {
        super(codigo, nombre);
        this.solicitudes = solicitudes;
    }

    public void registrarSolicitud(Solicitud solicitud) {
    }

    public Solicitud buscarSolicitud(String codigo) {
        return null;
    }

    public void listarSolicitudes() {
    }

    public List<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }
}
