package com.mycompany.proyecto.eventos;

import java.time.LocalDate;

/** Representa la clase EntradaInventario dentro del sistema Huellitas. */
public class EntradaInventario extends MovimientoInventario {
    private String procedencia;

    public EntradaInventario(String codigo, LocalDate fecha, int cantidad, Insumo insumo, String procedencia) {
        super(codigo, fecha, cantidad, insumo);
        this.procedencia = procedencia;
    }

    @Override
    public void mostrarMovimiento() {
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
}
