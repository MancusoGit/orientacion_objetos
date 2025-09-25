package ar.edu.unlp.info.oo1.ejercicio9;

import java.util.ArrayList;


public class Farola {

    private boolean estado; // true si está encendida, false si está apagada
    
    ArrayList<Farola> farolasVecinas;

    public Farola() {
        this.setEstado(false);
        this.farolasVecinas = new ArrayList<>();
    }

    private void setEstado(boolean state) {
        this.estado = state;
    }

    public void pairWithNeighbor(Farola vecina) {
        if (!this.getNeighbors().contains(vecina)) {
            this.getNeighbors().add(vecina);
            vecina.pairWithNeighbor(vecina);
        }
    }

    public ArrayList<Farola> getNeighbors() {
        return this.farolasVecinas;
    }

    public boolean isOn() {
        return this.estado;
    }

    public boolean isOff() {
        return !this.estado;
    }

    public void turnOn() {
        if (!this.estado) {
            this.setEstado(true);
            this.getNeighbors().stream().forEach(f -> f.turnOn());
        }
    }

    public void turnOff() {
        if (this.estado) {
            this.setEstado(false);
            this.getNeighbors().stream().forEach(farola -> farola.turnOff());
        }
    }
    


}
