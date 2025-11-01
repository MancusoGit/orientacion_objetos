package ar.edu.unlp.info.oo1.ejercicio21;

import java.util.LinkedList;

public abstract class Cliente {
    private String direccion;
    private LinkedList<Envio> envios;

    public Cliente() {
        this.setDireccion("");
        this.envios = new LinkedList<>();
    }

    public Cliente(String adress) {
        this.setDireccion(adress);
        this.envios = new LinkedList<>();
    }

    public String getDireccion() {
        return this.direccion;
    }

    protected void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarEnvio(Envio envio) {
        this.envios.add(envio);
    }

    public double calcularCosto(DateLapse periodo) {
        return this.envios.isEmpty() ? this.envios.stream()
        .mapToDouble(envio -> envio.calcularCostoPeriodo(periodo))
        .sum() : 0;
    }
}
