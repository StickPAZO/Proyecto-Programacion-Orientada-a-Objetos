package com.mycompany.proyecto.personas;

/** Representa la clase Administrador dentro del sistema Huellitas. */
public class Administrador extends Usuario {
    private String codigoAdministrador;

    public Administrador(String dni, String nombre, String apellido, String telefono, String correo, String usuario, String contrasena, String estadoCuenta, String codigoAdministrador) {
        super(dni, nombre, apellido, telefono, correo, usuario, contrasena, estadoCuenta);
        this.codigoAdministrador = codigoAdministrador;
    }

    @Override
    public void mostrarInformacion() {
    }

    public String getCodigoAdministrador() {
        return codigoAdministrador;
    }

    public void setCodigoAdministrador(String codigoAdministrador) {
        this.codigoAdministrador = codigoAdministrador;
    }
}
