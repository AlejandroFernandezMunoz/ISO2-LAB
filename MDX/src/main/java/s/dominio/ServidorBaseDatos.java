package s.dominio;
import java.util.*;

public class ServidorBaseDatos {
    private Map<String, List<String>> permisosUsuarios;
    private List<String> usuarios;

    public ServidorBaseDatos() {
        permisosUsuarios = new HashMap<>();
        usuarios = new ArrayList<>();
    }

    public List<String> consultarPermisos(String usuario) {
        return permisosUsuarios.getOrDefault(usuario, new ArrayList<>());
    }

    public void actualizarPermisos(String usuario, List<String> permisos) {
        permisosUsuarios.put(usuario, permisos);
    }

    public boolean verificarUsuario(String usuario) {
        return usuarios.contains(usuario);
    }

    public Map<String, List<String>> getPermisosUsuarios() {
        return permisosUsuarios;
    }

    public void setPermisosUsuarios(Map<String, List<String>> permisosUsuarios) {
        this.permisosUsuarios = permisosUsuarios;
    }

    public List<String> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<String> usuarios) {
        this.usuarios = usuarios;
    }
}