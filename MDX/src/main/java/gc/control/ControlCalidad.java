package gc.control;

import java.util.ArrayList;
import java.util.List;

import gc.dominio.*;

//Clase ControlCalidad
public class ControlCalidad {
 private List<MedicionCalidad> mediciones;
 private List<InformeCalidad> informes;
 private List<ParametroCalidad> parametros;
 private List<Proyecto> proyectos;

 public ControlCalidad() {
     mediciones = new ArrayList<>();
     informes = new ArrayList<>();
     parametros = new ArrayList<>();
     proyectos = new ArrayList<>();
 }

 public void iniciarEvaluacion(Proyecto proyecto) {
     System.out.println("Iniciando evaluación para el proyecto: " + proyecto.getNombre());
     proyecto.setEstado("En evaluación");
 }

 public InformeCalidad generarInforme(MedicionCalidad medicion) {
     InformeCalidad informe = new InformeCalidad();
     informe.setId(informes.size() + 1);
     informe.setMedicion(medicion);

     // Generar una métrica y recomendaciones como ejemplo
     informe.setMetrica("Eficiencia: " + medicion.getResultado() * 100 + "%");
     informe.setRecomendaciones("Optimizar parámetros para mejorar resultados.");

     informes.add(informe);
     return informe;
 }

 public void agregarMedicion(MedicionCalidad medicion) {
     mediciones.add(medicion);
 }

 public void asociarParametro(Proyecto proyecto, ParametroCalidad parametro) {
     System.out.println("Asociando parámetro: " + parametro.getNombre() + " al proyecto: " + proyecto.getNombre());
 }

public Object getMediciones() {
	// TODO Auto-generated method stub
	return null;
}

public List<InformeCalidad> getInformes() {
	// TODO Auto-generated method stub
	return null;
}
}