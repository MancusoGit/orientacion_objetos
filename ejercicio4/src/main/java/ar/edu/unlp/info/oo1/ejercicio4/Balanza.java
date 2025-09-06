package ar.edu.unlp.info.oo1.ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Balanza {
    private int cantidadDeProductos;
    private double precioTotal;
    private double pesoTotal;
    private ArrayList<Producto> productos;

    public int getCantidadDeProductos() {
        return this.cantidadDeProductos;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    public double getPesoTotal() {
        return this.pesoTotal;
    }

    public Balanza() {
        this.cantidadDeProductos = 0;
        this.precioTotal = 0;
        this.pesoTotal = 0;
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return this.productos;
    }

    public void ponerEnCero() {
        this.cantidadDeProductos = 0;
        this.precioTotal = 0;
        this.pesoTotal = 0;
        this.productos.clear();
    }

    public void agregarProducto (Producto p) {
        this.cantidadDeProductos++;
        this.precioTotal += p.getPrecio();
        this.pesoTotal += p.getPeso();
    }

    public Ticket emitirTicket() {
        LocalDate hoy = LocalDate.now();
        Ticket t = new Ticket(hoy, this.cantidadDeProductos, this.pesoTotal, this.precioTotal, this.productos);
        return t;
    }
}
