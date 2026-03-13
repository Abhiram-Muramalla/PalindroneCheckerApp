import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        sc.close();
    }

    public static boolean isPalindrome(String str) {
        // Convert string to character array
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Compare characters at both ends
            if (charArray[left] != charArray[right]) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }
}
