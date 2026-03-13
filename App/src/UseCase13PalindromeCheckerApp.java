public class UseCase13PalindromeCheckerApp {
        public static void main(String[] args) {
            // 1. Generate a large palindrome for testing (1 million characters)
            StringBuilder sb = new StringBuilder("a".repeat(500000));
            String largeInput = sb.toString() + sb.reverse().toString();

            System.out.println("Testing Palindrome Algorithms (Length: " + largeInput.length() + ")\n");

            // Test Two-Pointer
            long start = System.nanoTime();
            isPalindromeTwoPointer(largeInput);
            long end = System.nanoTime();
            System.out.println("Two-Pointer Time: " + (end - start) / 1_000_000.0 + " ms");

            // Test Stack-Based
            start = System.nanoTime();
            isPalindromeStack(largeInput);
            end = System.nanoTime();
            System.out.println("Stack-Based Time: " + (end - start) / 1_000_000.0 + " ms");
        }

        public static boolean isPalindromeTwoPointer(String str) {
            int left = 0, right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left++) != str.charAt(right--)) return false;
            }
            return true;
        }

        public static boolean isPalindromeStack(String str) {
            java.util.Stack<Character> stack = new java.util.Stack<>();
            for (int i = 0; i < str.length(); i++) stack.push(str.charAt(i));
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != stack.pop()) return false;
            }
            return true;
        }
    }
