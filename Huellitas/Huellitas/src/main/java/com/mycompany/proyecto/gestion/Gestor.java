package com.mycompany.proyecto.gestion;

/** Representa la clase Gestor dentro del sistema Huellitas. */
public abstract class Gestor {
    private String codigo;
    private String nombre;

    public Gestor(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void mostrarInformacion() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
