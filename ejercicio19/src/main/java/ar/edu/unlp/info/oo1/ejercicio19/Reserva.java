package ar.edu.unlp.info.oo1.ejercicio19;

//import java.time.LocalDate;

public class Reserva {
    
    private DateLapse periodo;
    private String nombreReservador;

    public Reserva() {
        this.setPeriodo(null);
        this.setNombreReservador("");
    }

    public Reserva(DateLapse periodo, String nombre) {
        this.setPeriodo(periodo); 
        this.setNombreReservador(nombre);
    }

    private void setPeriodo(DateLapse period) {
        this.periodo = period;
    }

    public DateLapse getPeriodo() {
        return this.periodo;
    }

    private void setNombreReservador(String name) {
        this.nombreReservador = name;
    }

    public String getNombreReservador() {
        return this.nombreReservador;
    }

    public double calcularPrecio(double precioNoche) {
        return precioNoche * this.getPeriodo().sizeInDays();
    }

    public boolean consultarDisponibilidad(DateLapse consulta) {
        return !this.getPeriodo().overlaps(consulta);
    }

}
