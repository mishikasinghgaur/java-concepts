package leetcode;

public class IntersectionNode {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null; // If either list is empty, there can be no intersection.
        }

        ListNode a = headA;
        ListNode b = headB;

        // Traverse both lists until they meet or reach the end.
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a; // Return the intersection node, or null if there's no intersection.
    }

    public static void main (String[] args) {
        ListNode intersect = new ListNode(8);
        ListNode listA = new ListNode(4);
        listA.next = new ListNode(1);
        listA.next.next = intersect;
        ListNode listB = new ListNode(5);
        listB.next = new ListNode(6);
        listB.next.next = new ListNode(1);
        listB.next.next.next = intersect;

        ListNode result = getIntersectionNode(listA, listB);
        System.out.println("Intersected at: " + result.val);
    }
}
