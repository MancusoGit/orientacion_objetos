package ar.edu.unlp.info.oo1.ejercicio21;

public class EnvioLocal extends Envio {

    private boolean envioRapido;

    public EnvioLocal(String origen, String destino, double peso, boolean envioRapido) {
        super(origen,destino,peso);
        this.setTipoEnvio(envioRapido);
    }

    public boolean getTipoEnvio() {
        return this.envioRapido;
    }

    private void setTipoEnvio(boolean envio) {
        this.envioRapido = envio;
    }

    public double calcularCosto() {
        return this.getTipoEnvio() ? 1500 : 1000;
    }
    
}
