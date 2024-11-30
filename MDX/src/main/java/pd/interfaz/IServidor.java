package pd.interfaz;

import pd.dominio.Proyecto;
import java.util.Map;

public interface IServidor {
    boolean enviarDatos(Proyecto proyecto);
    Proyecto recibirDatos(String proyectoId);
    boolean validarConexion();
    void actualizarEstado(int estado);
    Respuesta enviarSolicitud(Map<String, Object> datos);
    Respuesta recibirRespuesta();
}