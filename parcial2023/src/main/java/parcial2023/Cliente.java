package parcial2023;

import java.time.LocalDate;
import java.util.LinkedList;

public class Cliente {
    private String nombre;
    private String email;
    private LocalDate fechaAlta;
    private LinkedList<Pedido> pedidos;

    public Cliente(String nombre, String email) {
        this.setNombre(nombre);
        this.setEmail(email);
        this.pedidos = new LinkedList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String name) {
        this.nombre = name;
    }

    public String getEmail() {
        return this.email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }

    private Pedido buscarPedido(Pedido pedidoSearch) {
        return this.pedidos.stream()
                .filter(pedido -> pedido.equals(pedidoSearch))
                .findFirst()
                .orElse(null);
    }

    public void nuevoPedido() {
        this.pedidos.add(new Pedido());
    }

    public void nuevoPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void agregarProducto(Pedido pedido, Producto product, int cantidad) {
        Pedido consulta = buscarPedido(pedido);
        if (consulta != null) {
            consulta.agregarProducto(product, cantidad);
        }
    }

    public double calcularTotalProducto(Producto product) {
        return this.pedidos.stream()
                .mapToDouble(pedido -> pedido.getCantidadProducto(product))
                .sum();
    }

    public double calcularTotalPeriodo(DateLapse periodo) {
        return this.pedidos.stream()
                .filter(pedido -> periodo.includesDate(pedido.getFechaEmision()))
                .mapToDouble(pedido -> pedido.calcularTotal())
                .sum();
    }

}
