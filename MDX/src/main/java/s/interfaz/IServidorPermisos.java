package s.interfaz;

public interface IServidorPermisos {
    boolean autenticarUsuario(String usuario, String contrase�a);
    void gestionarPermisos(String usuario, String operacion);
}