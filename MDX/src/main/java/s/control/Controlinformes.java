package Control_S;

import java.util.Map;

public class ControlInformes {
    private Map<String, Informe> cacheInformes;

    public Map<String, Informe> getCacheInformes() {
        return cacheInformes;
    }

    public void setCacheInformes(Map<String, Informe> cacheInformes) {
        this.cacheInformes = cacheInformes;
    }

    public Informe obtenerInforme(String id) {
        return cacheInformes.get(id);
    }
}