package com.mycompany.proyecto.personas;

import java.time.LocalDate;

/** Representa la clase Adoptante dentro del sistema Huellitas. */
public class Adoptante extends Usuario {
    // Composicion: perfil pertenece al ciclo de vida de Adoptante.
    private final PerfilAdopcion perfil;

    public Adoptante(String dni, String nombre, String apellido, String telefono, String correo, String usuario, String contrasena, String estadoCuenta, String codigoPerfil, LocalDate fechaCreacionPerfil, String tipoVivienda, String espacioDisponible, String tiempoDisponible, boolean experienciaPrevia, String nivelActividadPerfil, boolean tieneOtrasMascotas) {
        super(dni, nombre, apellido, telefono, correo, usuario, contrasena, estadoCuenta);
        this.perfil = new PerfilAdopcion(codigoPerfil, fechaCreacionPerfil, tipoVivienda,
                espacioDisponible, tiempoDisponible, experienciaPrevia,
                nivelActividadPerfil, tieneOtrasMascotas);
    }

    @Override
    public void mostrarInformacion() {
    }

    public PerfilAdopcion getPerfil() {
        return perfil;
    }
}
