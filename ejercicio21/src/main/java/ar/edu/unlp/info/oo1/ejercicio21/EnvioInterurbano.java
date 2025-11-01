package ar.edu.unlp.info.oo1.ejercicio21;

public class EnvioInterurbano extends Envio {

    private double distancia;
    
    public EnvioInterurbano() {
        super();
        this.setDistancia(0);
    }

    public EnvioInterurbano(String origen, String destino, double peso, double distance) {
        super(origen,destino,peso);
        this.setDistancia(distance);
    }

    public double getDistancia() {
        return this.distancia;
    }

    private void setDistancia(double distance) {
        this.distancia = distance;
    }

    public double calcularCosto() {
        double total = 0;
        if (this.getDistancia() < 100) {
            total = 20 * this.getPeso();
        } else if (this.getDistancia() < 500) {
            total = 25 * this.getPeso();
        } else {
            total = 30 * this.getPeso();
        }
        return total;
    }
    
}
