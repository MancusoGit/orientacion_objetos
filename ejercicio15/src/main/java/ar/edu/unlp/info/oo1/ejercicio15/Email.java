package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.*;

public class Email {
    private String titulo;
    private String cuerpo;
    private List<Archivo> archivos;

    public Email() {
        this.setTitulo("");
        this.setCuerpo("");
        this.archivos = new LinkedList<>();
    }

    public Email(String titulo, String body) {
        this.setTitulo(titulo);
        this.setCuerpo(body);
        this.archivos = new LinkedList<>();
    }

    public String getTitulo() {
        return this.titulo;
    }

    private void setTitulo(String title) {
        this.titulo = title;
    }

    public String getCuerpo() {
        return this.cuerpo;
    }

    private void setCuerpo(String body) {
        this.cuerpo = body;
    }

    public List<Archivo> adjuntos() {
        //consultar si son los archivos o una copia de los mismos
        return this.archivos != null ? new ArrayList<>(this.archivos) : null;
    }

    public void agregarArchivo(Archivo file) {
        this.archivos.add(file);
    }

    public double getSize() {
        return this.getTitulo().length() + this.getCuerpo().length() + this.adjuntos().stream().mapToInt(archivo -> archivo.getTamaño()).sum();
    }
}
