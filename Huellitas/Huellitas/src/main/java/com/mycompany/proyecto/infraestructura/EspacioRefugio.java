package com.mycompany.proyecto.infraestructura;

/** Representa la clase EspacioRefugio dentro del sistema Huellitas. */
public abstract class EspacioRefugio {
    private String codigo;
    private String nombre;
    private int capacidad;
    private String estado;

    public EspacioRefugio(String codigo, String nombre, int capacidad, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public void mostrarEspacio() {
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
