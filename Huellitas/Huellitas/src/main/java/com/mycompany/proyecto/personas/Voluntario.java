package com.mycompany.proyecto.personas;

import java.time.LocalDate;

/** Representa la clase Voluntario dentro del sistema Huellitas. */
public class Voluntario extends Colaborador {
    private String disponibilidad;

    public Voluntario(String dni, String nombre, String apellido, String telefono, String correo, String codigoColaborador, LocalDate fechaIngreso, String disponibilidad) {
        super(dni, nombre, apellido, telefono, correo, codigoColaborador, fechaIngreso);
        this.disponibilidad = disponibilidad;
    }

    @Override
    public void mostrarInformacion() {
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
