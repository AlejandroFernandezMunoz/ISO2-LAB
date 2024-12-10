package um.control;

import um.dominio.RepositorioMetadatos;
import um.interfaz.Metadata;
import java.util.List;

public class ControlMetadatos {
    private RepositorioMetadatos repositorioMetadatos;

    public List<Metadata> consultarMetadatos(String criterio) {
        // Implementación para consultar metadatos basada en el criterio
        return repositorioMetadatos.obtenerMetadatos(criterio);
    }

    public RepositorioMetadatos getRepositorioMetadatos() {
        return repositorioMetadatos;
    }

    public void setRepositorioMetadatos(RepositorioMetadatos repositorioMetadatos) {
        this.repositorioMetadatos = repositorioMetadatos;
    }
}
