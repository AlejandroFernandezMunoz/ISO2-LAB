package pd.dominio;

import java.util.List;
import java.util.Map;

public class ServicioPermisos {
    private Map<String, List<String>> roles;
    private List<String> recursos;

    public void asignarPermisos(String rol, String recurso, String accion) {
        // Implementar la lógica para asignar permisos
    }

    public void eliminarPermisos(String rol, String recurso, String accion) {
        // Implementar la lógica para eliminar permisos
    }

    public boolean verificarPermisos(String rol, String recurso, String accion) {
        // Implementar la lógica para verificar permisos
        return false;
    }

    public Map<String, List<String>> getPermisos() {
        return roles;
    }

    public void setPermisos(Map<String, List<String>> permisos) {
        this.roles = permisos;
    }

    public List<String> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<String> recursos) {
        this.recursos = recursos;
    }
}