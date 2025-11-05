package parcial2023;

import java.util.LinkedList;

public class ProductoImportado extends Producto {
    private String paisOrigen;
    private LinkedList<String> paisesMercosur;

    public ProductoImportado(String nombre, double costo, String description ,String origen) {
        super(nombre,costo,description);
        this.setPaisOrigen(origen);
        this.paisesMercosur = new LinkedList<>();
        paisesMercosur.add("brasil");
        paisesMercosur.add("uruguay");
        paisesMercosur.add("paraguay");
    }

    public String getPaisOrigen() {
        return this.paisOrigen;
    }

    private void setPaisOrigen(String origin) {
        this.paisOrigen = origin;
    }
    
    @Override
    public double calcularImpuesto(int cantidad) {
        return this.paisesMercosur.contains(this.getPaisOrigen().toLowerCase()) && cantidad > 50 ? this.getCostoUnitario() * 0.08 : this.getCostoUnitario() * 0.21;
    }
}
