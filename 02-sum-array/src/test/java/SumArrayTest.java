import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumArrayTest {

    @Test
    public void testCalculateSum() {
        int[] input = {5, 10, 15};
        int result = SumArray.calculateSum(input);
        assertEquals(30, result);
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int result = SumArray.calculateSum(input);
        assertEquals(0, result);
    }

    @Test
    public void testNegativeNumbers() {
        int[] input = {-1, -2, -3};
        int result = SumArray.calculateSum(input);
        assertEquals(-6, result);
    }
}
