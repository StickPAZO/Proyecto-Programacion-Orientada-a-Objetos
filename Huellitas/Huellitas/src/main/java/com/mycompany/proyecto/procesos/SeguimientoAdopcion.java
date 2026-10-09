package com.mycompany.proyecto.procesos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/** Representa la clase SeguimientoAdopcion dentro del sistema Huellitas. */
public class SeguimientoAdopcion extends Seguimiento {
    private String estadoAdaptacion;
    private boolean alimentacionNormal;
    private boolean problemasComportamiento;
    // Composicion: visitas pertenece al ciclo de vida de SeguimientoAdopcion.
    private final List<VisitaPostAdopcion> visitas;

    public SeguimientoAdopcion(String codigo, LocalDate fechaInicio, String estado, String observaciones, String estadoAdaptacion, boolean alimentacionNormal, boolean problemasComportamiento) {
        super(codigo, fechaInicio, estado, observaciones);
        this.estadoAdaptacion = estadoAdaptacion;
        this.alimentacionNormal = alimentacionNormal;
        this.problemasComportamiento = problemasComportamiento;
        this.visitas = new ArrayList<>();
    }

    public void agregarVisita(VisitaPostAdopcion visita) {
    }

    @Override
    public void mostrarSeguimiento() {
    }

    public String getEstadoAdaptacion() {
        return estadoAdaptacion;
    }

    public void setEstadoAdaptacion(String estadoAdaptacion) {
        this.estadoAdaptacion = estadoAdaptacion;
    }

    public boolean isAlimentacionNormal() {
        return alimentacionNormal;
    }

    public void setAlimentacionNormal(boolean alimentacionNormal) {
        this.alimentacionNormal = alimentacionNormal;
    }

    public boolean isProblemasComportamiento() {
        return problemasComportamiento;
    }

    public void setProblemasComportamiento(boolean problemasComportamiento) {
        this.problemasComportamiento = problemasComportamiento;
    }

    public List<VisitaPostAdopcion> getVisitas() {
        return visitas;
    }
}
