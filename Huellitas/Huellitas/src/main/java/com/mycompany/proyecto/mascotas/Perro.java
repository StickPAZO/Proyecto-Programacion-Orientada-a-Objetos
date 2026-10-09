package com.mycompany.proyecto.mascotas;

/** Representa la clase Perro dentro del sistema Huellitas. */
public class Perro extends Mascota {
    private int frecuenciaPaseos;

    public Perro(String codigo, String nombre, int edad, String sexo, String tamanio, String nivelActividad, String espacioRequerido, String nivelCuidado, boolean conviveConMascotas, String estado, String foto, int frecuenciaPaseos) {
        super(codigo, nombre, edad, sexo, tamanio, nivelActividad, espacioRequerido, nivelCuidado, conviveConMascotas, estado, foto);
        this.frecuenciaPaseos = frecuenciaPaseos;
    }

    @Override
    public String obtenerTipo() {
        return null;
    }

    @Override
    public void mostrarInformacion() {
    }

    public int getFrecuenciaPaseos() {
        return frecuenciaPaseos;
    }

    public void setFrecuenciaPaseos(int frecuenciaPaseos) {
        this.frecuenciaPaseos = frecuenciaPaseos;
    }
}
