package com.mycompany.proyecto.gestion;

/** Representa la clase Servicio dentro del sistema Huellitas. */
public abstract class Servicio {
    private String codigo;
    private String estado;

    public Servicio(String codigo, String estado) {
        this.codigo = codigo;
        this.estado = estado;
    }

    public void ejecutarServicio() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
