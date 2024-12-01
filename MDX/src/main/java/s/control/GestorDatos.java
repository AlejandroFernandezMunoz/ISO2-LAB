package control;

	public class GestorDatos {
	    private RepositorioDatos repositorio;

	    public GestorDatos(RepositorioDatos repositorio) {
	        this.repositorio = repositorio;
	    }

	    // Guardar datos en el repositorio
	    public void guardarDatos(Datos datos) {
	        repositorio.agregarDatos(datos);
	    }

	    // Obtener datos del repositorio por ID
	    public Datos obtenerDatos(int id) {
	        return repositorio.buscarDatos(id);
	    }

	    // Método para analizar datos
	    public void analizarDatos() {
	        System.out.println("Analizando los datos almacenados...");
	        // Implementación del análisis (simulado)
	    }

	    // Generar reporte con los datos actuales
	    public void generarReporte() {
	        System.out.println("Generando reporte de los datos...");
	        // Implementación de generación de reporte
	    }

	    // Método para obtener el repositorio de datos
	    public RepositorioDatos getRepositorioDatos() {
	        return repositorio;
	    }

	    // Método para establecer un nuevo repositorio de datos
	    public void setRepositorioDatos(RepositorioDatos repositorio) {
	        this.repositorio = repositorio;
	    }
	}
