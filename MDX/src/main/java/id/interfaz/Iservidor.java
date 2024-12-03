package Interfaz_ID;

import java.util.Map;

public interface IServidor {
    Respuesta enviarSolicitud(String operacion, Map<String, Object> datos);
    Respuesta recibirRespuesta();
}