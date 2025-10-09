package ar.edu.unlp.info.oo1.ejercicio14;

public class Prisma extends Pieza {
    
    private double ladoMayor;
    private double ladoMenor;
    private double altura;

    public Prisma() {
        super();
        this.setLadoMayor(0);
        this.setLadoMenor(0);
        this.setAltura(0);
    }

    public double getLadoMayor() {
        return this.ladoMayor;
    }

    public void setLadoMayor(double maxSide) {
        this.ladoMayor = maxSide;
    }

    public double getLadoMenor() {
        return this.ladoMenor;
    }

    public void setLadoMenor(double minSide) {
        this.ladoMenor = minSide;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double height) {
        this.altura = height;
    }

    public double calcularSuperficie() {
        return 2 * (this.getLadoMayor() * this.getLadoMenor() + this.getLadoMayor() * this.getAltura() + this.getLadoMenor() * this.getAltura());
    }

    public double calcularVolumen() {
        return this.getLadoMayor() * this.getLadoMenor() * this.getAltura();
    }

}
