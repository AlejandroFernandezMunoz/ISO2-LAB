package s.dominio;

package dominio;

import java.util.ArrayList;
import java.util.List;

public class RepositorioMediciones {
    private List<MedicionCalidad> mediciones;

    public RepositorioMediciones() {
        this.mediciones = new ArrayList<>();
    }

    public List<MedicionCalidad> getMediciones() {
        return mediciones;
    }

    public void setMediciones(List<MedicionCalidad> mediciones) {
        this.mediciones = mediciones;
    }

    public void guardarMedicion(MedicionCalidad medicion) {
        mediciones.add(medicion);
        System.out.println("Medición guardada: " + medicion.getId());
    }

    public MedicionCalidad obtenerMedicion(int id) {
        return mediciones.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
    }

    public List<MedicionCalidad> obtenerMedicionesPorProyecto(int proyectoId) {
        List<MedicionCalidad> resultado = new ArrayList<>();
        for (MedicionCalidad medicion : mediciones) {
            if (medicion.getProyectoId() == proyectoId) {
                resultado.add(medicion);
            }
        }
        return resultado;
    }

    public void eliminarMedicion(int id) {
        mediciones.removeIf(m -> m.getId() == id);
        System.out.println("Medición eliminada con ID: " + id);
    }
