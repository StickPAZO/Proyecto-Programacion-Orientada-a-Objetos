package com.mycompany.proyecto.mascotas;

/** Representa la clase Gato dentro del sistema Huellitas. */
public class Gato extends Mascota {
    private boolean adaptadoInterior;

    public Gato(String codigo, String nombre, int edad, String sexo, String tamanio, String nivelActividad, String espacioRequerido, String nivelCuidado, boolean conviveConMascotas, String estado, String foto, boolean adaptadoInterior) {
        super(codigo, nombre, edad, sexo, tamanio, nivelActividad, espacioRequerido, nivelCuidado, conviveConMascotas, estado, foto);
        this.adaptadoInterior = adaptadoInterior;
    }

    @Override
    public String obtenerTipo() {
        return null;
    }

    @Override
    public void mostrarInformacion() {
    }

    public boolean isAdaptadoInterior() {
        return adaptadoInterior;
    }

    public void setAdaptadoInterior(boolean adaptadoInterior) {
        this.adaptadoInterior = adaptadoInterior;
    }
}
