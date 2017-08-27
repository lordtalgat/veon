package kz.veon;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testSubstract() {
        Main main = new Main();
        long result = main.substract(111L,123L);
        assertEquals(234L, result);
    }
}
