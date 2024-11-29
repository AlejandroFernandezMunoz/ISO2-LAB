package pd.control;

import Dominio_GS.ServicioPermisos;
import Interfaz_GS.IServidor;
import java.util.Map;

public class ControlPermisos {
    private IServidor servidor;
    private ServicioPermisos permisos;

    public void gestionarPermisos(String usuario, String recurso, String accion) {
        // Lógica para gestionar permisos del usuario
    }

    public boolean validarPermisos(String usuario, String recurso, String accion) {
        // Lógica para validar permisos
        return permisos.verificarPermisos(usuario, recurso, accion);
    }

    public void registrarAccion(String usuario, String recurso, String accion) {
        // Lógica para registrar acciones realizadas por el usuario
    }

    public IServidor getServidor() {
        return servidor;
    }

    public void setServidor(IServidor servidor) {
        this.servidor = servidor;
    }

    public ServicioPermisos getPermisos() {
        return permisos;
    }

    public void setPermisos(ServicioPermisos permisos) {
        this.permisos = permisos;
    }
}