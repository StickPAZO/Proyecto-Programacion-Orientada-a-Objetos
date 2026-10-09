package com.mycompany.proyecto.gestion;

import com.mycompany.proyecto.mascotas.Mascota;
import com.mycompany.proyecto.personas.Adoptante;
import com.mycompany.proyecto.personas.PerfilAdopcion;
import com.mycompany.proyecto.procesos.EvaluacionCompatibilidad;

/** Representa la clase ServicioCompatibilidad dentro del sistema Huellitas. */
public class ServicioCompatibilidad extends Servicio {

    public ServicioCompatibilidad(String codigo, String estado) {
        super(codigo, estado);
    }

    public int evaluarEspacio(PerfilAdopcion perfil, Mascota mascota) {
        return 0;
    }

    public int evaluarTiempo(PerfilAdopcion perfil, Mascota mascota) {
        return 0;
    }

    public int evaluarActividad(PerfilAdopcion perfil, Mascota mascota) {
        return 0;
    }

    public int evaluarExperiencia(PerfilAdopcion perfil, Mascota mascota) {
        return 0;
    }

    public int evaluarConvivencia(PerfilAdopcion perfil, Mascota mascota) {
        return 0;
    }

    public EvaluacionCompatibilidad calcularCompatibilidad(Adoptante adoptante, Mascota mascota) {
        return null;
    }
}
