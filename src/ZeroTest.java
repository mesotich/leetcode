import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ZeroTest{
  Solution solution = new Solution();


    @Test
    public void testThreeZero1() {
        int actual = solution.threeSumClosest(new int[]{0,0,0},0);
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testThreeZero2() {
        int actual = solution.threeSumClosest(new int[]{0,0,0},-2);
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testThreeZero3() {
        int actual = solution.threeSumClosest(new int[]{0,0,0},3);
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testThreeZero4() {
        int actual = solution.threeSumClosest(new int[]{0,0,0,0},0);
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testThreeZero5() {
        int actual = solution.threeSumClosest(new int[]{0,0,0,0},-3);
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testThreeZero6() {
        int actual = solution.threeSumClosest(new int[]{0,0,0,0},3);
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }
}