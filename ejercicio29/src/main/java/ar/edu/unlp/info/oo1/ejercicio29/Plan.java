package ar.edu.unlp.info.oo1.ejercicio29;

public abstract class Plan {
    private double precioBase;
    private int cantidadLimite;

    public Plan(double precio, int cantidad) {
        this.setPrecioBase(precio);
        this.setCantidadLimite(cantidad);
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    private void setPrecioBase(double price) {
        this.precioBase = price;
    }

    public int getCantidadLimite() {
        return this.cantidadLimite;
    }

    private void setCantidadLimite(int amount) {
        this.cantidadLimite = amount;
    }

    public abstract double calcularPenalizacion(int cantidadIpDetectadas, int cumpleAntiguedad);

    public abstract double calcularPrecioBase();
}
