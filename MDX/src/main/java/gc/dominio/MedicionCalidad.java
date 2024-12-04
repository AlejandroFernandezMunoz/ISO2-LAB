package gc.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Clase MedicionCalidad
public class MedicionCalidad {
    private float resultado;
    private int id;
    private Date fecha;
    private List<ParametroCalidad> parametrosEvaluados;

    public MedicionCalidad() {
        parametrosEvaluados = new ArrayList<>();
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<ParametroCalidad> getParametrosEvaluados() {
        return parametrosEvaluados;
    }

    public void setParametrosEvaluados(List<ParametroCalidad> parametrosEvaluados) {
        this.parametrosEvaluados = parametrosEvaluados;
    }
}