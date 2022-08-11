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
        Solution.ListNode node2 = new Solution.ListNode(3, node1);
        Solution.ListNode node3 = new Solution.ListNode(2, node2);
        Solution.ListNode node4 = new Solution.ListNode(1,node3);

        List<Integer> expected = new ArrayList<>(List.of(2,1,4,3));
        Solution.ListNode node = solution.swapPairs(node4);
        List<Integer> actual = new ArrayList<>();
        while (node != null) {
            actual.add(node.val);
            node = node.next;
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSimple2() {
        Solution.ListNode actual = solution.swapPairs(null);
        Assert.assertNull(actual);
    }
    @Test
    public void testSimple3() {
        Solution.ListNode node1 = new Solution.ListNode(1);
        Solution.ListNode actual = solution.swapPairs(node1);
        Assert.assertEquals(node1.val,actual.val);
    }

}
