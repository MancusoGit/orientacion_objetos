package ar.edu.unlp.info.oo1.ejercicio11;

public class CuentaCorriente extends Cuenta {
    
    private double limiteDescubierto;

    public CuentaCorriente() {
        super();
        this.setDescubierto(0);
    }
    
    public double getDescubierto() {
        return this.limiteDescubierto;
    }

    public void setDescubierto(double lim) {
        this.limiteDescubierto = lim;
    }

    public boolean puedeExtraer(double monto) {
        return monto <= this.getDescubierto() + this.getSaldo();
    }

}
