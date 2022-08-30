import java.util.Arrays;

class Solution {

    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    while (i != j) {
                        nums[i] ^= nums[i - 1];
                        nums[i - 1] ^= nums[i];
                        nums[i] ^= nums[i - 1];
                        i--;
                    }
                    return;
                }
            }
        }
        Arrays.sort(nums);
    }
}