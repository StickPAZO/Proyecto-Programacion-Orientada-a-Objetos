package com.mycompany.proyecto.personas;

import com.mycompany.proyecto.gestion.CatalogoMascotas;
import com.mycompany.proyecto.infraestructura.EspacioRefugio;
import java.util.List;

/** Representa la clase Refugio dentro del sistema Huellitas. */
public abstract class Refugio {
    private String codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    // Composicion: catalogoMascotas pertenece al ciclo de vida de Refugio.
    private final CatalogoMascotas catalogoMascotas;
    // Agregacion: espacios puede existir independientemente de Refugio.
    private List<EspacioRefugio> espacios;
    // Agregacion: colaboradores puede existir independientemente de Refugio.
    private List<Colaborador> colaboradores;

    public Refugio(String codigo, String nombre, String direccion, String telefono, String correo, String codigoCatalogo, String nombreCatalogo, List<EspacioRefugio> espacios, List<Colaborador> colaboradores) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.catalogoMascotas = new CatalogoMascotas(codigoCatalogo, nombreCatalogo, new java.util.ArrayList<>());
        this.espacios = espacios;
        this.colaboradores = colaboradores;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public CatalogoMascotas getCatalogoMascotas() {
        return catalogoMascotas;
    }

    public List<EspacioRefugio> getEspacios() {
        return espacios;
    }

    public void setEspacios(List<EspacioRefugio> espacios) {
        this.espacios = espacios;
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }
}
