package ar.edu.unlp.info.oo1.ejercicio29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ItemTest {
    private Item item1;

    @BeforeEach
    void setUp() {
        this.item1 = new Item("espada",1,150);
    }

    @Test
    void testSumarCantidad() {
        item1.sumarCantidad(3);
        assertEquals(4, item1.getCantidad());
    }

    @Test 
    void testCalcularCosto() {
        double esperado = 150;
        assertEquals(esperado, item1.calcularCosto());
        item1.sumarCantidad(4);
        esperado = 150 * 5;
        assertEquals(esperado, item1.calcularCosto());
    }
}
