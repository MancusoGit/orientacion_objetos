package ar.edu.unlp.info.oo1.ejercicio29;

public class Item {
    private String nombre;
    private int cantidad;
    private double precioUnitario;

    public Item(String name, int amount, double price) {
        this.setNombre(name);
        this.setCantidad(amount);
        this.setPrecioUnitario(price);
    }   

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String name) {
        this.nombre = name;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    private void setCantidad(int cant) {
        this.cantidad = cant;
    }

    public double getPrecioUnitario() {
        return this.precioUnitario;
    }

    private void setPrecioUnitario(double price) {
        this.precioUnitario = price;
    }

    public void sumarCantidad(int cant) {
        this.setCantidad(this.getCantidad() + cant);
    }
    
    public double calcularCosto() {
        return this.getPrecioUnitario() * this.getCantidad();
    }
}
