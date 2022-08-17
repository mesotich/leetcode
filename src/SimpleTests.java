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
        int actual = solution.strStr("hello", "ll");
        Assert.assertEquals(2, actual);
    }
    @Test
    public void testSimple2() {
        int actual = solution.strStr("aaaaa", "bba");
        Assert.assertEquals(-1, actual);
    }
    @Test
    public void testSimple3() {
        int actual = solution.strStr("aaaaa", "a");
        Assert.assertEquals(0, actual);
    }
    @Test
    public void testSimple4() {
        int actual = solution.strStr("hello", "llo");
        Assert.assertEquals(2, actual);
    }
    @Test
    public void testSimple5() {
        int actual = solution.strStr("hello", "hely");
        Assert.assertEquals(-1, actual);
    }
    @Test
    public void testSimple6() {
        int actual = solution.strStr("a", "a");
        Assert.assertEquals(0, actual);
    }
    @Test
    public void testSimple7() {
        int actual = solution.strStr("a", "a");
        Assert.assertEquals(0, actual);
    }
    @Test
    public void testSimple8() {
        int actual = solution.strStr("wer", "a");
        Assert.assertEquals(-1, actual);
    }
    @Test
    public void testSimple9() {
        int actual = solution.strStr("mississippi", "issip");
        Assert.assertEquals(4, actual);
    }
    @Test
    public void testSimple10() {
        int actual = solution.strStr("abc", "c");
        Assert.assertEquals(2, actual);
    }


}
