
import java.util.Scanner;
import static java.lang.Character.toLowerCase;

public class CountVowels {

    public static int count(String str) {
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }
        return vowels;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to count its vowels: ");
        String input = scanner.nextLine();

        int count = count(input);

        System.out.println("Vowels count: " + count);

        scanner.close();
    }
}
