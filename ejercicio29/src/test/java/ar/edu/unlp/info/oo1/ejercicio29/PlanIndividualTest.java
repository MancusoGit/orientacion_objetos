package ar.edu.unlp.info.oo1.ejercicio29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlanIndividualTest {
    private PlanIndividual planPrueba;

    @BeforeEach
    void setUp() {
        this.planPrueba = new PlanIndividual(50);
    }

    @Test
    void testCalcularPenalizacion() {
        assertEquals(0.0, planPrueba.calcularPenalizacion(1, 0));
        assertEquals(300 * 5, planPrueba.calcularPenalizacion(5, 0));
    }

    @Test
    void testCalcularPrecioBase() {
        assertEquals(20 * 50, planPrueba.calcularPrecioBase());
    }
}
