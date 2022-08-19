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
        int actual = solution.divide(10, 3);
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testSimple2() {
        int actual = solution.divide(7, -3);
        Assert.assertEquals(-2, actual);
    }

    @Test
    public void testSimple3() {
        int actual = solution.divide(1, 1);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testSimple4() {
        int actual = solution.divide(Integer.MIN_VALUE, Integer.MIN_VALUE);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testSimple5() {
        int actual = solution.divide(Integer.MIN_VALUE, Integer.MAX_VALUE);
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testSimple6() {
        int actual = solution.divide(Integer.MAX_VALUE, Integer.MIN_VALUE);
        Assert.assertEquals(0, actual);
    }

    @Test
    public void testSimple7() {
        int actual = solution.divide(Integer.MAX_VALUE, Integer.MAX_VALUE);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testSimple8() {
        int actual = solution.divide(Integer.MIN_VALUE, 1);
        Assert.assertEquals(Integer.MIN_VALUE, actual);
    }

    @Test
    public void testSimple9() {
        int actual = solution.divide(Integer.MAX_VALUE, -1);
        Assert.assertEquals(-Integer.MAX_VALUE, actual);
    }

    @Test
    public void testSimple10() {
        int actual = solution.divide(Integer.MIN_VALUE, -1);
        Assert.assertEquals(Integer.MAX_VALUE, actual);
    }

    @Test
    public void testSimple11() {
        int actual = solution.divide(Integer.MIN_VALUE, -2);
        Assert.assertEquals(1_073_741_824, actual);
    }
}
