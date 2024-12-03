package Control_S;

import java.util.List;
import java.util.Map;

public class ServicioMDX implements ISistemaMDX {
    private List<String> registros;

    public List<String> getRegistros() {
        return registros;
    }

    public void setRegistros(List<String> registros) {
        this.registros = registros;
    }

    @Override
    public Resultado procesarDatos(List<String> datos) {
        // Lógica para procesar los datos
        return new Resultado();
    }

    @Override
    public Informe generarInforme(Map<String, String> parametros) {
        // Lógica para generar un informe
        return new Informe();
    }
}