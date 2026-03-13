import java.util.Scanner;
import java.util.Stack;

// 1. The Strategy Interface
interface PalindromeStrategy {
    boolean isValid(String text);
}

// 2. Concrete Strategy A: Two-Pointer Approach
class TwoPointerStrategy implements PalindromeStrategy {
    public boolean isValid(String text) {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) return false;
        }
        return true;
    }
}

// 3. Concrete Strategy B: Stack-Based Approach
class StackStrategy implements PalindromeStrategy {
    public boolean isValid(String text) {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : clean.toCharArray()) stack.push(c);
        for (char c : clean.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

// 4. The Context Class
class PalindromeChecker {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeCheck(String text) {
        return strategy.isValid(text);
    }
}

// 5. Main Class
public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        // Dynamically choose the strategy
        System.out.println("Using Two-Pointer Strategy...");
        checker.setStrategy(new TwoPointerStrategy());
        System.out.println("Result: " + checker.executeCheck(input));

        System.out.println("\nSwitching to Stack Strategy...");
        checker.setStrategy(new StackStrategy());
        System.out.println("Result: " + checker.executeCheck(input));

        sc.close();
    }
}