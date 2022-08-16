class Solution {

    public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = 0;
        while (end < nums.length) {
            while (nums[end] == val) {
                end++;
                if (end >= nums.length)
                    return start;
            }
            nums[start] = nums[end];
            start++;
            end++;
        }
        return start;
    }
}