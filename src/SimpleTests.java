import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleTests {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void testSimple1() {
        Set<String> expected = new HashSet<>(List.of("((()))", "(()())", "(())()", "()(())", "()()()"));
        Set<String> actual = new HashSet<>(solution.generateParenthesis(3));
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSimple2() {
        Set<String> expected = new HashSet<>(List.of("()"));
        Set<String> actual = new HashSet<>(solution.generateParenthesis(1));
        Assert.assertEquals(expected, actual);
    }
}
