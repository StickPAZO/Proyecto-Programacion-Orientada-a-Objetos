package com.mycompany.proyecto.personas;

import java.time.LocalDate;

/** Representa la clase PerfilAdopcion dentro del sistema Huellitas. */
public class PerfilAdopcion extends Perfil {
    private String tipoVivienda;
    private String espacioDisponible;
    private String tiempoDisponible;
    private boolean experienciaPrevia;
    private String nivelActividad;
    private boolean tieneOtrasMascotas;

    public PerfilAdopcion(String codigo, LocalDate fechaCreacion, String tipoVivienda, String espacioDisponible, String tiempoDisponible, boolean experienciaPrevia, String nivelActividad, boolean tieneOtrasMascotas) {
        super(codigo, fechaCreacion);
        this.tipoVivienda = tipoVivienda;
        this.espacioDisponible = espacioDisponible;
        this.tiempoDisponible = tiempoDisponible;
        this.experienciaPrevia = experienciaPrevia;
        this.nivelActividad = nivelActividad;
        this.tieneOtrasMascotas = tieneOtrasMascotas;
    }

    @Override
    public void mostrarPerfil() {
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public String getEspacioDisponible() {
        return espacioDisponible;
    }

    public void setEspacioDisponible(String espacioDisponible) {
        this.espacioDisponible = espacioDisponible;
    }

    public String getTiempoDisponible() {
        return tiempoDisponible;
    }

    public void setTiempoDisponible(String tiempoDisponible) {
        this.tiempoDisponible = tiempoDisponible;
    }

    public boolean isExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(boolean experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    public String getNivelActividad() {
        return nivelActividad;
    }

    public void setNivelActividad(String nivelActividad) {
        this.nivelActividad = nivelActividad;
    }

    public boolean isTieneOtrasMascotas() {
        return tieneOtrasMascotas;
    }

    public void setTieneOtrasMascotas(boolean tieneOtrasMascotas) {
        this.tieneOtrasMascotas = tieneOtrasMascotas;
    }
}
