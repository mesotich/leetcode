import java.util.TreeSet;

class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];
        ListNode newNode = new ListNode();
        ListNode node;
        ListNode result = newNode;
        TreeSet<ListNode> set = new TreeSet<>((o1, o2) -> {
            if (o1.val == o2.val)
                return o1.hashCode() - o2.hashCode();
            return o1.val - o2.val;
        });
        for (ListNode n : lists
        ) {
            if (n != null)
                set.add(n);
        }
        while (!set.isEmpty()) {
            node = set.pollFirst();
            newNode.next = node;
            newNode = newNode.next;
            node = node.next;
            if (node != null)
                set.add(node);
        }
        return result.next;
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