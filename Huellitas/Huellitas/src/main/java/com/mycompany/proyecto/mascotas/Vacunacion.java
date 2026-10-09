package com.mycompany.proyecto.mascotas;

import java.time.LocalDate;

/** Representa la clase Vacunacion dentro del sistema Huellitas. */
public class Vacunacion extends RegistroMedico {
    private String nombreVacuna;
    private String dosis;
    private LocalDate proximaDosis;

    public Vacunacion(String codigo, LocalDate fecha, String observacion, String diagnostico, String estadoSalud, String nombreVacuna, String dosis, LocalDate proximaDosis) {
        super(codigo, fecha, observacion, diagnostico, estadoSalud);
        this.nombreVacuna = nombreVacuna;
        this.dosis = dosis;
        this.proximaDosis = proximaDosis;
    }

    @Override
    public void mostrarRegistro() {
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public LocalDate getProximaDosis() {
        return proximaDosis;
    }

    public void setProximaDosis(LocalDate proximaDosis) {
        this.proximaDosis = proximaDosis;
    }
}
