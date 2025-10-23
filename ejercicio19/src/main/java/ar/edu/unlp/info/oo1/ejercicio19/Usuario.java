package ar.edu.unlp.info.oo1.ejercicio19;

import java.util.LinkedList;

public class Usuario {

    private String nombre;
    private String direccion;
    private long dni;
    private LinkedList<Propiedad> propiedades;

    public Usuario() {
        this.setNombre("");
        this.setDireccion("");
        this.setDNI(0);
        this.propiedades = new LinkedList<>();
    }

    public Usuario(String nombre, String direccion, long dni) {
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setDNI(dni);
        this.propiedades = new LinkedList<>();
    }

    private void setNombre(String name) {
        this.nombre = name;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setDireccion(String addres) {
        this.direccion = addres;
    }

    public String getDireccion() {
        return this.direccion;
    }

    private void setDNI(long documento) {
        this.dni = documento;
    }

    public long getDNI() {
        return this.dni;
    }

    private Propiedad buscarPropiedad(String nombrePropiedad) {
        return this.propiedades.stream()
        .filter(propiedad -> propiedad.getNombre().equals(nombrePropiedad))
        .findFirst()
        .orElse(null);
    }

    public void crearReserva(String nombrePropiedad, String nombreCliente, DateLapse periodo) {
        Propiedad consulta = this.buscarPropiedad(nombrePropiedad);
        if (consulta != null) {
            consulta.crearReserva(periodo, nombreCliente);
        }
    }

    public double calcularPrecioReserva(String nombrePropiedad, String nombreCliente, DateLapse periodo) {
        Propiedad consulta = this.buscarPropiedad(nombrePropiedad);
        return consulta != null ? consulta.calcularPrecioReserva(periodo, nombreCliente) : 0;
    }

    public void cancelarReserva(String nombrePropiedad, String nombreCliente, DateLapse periodo) {
        Propiedad consulta = this.buscarPropiedad(nombrePropiedad);
        if (consulta != null) {
            consulta.cancelarReserva(periodo, nombreCliente);
        }
    }

    public double calcularIngresos(DateLapse periodo) {
        return (this.propiedades.stream()
        .mapToDouble(propiedad -> propiedad.calcularIngresos(periodo))
        .sum()) * 0.75;
    }

}
