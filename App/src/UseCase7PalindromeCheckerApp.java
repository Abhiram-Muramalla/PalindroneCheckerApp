import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class UseCase7PalindromeCheckerApp {

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
            Deque<Character> deque = new ArrayDeque<>();

            // Add all characters to the deque
            for (int i = 0; i < str.length(); i++) {
                deque.addLast(str.charAt(i));
            }

            // Compare from both ends
            while (deque.size() > 1) {
                char front = deque.removeFirst();
                char back = deque.removeLast();

                if (front != back) {
                    return false;
                }
            }

            return true;
        }
    }
