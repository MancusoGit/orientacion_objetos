package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    private Cliente clienteIndividual;
    private Cliente clienteGrupal;

    @BeforeEach
    void setUp() {
        this.clienteIndividual = new Cliente("Tomas", "134.0.6", new PlanIndividual(600));
        this.clienteGrupal = new Cliente("Constanza", "192.0.4", new PlanGrupal(5));
        Juego juegoPruebaIp = new Juego(clienteIndividual.getIPAddress(), 500);
        juegoPruebaIp.agregarItem("abc", 4, 1000);
        Juego juegoPruebaIpMal = new Juego(clienteGrupal.getIPAddress(), 500);
        juegoPruebaIpMal.agregarItem("dcf", 2, 3000);
        clienteIndividual.agregarActividad(juegoPruebaIp);
        clienteIndividual.agregarActividad(juegoPruebaIpMal);
        clienteGrupal.agregarActividad(juegoPruebaIpMal);
    }

    @Test
    void testCalcularIpDetectadas() {
        assertEquals(1, clienteIndividual.calcularIpDetectadas());
        assertEquals(0, clienteGrupal.calcularIpDetectadas());
    }

    @Test
    void testCalcularPenalizacion() {
        assertEquals(300, clienteIndividual.calcularPenalizacion());
        assertEquals(0, clienteGrupal.calcularPenalizacion());
    }

    @Test
    void testCalcularTotal() {
        LocalDate inicio = LocalDate.of(2024, 1, 1);
        LocalDate fin = LocalDate.of(2026, 1, 1);
        DateLapse periodo = new DateLapse(inicio, fin);
        double totalIndividual = 10000 + 300 + 12000;
        double totalGrupal = 6000 + 4000;
        assertEquals(totalIndividual, clienteIndividual.calcularTotal(periodo));
        assertEquals(totalGrupal, clienteGrupal.calcularTotal(periodo));
    }

}
