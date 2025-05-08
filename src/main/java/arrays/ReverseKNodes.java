package arrays;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class ReverseKNodes {

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        // Dummy node to simplify handling the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupEnd = dummy;

        while (true) {
            // Check if there are at least k nodes left
            ListNode kth = getKthNode(prevGroupEnd, k);
            if (kth == null) break;

            ListNode groupStart = prevGroupEnd.next;
            ListNode nextGroupStart = kth.next;

            // Reverse k nodes
            ListNode prev = kth.next;
            ListNode curr = groupStart;
            while (curr != nextGroupStart) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Connect previous group to reversed group
            prevGroupEnd.next = kth;
            prevGroupEnd = groupStart; // Move prevGroupEnd to end of reversed group
        }

        return dummy.next;
    }

    // Helper to get the k-th node from current node
    private static ListNode getKthNode(ListNode start, int k) {
        while (start != null && k > 0) {
            start = start.next;
            k--;
        }
        return start;
    }

    // Helper method to print a linked list (optional)
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Input: 1 -> 2 -> 3 -> 4 -> 5, k = 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 3;
        ListNode result = reverseKGroup(head, k);

        // Output: 3 -> 2 -> 1 -> 4 -> 5
        printList(result);
    }
}
