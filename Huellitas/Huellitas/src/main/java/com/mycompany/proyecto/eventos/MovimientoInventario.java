package com.mycompany.proyecto.eventos;

import java.time.LocalDate;

/** Representa la clase MovimientoInventario dentro del sistema Huellitas. */
public abstract class MovimientoInventario {
    private String codigo;
    private LocalDate fecha;
    private int cantidad;
    private Insumo insumo;

    public MovimientoInventario(String codigo, LocalDate fecha, int cantidad, Insumo insumo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.insumo = insumo;
    }

    public void mostrarMovimiento() {
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }
}
