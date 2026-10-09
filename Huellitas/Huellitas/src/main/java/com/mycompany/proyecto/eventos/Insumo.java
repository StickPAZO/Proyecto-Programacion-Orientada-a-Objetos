package com.mycompany.proyecto.eventos;

import java.time.LocalDate;

/** Representa la clase Insumo dentro del sistema Huellitas. */
public abstract class Insumo {
    private String codigo;
    private String nombre;
    private int cantidad;
    private LocalDate fechaVencimiento;

    public Insumo(String codigo, String nombre, int cantidad, LocalDate fechaVencimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void mostrarInsumo() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
