package com.mycompany.proyecto.mascotas;

import java.time.LocalDate;

/** Representa la clase ConsultaVeterinaria dentro del sistema Huellitas. */
public class ConsultaVeterinaria extends ProcedimientoVeterinario {
    private String motivoConsulta;
    private String recomendacion;

    public ConsultaVeterinaria(String codigo, LocalDate fecha, String descripcion, String resultado, String motivoConsulta, String recomendacion) {
        super(codigo, fecha, descripcion, resultado);
        this.motivoConsulta = motivoConsulta;
        this.recomendacion = recomendacion;
    }

    @Override
    public void mostrarProcedimiento() {
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }
}
