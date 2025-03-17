import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsPalindromeTest {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testIsPalindrome(String input, Boolean expected) {
        Boolean result = IsPalindrome.isPalindrome(input);
        assertEquals(expected, result);
    }

    // Method that provides test data
    static Stream<org.junit.jupiter.params.provider.Arguments> provideTestCases() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of("racecar", true),
            org.junit.jupiter.params.provider.Arguments.of("Racecar", true),
            org.junit.jupiter.params.provider.Arguments.of("Rac ecar", true),
            org.junit.jupiter.params.provider.Arguments.of("hello", false),
            org.junit.jupiter.params.provider.Arguments.of("", true),
            org.junit.jupiter.params.provider.Arguments.of("  ", true),
            org.junit.jupiter.params.provider.Arguments.of(".", true),
            org.junit.jupiter.params.provider.Arguments.of(" a!a  ", true),
            org.junit.jupiter.params.provider.Arguments.of("121", true),
            org.junit.jupiter.params.provider.Arguments.of("1212", false),
            org.junit.jupiter.params.provider.Arguments.of("A man, a plan, a canal, Panama", true)
        );
    }
}
