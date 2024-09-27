package ar.edu.unju.escmi.tp4.dominio;

public class Vivienda extends Inmueble {
    private String direccion;
    private int habitaciones;
    private double precioAlquiler;

    public Vivienda(String codigo, String direccion, int habitaciones, double precioAlquiler, boolean disponibilidad) {
        super(codigo, disponibilidad);
        this.direccion = direccion;
        this.habitaciones = habitaciones;
        this.precioAlquiler = precioAlquiler;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Vivienda: Código=" + codigo + ", Dirección=" + direccion + ", Habitaciones=" + habitaciones + ", Precio alquiler=" + precioAlquiler + ", Disponible=" + disponibilidad);
    }
}

