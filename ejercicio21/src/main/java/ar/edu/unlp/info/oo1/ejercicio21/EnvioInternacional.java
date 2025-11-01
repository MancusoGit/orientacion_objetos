package ar.edu.unlp.info.oo1.ejercicio21;

public class EnvioInternacional extends Envio {
    
    private boolean envioRapido; //true si es rapido, false si no es rapido

    public EnvioInternacional() {
        super();
        this.setTipoEnvio(false);
    }

    public EnvioInternacional(String origen, String destino, double peso, boolean tipo) {
        super(origen,destino,peso);
        this.setTipoEnvio(tipo);
    }

    public boolean getTipoEnvio() {
        return this.envioRapido;
    }

    private void setTipoEnvio(boolean type) {
        this.envioRapido = type;
    }

    public double calcularCosto() {
        double total = 5000;
        if (this.getPeso() < 1000) {
            total += this.getPeso() * 10;
        } else {
            total += this.getPeso() * 12;
        }
        if (this.getTipoEnvio()) { total += 800; }
        return total;
    }
    
}
