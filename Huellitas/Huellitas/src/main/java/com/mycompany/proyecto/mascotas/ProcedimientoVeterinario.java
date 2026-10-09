package com.mycompany.proyecto.mascotas;

import java.time.LocalDate;

/** Representa la clase ProcedimientoVeterinario dentro del sistema Huellitas. */
public abstract class ProcedimientoVeterinario {
    private String codigo;
    private LocalDate fecha;
    private String descripcion;
    private String resultado;

    public ProcedimientoVeterinario(String codigo, LocalDate fecha, String descripcion, String resultado) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.resultado = resultado;
    }

    public void mostrarProcedimiento() {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
