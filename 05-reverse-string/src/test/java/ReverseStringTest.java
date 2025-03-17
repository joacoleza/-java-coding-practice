import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {

    @Test
    public void testReverse() {
        // Test case 1: Simple case
        assertEquals("olleh", ReverseString.reverse("hello"));

        // Test case 2: Single character
        assertEquals("a", ReverseString.reverse("a"));

        // Test case 3: Empty string
        assertEquals("", ReverseString.reverse(""));

        // Test case 4: String with spaces
        assertEquals(" olleh", ReverseString.reverse("hello "));

        // Test case 5: Palindrome string (should remain the same)
        assertEquals("madam", ReverseString.reverse("madam"));
    }
}
