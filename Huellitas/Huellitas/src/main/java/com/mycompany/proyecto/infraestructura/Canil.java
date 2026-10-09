package com.mycompany.proyecto.infraestructura;

/** Representa la clase Canil dentro del sistema Huellitas. */
public class Canil extends EspacioRefugio {
    private int cantidadPerros;

    public Canil(String codigo, String nombre, int capacidad, String estado, int cantidadPerros) {
        super(codigo, nombre, capacidad, estado);
        this.cantidadPerros = cantidadPerros;
    }

    @Override
    public void mostrarEspacio() {
    }

    public int getCantidadPerros() {
        return cantidadPerros;
    }

    public void setCantidadPerros(int cantidadPerros) {
        this.cantidadPerros = cantidadPerros;
    }
}
