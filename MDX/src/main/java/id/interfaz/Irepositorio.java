package Interfaz_ID;

import java.util.List;

public interface IRepositorio {
    List<String> descubrirDatos();
    InformeCalidad solicitarInformeCalidad(String datos);
}