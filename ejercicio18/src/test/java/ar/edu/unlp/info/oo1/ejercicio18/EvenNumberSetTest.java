package ar.edu.unlp.info.oo1.ejercicio18;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class EvenNumberSetTest {
    private Set<Integer> set;

    @BeforeEach
    void setUp() {
        this.set = new EvenNumberSet();
    }

    @Test
    void testAdd() {
        set.add(2);
        set.add(5);
        assertEquals(true, set.contains(2));
        assertEquals(false, set.contains(5));
    }
}
