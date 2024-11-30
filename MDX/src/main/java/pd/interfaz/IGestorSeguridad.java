package pd.interfaz;

public interface IGestorSeguridad {
    void solicitarGestionPermisos(String usuario, String recurso, String accion);
    boolean validarAccesoUsuario(String usuario, String recurso, String accion);
}