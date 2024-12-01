package dominio;

import java.util.List;

public class ServidorDatos {
    private ConfiguracionServidor configuracion;
    private List<Datos> datosAlmacenados;

    public ConfiguracionServidor getConfiguracion() {
        return configuracion;
    }

    public void setConfiguracion(ConfiguracionServidor configuracion) {
        this.configuracion = configuracion;
    }

    public List<Datos> getDatosAlmacenados() {
        return datosAlmacenados;
    }

    public void setDatosAlmacenados(List<Datos> datosAlmacenados) {
        this.datosAlmacenados = datosAlmacenados;
    }

    public void guardarDatos(Datos datos) {
        datosAlmacenados.add(datos);
    }

    public Datos obtenerDatos(int id) {
        // Buscar datos por ID
        return datosAlmacenados.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Datos> listarDatos() {
        return datosAlmacenados;
    }
}
