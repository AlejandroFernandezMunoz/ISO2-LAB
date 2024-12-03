package Dominio_ID;

import java.util.List;
import java.util.Map;

public class RepositorioDatos {
    private List<String> datosDisponibles;
    private Map<String, InformeCalidad> informes;

    public List<String> descubrirDatos() {
        return datosDisponibles;
    }

    public InformeCalidad solicitarInformeCalidad(String datos) {
        return informes.get(datos);
    }

    public List<String> getDatosDisponibles() {
        return datosDisponibles;
    }

    public void setDatosDisponibles(List<String> datosDisponibles) {
        this.datosDisponibles = datosDisponibles;
    }

    public Map<String, InformeCalidad> getInformes() {
        return informes;
    }

    public void setInformes(Map<String, InformeCalidad> informes) {
        this.informes = informes;
    }
}