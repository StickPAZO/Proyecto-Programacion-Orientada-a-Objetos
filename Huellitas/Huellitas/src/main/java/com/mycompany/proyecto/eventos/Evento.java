package com.mycompany.proyecto.eventos;

import java.time.LocalDate;

/** Representa la clase Evento dentro del sistema Huellitas. */
public abstract class Evento {
    private String codigo;
    private String nombre;
    private LocalDate fecha;
    private String lugar;
    private String estado;

    public Evento(String codigo, String nombre, LocalDate fecha, String lugar, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.estado = estado;
    }

    public void mostrarEvento() {
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
