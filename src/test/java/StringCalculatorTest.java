import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAdd1() {
        String numbers = "1, 2, 3, 4";
        assertEquals(10, calculator.add(numbers));
    }

    @Test
    public void testAdd2() {
        String numbers = "5";
        assertEquals(5, calculator.add(numbers));
    }

    @Test
    public void testAdd3() {
        String numbers = "900, 50, 900";
        assertEquals(1850, calculator.add(numbers));
    }

    @Test
    public void testAdd4() {
        String numbers = "900, 1000, 1";
        assertEquals(901, calculator.add(numbers));
    }

    @Test
    public void testAdd5() {
        String numbers = "";
        assertEquals(0, calculator.add(numbers));
    }

    @Test
    public void testAdd6() {
        String numbers = "8, -1, 3";
        assertThrows(IllegalArgumentException.class, () -> calculator.add(numbers));
    }
}
