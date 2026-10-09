package com.mycompany.proyecto.personas;

import com.mycompany.proyecto.infraestructura.EspacioRefugio;
import java.util.List;

/** Representa la clase RefugioPrivado dentro del sistema Huellitas. */
public class RefugioPrivado extends Refugio {
    private String organizacionResponsable;

    public RefugioPrivado(String codigo, String nombre, String direccion, String telefono, String correo, String codigoCatalogo, String nombreCatalogo, List<EspacioRefugio> espacios, List<Colaborador> colaboradores, String organizacionResponsable) {
        super(codigo, nombre, direccion, telefono, correo, codigoCatalogo, nombreCatalogo, espacios, colaboradores);
        this.organizacionResponsable = organizacionResponsable;
    }

    @Override
    public void mostrarInformacion() {
    }

    public String getOrganizacionResponsable() {
        return organizacionResponsable;
    }

    public void setOrganizacionResponsable(String organizacionResponsable) {
        this.organizacionResponsable = organizacionResponsable;
    }
}
