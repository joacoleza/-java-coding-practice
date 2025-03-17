import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountVowelsTest {

    @Test
    public void testCountVowels() {
        // Test case 1: Simple case
        assertEquals(2, CountVowels.count("hello"));

        // Test case 2: Single character
        assertEquals(1, CountVowels.count("a"));

        // Test case 3: Empty string
        assertEquals(0, CountVowels.count(""));

        // Test case 4: String with spaces
        assertEquals(2, CountVowels.count("hello "));

        // Test case 5: No vowels
        assertEquals(0, CountVowels.count("xyz"));

        // Test case 6: Should count upper case vowels
        assertEquals(5, CountVowels.count("AeIoU"));

        // Test case 7: Should not count vowels with accent
        assertEquals(1, CountVowels.count("cAfé"));
    }
}
