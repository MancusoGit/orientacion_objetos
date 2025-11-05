package parcial2023;

public abstract class Producto {
    private String nombre;
    private double costoUnitario;
    private String descripcion;

    public Producto(String name, double costo, String desc) {
        this.setNombre(name);
        this.setCostoUnitario(costo);
        this.setDescripcion(desc);
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostoUnitario() {
        return this.costoUnitario;
    }

    private void setCostoUnitario(double costo) {
        this.costoUnitario = costo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    private void setDescripcion(String desc) {
        this.descripcion = desc;
    }

    public double calcularTotal(int cantidad) {
        return (this.getCostoUnitario() + this.calcularImpuesto(cantidad)) * cantidad;
    }

    public abstract double calcularImpuesto(int cantidad);
}
