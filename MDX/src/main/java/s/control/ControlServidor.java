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
    private Map<String, List<String>> permisos;
    private ISistemaMDX servidorMDX;


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
    public ControlServidor() {
        this.servidorBaseDatos = new ServidorBaseDatos();
        this.logsSeguridad = new LogsSeguridad();
    }

    @Override
    public boolean autenticarUsuario(String usuario, String contrase�a) {
        boolean autenticado = servidorBaseDatos.verificarUsuario(usuario);
        logsSeguridad.registrarEvento(usuario, "Autenticaci�n", autenticado);
        return autenticado;
    }

    @Override
    public void gestionarPermisos(String usuario, String operacion) {
        boolean permitido = servidorBaseDatos.consultarPermisos(usuario).contains(operacion);
        logsSeguridad.registrarEvento(usuario, "Gesti�n de permisos para operaci�n: " + operacion, permitido);
    }

    public boolean procesarSolicitud(String usuario, String operacion) {
        if (autenticarUsuario(usuario, "dummyPassword")) { // Contrase�a fija para simplificaci�n
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
    public Map<String, List<String>> getPermisos() {
        return permisos;
    }

    public void setPermisos(Map<String, List<String>> permisos) {
        this.permisos = permisos;
    }

    public ISistemaMDX getServidorMDX() {
        return servidorMDX;
    }

    public void setServidorMDX(ISistemaMDX servidorMDX) {
        this.servidorMDX = servidorMDX;
    }

    public boolean autenticarUsuario(String usuario, String contraseña) {
        // Lógica para autenticar al usuario
        return true;
    }

    public boolean validarPermiso(String usuario, String recurso) {
        // Lógica para validar permisos
        return permisos.containsKey(usuario) && permisos.get(usuario).contains(recurso);
    }
}
}

}

