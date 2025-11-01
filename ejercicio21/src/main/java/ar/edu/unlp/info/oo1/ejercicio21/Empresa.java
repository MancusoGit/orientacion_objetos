package ar.edu.unlp.info.oo1.ejercicio21;

import java.util.LinkedList;

public class Empresa {

    private LinkedList<Cliente> clientes;

    public Empresa() {
        this.clientes = new LinkedList<>();
    }

    public Empresa (LinkedList<Cliente> lista) {
        this.clientes = lista;
    }

    private Cliente buscarCliente(String adress) {
        return this.clientes.stream()
        .filter(cliente -> cliente.getDireccion().equals(adress))
        .findFirst()
        .orElse(null);
        
    }

    public void agregarPedido(Cliente cliente, Envio envio) {
        Cliente consulta = buscarCliente(cliente.getDireccion());
        if (consulta == null) {
            clientes.add(cliente);
        } 
        consulta.agregarEnvio(envio);
    }

    public double calcularCostoCliente(Cliente cliente, DateLapse periodo) {
        Cliente consulta = buscarCliente(cliente.getDireccion());
        return consulta != null ? cliente.calcularCosto(periodo) : 0;
    }

    

}
