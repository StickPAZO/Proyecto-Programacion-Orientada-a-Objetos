package com.mycompany.proyecto.eventos;

import java.time.LocalDate;

/** Representa la clase DonacionInsumo dentro del sistema Huellitas. */
public class DonacionInsumo extends Donacion {
    private int cantidad;
    private Insumo insumo;

    public DonacionInsumo(String codigo, LocalDate fecha, String descripcion, int cantidad, Insumo insumo) {
        super(codigo, fecha, descripcion);
        this.cantidad = cantidad;
        this.insumo = insumo;
    }

    @Override
    public void mostrarDonacion() {
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
