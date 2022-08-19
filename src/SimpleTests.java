import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class SimpleTests {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void testSimple1() {
        List<Integer> actual = solution.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"});
        Assert.assertEquals(List.of(0, 9), actual);
    }

    @Test
    public void testSimple2() {
        List<Integer> actual = solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"});
        Assert.assertEquals(Collections.emptyList(), actual);
    }

    @Test
    public void testSimple3() {
        List<Integer> actual = solution.findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"});
        Assert.assertEquals(List.of(6, 9, 12), actual);
    }

    @Test
    public void testSimple4() {
        List<Integer> actual = solution.findSubstring("abcdabcefj", new String[]{"abc", "bcd", "efj"});
        Assert.assertEquals(List.of(1), actual);
    }

    @Test
    public void testSimple5() {
        List<Integer> actual = solution.findSubstring("aaaaaaaaaa", new String[]{"aaa", "aaa", "aaa"});
        Assert.assertEquals(List.of(0, 1), actual);
    }

    @Test
    public void testSimple6() {
        List<Integer> actual = solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "good"});
        Assert.assertEquals(List.of(8), actual);
    }
}
