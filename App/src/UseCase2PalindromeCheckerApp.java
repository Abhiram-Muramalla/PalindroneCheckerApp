public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        if (word.equals("madam")) {
            System.out.println("The word '" + word + "' is a palindrome.");
        } else {
            System.out.println("The word '" + word + "' is not a palindrome.");
        }
    }
}