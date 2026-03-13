import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            if (isPalindrome(input)) {
                System.out.println("Result: It is a palindrome.");
            } else {
                System.out.println("Result: It is not a palindrome.");
            }
            sc.close();
        }

        public static boolean isPalindrome(String str) {
            // Base cases
            if (str.length() <= 1) {
                return true;
            }

            // Check first and last characters
            if (str.charAt(0) != str.charAt(str.length() - 1)) {
                return false;
            }

            // Recursive call with inner substring
            return isPalindrome(str.substring(1, str.length() - 1));
        }
    }