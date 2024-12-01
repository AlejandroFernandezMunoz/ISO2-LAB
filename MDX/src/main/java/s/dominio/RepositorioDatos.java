package dominio;

import java.util.List;

public class RepositorioDatos {
    private List<Datos> datos;

    public List<Datos> getDatos() {
        return datos;
    }

    public void setDatos(List<Datos> datos) {
        this.datos = datos;
    }

    public void almacenarDatos(Datos dato) {
        datos.add(dato);
    }

    public Datos recuperarDatos(int id) {
        // Buscar datos por ID
        return datos.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean eliminarDatos(int id) {
        return datos.removeIf(d -> d.getId() == id);
    }
}
