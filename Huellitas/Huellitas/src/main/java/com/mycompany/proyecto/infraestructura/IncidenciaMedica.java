package com.mycompany.proyecto.infraestructura;

import com.mycompany.proyecto.mascotas.Mascota;
import java.time.LocalDate;

/** Representa la clase IncidenciaMedica dentro del sistema Huellitas. */
public class IncidenciaMedica extends Incidencia {
    private Mascota mascota;

    public IncidenciaMedica(String codigo, LocalDate fecha, String descripcion, String nivelPrioridad, String estado, Mascota mascota) {
        super(codigo, fecha, descripcion, nivelPrioridad, estado);
        this.mascota = mascota;
    }

    @Override
    public void mostrarIncidencia() {
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
