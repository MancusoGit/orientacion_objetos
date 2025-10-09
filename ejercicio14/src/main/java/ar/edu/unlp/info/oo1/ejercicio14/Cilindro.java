package ar.edu.unlp.info.oo1.ejercicio14;

public class Cilindro extends Pieza {
    
    private double PI;
    private double radio;
    private double altura;

    public Cilindro() {
        super();
        this.PI = Math.PI;
        this.setRadio(0);;
        this.setAltura(0);;
    }

    public void setRadio(double radius) {
        this.radio = radius;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setAltura(double height) {
        this.altura = height;
    }

    public double getAltura() {
        return this.altura;
    }

    public double calcularVolumen() {
        return PI * Math.pow(this.getRadio(), 2) * this.getAltura(); 
    }

    public double calcularSuperficie() {
        return (2 * PI * this.getRadio() * this.getAltura()) + (2 * PI * Math.pow(altura, 2));
    }

}
