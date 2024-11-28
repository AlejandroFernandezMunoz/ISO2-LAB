package pd.dominio;

import java.util.Date;
import java.util.List;

public class Tarea {
    private int idTarea;
    private String descripcion;
    private String estado;
    private List<Colaborador> colaboradores;
    private Date fechaCreacion;

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public void setColaboradores(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void asignarColaborador(Colaborador colaborador) {
        this.colaboradores.add(colaborador);
    }

    public void cambiarEstado(String estado) {
        this.estado = estado;
    }
}