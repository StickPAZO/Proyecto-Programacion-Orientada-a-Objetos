package com.mycompany.proyecto.personas;

import java.time.LocalDate;

/** Representa la clase Colaborador dentro del sistema Huellitas. */
public abstract class Colaborador extends Persona {
    private String codigoColaborador;
    private LocalDate fechaIngreso;

    public Colaborador(String dni, String nombre, String apellido, String telefono, String correo, String codigoColaborador, LocalDate fechaIngreso) {
        super(dni, nombre, apellido, telefono, correo);
        this.codigoColaborador = codigoColaborador;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public void mostrarInformacion() {
    }

    public String getCodigoColaborador() {
        return codigoColaborador;
    }

    public void setCodigoColaborador(String codigoColaborador) {
        this.codigoColaborador = codigoColaborador;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
