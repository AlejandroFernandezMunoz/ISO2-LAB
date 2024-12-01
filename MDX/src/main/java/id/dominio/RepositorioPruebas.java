package dominio;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPropuestas {
    private List<Propuesta> propuestas;

    public RepositorioPropuestas() {
        this.propuestas = new ArrayList<>();
    }

    public void almacenarPropuesta(Propuesta propuesta) {
        propuestas.add(propuesta);
    }

    public Propuesta obtenerPropuesta(int idPropuesta) {
        return propuestas.stream()
                .filter(propuesta -> propuesta.getId() == idPropuesta)
                .findFirst()
                .orElse(null);
    }

    public List<Propuesta> listarPropuestas() {
        return propuestas;
    }

    public void setPropuestas(List<Propuesta> propuestas) {
        this.propuestas = propuestas;
    }
}
