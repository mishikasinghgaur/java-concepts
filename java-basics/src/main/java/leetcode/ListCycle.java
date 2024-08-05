package leetcode;

public class ListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node.
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;      // Move one step.
            fast = fast.next.next; // Move two steps.

            if (slow == fast) {
                return true; // The two pointers meet, indicating a cycle.
            }
        }

        return false; // No cycle found.
    }

    public static void main (String[] args) {
        // Create a linked list with a cycle
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeNeg4 = new ListNode(-4);

        head.next = node2;
        node2.next = node0;
        node0.next = nodeNeg4;
        nodeNeg4.next = node2; // Cycle here

        boolean result = hasCycle(head);
        System.out.println(result); // Output: true

    }
}
