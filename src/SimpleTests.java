import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SimpleTests {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void testSimple1() {
        Solution.ListNode node1 = new Solution.ListNode(4);
        Solution.ListNode node2 = new Solution.ListNode(2, node1);
        Solution.ListNode node3 = new Solution.ListNode(1, node2);
        Solution.ListNode node4 = new Solution.ListNode(4);
        Solution.ListNode node5 = new Solution.ListNode(3, node4);
        Solution.ListNode node6 = new Solution.ListNode(1, node5);
        List<Integer> expected = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4));
        List<Integer> actual = new ArrayList<>();
        Solution.ListNode node = solution.mergeTwoLists(node3, node6);
        while (node.next != null) {
            actual.add(node.val);
            node = node.next;
        }
        actual.add(node.val);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSimple2() {
        Assert.assertNull(solution.mergeTwoLists(null, null));
    }
    @Test
    public void testSimple3() {
        Solution.ListNode node1 = new Solution.ListNode();
        List<Integer> expected = new ArrayList<>(List.of(0));
        List<Integer> actual = new ArrayList<>();
        Solution.ListNode node = solution.mergeTwoLists(null, node1);
        while (node.next != null) {
            actual.add(node.val);
            node = node.next;
        }
        actual.add(node.val);
        Assert.assertEquals(expected, actual);
    }
}
