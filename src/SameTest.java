import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SameTest {

    Solution solution = new Solution();

    @Test
    public void testSame1() {
        int actual = solution.threeSumClosest(new int[]{1, 1, 1, 1, 1}, 6);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSame2() {
        int actual = solution.threeSumClosest(new int[]{1, 1, 1, 1, 1}, -3);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSame3() {
        int actual = solution.threeSumClosest(new int[]{1, 1, 1, 1, 1}, 1);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSame4() {
        int actual = solution.threeSumClosest(new int[]{1, 1, 1, 1, 1, 2, 2, 2}, 5);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSame5() {
        int actual = solution.threeSumClosest(new int[]{1, 1, 1, 1, 1, 2, 2, 2}, 3);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSame6() {
        int actual = solution.threeSumClosest(new int[]{-1,-1,-1,0,0,0,1, 1, 1, 1, 1, 2, 2, 2, 3,3,3,3}, 3);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
}
