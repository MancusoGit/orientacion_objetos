package parcial2023;

import java.util.LinkedList;

public class Distribuidora {
    private LinkedList<Cliente> clientes;
    private LinkedList<Producto> productos;

    public Distribuidora() {
        this.clientes = new LinkedList<>();
        this.productos = new LinkedList<>();
    }

    public void agregarCliente(String nombre, String email) {
        this.clientes.add(new Cliente(nombre, email));
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void nuevoPedidoCliente(Cliente cliente) {
        Cliente consulta = buscarCliente(cliente);
        if (consulta != null) {
            consulta.nuevoPedido();
        }
    }

    public double calcularTotalProducto(Producto product) {
        return this.clientes.stream()
                .mapToDouble(cliente -> cliente.calcularTotalProducto(product))
                .sum();   
    }

    private Cliente buscarCliente(Cliente client) {
        return this.clientes.stream()
                .filter(cliente -> cliente.equals(client))
                .findFirst()
                .orElse(null);
    }

    public double calcularCostoCliente(Cliente client, DateLapse periodo) {
        Cliente consulta = buscarCliente(client);
        return consulta != null ? consulta.calcularTotalPeriodo(periodo) : 0;
    }
    
}
