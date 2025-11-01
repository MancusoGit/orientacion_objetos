package ar.edu.unlp.info.oo1.ejercicio21;

public class Persona extends Cliente {
    
    private String nombre;
    private long DNI;

    public Persona() {
        super();
        this.setNombre("");
        this.setDNI(0);
    }

    public Persona(String direccion, String nombre, long dni) {
        super(direccion);
        this.setNombre(nombre);
        this.setDNI(dni);
    }

    public String getNombre() {
        return this.nombre;
    }
    
    private void setNombre(String name) {
        this.nombre = name;
    }

    public long getDNI() {
        return this.DNI;
    }

    private void setDNI(long dni) {
        this.DNI = dni;
    }

    @Override
    public double calcularCosto(DateLapse periodo) {
        return super.calcularCosto(periodo) * 0.10;
    }

}
