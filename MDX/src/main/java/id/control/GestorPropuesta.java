package dominio;

import java.util.ArrayList;
import java.util.List;

public class GestorPropuesta {
    private RepositorioPropuestas repositorioPropuestas;
    private List<Propuesta> propuestasPendientes;

    public GestorPropuesta(RepositorioPropuestas repositorioPropuestas) {
        this.repositorioPropuestas = repositorioPropuestas;
        this.propuestasPendientes = new ArrayList<>();
    }

    public int guardarPropuesta(Datos datos, Metadatos metadatos) {
        Propuesta propuesta = new Propuesta(datos, metadatos);
        repositorioPropuestas.almacenarPropuesta(propuesta);
        return propuesta.getId();
    }

    public boolean aprobarPropuesta(int idPropuesta) {
        // Implementación para aprobar propuestas
        return true;
    }

    public boolean rechazarPropuesta(int idPropuesta) {
        // Implementación para rechazar propuestas
        return false;
    }

    public String consultarEstadoPropuesta(int idPropuesta) {
        Propuesta propuesta = repositorioPropuestas.obtenerPropuesta(idPropuesta);
        return propuesta != null ? propuesta.getEstado() : "Propuesta no encontrada";
    }

    public List<Propuesta> getPropuestasPendientes() {
        return propuestasPendientes;
    }

    public void setPropuestasPendientes(List<Propuesta> propuestasPendientes) {
        this.propuestasPendientes = propuestasPendientes;
    }
}