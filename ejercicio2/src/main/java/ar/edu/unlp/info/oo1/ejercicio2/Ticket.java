package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Ticket {
    private LocalDate fecha;
    private int cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal;

    public Ticket() {

    }

    public Ticket(LocalDate fecha, int cant, double weight, double price) {
        this.fecha = fecha;
        this.cantidadDeProductos = cant;
        this.pesoTotal = weight;
        this.precioTotal = price;
    }

    public int getCantidadDeProductos() {
        return this.cantidadDeProductos;
    }

    public double getPesoTotal() {
        return this.pesoTotal;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public double impuesto() {
        return this.getPrecioTotal() * 0.21;
    }
}
