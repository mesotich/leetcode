import org.junit.Assert;
import org.junit.Test;

public class MinMaxValueTests {
Solution solution = new Solution();
    @Test
    public void testMinValue() {
        int actual = solution.threeSumClosest(new int[]{0,1,2},0);
        int expected = 3;
        Assert.assertEquals(expected,actual);
    }
}
