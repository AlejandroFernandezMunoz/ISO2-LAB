package gc.interfaz;

import java.util.List;

import gc.dominio.*;

//Interfaz IUsuarioEvaluador
interface IUsuarioEvaluador {
	void realizarMedicion(List<ParametroCalidad> parametros);

	List<InformeCalidad> verResultados();

	void gestionarParametros();
}