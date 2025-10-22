package ar.edu.unlp.info.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class DateLapseTest {

    private DateLapse lapso;

    @BeforeEach
    void setUp() {
        this.lapso = new DateLapse(LocalDate.of(2024, 1, 1), LocalDate.of(2025,1,1));
    }

    @Test
    void testIncludesDate() {
        LocalDate fecha1 = LocalDate.of(2024, 2, 2);
        LocalDate fecha2 = LocalDate.of(2023, 6, 7);
        assertEquals(true, this.lapso.includesDate(fecha1));
        assertEquals(false, this.lapso.includesDate(fecha2));
    }

    @Test
    void testSizeInDays() {
        assertEquals(366, this.lapso.sizeInDays());
    }
}
