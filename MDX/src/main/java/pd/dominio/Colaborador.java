package pd.dominio;

import java.util.ArrayList;
import java.util.List;

public class Colaborador {
    private String nombre;
    private String rol;
    private List<String> permisos;

    public Colaborador() {
        this.permisos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<String> getPermisos() {
        return permisos;
    }

    public void agregarPermiso(String permiso) {
        this.permisos.add(permiso);
    }

    public void eliminarPermiso(String permiso) {
        this.permisos.remove(permiso);
    }
}