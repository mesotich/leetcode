import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {



    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int left = 0;
        int right = nums.length - 1;
        int middle;
        int sum;
        while (left < nums.length - 2) {
            while (left < right - 1 && left - 1 >= 0 && nums[left] == nums[left - 1]) {
                left++;
            }
            while (left < right - 1) {
                while (left < right - 1 && right + 1 < nums.length && nums[right] == nums[right + 1]) {
                    right--;
                }
                sum = nums[left] + nums[right];
                middle = Arrays.binarySearch(nums, left + 1, right, -sum);
                if (middle >= 0) result.add(new ArrayList<>(Arrays.asList(nums[left], nums[middle], nums[right])));
                right--;
            }
            right = nums.length - 1;
            left++;
        }
        return result;
    }
}



