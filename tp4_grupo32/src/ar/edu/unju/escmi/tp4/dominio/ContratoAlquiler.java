package ar.edu.unju.escmi.tp4.dominio;

import java.time.LocalDate;

public class ContratoAlquiler {
    private int duracion;
    private double precio;
    private double gastosInmobiliaria;
    private Cliente cliente;
    private Vivienda vivienda;
    private LocalDate fechaContrato;

    public ContratoAlquiler(int duracion, double precio, double gastosInmobiliaria, Cliente cliente, Vivienda vivienda) {
        this.duracion = duracion;
        this.precio = precio;
        this.gastosInmobiliaria = gastosInmobiliaria;
        this.cliente = cliente;
        this.vivienda = vivienda;
        this.fechaContrato = LocalDate.now();
    }

    public double getMontoTotal() {
        return (precio * duracion) + gastosInmobiliaria;
    }

    public void mostrarDatos() {
        System.out.println("Contrato Alquiler: Duración=" + duracion + " meses, Precio=" + precio + ", Gastos Inmobiliaria=" + gastosInmobiliaria + ", Cliente=" + cliente.getDni() + ", Vivienda=" + vivienda.getCodigo() + ", Fecha=" + fechaContrato);
    }
}
