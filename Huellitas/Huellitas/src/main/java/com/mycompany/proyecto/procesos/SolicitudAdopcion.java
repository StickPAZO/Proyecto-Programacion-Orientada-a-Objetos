package com.mycompany.proyecto.procesos;

import com.mycompany.proyecto.mascotas.Mascota;
import com.mycompany.proyecto.personas.Adoptante;
import java.time.LocalDate;

/** Representa la clase SolicitudAdopcion dentro del sistema Huellitas. */
public class SolicitudAdopcion extends Solicitud {
    private Adoptante adoptante;
    private Mascota mascota;
    private EvaluacionCompatibilidad evaluacion;

    public SolicitudAdopcion(String codigo, LocalDate fecha, String estado, String descripcion, Adoptante adoptante, Mascota mascota, EvaluacionCompatibilidad evaluacion) {
        super(codigo, fecha, estado, descripcion);
        this.adoptante = adoptante;
        this.mascota = mascota;
        this.evaluacion = evaluacion;
    }

    @Override
    public void mostrarSolicitud() {
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

    public EvaluacionCompatibilidad getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(EvaluacionCompatibilidad evaluacion) {
        this.evaluacion = evaluacion;
    }
}
