package s.control;

import java.util.ArrayList;
import java.util.List;

public class GestorInformes {
    private List<InformeCalidad> informes;

    public GestorInformes() {
        this.informes = new ArrayList<>();
    }

    public InformeCalidad generarInforme(EvaluacionCalidad evaluacion) {
        InformeCalidad informe = new InformeCalidad();
        informe.setId(informes.size() + 1);
        informe.setEvaluacion(evaluacion);
        informe.setContenido("Informe generado para la evaluación ID: " + evaluacion.getId());
        informes.add(informe);
        System.out.println("Informe generado con ID: " + informe.getId());
        return informe;
    }

    public File exportarInforme(int idInforme, String formato) {
        InformeCalidad informe = obtenerInforme(idInforme);
        if (informe == null) {
            System.out.println("No se encontró el informe con ID: " + idInforme);
            return null;
        }
        // Simular la exportación en un archivo
        File archivo = new File("informe_" + idInforme + "." + formato);
        System.out.println("Informe exportado como: " + archivo.getName());
        return archivo;
    }

    public InformeCalidad obtenerInforme(int idInforme) {
        return informes.stream().filter(i -> i.getId() == idInforme).findFirst().orElse(null);
    }

    public void eliminarInforme(int idInforme) {
        informes.removeIf(i -> i.getId() == idInforme);
        System.out.println("Informe eliminado con ID: " + idInforme);
    }

    public List<InformeCalidad> getInformes() {
        return informes;
    }

    public void setInformes(List<InformeCalidad> informes) {
        this.informes = informes;
    }
}