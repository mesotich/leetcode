import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class SimpleTests {

    private Solution solution;
    private NodeList nodeList;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void testSimple1() {
        Solution.ListNode node1 = new Solution.ListNode(5, null);
        Solution.ListNode node2 = new Solution.ListNode(4, node1);
        Solution.ListNode node3 = new Solution.ListNode(3, node2);
        Solution.ListNode node4 = new Solution.ListNode(2, node3);
        Solution.ListNode node5 = new Solution.ListNode(1, node4);
        Solution.ListNode ac = solution.removeNthFromEnd(node5, 2);
        List<Integer> actual = new ArrayList<>();
        while (ac.next != null) {
            actual.add(ac.val);
            ac = ac.next;
        }
        actual.add(ac.val);
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 3, 5));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSimple2() {
        Solution.ListNode node1 = new Solution.ListNode(1, null);
        Solution.ListNode ac = solution.removeNthFromEnd(node1, 1);
        Assert.assertNull(ac);
    }
    @Test
    public void testSimple3() {
        Solution.ListNode node1 = new Solution.ListNode(2, null);
        Solution.ListNode node2 = new Solution.ListNode(1, node1);
        Solution.ListNode ac = solution.removeNthFromEnd(node2, 1);
        List<Integer> actual = new ArrayList<>();
        while (ac.next != null) {
            actual.add(ac.val);
            ac = ac.next;
        }
        actual.add(ac.val);
        List<Integer> expected = new ArrayList<>(List.of(1));
        Assert.assertEquals(expected, actual);
    }
}
