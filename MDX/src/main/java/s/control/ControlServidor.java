package control;

import dominio.ConectorOrigen;
import dominio.ProyectoServidor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControlServidor {
    private Map<String, List<String>> permisos = new HashMap<>();
    private List<ProyectoServidor> proyectos;
    private Map<String, String> clasificaciones = new HashMap<>();

    public void gestionarPermisos(String usuarioId, List<String> permisos) {
        this.permisos.put(usuarioId, permisos);
        System.out.println("Permisos gestionados para el usuario: " + usuarioId);
    }

    public void procesarConfiguracion(ConectorOrigen proyecto) {
        if (proyecto.verificarOrigen(proyecto.getOrigen())) {
            ProyectoServidor proyectoServidor = new ProyectoServidor();
            proyectoServidor.setConfiguracion("Configuración procesada");
            proyectoServidor.setEstado("Activo");
            proyectos.add(proyectoServidor);
            System.out.println("Configuración procesada para el proyecto: " + proyecto.getOrigen());
        } else {
            System.out.println("Error al verificar el origen del proyecto.");
        }
    }

    public boolean validarClasificacion(String proyectoId, String categoria) {
        if (clasificaciones.containsKey(proyectoId) && clasificaciones.get(proyectoId).equals(categoria)) {
            System.out.println("Clasificación validada para el proyecto: " + proyectoId);
            return true;
        }
        System.out.println("Clasificación no válida.");
        return false;
    }

    public void aplicarPermisos(ConectorOrigen proyecto, List<String> permisos) {
        if (proyecto.conectar(proyecto.getOrigen())) {
            proyecto.setPermisos(permisos);
            System.out.println("Permisos aplicados al proyecto: " + proyecto.getOrigen());
        } else {
            System.out.println("Error al conectar al origen de datos.");
        }
    }

    public void cerrarAcceso(String usuarioId) {
        permisos.remove(usuarioId);
        System.out.println("Acceso cerrado para el usuario: " + usuarioId);
    }

}