package com.mycompany.proyecto.procesos;

import java.time.LocalDate;

/** Representa la clase Rescate dentro del sistema Huellitas. */
public class Rescate extends Proceso {
    private String lugarRescate;
    private String condicionInicial;

    public Rescate(String codigo, LocalDate fechaInicio, String estado, String observaciones, String lugarRescate, String condicionInicial) {
        super(codigo, fechaInicio, estado, observaciones);
        this.lugarRescate = lugarRescate;
        this.condicionInicial = condicionInicial;
    }

    @Override
    public void mostrarProceso() {
    }

    public String getLugarRescate() {
        return lugarRescate;
    }

    public void setLugarRescate(String lugarRescate) {
        this.lugarRescate = lugarRescate;
    }

    public String getCondicionInicial() {
        return condicionInicial;
    }

    public void setCondicionInicial(String condicionInicial) {
        this.condicionInicial = condicionInicial;
    }
}
