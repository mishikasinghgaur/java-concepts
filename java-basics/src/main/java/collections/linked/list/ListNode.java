package collections.linked.list;

import java.util.List;

public class ListNode {
    int val;

    ListNode next;

    ListNode (int value){
        val = value;
    }

    public static ListNode removeNthNodeFromEnd(ListNode head, int n) {

        ListNode node = new ListNode(0);
        node.next = head;

        ListNode prev = node;
        ListNode fast = node;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return node.next;
    }

    public static void main (String[] args) {

        ListNode head = new ListNode(10);

        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        ListNode result = removeNthNodeFromEnd(head , 2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }


    }
}


