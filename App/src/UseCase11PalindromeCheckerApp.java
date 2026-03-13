import java.util.Scanner;

    class PalindromeService {


        public boolean check(String text) {
            if (text == null) return false;

            String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            int left = 0;
            int right = clean.length() - 1;

            while (left < right) {
                if (clean.charAt(left) != clean.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

    public class UseCase11PalindromeCheckerApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            PalindromeService service = new PalindromeService();

            System.out.println("--- Palindrome Service App ---");
            System.out.print("Enter text to verify: ");
            String input = sc.nextLine();

            if (service.check(input)) {
                System.out.println("Result: Success! It is a palindrome.");
            } else {
                System.out.println("Result: Failure. Not a palindrome.");
            }

            sc.close();
        }
    }