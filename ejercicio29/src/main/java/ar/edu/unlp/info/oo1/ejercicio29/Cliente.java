package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;
import java.util.LinkedList;

public class Cliente {
    private String nombre;
    private LocalDate fechaAlta;
    private String IPAddress;
    private Plan planActual;
    private LinkedList<Actividad> actividades;

    public Cliente(String nombre, String ip, Plan plan) {
        this.setNombre(nombre);
        this.fechaAlta = LocalDate.now();
        this.setIPAddress(ip);
        this.setPlanActual(plan);
        this.actividades = new LinkedList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String name) {
        this.nombre = name;
    }

    public String getIPAddress() {
        return this.IPAddress;
    }

    private void setIPAddress(String ip) {
        this.IPAddress = ip;
    }

    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }

    public Plan getPlanActual() {
        return this.planActual;
    }

    private void setPlanActual(Plan plan) {
        this.planActual = plan;
    }

    public void cambiarPlan(Plan planNuevo) {
        this.setPlanActual(planNuevo);
    }

    public void agregarActividad(Actividad activity) {
        this.actividades.add(activity);
    }

    public int calcularIpDetectadas() {
        return (int) this.actividades.stream()
                .filter(actividad -> !actividad.getIpAddress().equals(this.getIPAddress()))
                .count();
    }

    public double calcularPenalizacion() {
        return this.getPlanActual().calcularPenalizacion(this.calcularIpDetectadas(), this.getFechaAlta().getYear());
    }

    public double calcularTotal(DateLapse periodo) {
        return this.actividades.stream()
        .filter(actividad -> periodo.includesDate(actividad.getFechaInicio()))
        .mapToDouble(actividad -> actividad.calcularPrecioActividad())
        .sum() + this.calcularPenalizacion() + this.getPlanActual().calcularPrecioBase();
    }

}
