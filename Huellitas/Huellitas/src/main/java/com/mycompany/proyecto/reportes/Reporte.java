package com.mycompany.proyecto.reportes;

import com.mycompany.proyecto.procesos.Documento;
import java.time.LocalDate;

/** Representa la clase Reporte dentro del sistema Huellitas. */
public abstract class Reporte extends Documento {
    private String tipoReporte;
    private String periodo;

    public Reporte(String codigo, LocalDate fechaEmision, String titulo, String tipoReporte, String periodo) {
        super(codigo, fechaEmision, titulo);
        this.tipoReporte = tipoReporte;
        this.periodo = periodo;
    }

    public void generarReporte() {
    }

    @Override
    public void mostrarDocumento() {
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
