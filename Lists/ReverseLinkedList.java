import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseLinkedList {
    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        Deque<ListNode> deque = new ArrayDeque<>();
        while (head != null) {
            deque.add(head);
            head = head.next;
        }
        ListNode tmp = new ListNode();
        ListNode ans = tmp;
        while (!deque.isEmpty()) {
            tmp.next = deque.removeLast();
            tmp = tmp.next;
        }
        tmp.next = null;
        return ans.next;
    }
}
