package leetcode;

class Node {
        int data;
        Node next;

public Node(int data) {
        this.data = data;
        this.next = null;
        }
        }

class PalindromeLL {
    Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean isPalindrome() {
        Node slow = head;
        Node fast = head;
        Node prev = null;

        // Find the middle of the linked list using slow and fast pointers
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // If the linked list has an odd number of elements, skip the middle node
        if (fast != null) {
            slow = slow.next;
        }

        // Compare the first half with the reversed second half
        while (slow != null) {
            assert prev != null;
            if (slow.data != prev.data) {
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeLL list = new PalindromeLL();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(2);
        list.append(1);

        if (list.isPalindrome()) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}