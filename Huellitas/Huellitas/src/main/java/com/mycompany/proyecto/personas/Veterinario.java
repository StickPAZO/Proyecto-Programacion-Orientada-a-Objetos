package com.mycompany.proyecto.personas;

import java.time.LocalDate;

/** Representa la clase Veterinario dentro del sistema Huellitas. */
public class Veterinario extends Colaborador {
    private String numeroColegiatura;
    private String especialidad;

    public Veterinario(String dni, String nombre, String apellido, String telefono, String correo, String codigoColaborador, LocalDate fechaIngreso, String numeroColegiatura, String especialidad) {
        super(dni, nombre, apellido, telefono, correo, codigoColaborador, fechaIngreso);
        this.numeroColegiatura = numeroColegiatura;
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion() {
    }

    public String getNumeroColegiatura() {
        return numeroColegiatura;
    }

    public void setNumeroColegiatura(String numeroColegiatura) {
        this.numeroColegiatura = numeroColegiatura;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
