package ar.edu.unlp.info.oo1.ejercicio11;

public abstract class Cuenta {
    
    private double saldo;

    public Cuenta() {
        this.setSaldo(0);
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double balance) {
        this.saldo = balance;
    }

    public void depositar(double monto) {
        this.setSaldo(this.getSaldo()+monto);
    }

    public boolean extraer(double mount) {
        if (puedeExtraer(mount)) {
            this.extraerSinControlar(mount);
            return true;
        }
        return false;
    }

    protected void extraerSinControlar(double monto) {
        this.setSaldo(this.getSaldo()-monto);
    }

    protected abstract boolean puedeExtraer(double monto);    

    public boolean transferirACuenta(double monto, Cuenta destino) {
        if(this.puedeExtraer(monto)) {
            this.extraerSinControlar(monto);
            destino.depositar(monto);
            return true;
        }
        return false;
    }

}
