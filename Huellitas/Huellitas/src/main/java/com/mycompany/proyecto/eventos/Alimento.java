package com.mycompany.proyecto.eventos;

import java.time.LocalDate;

/** Representa la clase Alimento dentro del sistema Huellitas. */
public class Alimento extends Insumo {
    private String tipoAlimento;

    public Alimento(String codigo, String nombre, int cantidad, LocalDate fechaVencimiento, String tipoAlimento) {
        super(codigo, nombre, cantidad, fechaVencimiento);
        this.tipoAlimento = tipoAlimento;
    }

    @Override
    public void mostrarInsumo() {
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }
}
