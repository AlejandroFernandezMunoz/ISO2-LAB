package s.control;


import java.util.*;

import dominio.*;


public class ControlCalidad {
    private RepositorioMediciones repositorioMediciones;
    private GestorInformes gestorInformes;

    public ControlCalidad() {
        this.repositorioMediciones = new RepositorioMediciones();
        this.gestorInformes = new GestorInformes();
    }

    public MedicionCalidad recolectarMedicion(DatosMedicion datos) {
        MedicionCalidad medicion = new MedicionCalidad();
        medicion.setId(repositorioMediciones.getMediciones().size() + 1);
        medicion.setDatos(datos);
        repositorioMediciones.guardarMedicion(medicion);
        return medicion;
    }

    public EvaluacionCalidad ejecutarEvaluacion(MedicionCalidad medicion) {
        EvaluacionCalidad evaluacion = new EvaluacionCalidad();
        evaluacion.setId(medicion.getId());
        evaluacion.setResultado(medicion.getDatos().getValor() * 1.5); // Ejemplo de cálculo
        System.out.println("Evaluación ejecutada para medición ID: " + medicion.getId());
        return evaluacion;
    }

    public InformeCalidad generarInforme(EvaluacionCalidad evaluacion) {
        return gestorInformes.generarInforme(evaluacion);
    }

    public List<MedicionCalidad> obtenerMedicionesPorProyecto(int proyectoId) {
        return repositorioMediciones.obtenerMedicionesPorProyecto(proyectoId);
    }

    public List<InformeCalidad> obtenerInformesPorProyecto(int proyectoId) {
        // Simular generación basada en las evaluaciones de las mediciones
        List<MedicionCalidad> mediciones = repositorioMediciones.obtenerMedicionesPorProyecto(proyectoId);
        List<InformeCalidad> informes = gestorInformes.getInformes();
        return informes; // Filtrar por proyecto si es necesario
    }

    public RepositorioMediciones getRepositorioMediciones() {
        return repositorioMediciones;
    }

    public void setRepositorioMediciones(RepositorioMediciones repositorioMediciones) {
        this.repositorioMediciones = repositorioMediciones;
    }

    public GestorInformes getGestorInformes() {
        return gestorInformes;
    }

    public void setGestorInformes(GestorInformes gestorInformes) {
        this.gestorInformes = gestorInformes;
    }
}