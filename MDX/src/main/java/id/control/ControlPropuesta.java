package control;

import dominio.GestorPropuesta;
import dominio.Datos;
import dominio.Metadatos;

public class ControlPropuesta {
    private GestorPropuesta gestorPropuesta;

    public ControlPropuesta(GestorPropuesta gestorPropuesta) {
        this.gestorPropuesta = gestorPropuesta;
    }

    public boolean validarPropuesta(Datos datos, Metadatos metadatos) {
        // Implementación para validar propuestas
        return true;
    }

    public void enviarPropuesta(Datos datos, Metadatos metadatos) {
        gestorPropuesta.guardarPropuesta(datos, metadatos);
    }

    public String consultarEstadoPropuesta(int idPropuesta) {
        return gestorPropuesta.consultarEstadoPropuesta(idPropuesta);
    }

    public GestorPropuesta getGestorPropuesta() {
        return gestorPropuesta;
    }

    public void setGestorPropuesta(GestorPropuesta gestorPropuesta) {
        this.gestorPropuesta = gestorPropuesta;
    }
}