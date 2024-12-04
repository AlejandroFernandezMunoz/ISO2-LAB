package gc.interfaz;

import gc.control.*;
import gc.dominio.*;
import java.util.List;
import java.util.Optional;

abstract class MedicionCalidadImpl implements IMedicionCalidad {
    private ControlCalidad control;

    public MedicionCalidadImpl(ControlCalidad control) {
        this.control = control;
    }

    @Override
    public void procesarMedicion(MedicionCalidad medicion) {
        System.out.println("Procesando medición ID: " + medicion.getId());
    }

    @Override
    public void guardarMedicion(MedicionCalidad medicion) {
        control.agregarMedicion(medicion);
        System.out.println("Medición guardada.");
    }

    @Override
    public MedicionCalidad obtenerMedicion(int id) {
       
        List<MedicionCalidad> mediciones = (List<MedicionCalidad>) control.getMediciones();
        Optional<MedicionCalidad> resultado = mediciones.stream()
                .filter(m -> m.getId() == id)
                .findFirst();
        return resultado.orElse(null); 
    }
}
