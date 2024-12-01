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
    private ServidorBaseDatos servidorBaseDatos;
    private LogsSeguridad logsSeguridad;


    public void gestionarPermisos(String usuarioId, List<String> permisos) {
        this.permisos.put(usuarioId, permisos);
        System.out.println("Permisos gestionados para el usuario: " + usuarioId);
    }

    public void procesarConfiguracion(ConectorOrigen proyecto) {
        if (proyecto.verificarOrigen(proyecto.getOrigen())) {
            ProyectoServidor proyectoServidor = new ProyectoServidor();
            proyectoServidor.setConfiguracion("Configuraci贸n procesada");
            proyectoServidor.setEstado("Activo");
            proyectos.add(proyectoServidor);
            System.out.println("Configuraci贸n procesada para el proyecto: " + proyecto.getOrigen());
        } else {
            System.out.println("Error al verificar el origen del proyecto.");
        }
    }

    public boolean validarClasificacion(String proyectoId, String categoria) {
        if (clasificaciones.containsKey(proyectoId) && clasificaciones.get(proyectoId).equals(categoria)) {
            System.out.println("Clasificaci贸n validada para el proyecto: " + proyectoId);
            return true;
        }
        System.out.println("Clasificaci贸n no v谩lida.");
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
    public ControlServidor() {
        this.servidorBaseDatos = new ServidorBaseDatos();
        this.logsSeguridad = new LogsSeguridad();
    }

    @Override
    public boolean autenticarUsuario(String usuario, String contrase馻) {
        boolean autenticado = servidorBaseDatos.verificarUsuario(usuario);
        logsSeguridad.registrarEvento(usuario, "Autenticaci髇", autenticado);
        return autenticado;
    }

    @Override
    public void gestionarPermisos(String usuario, String operacion) {
        boolean permitido = servidorBaseDatos.consultarPermisos(usuario).contains(operacion);
        logsSeguridad.registrarEvento(usuario, "Gesti髇 de permisos para operaci髇: " + operacion, permitido);
    }

    public boolean procesarSolicitud(String usuario, String operacion) {
        if (autenticarUsuario(usuario, "dummyPassword")) { // Contrase馻 fija para simplificaci髇
            gestionarPermisos(usuario, operacion);
            return true;
        }
        return false;
    }

    public ServidorBaseDatos getServidorBaseDatos() {
        return servidorBaseDatos;
    }

    public void setServidorBaseDatos(ServidorBaseDatos servidorBaseDatos) {
        this.servidorBaseDatos = servidorBaseDatos;
    }

    public LogsSeguridad getLogsSeguridad() {
        return logsSeguridad;
    }

    public void setLogsSeguridad(LogsSeguridad logsSeguridad) {
        this.logsSeguridad = logsSeguridad;
    }
}

}