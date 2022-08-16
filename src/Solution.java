class Solution {

    public int removeDuplicates(int[] nums) {
        int start = 0;
        int end = 1;
        while (end < nums.length) {
            while (nums[start] == nums[end]) {
                end++;
                if (end >= nums.length)
                    return start + 1;
            }
            start++;
            nums[start] = nums[end];
            end++;
        }
        return start + 1;
    }
}
