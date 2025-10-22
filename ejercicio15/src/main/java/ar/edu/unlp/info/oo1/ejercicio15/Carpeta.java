package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Carpeta {
    private String nombre;
    private List<Email> emails;

    public Carpeta() {
        this.setNombre("");
        this.emails = new LinkedList<>();
    }

    public Carpeta(String name) {
        this.setNombre(name);
        this.emails = new ArrayList<>();
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void agregarEmail(Email correo) {
        this.emails.add(correo);
        correo.setCarpetaContenido(this.getNombre());
    }

    public void mover(Email correo, Carpeta destino) {
        if (this.emails.contains(correo)) {
            destino.agregarEmail(correo);
            this.emails.remove(correo);
        }
    }

    public int calcularTamaño() {
        return this.emails.stream().mapToInt(mail -> mail.getSize()).sum();
    }

    public Email search(String fragmento) {
        return this.emails.stream().filter(mail -> mail.buscar(fragmento)).findFirst().orElse(null);
    }

}
