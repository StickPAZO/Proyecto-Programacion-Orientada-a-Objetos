package com.mycompany.proyecto.procesos;

import java.time.LocalDate;

/** Representa la clase Evaluacion dentro del sistema Huellitas. */
public abstract class Evaluacion {
    private String codigo;
    private LocalDate fecha;
    private String resultado;
    private String observaciones;

    public Evaluacion(String codigo, LocalDate fecha, String resultado, String observaciones) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.resultado = resultado;
        this.observaciones = observaciones;
    }

    public void mostrarResultado() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
