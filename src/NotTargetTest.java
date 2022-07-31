import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class NotTargetTest {
  Solution solution = new Solution();


    @Test
    public void testNotTarget1() {
        int actual = solution.threeSumClosest(new int[]{-3,-4,0, 98,99},120);
        int expected = 96;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testNotTarget2() {
        int actual = solution.threeSumClosest(new int[]{-3,-4,0, 98,99},-8);
        int expected = -7;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testNotTarget3() {
        int actual = solution.threeSumClosest(new int[]{-3,-4,0, 98,99},90);
        int expected = 91;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testNotTarget4() {
        int actual = solution.threeSumClosest(new int[]{-3,-4,0, 98,99},6);
        int expected = -7;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testNotTarget5() {
        int actual = solution.threeSumClosest(new int[]{-3,-4,0, 95,99},97);
        int expected = 96;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testNotTarget6() {
        int actual = solution.threeSumClosest(new int[]{-982,-981,-980,-979},-2950);
        int expected = -2943;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testNotTarget7() {
        int actual = solution.threeSumClosest(new int[]{0,1,2},0);
        int expected = 3;
        Assert.assertEquals(expected,actual);
    }

}