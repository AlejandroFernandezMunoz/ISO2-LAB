package Dominio_ID;

import java.util.List;
import java.util.Map;

public class AnalizadorInformes {
    private Map<String, InformeCalidad> resultados;

    public void procesarInforme(List<String> datos) {
        // Lógica para procesar los datos y generar informes
    }

    public InformeCalidad obtenerResultados(String nombreProyecto) {
        return resultados.get(nombreProyecto);
    }

    public Map<String, InformeCalidad> getResultados() {
        return resultados;
    }

    public void setResultados(Map<String, InformeCalidad> resultados) {
        this.resultados = resultados;
    }
}