package ar.edu.unlp.info.oo1.ejercicio4;

public class Producto {
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    public Producto(String desc, double peso, double precioKilo) {
        this.peso = peso;
        this.precioPorKilo = precioKilo;
        this.descripcion = desc;
    }

    public double getPeso() {
        return this.peso;
    }
    
    public double getPrecioPorKilo() {
        return this.precioPorKilo;
    }

    public void setPrecioPorKilo(double precioNuevo) {
        this.precioPorKilo = precioNuevo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPrecio() {
        return (this.getPrecioPorKilo() * this.getPeso());
    }
}
