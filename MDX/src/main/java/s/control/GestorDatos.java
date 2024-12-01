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

	    // M�todo para analizar datos
	    public void analizarDatos() {
	        System.out.println("Analizando los datos almacenados...");
	        // Implementaci�n del an�lisis (simulado)
	    }

	    // Generar reporte con los datos actuales
	    public void generarReporte() {
	        System.out.println("Generando reporte de los datos...");
	        // Implementaci�n de generaci�n de reporte
	    }

	    // M�todo para obtener el repositorio de datos
	    public RepositorioDatos getRepositorioDatos() {
	        return repositorio;
	    }

	    // M�todo para establecer un nuevo repositorio de datos
	    public void setRepositorioDatos(RepositorioDatos repositorio) {
	        this.repositorio = repositorio;
	    }
	}
