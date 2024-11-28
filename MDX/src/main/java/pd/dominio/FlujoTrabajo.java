package pd.dominio;

import java.util.ArrayList;
import java.util.List;

public class FlujoTrabajo {
    private List<String> etapas; // Cambiado de EspacioTarea a String
    private String estado;
    private Proyecto proyecto;

    public FlujoTrabajo() {
        this.etapas = new ArrayList<>(); // Inicializar la lista para evitar null
    }

    // Métodos getters y setters
    public List<String> getEtapas() {
        return etapas;
    }

    public void setEtapas(List<String> etapas) {
        this.etapas = etapas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    // Método para agregar una etapa (como String)
    public void agregarEtapa(String etapa) {
        this.etapas.add(etapa);
    }

    // Método para cambiar el estado del flujo de trabajo
    public void cambiarEstado(String estado) {
        this.estado = estado;
    }
}