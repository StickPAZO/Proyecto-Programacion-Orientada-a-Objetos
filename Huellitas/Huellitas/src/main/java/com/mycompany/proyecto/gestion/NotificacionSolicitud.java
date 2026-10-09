package com.mycompany.proyecto.gestion;

import com.mycompany.proyecto.procesos.Solicitud;
import java.time.LocalDate;

/** Representa la clase NotificacionSolicitud dentro del sistema Huellitas. */
public class NotificacionSolicitud extends Notificacion {
    private Solicitud solicitud;

    public NotificacionSolicitud(String codigo, LocalDate fecha, String mensaje, String estado, Solicitud solicitud) {
        super(codigo, fecha, mensaje, estado);
        this.solicitud = solicitud;
    }

    @Override
    public void mostrarNotificacion() {
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
}
