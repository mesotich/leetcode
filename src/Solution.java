class Solution {

    private ListNode[] arr;
    private ListNode nextHead;

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1)
            return head;
        arr = new ListNode[k];
        return recursive(head);
    }

    private ListNode recursive(ListNode head) {
        if (head == null)
            return null;
        for (int i = 0; i < arr.length; i++) {
            if (head == null)
                return arr[0];
            arr[i] = head;
            head = head.next;
        }
        int last = arr.length - 1;
        ListNode lastNode = arr[last];
        nextHead = arr[last].next;
        for (int i = last; i >= 1; i--) {
            arr[i].next = arr[i - 1];
        }
        arr[0].next = recursive(nextHead);
        return lastNode;
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
