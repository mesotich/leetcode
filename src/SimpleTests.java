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
        boolean expected = true;
        boolean actual = solution.isValid("()");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSimple2() {
        boolean expected = true;
        boolean actual = solution.isValid("()[]{}");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSimple3() {
        boolean expected = false;
        boolean actual = solution.isValid("(]");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSimple4() {
        boolean expected = true;
        boolean actual = solution.isValid("(({[]}))");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSimple5() {
        boolean expected = false;
        boolean actual = solution.isValid("(({[]}){");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSimple6() {
        boolean expected = false;
        boolean actual = solution.isValid("){");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSimple7() {
        boolean expected = true;
        boolean actual = solution.isValid("{[]{()()}}");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSimple8() {
        boolean expected = false;
        boolean actual = solution.isValid("{[]{(}()}}");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSimple9() {
        boolean expected = false;
        boolean actual = solution.isValid("{[]{(}()})");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSimple10() {
        boolean expected = false;
        boolean actual = solution.isValid("[([]])");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSimple11() {
        boolean expected = false;
        boolean actual = solution.isValid("([([]]))");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSimple12() {
        boolean expected = false;
        boolean actual = solution.isValid("(([(()))])");
        Assert.assertEquals(expected, actual);
    }
    //Wrong Answer
    //Details
    //Input
    //"[([]])"
    //Output
    //true
    //Expected
    //false
}
