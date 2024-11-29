package s.interfaz;

public interface IServidorPermisos {
    boolean autenticarUsuario(String usuario, String contraseņa);
    void gestionarPermisos(String usuario, String operacion);
}