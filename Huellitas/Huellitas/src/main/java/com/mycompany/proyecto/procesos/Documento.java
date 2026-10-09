package com.mycompany.proyecto.procesos;

import java.time.LocalDate;

/** Representa la clase Documento dentro del sistema Huellitas. */
public abstract class Documento {
    private String codigo;
    private LocalDate fechaEmision;
    private String titulo;

    public Documento(String codigo, LocalDate fechaEmision, String titulo) {
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.titulo = titulo;
    }

    public void mostrarDocumento() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
