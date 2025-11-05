package parcial2023;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoImportadoTest {
    ProductoImportado importProductMercosur;
    ProductoImportado importProductNM;

    @BeforeEach
    void setup() {
        importProductMercosur = new ProductoImportado("wd40", 180.0, "aflojador", "bRasIl");
        importProductNM = new ProductoImportado("raid", 70.0, "matador", "germany");
    }

    @Test
    void testCalcularImpuesto() {
        double esperadoMercosur = 180 * 0.08;
        double esperadoOtro = 70 * 0.21;
        assertEquals(esperadoMercosur, importProductMercosur.calcularImpuesto(60));
        assertEquals(esperadoOtro,  importProductNM.calcularImpuesto(30));
    }
}
