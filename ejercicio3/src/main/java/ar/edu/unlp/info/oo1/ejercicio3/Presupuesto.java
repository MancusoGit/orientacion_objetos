package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto {
    
    private LocalDate fecha;
    
    private String cliente;

    private ArrayList<Item> items;

    public Presupuesto() {

    }

    public Presupuesto(String client) {
        this.fecha = LocalDate.now();
        this.cliente = client;
        this.items = new ArrayList<>();
    }

    public String getCliente() {
        return this.cliente;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void agregarItem(Item item) {
        items.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item it : items) {
            total += it.costo();
        }
        return total;
    }

}
