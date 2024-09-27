package ar.edu.unju.escmi.tp4.dominio;

import java.time.LocalDate;

public class ContratoCompraVenta {
    private double precio;
    private double impuestos;
    private Cliente cliente;
    private Terreno terreno;
    private LocalDate fechaContrato;

    public ContratoCompraVenta(double precio, double impuestos, Cliente cliente, Terreno terreno) {
        this.precio = precio;
        this.impuestos = impuestos;
        this.cliente = cliente;
        this.terreno = terreno;
        this.fechaContrato = LocalDate.now();
    }

    public double getMontoTotal() {
        return precio + impuestos;
    }

    public void mostrarDatos() {
        System.out.println("Contrato Compra-Venta: Precio=" + precio + ", Impuestos=" + impuestos + ", Cliente=" + cliente.getDni() + ", Terreno=" + terreno.getCodigo() + ", Fecha=" + fechaContrato);
    }
}

