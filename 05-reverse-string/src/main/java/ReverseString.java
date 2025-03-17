import java.util.Scanner;

public class ReverseString {

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to reverse: ");
        String input = scanner.nextLine();

        String reversed = reverse(input);

        System.out.println("Reversed String: " + reversed);

        scanner.close();
    }
}
