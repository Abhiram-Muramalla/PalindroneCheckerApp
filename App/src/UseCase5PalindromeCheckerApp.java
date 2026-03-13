import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        // Step 1: Push all characters onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Step 2: Pop and compare with the original string
        for (int i = 0; i < str.length(); i++) {
            char originalChar = str.charAt(i);
            char reversedChar = stack.pop();

            if (originalChar != reversedChar) {
                return false;
            }
        }

        return true;
    }
}