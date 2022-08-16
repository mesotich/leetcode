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
        int actual = solution.removeElement(new int[]{3, 2, 2, 3}, 3);
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testSimple2() {
        int actual = solution.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        Assert.assertEquals(5, actual);
    }
    @Test
    public void testSimple3() {
        int actual = solution.removeElement(new int[]{2,2,2,2}, 2);
        Assert.assertEquals(0, actual);
    }
    @Test
    public void testSimple4() {
        int actual = solution.removeElement(new int[]{2,2,2,2,3,3}, 3);
        Assert.assertEquals(4, actual);
    }
}
