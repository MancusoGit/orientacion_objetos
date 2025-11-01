package ar.edu.unlp.info.oo1.ejercicio19;

import java.util.LinkedList;

public class Propiedad {

    private String direccion;
    private String nombre;
    private double precioPorNoche;
    private LinkedList<Reserva> reservas;

    public Propiedad() {
        this.setDireccion("");
        this.setNombre("");
        this.setPrecioPorNoche(0);
        this.reservas = new LinkedList<>();
    }

    public Propiedad(String direccion, String nombre, double precio) {
        this.setDireccion(direccion);
        this.setNombre(nombre);
        this.setPrecioPorNoche(precio);
        this.reservas = new LinkedList<>();
    }

    private void setDireccion(String adress) {
        this.direccion = adress;
    } 

    public String getDireccion() {
        return this.direccion;
    }

    private void setNombre(String name) {
        this.nombre = name;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setPrecioPorNoche(double price) {
        this.precioPorNoche = price;
    }

    public double getPrecioPorNoche() {
        return this.precioPorNoche;
    }

    public boolean estaDisponible(DateLapse periodo) {
        return this.reservas.stream()
        .allMatch(reserva -> reserva.consultarDisponibilidad(periodo));
    }

    public void crearReserva(DateLapse periodo, String nombreCliente) {
        if (this.estaDisponible(periodo)) {
            this.reservas.add(new Reserva(periodo, nombreCliente));
        }
    }

    private Reserva buscarReserva(DateLapse periodo, String nombreCliente) {
        return this.reservas.stream()
        .filter(reserva -> reserva.getNombreReservador().equals(nombreCliente) && reserva.getPeriodo().equals(periodo))
        .findFirst()
        .orElse(null);
    }

    public void cancelarReserva(DateLapse periodo, String nombreCliente) {
        Reserva consulta = buscarReserva(periodo, nombreCliente);
        if (consulta != null) {
            this.reservas.remove(consulta);
        }
    }

    public double calcularPrecioReserva(DateLapse periodo, String nombreCliente) {
        Reserva consulta = buscarReserva(periodo, nombreCliente);
        return consulta != null ? consulta.calcularPrecio(this.precioPorNoche) : 0;
    }

    public double calcularIngresos(DateLapse periodo) {
        return this.reservas.stream()
        .filter(reserva -> reserva.getPeriodo().overlaps(periodo))
        .mapToDouble(reserva -> reserva.calcularPrecio(precioPorNoche))
        .sum();
    }
    
}
