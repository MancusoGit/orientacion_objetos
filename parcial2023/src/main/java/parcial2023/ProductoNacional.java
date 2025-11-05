package parcial2023;

public class ProductoNacional extends Producto {
    
    public ProductoNacional(String nombre, double price, String desc) {
        super(nombre, price, desc);
    }

    @Override
    public double calcularImpuesto(int cantidad) {
        return cantidad < 10 ? this.getCostoUnitario() * 0.05 : 0;
    }
    
}
