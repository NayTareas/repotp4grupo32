package ar.edu.unju.escmi.tp4.collections;

import ar.edu.unju.escmi.tp4.dominio.Terreno;
import ar.edu.unju.escmi.tp4.dominio.Vivienda;

import java.util.ArrayList;
import java.util.List;

public class CollectionInmueble {
    public static List<Terreno> terrenos = new ArrayList<>();
    public static List<Vivienda> viviendas = new ArrayList<>();


    public static Terreno buscarTerrenoPorCodigo(String codigo) {
        for (Terreno terreno : terrenos) {
            if (terreno.getCodigo().equals(codigo)) {
                return terreno;
            }
        }
        return null;
    }


    public static Vivienda buscarViviendaPorCodigo(String codigo) {
        for (Vivienda vivienda : viviendas) {
            if (vivienda.getCodigo().equals(codigo)) {
                return vivienda;
            }
        }
        return null;
    }
}