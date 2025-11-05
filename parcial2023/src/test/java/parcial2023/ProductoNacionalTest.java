package parcial2023;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoNacionalTest {
    ProductoNacional estaLocura;

    @BeforeEach
    void setUp() {
        estaLocura = new ProductoNacional("pepas", 80.0, "galles");
    }

    @Test
    void testCalcularImpuesto() {
        double esperado = 80 * 0.05;
        assertEquals(esperado, estaLocura.calcularImpuesto(6));
        assertEquals(0.0, estaLocura.calcularImpuesto(12));
    }
}
