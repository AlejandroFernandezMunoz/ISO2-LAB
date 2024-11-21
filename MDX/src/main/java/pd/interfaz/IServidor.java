package pd.interfaz;

import pd.dominio.Proyecto;

public interface IServidor {
    boolean enviarDatos(Proyecto proyecto);
    Proyecto recibirDatos(String proyectoId);
    boolean validarConexion();
    void actualizarEstado(int estado);
}