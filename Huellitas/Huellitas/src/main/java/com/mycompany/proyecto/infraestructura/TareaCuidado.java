package com.mycompany.proyecto.infraestructura;

import java.time.LocalDate;

/** Representa la clase TareaCuidado dentro del sistema Huellitas. */
public class TareaCuidado extends Tarea {
    private String tipoCuidado;

    public TareaCuidado(String codigo, String descripcion, LocalDate fecha, String estado, String tipoCuidado) {
        super(codigo, descripcion, fecha, estado);
        this.tipoCuidado = tipoCuidado;
    }

    @Override
    public void mostrarTarea() {
    }

    public String getTipoCuidado() {
        return tipoCuidado;
    }

    public void setTipoCuidado(String tipoCuidado) {
        this.tipoCuidado = tipoCuidado;
    }
}
