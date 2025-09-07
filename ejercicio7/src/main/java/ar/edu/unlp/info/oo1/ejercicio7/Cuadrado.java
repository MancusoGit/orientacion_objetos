package ar.edu.unlp.info.oo1.ejercicio7;

public class Cuadrado extends Figura {

    private final double caras = 4;

    public Cuadrado() {
        super();
    }

    public Cuadrado(double side) {
        super(side);
    }

    public void setLado(double l) {
        super.setLinea(l);
    }

    public double getLado() {
        return super.getLinea();
    }

    @Override
    public double getPerimetro() {
        return super.getLinea() * caras;
    }

    @Override
    public double getArea() {
        return Math.pow(this.getLado(), 2);
    }

}
