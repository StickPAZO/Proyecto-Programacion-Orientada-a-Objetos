package com.mycompany.proyecto.procesos;

import com.mycompany.proyecto.mascotas.Mascota;
import com.mycompany.proyecto.personas.Adoptante;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/** Representa la clase Adopcion dentro del sistema Huellitas. */
public class Adopcion extends Proceso {
    private Adoptante adoptante;
    private Mascota mascota;
    private SolicitudAdopcion solicitud;
    // Composicion: seguimientos pertenece al ciclo de vida de Adopcion.
    private final List<SeguimientoAdopcion> seguimientos;

    public Adopcion(String codigo, LocalDate fechaInicio, String estado, String observaciones, Adoptante adoptante, Mascota mascota, SolicitudAdopcion solicitud) {
        super(codigo, fechaInicio, estado, observaciones);
        this.adoptante = adoptante;
        this.mascota = mascota;
        this.solicitud = solicitud;
        this.seguimientos = new ArrayList<>();
    }

    public void agregarSeguimiento(SeguimientoAdopcion seguimiento) {
    }

    @Override
    public void mostrarProceso() {
    }

    public Adoptante getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(Adoptante adoptante) {
        this.adoptante = adoptante;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public SolicitudAdopcion getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(SolicitudAdopcion solicitud) {
        this.solicitud = solicitud;
    }

    public List<SeguimientoAdopcion> getSeguimientos() {
        return seguimientos;
    }
}
