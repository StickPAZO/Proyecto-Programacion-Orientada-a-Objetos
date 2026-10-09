package com.mycompany.proyecto.personas;

/** Representa la clase Usuario dentro del sistema Huellitas. */
public abstract class Usuario extends Persona {
    private String usuario;
    private String contrasena;
    private String estadoCuenta;

    public Usuario(String dni, String nombre, String apellido, String telefono, String correo, String usuario, String contrasena, String estadoCuenta) {
        super(dni, nombre, apellido, telefono, correo);
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.estadoCuenta = estadoCuenta;
    }

    @Override
    public void mostrarInformacion() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(String estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }
}
