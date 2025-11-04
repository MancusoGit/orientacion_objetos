package ar.edu.unlp.info.oo1.ejercicio29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuegoTest {
    private Juego juegoLargo;
    private Juego juegoCorto;

    @BeforeEach
    void setUp() {
        this.juegoLargo = new Juego("123", 400);
        this.juegoCorto = new Juego("456", 100);
        juegoLargo.agregarItem("espada", 2, 150);
        juegoCorto.agregarItem("espada", 2, 150);
    }

    @Test
    void testCalcularPrecioActividad() {
        assertEquals(0, juegoCorto.calcularPrecioActividad());
        assertEquals(300, juegoLargo.calcularPrecioActividad());
    }
}
