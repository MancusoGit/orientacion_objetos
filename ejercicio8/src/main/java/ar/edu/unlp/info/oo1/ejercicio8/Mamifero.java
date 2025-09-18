package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.LocalDate;

public class Mamifero {

    private String identificador;
    private String especie;
    private LocalDate fechaNacimiento;
    private Mamifero padre;
    private Mamifero madre;

    /* 
    private Mamifero abueloMaterno;
    private Mamifero abuelaMaterna;
    private Mamifero abueloPaterno;
    private Mamifero abuelaPaterna;
    */

    public Mamifero() {

    }

    public Mamifero(String id) {
        this.setIdentificador(id);
        this.setEspecie("");
        this.setFechaNacimiento(null);
        this.setPadre(null);
        this.setMadre(null);
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String id) {
        this.identificador = id;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String specie) {
        this.especie = specie;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate birth) {
        this.fechaNacimiento = birth;
    }

    public Mamifero getPadre() {
        return this.padre;
    }

    public void setPadre(Mamifero dad) {
        this.padre = dad;
    }

    public Mamifero getMadre() {
        return this.madre;
    }

    public void setMadre(Mamifero mum) {
        this.madre = mum;
    }
    

    private boolean hasFather() {
        return this.getPadre() != null;
    }

    private boolean hasMother() {
        return this.getMadre() != null;
    }

    public Mamifero getAbueloMaterno() {
        return (this.hasMother() && this.getMadre().hasFather()) ? this.getMadre().getPadre() : null;
    }

    public Mamifero getAbuelaMaterna() {
        return (this.hasMother() && this.getMadre().hasMother()) ? this.getMadre().getMadre() : null;  
    }

    public Mamifero getAbueloPaterno() {
        return (this.hasFather() && this.getPadre().hasFather()) ? this.getPadre().getPadre() : null;
    }

    public Mamifero getAbuelaPaterna() {
        return (this.hasFather() && this.getPadre().hasMother()) ? this.getPadre().getMadre() : null;
    }

    public Boolean tieneComoAncestroA(Mamifero pariente) {
        boolean ok = false;
        //solucion recursiva preguntando por el padre y la madre si coinciden con el mamifero
        if (pariente != null) {
            String ancestro = pariente.getIdentificador();
            ok = buscarAncestro(ancestro);
        }
        return ok;
    }

    private boolean buscarAncestro(String ancestro) {
        boolean ok = false;
        if (this.hasFather()) {
            Mamifero dad = this.getPadre();
            if (dad.getIdentificador().equals(ancestro)) {
                ok = true;
            } else if (dad.hasFather() || dad.hasMother()) {
                ok = dad.buscarAncestro(ancestro);
            }
        }
        if (this.hasMother() && !ok) {
            Mamifero mum = this.getMadre();
            if (mum.getIdentificador().equals(ancestro)) {
                ok = true;
            } else if (mum.hasFather() || mum.hasMother()) {
                ok = mum.buscarAncestro(ancestro);
            }
        }
        return ok;
    }
}
