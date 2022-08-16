import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleTests {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void testSimple1() {
        int actual = solution.removeDuplicates(new int[]{1, 1, 2});
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testSimple2() {
        int actual = solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        Assert.assertEquals(5, actual);
    }
    @Test
    public void testSimple3() {
        int actual = solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4,4,4});
        Assert.assertEquals(5, actual);
    }
}
