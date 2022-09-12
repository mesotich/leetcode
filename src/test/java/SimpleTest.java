import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SimpleTest {

    private Solution solution;

    @BeforeAll
    void init() {
        solution = new Solution();
    }

    @Test
    void simpleTest1() {
        int actual = solution.longestValidParentheses("(()");
        Assertions.assertEquals(2, actual);
    }

    @Test
    void simpleTest2() {
        int actual = solution.longestValidParentheses(")()())");
        Assertions.assertEquals(4, actual);
    }

    @Test
    void simpleTest3() {
        int actual = solution.longestValidParentheses("");
        Assertions.assertEquals(0, actual);
    }
    @Test
    void simpleTest4() {
        int actual = solution.longestValidParentheses("(())");
        Assertions.assertEquals(4, actual);
    }
    @Test
    void simpleTest5() {
        int actual = solution.longestValidParentheses("((())(())(())()");
        Assertions.assertEquals(14, actual);
    }
    @Test
    void simpleTest6() {
        int actual = solution.longestValidParentheses("(()))()()()");
        Assertions.assertEquals(6, actual);
    }
    @Test
    void simpleTest7() {
        int actual = solution.longestValidParentheses("(())())()()()");
        Assertions.assertEquals(6, actual);
    }
    @Test
    void simpleTest8() {
        int actual = solution.longestValidParentheses("(())())()()()()");
        Assertions.assertEquals(8, actual);
    }
    @Test
    void simpleTest9() {
        int actual = solution.longestValidParentheses("()");
        Assertions.assertEquals(2, actual);
    }
    @Test
    void simpleTest10() {
        int actual = solution.longestValidParentheses("(((()(((()");
        Assertions.assertEquals(2, actual);
    }
    @Test
    void simpleTest11() {
        int actual = solution.sumValid("(())",0,0);
        Assertions.assertEquals(4, actual);
    }
}
