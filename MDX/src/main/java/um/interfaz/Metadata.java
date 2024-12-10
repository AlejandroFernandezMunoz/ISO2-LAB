package um.interfaz;

public class Metadata {
    private int id;
    private String nombre;
    private String descripcion;

    // Constructor
    public Metadata(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método matchesCriteria
    public boolean matchesCriteria(String criterio) {
        // Comprueba si el criterio está contenido en el nombre o la descripción
        if (criterio == null || criterio.isEmpty()) {
            return false;
        }
        return (nombre != null && nombre.toLowerCase().contains(criterio.toLowerCase())) ||
               (descripcion != null && descripcion.toLowerCase().contains(criterio.toLowerCase()));
    }

    // toString (opcional para depuración)
    @Override
    public String toString() {
        return "Metadata{id=" + id + ", nombre='" + nombre + "', descripcion='" + descripcion + "'}";
    }
}
