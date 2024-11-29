package s.interfaz;

public interface IServidorPermisos {
    boolean autenticarUsuario(String usuario, String contraseña);
    void gestionarPermisos(String usuario, String operacion);
}