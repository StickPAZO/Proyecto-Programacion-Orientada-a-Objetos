package com.mycompany.proyecto.eventos;

import java.time.LocalDate;

/** Representa la clase FeriaAdopcion dentro del sistema Huellitas. */
public class FeriaAdopcion extends Evento {
    private int numeroMascotas;

    public FeriaAdopcion(String codigo, String nombre, LocalDate fecha, String lugar, String estado, int numeroMascotas) {
        super(codigo, nombre, fecha, lugar, estado);
        this.numeroMascotas = numeroMascotas;
    }

    @Override
    public void mostrarEvento() {
    }

    public int getNumeroMascotas() {
        return numeroMascotas;
    }

    public void setNumeroMascotas(int numeroMascotas) {
        this.numeroMascotas = numeroMascotas;
    }
}
