package gc.dominio;

import java.util.ArrayList;
import java.util.List;

//Clase Proyecto
public class Proyecto {
	private List<MedicionCalidad> mediciones;
	private List<InformeCalidad> informes;
	private String nombre;
	private String categoria;
	private String estado;

	public Proyecto() {
		mediciones = new ArrayList<>();
		informes = new ArrayList<>();
	}

	public void agregarMedicion(MedicionCalidad medicion) {
		this.mediciones.add(medicion);
	}

	public void agregarInforme(InformeCalidad informe) {
		this.informes.add(informe);
	}

	public List<MedicionCalidad> getMediciones() {
		return mediciones;
	}

	public List<InformeCalidad> getInformes() {
		return informes;
	}

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
}
