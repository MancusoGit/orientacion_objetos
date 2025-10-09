package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class EmailTest {

    private Email emailContenido;
    private Email emailVacio;
    private Archivo archivo1;

    @BeforeEach
    void setUp() {
        emailContenido = new Email("Carta Documento", "viva peron");
        emailContenido.agregarArchivo(archivo1);
        emailVacio = new Email();
    }

    @Test
    void testAdjuntos() {
        assertEquals(emailVacio.adjuntos(), null);
        assertNotEquals(emailContenido.adjuntos(), null);
        assertTrue(emailContenido.adjuntos().contains(archivo1));
    }

}
