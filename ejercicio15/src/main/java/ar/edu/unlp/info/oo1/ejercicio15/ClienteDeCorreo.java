package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.*;

public class ClienteDeCorreo {
    private Carpeta inbox;
    private List<Carpeta> carpetas;

    public ClienteDeCorreo() {
        inbox = new Carpeta("inbox");
        this.carpetas = new LinkedList<>();
        carpetas.add(inbox);
    }
    
    public String getInboxName() {
        return this.inbox.getNombre();
    }

    public void crearCarpeta(String name) {
        this.carpetas.add(new Carpeta(name));
    }

    public void recibir(Email email) {
        this.inbox.agregarEmail(email);
    }

    public int espacioOcupado() {
        return this.carpetas.stream()
        .mapToInt(folder -> folder.calcularTamaño())
        .sum();
    }
    
    public Email buscar(String texto) {
        return this.carpetas.stream()
                .map(carpeta -> carpeta.search(texto))
                .findFirst()
                .orElse(null);
    }
}
