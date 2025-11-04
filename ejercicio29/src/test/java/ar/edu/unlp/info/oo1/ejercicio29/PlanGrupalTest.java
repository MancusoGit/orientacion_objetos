package ar.edu.unlp.info.oo1.ejercicio29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlanGrupalTest {
    private PlanGrupal planPrueba;

    @BeforeEach
    void setUp() {
        this.planPrueba = new PlanGrupal(4);
    }

    @Test
    void testCalcularPenalizacion() {
        assertEquals(0.0, planPrueba.calcularPenalizacion(2, 2000));
        assertEquals(4 * 500, planPrueba.calcularPenalizacion(8, 2023));
        assertEquals(0, planPrueba.calcularPenalizacion(8, 2000));
    }

    @Test
    void testCalcularPrecioBase() {
        assertEquals(4 * 800, planPrueba.calcularPrecioBase());
    }

}
