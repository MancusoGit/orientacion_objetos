package ar.edu.unlp.info.oo1.ejercicio29;

public class PlanIndividual extends Plan {
    private int cantidadMinutos;

    public PlanIndividual(int cantMinutos) {
        super(20, 1);
        this.setCantidadMinutos(cantMinutos);
    }

    public int getCantidadMinutos() {
        return this.cantidadMinutos;
    }

    private void setCantidadMinutos(int amount) {
        this.cantidadMinutos = amount;
    }

    @Override
    public double calcularPenalizacion(int cantidadIpDetectadas, int cumpleAntiguedad) {
        return (this.getCantidadLimite() <= cantidadIpDetectadas) ? (cantidadIpDetectadas) * 300 : 0;
    }

    @Override
    public double calcularPrecioBase() {
        return this.getPrecioBase() * this.getCantidadMinutos();
    }

}
