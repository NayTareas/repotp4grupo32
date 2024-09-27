package ar.edu.unju.escmi.tp4.dominio;

public class Terreno extends Inmueble {
    private double latitud;
    private double longitud;
    private double superficie;
    private double precio;

    public Terreno(String codigo, double latitud, double longitud, double superficie, double precio, boolean disponibilidad) {
        super(codigo, disponibilidad);
        this.latitud = latitud;
        this.longitud = longitud;
        this.superficie = superficie;
        this.precio = precio;
    }

    public double getPrecioVenta() {
        return precio;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Terreno: Código=" + codigo + ", Latitud=" + latitud + ", Longitud=" + longitud + ", Superficie=" + superficie + "m², Precio=" + precio + ", Disponible=" + disponibilidad);
    }
}
