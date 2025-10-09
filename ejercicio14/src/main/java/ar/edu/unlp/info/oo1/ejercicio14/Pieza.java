package ar.edu.unlp.info.oo1.ejercicio14;

public abstract class Pieza {

    private double linea;
    private String material;
    private String color;

    public Pieza() {
        this.material = null;
        this.color = null;
    }

    public double getLinea() {
        return this.linea;
    }

    public void setLinea(double line) {
        this.linea = line;
    }

    protected boolean coincideColor(String color) {
        return this.color.equals(color);
    }

    protected boolean coincideMaterial(String material) {
        return this.material.equals(material);
    }

    public abstract double calcularVolumen();

    public abstract double calcularSuperficie();

}
