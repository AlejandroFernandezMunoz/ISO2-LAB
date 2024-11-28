package pd.control;

import java.util.ArrayList;
import java.util.List;
import pd.dominio.Tarea;
import pd.dominio.FlujoTrabajo;
import pd.dominio.Colaborador;

public class ControlTareas {

    private List<Tarea> tareas = new ArrayList<>();
    private FlujoTrabajo flujoTrabajo;

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public FlujoTrabajo getFlujoTrabajo() {
        return flujoTrabajo;
    }

    public void setFlujoTrabajo(FlujoTrabajo flujoTrabajo) {
        this.flujoTrabajo = flujoTrabajo;
    }

    public void asignarTarea(Tarea tarea, Colaborador colaborador) {
        tarea.asignarColaborador(colaborador);
        tareas.add(tarea);
        System.out.println("Tarea asignada a colaborador: " + colaborador.getNombre());
    }

    public void finalizarTarea(Tarea tarea) {
        tarea.cambiarEstado("Finalizado");
        System.out.println("Tarea finalizada: " + tarea.getDescripcion());
    }

    public void actualizarFlujoTrabajo(Tarea tarea) {
        flujoTrabajo.cambiarEstado("Actualizado");
        System.out.println("Flujo de trabajo actualizado con tarea: " + tarea.getDescripcion());
    }
}
