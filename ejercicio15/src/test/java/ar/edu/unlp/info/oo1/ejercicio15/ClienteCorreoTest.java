package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ClienteCorreoTest {

    private ClienteDeCorreo client;
    private Email mail;
    private Archivo arch;

    @BeforeEach
    void setUp() {
        this.arch = new Archivo();
        arch.setTamaño(5);
        this.client = new ClienteDeCorreo();
        this.mail = new Email("Cartita Documento", "Aguante River");
        for (int i = 0; i < 3; i++) {
            mail.agregarArchivo(arch);
        }
    }

    @Test
    void testRecibir() {
        client.recibir(mail);
        assertEquals(mail.getCarpetaContenido(), client.getInboxName());
    }

    @Test
    void testEspacioOcupado() {
        for (int i = 0; i < 3; i++) {
            client.recibir(mail);
        }
        int tamaño = (arch.getTamaño() * 9) + (30 * 3); //la primer parte calcula el total de los archivos, y la segunda la cantidad total de caracteres del email
        assertEquals(tamaño, client.espacioOcupado());
    }

    @Test
    void testBuscar() {
        String sectionTrue = "Cartita";
        //String sectionFalse = "Carta";
        client.recibir(mail);
        assertEquals(mail, client.buscar(sectionTrue));
        //assertEquals(null, client.buscar(sectionFalse));
    }

}
