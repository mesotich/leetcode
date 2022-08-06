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
        Solution.ListNode node3 = new Solution.ListNode(1, node2);
        Solution.ListNode node4 = new Solution.ListNode(4);
        Solution.ListNode node5 = new Solution.ListNode(3, node4);
        Solution.ListNode node6 = new Solution.ListNode(1, node5);
        Solution.ListNode node7 = new Solution.ListNode(6);
        Solution.ListNode node8 = new Solution.ListNode(2, node7);
        List<Integer> expected = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 6));
        Solution.ListNode node = solution.mergeKLists(new Solution.ListNode[]{node3, node6, node8});
        List<Integer> actual = new ArrayList<>();
        while (node != null) {
            actual.add(node.val);
            node = node.next;
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSimple2() {
        Solution.ListNode actual = solution.mergeKLists(new Solution.ListNode[]{null});
        Assert.assertNull(actual);
    }
    @Test
    public void testSimple3() {
        Solution.ListNode actual = solution.mergeKLists(null);
        Assert.assertNull(actual);
    }
    @Test
    public void testSimple4() {
        Solution.ListNode actual = solution.mergeKLists(new Solution.ListNode[]{new Solution.ListNode(1),null});
        Assert.assertEquals(1,actual.val);
    }
}
