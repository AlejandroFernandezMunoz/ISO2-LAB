package Control_ID;

import Interfaz_ID.IRepositorio;
import Interfaz_ID.IServidor;
import Dominio_ID.InformeCalidad;

import java.util.List;

public class ControlAnalisis {
    private IRepositorio repositorio;
    private IServidor servidor;
    private List<String> proyectos;

    public void configurarProyecto(String nombre, List<String> datos) {
        // Lógica para configurar el proyecto
    }

    public InformeCalidad analizarDatos(String nombreProyecto) {
        // Lógica para analizar los datos de un proyecto
        return repositorio.solicitarInformeCalidad(nombreProyecto);
    }

    public InformeCalidad obtenerInforme(String nombreProyecto) {
        return repositorio.solicitarInformeCalidad(nombreProyecto);
    }

    public IRepositorio getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(IRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public IServidor getServidor() {
        return servidor;
    }

    public void setServidor(IServidor servidor) {
        this.servidor = servidor;
    }

    public List<String> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<String> proyectos) {
        this.proyectos = proyectos;
    }
}