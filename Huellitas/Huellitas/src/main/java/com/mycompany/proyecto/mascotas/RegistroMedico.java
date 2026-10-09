package com.mycompany.proyecto.mascotas;

import java.time.LocalDate;

/** Representa la clase RegistroMedico dentro del sistema Huellitas. */
public abstract class RegistroMedico extends Registro {
    private String diagnostico;
    private String estadoSalud;

    public RegistroMedico(String codigo, LocalDate fecha, String observacion, String diagnostico, String estadoSalud) {
        super(codigo, fecha, observacion);
        this.diagnostico = diagnostico;
        this.estadoSalud = estadoSalud;
    }

    @Override
    public void mostrarRegistro() {
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }
}
