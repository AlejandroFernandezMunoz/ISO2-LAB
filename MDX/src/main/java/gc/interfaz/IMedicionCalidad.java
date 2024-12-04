package gc.interfaz;


import gc.dominio.MedicionCalidad;


//Interfaz IMedicionCalidad
interface IMedicionCalidad {
	void procesarMedicion(MedicionCalidad medicion);

	void guardarMedicion(MedicionCalidad medicion);

	MedicionCalidad obtenerMedicion(int id);
}