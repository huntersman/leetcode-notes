public class SwapNodesInPairs {
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

    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode();
        ListNode ans = pre;
        pre.next = head;
        while (head != null) {
            if (head.next == null) {
                break;
            }
            ListNode tmp = head.next.next;
            pre.next = head.next;
            pre.next.next = head;
            pre = head;
            head.next = tmp;
            head = head.next;
        }
        return ans.next;
    }
}
