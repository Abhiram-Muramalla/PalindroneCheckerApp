import java.util.Scanner;
import java.util.Stack;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}
public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Build the Linked List
        Node head = null;
        Node tail = null;
        for (char ch : input.toCharArray()) {
            Node newNode = new Node(ch);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        if (isPalindrome(head)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
        sc.close();
    }

    public static boolean isPalindrome(Node head) {
        Node temp = head;
        Stack<Character> stack = new Stack<>();

        // Push all elements to stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        // Compare nodes with stack pops
        temp = head;
        while (temp != null) {
            if (temp.data != stack.pop()) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }
}