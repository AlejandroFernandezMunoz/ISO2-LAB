package s.control;

public class ConectorOrigen {
    private String origen;
    private boolean conexionActiva;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isConexionActiva() {
        return conexionActiva;
    }

    public void setConexionActiva(boolean conexionActiva) {
        this.conexionActiva = conexionActiva;
    }

    public boolean verificarOrigen(String origen) {
        // Lógica para verificar el origen
        return this.origen.equals(origen);
    }
}