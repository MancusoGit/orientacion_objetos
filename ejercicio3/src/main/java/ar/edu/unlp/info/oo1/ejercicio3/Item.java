package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {
    private String detalle;
    private int cantidad;
    private double costoUnitario;

    public Item() {

    }

    public Item(String detail, int cant, double costoUni) {
        this.detalle = detail;
        this.cantidad = cant;
        this.costoUnitario = costoUni;
    }

    public double getCostoUnitario() {
        return this.costoUnitario;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public String getDetalle() {
        return this.detalle;
    }

    public double costo() {
        return this.getCostoUnitario() * this.getCantidad();
    }
    
}
