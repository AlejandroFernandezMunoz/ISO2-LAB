package pd.dominio;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private String categoria;
    private String estado;
    private List<Colaborador> colaboradores = new ArrayList<>();

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void agregarColaborador(Colaborador colaborador) {
        this.colaboradores.add(colaborador);
    }

    public void eliminarColaborador(Colaborador colaborador) {
        this.colaboradores.remove(colaborador);
    }
}