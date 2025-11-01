package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public abstract class Envio {
    private LocalDate fecha;
    private String origen;
    private String destino;
    private double peso;

    public Envio(String origen, String destino, double weight) {
        this.setFecha(LocalDate.now());
        this.setOrigen(origen);
        this.setDestino(destino);
        this.setPeso(weight);
    }

    public Envio() {
        this.setFecha(LocalDate.now());
        this.setOrigen("");
        this.setDestino("");
        this.setPeso(0);
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    protected void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getOrigen() {
        return this.origen;
    }

    protected void setOrigen(String origin) {
        this.origen = origin;
    }

    public String getDestino() {
        return this.destino;
    }

    protected void setDestino(String destiny) {
        this.destino = destiny;
    }

    public double getPeso() {
        return this.peso;
    }

    protected void setPeso(double weight) {
        this.peso = weight;
    }

    protected boolean entrePeriodo(DateLapse period) {
        return period.includesDate(fecha);
    }

    public double calcularCostoPeriodo(DateLapse period) {
        return period.includesDate(fecha) ? this.calcularCosto() : 0;
    }

    protected abstract double calcularCosto();

}



