package com.mycompany.proyecto.gestion;

/** Representa la clase Catalogo dentro del sistema Huellitas. */
public abstract class Catalogo {
    private String codigo;
    private String nombre;

    public Catalogo(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void listarElementos() {
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
