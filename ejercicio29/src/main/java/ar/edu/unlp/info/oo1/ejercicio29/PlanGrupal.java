package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;

public class PlanGrupal extends Plan {
    
    public PlanGrupal(int cantidadIP) {
        super(800, cantidadIP);
    }

    @Override
    public double calcularPenalizacion(int cantidadIpDetectadas, int cumpleAntiguedad) {
        int antiguedad = LocalDate.now().getYear() - cumpleAntiguedad;
        return (this.getCantidadLimite() < cantidadIpDetectadas) && antiguedad < 10  ?  (cantidadIpDetectadas - this.getCantidadLimite()) * 500 : 0;
    }

    @Override
    public double calcularPrecioBase() {
        return this.getCantidadLimite() * this.getPrecioBase();
    }

}
