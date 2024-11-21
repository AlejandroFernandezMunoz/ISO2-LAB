package s.dominio;

import java.util.List;

public class ConectorOrigen {
    private String origen;
    private boolean conexionActiva;
    private List<String> permisos; // Agregar esta propiedad

    public boolean conectar(String origen) {
        this.origen = origen;
        this.conexionActiva = true;
        return true;
    }

    public boolean desconectar() {
        this.conexionActiva = false;
        return true;
    }

    public List<String> obtenerDatos() {
        if (conexionActiva) {
            return permisos; // Simula datos obtenidos
        } else {
            return null;
        }
    }

    public boolean verificarOrigen(String origen) {
        return this.origen != null && this.origen.equals(origen);
    }

    public String getOrigen() {
        return origen;
    }

    public boolean isConexionActiva() {
        return conexionActiva;
    }

    // Método setPermisos
    public void setPermisos(List<String> permisos) {
        this.permisos = permisos;
    }

    // Getter opcional para permisos
    public List<String> getPermisos() {
        return permisos;
    }
}