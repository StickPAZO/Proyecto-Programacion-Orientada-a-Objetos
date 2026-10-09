package com.mycompany.proyecto.mascotas;

import java.util.ArrayList;
import java.util.List;

/** Representa la clase Mascota dentro del sistema Huellitas. */
public abstract class Mascota {
    private String codigo;
    private String nombre;
    private int edad;
    private String sexo;
    private String tamanio;
    private String nivelActividad;
    private String espacioRequerido;
    private String nivelCuidado;
    private boolean conviveConMascotas;
    private String estado;
    private String foto;
    // Composicion: historialMedico pertenece al ciclo de vida de Mascota.
    private final List<RegistroMedico> historialMedico;

    public Mascota(String codigo, String nombre, int edad, String sexo, String tamanio, String nivelActividad, String espacioRequerido, String nivelCuidado, boolean conviveConMascotas, String estado, String foto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.tamanio = tamanio;
        this.nivelActividad = nivelActividad;
        this.espacioRequerido = espacioRequerido;
        this.nivelCuidado = nivelCuidado;
        this.conviveConMascotas = conviveConMascotas;
        this.estado = estado;
        this.foto = foto;
        this.historialMedico = new ArrayList<>();
    }

    public String obtenerTipo() {
        return null;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getNivelActividad() {
        return nivelActividad;
    }

    public void setNivelActividad(String nivelActividad) {
        this.nivelActividad = nivelActividad;
    }

    public String getEspacioRequerido() {
        return espacioRequerido;
    }

    public void setEspacioRequerido(String espacioRequerido) {
        this.espacioRequerido = espacioRequerido;
    }

    public String getNivelCuidado() {
        return nivelCuidado;
    }

    public void setNivelCuidado(String nivelCuidado) {
        this.nivelCuidado = nivelCuidado;
    }

    public boolean isConviveConMascotas() {
        return conviveConMascotas;
    }

    public void setConviveConMascotas(boolean conviveConMascotas) {
        this.conviveConMascotas = conviveConMascotas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<RegistroMedico> getHistorialMedico() {
        return historialMedico;
    }
}
