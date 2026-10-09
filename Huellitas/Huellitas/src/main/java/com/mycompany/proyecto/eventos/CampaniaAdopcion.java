package com.mycompany.proyecto.eventos;

import java.time.LocalDate;

/** Representa la clase CampaniaAdopcion dentro del sistema Huellitas. */
public class CampaniaAdopcion extends Campania {
    private int metaAdopciones;

    public CampaniaAdopcion(String codigo, String nombre, LocalDate fecha, String lugar, String estado, String objetivo, String responsable, int metaAdopciones) {
        super(codigo, nombre, fecha, lugar, estado, objetivo, responsable);
        this.metaAdopciones = metaAdopciones;
    }

    @Override
    public void mostrarEvento() {
    }

    public int getMetaAdopciones() {
        return metaAdopciones;
    }

    public void setMetaAdopciones(int metaAdopciones) {
        this.metaAdopciones = metaAdopciones;
    }
}
