package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;

public abstract class Actividad {
    private LocalDate fechaInicio;
    private String ipAddress;
    private double duracion;

    public Actividad(String ip, double duration) {
        this.fechaInicio = LocalDate.now();
        this.setIpAddress(ip);
        this.setDuracion(duration);
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    private void setIpAddress(String ip) {
        this.ipAddress = ip;
    }

    public double getDuracion() {
        return this.duracion;
    }

    private void setDuracion(double duration) {
        this.duracion = duration;
    }

    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }

    public boolean soyYo(String ip, LocalDate fecha) {
        return this.getIpAddress().equals(ip) && this.getFechaInicio().equals(fecha);
    }

    public abstract double calcularPrecioActividad();
}
