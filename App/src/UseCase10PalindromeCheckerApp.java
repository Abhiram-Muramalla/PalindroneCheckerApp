import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: It is a palindrome (ignoring case/spaces).");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
        sc.close();
    }

    public static boolean isPalindrome(String str) {
        // Step 1 & 2: Remove spaces/punctuation and convert to lowercase
        // regex [^a-zA-Z0-9] matches anything that is NOT a letter or number
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 3: Standard pointer check on the cleaned string
        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}