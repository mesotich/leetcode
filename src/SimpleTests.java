import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleTests {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void testSimple1() {
        int[] arr = {1, 2, 3};
        solution.nextPermutation(arr);
        Assert.assertEquals(List.of(1, 3, 2), Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }
    @Test
    public void testSimple2() {
        int[] arr = {3, 2, 1};
        solution.nextPermutation(arr);
        Assert.assertEquals(List.of(1, 2, 3), Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }

    @Test
    public void testSimple3() {
        int[] arr = {1, 1, 5};
        solution.nextPermutation(arr);
        Assert.assertEquals(List.of(1, 5, 1), Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }
    @Test
    public void testSimple4() {
        int[] arr = {1, 3, 2};
        solution.nextPermutation(arr);
        Assert.assertEquals(List.of(2, 1, 3), Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }
    @Test
    public void testSimple5() {
        int[] arr = {2, 3, 1};
        solution.nextPermutation(arr);
        Assert.assertEquals(List.of(3, 1, 2), Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }
//    Wrong Answer
//    Details
//            Input
//[2,3,1]
//    Output
//[3,2,1]
//    Expected
//[3,1,2]
}
