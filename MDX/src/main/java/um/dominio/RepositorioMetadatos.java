package um.dominio;

import java.util.List;
import um.interfaz.Metadata;

public class RepositorioMetadatos {
    private List<Metadata> metadatos;

    public List<Metadata> obtenerMetadatos(String criterio) {
        // Implementación para filtrar y devolver metadatos según el criterio
        return metadatos.stream()
                .filter(metadata -> metadata.matchesCriteria(criterio))
                .toList();
    }

    public List<Metadata> getMetadatos() {
        return metadatos;
    }

    public void setMetadatos(List<Metadata> metadatos) {
        this.metadatos = metadatos;
    }
}
