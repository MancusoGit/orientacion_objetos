package ar.edu.unlp.info.oo1.ejercicio7;

public class Circulo extends Figura {

    private double radio;
    private final double PI = Math.PI; 
    private double diametro;

    public Circulo() {
        
    }

    public Circulo(double radius) {
        this.setRadio(radius);
    }

    public void setRadio(double r) {
        this.radio = r;
        this.diametro = r * 2;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setDiametro(double d) {
        this.diametro = d;
        this.setRadio(d / 2);
    }

    public double getDiametro() {
        return this.diametro;
    }

    @Override
    public double getPerimetro() {
        return this.getDiametro() * PI;
    }

    @Override
    public double getArea() {
        return Math.pow(this.getRadio(), 2) * PI;
    }

}
