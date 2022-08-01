
class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        ListNode tail = head;
        for (int i = 1; i < n; i++) {
            tail = tail.next;
        }
        if (tail.next == null) {
            head = head.next;
            return head;
        }
        tail = tail.next;
        ListNode delNode = head.next;
        ListNode nextNode = delNode.next;
        ListNode previousNode = head;
        while (tail.next != null) {
            tail = tail.next;
            delNode = delNode.next;
            previousNode = previousNode.next;
            nextNode = nextNode.next;
        }
        previousNode.next = nextNode;
        return head;
    }

    public static class ListNode {

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
}





