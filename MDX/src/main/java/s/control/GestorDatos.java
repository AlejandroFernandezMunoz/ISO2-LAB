package control;

import java.util.Queue;

import dominio.Datos;
import dominio.RepositorioDatos;

public class GestorDatos {
    private RepositorioDatos repositorioDatos;
    private Queue<Tarea> tareasPendientes;

    public RepositorioDatos getRepositorioDatos() {
        return repositorioDatos;
    }

    public void setRepositorioDatos(RepositorioDatos repositorioDatos) {
        this.repositorioDatos = repositorioDatos;
    }

    public Queue<Tarea> getTareasPendientes() {
        return tareasPendientes;
    }

    public void setTareasPendientes(Queue<Tarea> tareasPendientes) {
        this.tareasPendientes = tareasPendientes;
    }

    public InformeAnalisis analizarDatos(Datos datos) {
        // L�gica para analizar los datos
        return new InformeAnalisis();
    }

    public Datos transformarDatos(Datos datos) {
        // L�gica para transformar los datos
        return datos;
    }

    public boolean prepararDatos(Datos datos) {
        // L�gica para preparar los datos
        return true;
    }
}