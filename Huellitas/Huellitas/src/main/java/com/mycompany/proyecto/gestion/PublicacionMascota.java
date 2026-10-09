package com.mycompany.proyecto.gestion;

import com.mycompany.proyecto.mascotas.Mascota;
import java.time.LocalDate;

/** Representa la clase PublicacionMascota dentro del sistema Huellitas. */
public class PublicacionMascota extends Publicacion {
    private Mascota mascota;

    public PublicacionMascota(String codigo, String titulo, String descripcion, LocalDate fechaPublicacion, Mascota mascota) {
        super(codigo, titulo, descripcion, fechaPublicacion);
        this.mascota = mascota;
    }

    @Override
    public void mostrarPublicacion() {
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
