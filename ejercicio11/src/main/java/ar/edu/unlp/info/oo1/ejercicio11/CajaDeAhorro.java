package ar.edu.unlp.info.oo1.ejercicio11;

public class CajaDeAhorro extends Cuenta {
    
    private double comision;

    public CajaDeAhorro() {
        super();
        this.setComision(this.getSaldo()*0.02);
    }

    private void setComision(double comision) {
        this.comision = comision;
    }

    private double getComision() {
        return this.comision;
    }

    public boolean puedeExtraer(double monto) {
        return monto + this.getComision() <= this.getSaldo();
    }

}
