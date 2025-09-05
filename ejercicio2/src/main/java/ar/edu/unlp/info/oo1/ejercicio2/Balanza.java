package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Balanza {
    private int cantidadDeProductos;
    private double precioTotal;
    private double pesoTotal;

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
    }

    public void ponerEnCero() {
        this.cantidadDeProductos = 0;
        this.precioTotal = 0;
        this.pesoTotal = 0;
    }

    public void agregarProducto (Producto p) {
        this.cantidadDeProductos++;
        this.precioTotal += p.getPrecio();
        this.pesoTotal += p.getPeso();
    }

    public Ticket emitirTicket() {
        LocalDate hoy = LocalDate.now();
        Ticket t = new Ticket(hoy, this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
        return t;
    }

}
