package pd.control;

import java.util.List;
import java.util.Map;

import pd.dominio.Colaborador;
import pd.dominio.Proyecto;

public class ControlProyectos {
    private List<Proyecto> proyectos;
    private Map<Proyecto, List<Colaborador>> colaboradores;
    private Map<Proyecto, String> categorias;
    private Map<Proyecto, String> origenes;

    public void iniciarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
        System.out.println("Proyecto iniciado: " + proyecto.getNombre());
    }

    public void actualizarProyecto(Proyecto proyecto) {
        // Lógica para actualizar un proyecto
        System.out.println("Proyecto actualizado: " + proyecto.getNombre());
    }

    public void gestionarColaborador(Proyecto proyecto, Colaborador colaborador) {
        if (!colaboradores.containsKey(proyecto)) {
            colaboradores.put(proyecto, List.of());
        }
        colaboradores.get(proyecto).add(colaborador);
        System.out.println("Colaborador agregado al proyecto: " + proyecto.getNombre());
    }

    public void asignarCategoria(Proyecto proyecto, String categoria) {
        categorias.put(proyecto, categoria);
        System.out.println("Categoría asignada al proyecto: " + proyecto.getNombre());
    }

    public void seleccionarOrigen(Proyecto proyecto, String origen) {
        origenes.put(proyecto, origen);
        System.out.println("Origen seleccionado para el proyecto: " + proyecto.getNombre());
    }

    public void cerrarProyecto(Proyecto proyecto) {
        proyectos.remove(proyecto);
        System.out.println("Proyecto cerrado: " + proyecto.getNombre());
    }
}