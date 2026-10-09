package com.mycompany.proyecto.procesos;

import com.mycompany.proyecto.mascotas.Mascota;
import com.mycompany.proyecto.personas.Adoptante;
import java.time.LocalDate;

/** Representa la clase EvaluacionCompatibilidad dentro del sistema Huellitas. */
public class EvaluacionCompatibilidad extends Evaluacion {
    private Adoptante adoptante;
    private Mascota mascota;
    private double porcentaje;
    private String nivel;

    public EvaluacionCompatibilidad(String codigo, LocalDate fecha, String resultado, String observaciones, Adoptante adoptante, Mascota mascota, double porcentaje, String nivel) {
        super(codigo, fecha, resultado, observaciones);
        this.adoptante = adoptante;
        this.mascota = mascota;
        this.porcentaje = porcentaje;
        this.nivel = nivel;
    }

    @Override
    public void mostrarResultado() {
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

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
