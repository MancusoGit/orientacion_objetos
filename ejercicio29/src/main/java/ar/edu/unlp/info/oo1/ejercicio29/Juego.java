package ar.edu.unlp.info.oo1.ejercicio29;

import java.util.LinkedList;

public class Juego extends Actividad {

    private LinkedList<Item> items;
    
    public Juego(String ip, double duracion) {
        super(ip,duracion);
        this.items = new LinkedList<>(); //preguntar si tengo que hacer que el constructor admita si o si una lista de items
    }

    private Item buscarItem(String nombre) {
        return this.items.stream()
                .filter(item -> item.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    public void agregarItem(String nombre, int cantidad, double precio) {
        Item consultar = buscarItem(nombre);
        if (consultar != null) {
            consultar.sumarCantidad(cantidad);
        } else {
            this.items.add(new Item(nombre,cantidad,precio));
        }
    }

    public void eliminarItem(String nombre) {
        Item consultar = buscarItem(nombre);
        if (consultar != null) {
            this.items.remove(consultar);
        }
    }

    @Override
    public double calcularPrecioActividad() {
        return (this.getDuracion() > 360) ? this.items.stream()
                                            .mapToDouble(item -> item.calcularCosto())
                                            .sum() 
                                          : 0;
    }
}
