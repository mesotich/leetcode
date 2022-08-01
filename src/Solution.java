import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4)
            return Collections.emptyList();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        long sum;
        for (int first = 0; first < nums.length - 3; first++) {
            if (first - 1 >= 0 && nums[first] == nums[first - 1])
                continue;
            sum = (long) nums[first] + (long) nums[first + 1] + (long) nums[first + 2] + (long) nums[first + 3];
            if (sum > target)
                continue;
            sum = (long) nums[first] + (long) nums[nums.length - 3] + (long) nums[nums.length - 2] + (long) nums[nums.length - 1];
            if (sum < target)
                continue;
            for (int second = first + 1; second < nums.length - 2; second++) {
                if (second - 1 > first && nums[second] == nums[second - 1])
                    continue;
                long twoSum = (long) nums[first] + (long) nums[second];
                sum = twoSum + (long) nums[second + 1] + (long) nums[second + 2];
                if (sum > target)
                    continue;
                sum = twoSum + (long) nums[nums.length - 2] + (long) nums[nums.length - 1];
                if (sum < target)
                    continue;
                int index = nums.length;
                for (int third = second + 1; third < nums.length - 1; third++) {
                    if (third - 1 > second && nums[third] == nums[third - 1])
                        continue;
                    long threeSum = twoSum + (long) nums[third];
                    sum = threeSum + (long) nums[third + 1];
                    if (sum > target)
                        continue;
                    sum = threeSum + (long) nums[nums.length - 1];
                    if (sum < target)
                        continue;
                    if (index <= third + 1)
                        continue;
                    index = Arrays.binarySearch(nums, third + 1, index, (int) (target - threeSum));
                    if (index >= 0) {
                        result.add(new ArrayList<>(List.of(nums[first], nums[second], nums[third], nums[index])));
                    } else index = ~index;
                }
            }
        }
        return result;
    }
}






