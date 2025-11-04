package ar.edu.unlp.info.oo1.ejercicio29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VideoTest {
    private Video videoPrueba;

    @BeforeEach
    void setUp() {
        this.videoPrueba = new Video("123", 40, 5);
    }

    @Test
    void testCalcularPrecioActividad() {
        assertEquals(350, videoPrueba.calcularPrecioActividad());
    }
}
