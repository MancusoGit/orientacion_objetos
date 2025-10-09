package ar.edu.unlp.info.oo1.ejercicio14;

public class Esfera extends Pieza {
    
    private double PI;
    private double radio;

    public Esfera() {
        super();
        this.PI = Math.PI;
        this.radio = 0;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radius) {
        this.radio = radius;
    }

    public double calcularSuperficie() {
        return 4 * PI * Math.pow(this.getRadio(),2);
    }

    public double calcularVolumen() {
        return (4/3) * PI * Math.pow(this.getRadio(),3);
    } 

}
