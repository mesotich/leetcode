import java.util.Arrays;

class Solution {

    public int threeSumClosest(int[] nums, int target) {
        final int len = nums.length - 1;
        int low;
        int high;
        int sum;
        int result = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            low = i + 1;
            high = len;
            while (low < high) {
                sum = nums[i] + nums[low] + nums[high];
                if (sum == target) return target;
                if (sum < target) low++;
                else high--;
                if (Math.abs(sum - target) < Math.abs(result - target))
                    result = sum;
            }
        }
        return result;
    }
}






