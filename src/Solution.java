import java.util.ArrayList;
import java.util.List;

class Solution {

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

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9, node1);
        ListNode node3 = new ListNode(9, node2);
        ListNode node4 = new ListNode(9,node3);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9, node5);
        System.out.println(solution.addTwoNumbers(node4, node6).next.next.next.next.val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode zero = new ListNode(0);
        if (l1 == null && l2 == null)
            return zero;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        int one = 0;
        List<Integer> list = new ArrayList<>();
        while (l1 != null || l2 != null) {
            int a = 0;
            int b = 0;
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }
            int sum = a + b + one;
            one = (sum < 10) ? 0 : 1;
            list.add(sum % 10);
        }
        if(one==1)
            list.add(1);
        ListNode nextNode = new ListNode(list.get(list.size() - 1));
        ListNode node = null;
        for (int i = list.size() - 2; i >= 0; i--) {
            node = new ListNode(list.get(i), nextNode);
            nextNode = node;
        }
        return nextNode;
    }
}
