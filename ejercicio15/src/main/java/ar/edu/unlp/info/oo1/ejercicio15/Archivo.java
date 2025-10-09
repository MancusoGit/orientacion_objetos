package ar.edu.unlp.info.oo1.ejercicio15;

public class Archivo {

    private String nombre;
    private int size;

    public Archivo() {
        this.setNombre("");
        this.size = 0;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTamaño() {
        return this.size;
    }
}
