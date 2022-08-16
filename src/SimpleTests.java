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
        Solution.ListNode node1 = new Solution.ListNode(5);
        Solution.ListNode node2 = new Solution.ListNode(4, node1);
        Solution.ListNode node3 = new Solution.ListNode(3, node2);
        Solution.ListNode node4 = new Solution.ListNode(2, node3);
        Solution.ListNode node5 = new Solution.ListNode(1, node4);
        List<Integer> expected = new ArrayList<>(List.of(3, 2, 1, 4, 5));
        Solution.ListNode node = solution.reverseKGroup(node5, 3);
        List<Integer> actual = new ArrayList<>();
        while (node != null) {
            actual.add(node.val);
            node = node.next;
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSimple2() {
        Solution.ListNode node1 = new Solution.ListNode(1);
        Solution.ListNode actual = solution.reverseKGroup(node1, 1);
        Assert.assertEquals(node1.val, actual.val);
    }

    @Test
    public void testSimple3() {
        Solution.ListNode node1 = new Solution.ListNode(5);
        Solution.ListNode node2 = new Solution.ListNode(4, node1);
        Solution.ListNode node3 = new Solution.ListNode(3, node2);
        Solution.ListNode node4 = new Solution.ListNode(2, node3);
        Solution.ListNode node5 = new Solution.ListNode(1, node4);
        List<Integer> expected = new ArrayList<>(List.of(2, 1, 4, 3, 5));
        Solution.ListNode node = solution.reverseKGroup(node5, 2);
        List<Integer> actual = new ArrayList<>();
        while (node != null) {
            actual.add(node.val);
            node = node.next;
        }
        Assert.assertEquals(expected, actual);
    }
}
