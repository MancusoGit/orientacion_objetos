package parcial2023;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ClienteTest {
    Cliente clientePrueba;

    @BeforeEach
    void setUp() 
    {
        clientePrueba = new Cliente("Jorge", "lanata@gmail.com");
        Pedido pedido = new Pedido();
        clientePrueba.nuevoPedido(pedido);
        clientePrueba.agregarProducto(pedido, new ProductoNacional("pepas", 900.0, "galles"), 5);
        clientePrueba.agregarProducto(pedido, new ProductoImportado("wd40", 2500.0,"aflojador", "brasil"), 60);
    }

    @Test
    void testCalcularTotalPeriodo() {
        DateLapse periodo = new DateLapse(LocalDate.of(2023,12,1), LocalDate.of(2026, 12, 1));
        double totalEsperado = (900 + (900*0.05)) * 5 + (2500 + (2500*0.08)) * 60;
        assertEquals(totalEsperado, clientePrueba.calcularTotalPeriodo(periodo));
    }
}
