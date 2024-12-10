package um.interfaz;

import java.util.List;

public interface IUsuarioConsulta {
    List<Metadata> consultarMetadatos(String criterio);
}
