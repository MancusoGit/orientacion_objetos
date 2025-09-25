package ar.edu.unlp.info.oo1.ejercicio7;

public class Cuadrado extends Figura {

    private double lado;

    private final double caras = 4;

    public Cuadrado() {
        
    }

    public Cuadrado(double side) {
        this.setLado(side);
    }

    public void setLado(double l) {
        this.lado = l;
    }

    public double getLado() {
        return this.lado;
    }

    @Override
    public double getPerimetro() {
        return this.getLado() * caras;
    }

    @Override
    public double getArea() {
        return Math.pow(this.getLado(), 2);
    }

}
