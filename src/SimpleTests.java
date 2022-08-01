import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class SimpleTests {

    Solution solution = new Solution();

    @Test
    public void testSimple1() {
        List<List<Integer>> actual = solution.fourSum(new int[]{-2, -1, 0, 0, 1, 2}, 0);
        List<List<Integer>> expected = List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSimple2() {
        List<List<Integer>> actual = solution.fourSum(new int[]{2, 2, 2, 2, 2}, 8);
        List<List<Integer>> expected = List.of(List.of(2, 2, 2, 2));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSimple3() {
        List<List<Integer>> actual = solution.fourSum(new int[]{2}, 2);
        List<List<Integer>> expected = Collections.emptyList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSimple4() {
        List<List<Integer>> actual = solution.fourSum(new int[]{0}, 0);
        List<List<Integer>> expected = Collections.emptyList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSimple5() {
        List<List<Integer>> actual = solution.fourSum(new int[]{0, 1, 2}, 3);
        List<List<Integer>> expected = Collections.emptyList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSimple6() {
        List<List<Integer>> actual = solution.fourSum(new int[]{-3, -2, -1, 0, 0, 1, 2, 3}, 0);
        List<List<Integer>> expected = List.of(List.of(-3, -2, 2, 3), List.of(-3, -1, 1, 3), List.of(-3, 0, 0, 3),
                List.of(-3, 0, 1, 2), List.of(-2, -1, 0, 3), List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1));
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSimple7() {
        List<List<Integer>> actual = solution.fourSum(new int[]{-2,-1,-1,1,1,2,2}, 0);
        List<List<Integer>> expected = List.of(List.of(-2,-1,1,2), List.of(-1,-1,1,1));
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSimple8() {
        List<List<Integer>> actual = solution.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296);
        List<List<Integer>> expected = Collections.emptyList();
        Assert.assertEquals(expected, actual);
    }
//Input
//[1000000000,1000000000,1000000000,1000000000]
//-294967296
//Output
//[[1000000000,1000000000,1000000000,1000000000]]
//Expected
//[]
}
