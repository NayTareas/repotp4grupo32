package ar.edu.unju.escmi.tp4.collections;

import ar.edu.unju.escmi.tp4.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;

public class CollectionCliente {
    public static List<Cliente> clientes = new ArrayList<>();

    // Método para buscar cliente por DNI
    public static Cliente buscarClientePorDni(String dni) {
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                return cliente;
            }
        }
        return null;
    }
}
