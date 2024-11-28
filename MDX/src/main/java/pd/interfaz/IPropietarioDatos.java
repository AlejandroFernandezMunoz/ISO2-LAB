package pd.interfaz;

import pd.dominio.Proyecto;

import java.util.List;

import pd.dominio.Colaborador;

public interface IPropietarioDatos {
    void configurarProyecto(Proyecto proyecto);
    void agregarColaborador(Colaborador colaborador);
    void gestionarColaboradores(List<Colaborador> colaboradores);
    void asignarCategoria(Proyecto proyecto, String categoria);
    void seleccionarOrigenDatos(String origen);
    void aprobarPropuesta(int propuestaId);
    void finalizarProyecto(Proyecto proyecto);
}