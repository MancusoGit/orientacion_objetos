package ar.edu.unlp.info.oo1;
public class Producto {
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    public double getPeso() {
        return this.peso;
    }
    
    public double getPrecioPorKilo() {
        return this.precioPorKilo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPrecio() {
        return (this.getPrecioPorKilo() * this.getPeso());
    }

}
