package gc.dominio;

import gc.dominio.MedicionCalidad;

//Clase InformeCalidad
public class InformeCalidad {
	private int id;
	private MedicionCalidad medicion;
	private String metrica;
	private String recomendaciones;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MedicionCalidad getMedicion() {
		return medicion;
	}

	public void setMedicion(MedicionCalidad medicion) {
		this.medicion = medicion;
	}

	public String getMetrica() {
		return metrica;
	}

	public void setMetrica(String metrica) {
		this.metrica = metrica;
	}

	public String getRecomendaciones() {
		return recomendaciones;
	}

	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}
}