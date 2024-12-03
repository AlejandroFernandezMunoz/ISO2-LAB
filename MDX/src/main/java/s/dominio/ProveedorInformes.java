package Dominio_S;

import java.util.List;

public class ProveedorInformes {
    private List<Informe> informes;

    public List<Informe> getInformes() {
        return informes;
    }

    public void setInformes(List<Informe> informes) {
        this.informes = informes;
    }

    public Informe generarInforme(String id) {
        // Lógica para generar un informe a partir del ID
        return informes.stream()
                .filter(informe -> informe.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<String> listarInformes() {
        // Lógica para listar los informes
        return informes.stream().map(Informe::getId).toList();
    }
}