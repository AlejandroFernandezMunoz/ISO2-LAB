package s.dominio;
import java.util.*;

public class LogsSeguridad {
    private List<String> registroOperaciones;

    public LogsSeguridad() {
        registroOperaciones = new ArrayList<>();
    }

    public void registrarEvento(String usuario, String operacion, boolean resultado) {
        String log = "Usuario: " + usuario + ", Operación: " + operacion + ", Resultado: " + (resultado ? "Éxito" : "Fallo");
        registroOperaciones.add(log);
    }

    public List<String> obtenerLogs() {
        return registroOperaciones;
    }

    public void setRegistroOperaciones(List<String> registroOperaciones) {
        this.registroOperaciones = registroOperaciones;
    }
}
