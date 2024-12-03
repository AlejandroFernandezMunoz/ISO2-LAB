package interfaz;

import dominio.ConectorOrigen;

public interface ISistemaMDX {
    boolean recibirProyecto(ConectorOrigen proyecto);
    boolean enviarEstado(String proyectoId);
    boolean validarAcceso(String usuarioId);
    Resultado procesarDatos(List<String> datos);
    Informe generarInforme(Map<String, String> parametros);
}