package parcial2023;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private Map<Producto, Integer> items;
    private LocalDate fechaEmision;

    public Pedido() {
        this.items = new HashMap<>();
        this.fechaEmision = LocalDate.now();
    }

    public LocalDate getFechaEmision() {
        return this.fechaEmision;
    }

    public void agregarProducto(Producto product, int cantidad) {
        items.put(product,cantidad);
    }

    public int getCantidadProducto(Producto product) {
        return this.items.getOrDefault(product, 0);
    }

    public double calcularTotal() {
        return this.items.entrySet().stream()
                .mapToDouble(e -> e.getKey().calcularTotal(e.getValue()))
                .sum();
    }
}
