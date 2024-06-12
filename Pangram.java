import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        boolean[] isPresent = new boolean[26];
        int index;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                index = ch - 'a';
                isPresent[index] = true;
            }
        }

        boolean isPangram = true;
        for (boolean b : isPresent) {
            if (!b) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The input string is a pangram.");
        } else {
            System.out.println("The input string is not a pangram.");
        }
    }
}
