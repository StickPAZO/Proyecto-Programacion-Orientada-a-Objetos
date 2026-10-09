package com.mycompany.proyecto.reportes;

import java.time.LocalDate;

/** Representa la clase ReporteAdopciones dentro del sistema Huellitas. */
public class ReporteAdopciones extends Reporte {
    private int totalAdopciones;

    public ReporteAdopciones(String codigo, LocalDate fechaEmision, String titulo, String tipoReporte, String periodo, int totalAdopciones) {
        super(codigo, fechaEmision, titulo, tipoReporte, periodo);
        this.totalAdopciones = totalAdopciones;
    }

    @Override
    public void generarReporte() {
    }

    @Override
    public void mostrarDocumento() {
    }

    public int getTotalAdopciones() {
        return totalAdopciones;
    }

    public void setTotalAdopciones(int totalAdopciones) {
        this.totalAdopciones = totalAdopciones;
    }
}
