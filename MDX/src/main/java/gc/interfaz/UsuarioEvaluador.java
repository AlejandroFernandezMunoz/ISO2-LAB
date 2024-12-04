package gc.interfaz;

import java.sql.Date;
import java.util.List;

import gc.control.*;
import gc.interfaz.*;
import gc.dominio.*;

abstract class UsuarioEvaluador implements IUsuarioEvaluador {
    private ControlCalidad control;

    public UsuarioEvaluador(ControlCalidad control) {
        this.control = control;
    }

    @Override
    public void realizarMedicion(List<ParametroCalidad> parametros) {
        MedicionCalidad medicion = new MedicionCalidad();
        medicion.setId(((List<ParametroCalidad>) control.getMediciones()).size() + 1);

        medicion.setFecha(new Date(System.currentTimeMillis())); 
        medicion.setParametrosEvaluados(parametros);
        medicion.setResultado((float) Math.random() * 10); 

        control.agregarMedicion(medicion);
        System.out.println("Medición realizada con éxito.");
    }

    @Override
    public List<InformeCalidad> verResultados() {
        return control.getInformes();
    }

    @Override
    public void gestionarParametros() {
        System.out.println("Gestión de parámetros en proceso...");
    }
}
