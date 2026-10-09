package com.mycompany.proyecto.gestion;

import com.mycompany.proyecto.mascotas.Mascota;
import java.util.List;

/** Representa la clase CatalogoMascotas dentro del sistema Huellitas. */
public class CatalogoMascotas extends Catalogo {
    // Agregacion: mascotas puede existir independientemente de CatalogoMascotas.
    private List<Mascota> mascotas;

    public CatalogoMascotas(String codigo, String nombre, List<Mascota> mascotas) {
        super(codigo, nombre);
        this.mascotas = mascotas;
    }

    public void agregarMascota(Mascota mascota) {
    }

    public Mascota buscarMascota(String codigo) {
        return null;
    }

    public void listarDisponibles() {
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
