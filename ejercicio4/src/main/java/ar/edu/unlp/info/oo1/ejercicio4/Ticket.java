package ar.edu.unlp.info.oo1.ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ticket {
    private LocalDate fecha;
    private int cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal;
    private ArrayList<Producto> products;

    public Ticket() {

    }

    public Ticket(LocalDate fecha, int cant, double weight, double price, ArrayList<Producto> prods) {
        this.fecha = fecha;
        this.cantidadDeProductos = cant;
        this.pesoTotal = weight;
        this.precioTotal = price;
        this.products = new ArrayList<>();
        products.addAll(prods);
    }

    public int getCantidadDeProductos() {
        return this.cantidadDeProductos;
    }

    public ArrayList<Producto> getProductos() {
        return this.products;
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
