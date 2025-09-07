package ar.edu.unlp.info.oo1.ejercicio7;

public abstract class Figura {

    private double linea;

    public Figura() {

    }

    public Figura(double line) {
        this.linea = line;
    }

    public double getLinea() {
        return this.linea;
    }

    public void setLinea(double l) {
        this.linea = l;
    }

    public abstract double getPerimetro();

    public abstract double getArea();

}
