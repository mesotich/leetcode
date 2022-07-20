import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        Arrays.stream(solution.twoSum(nums, 18)).forEach(System.out::println);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] numsClone = nums.clone();
        Arrays.sort(numsClone);
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int second = target - first;
            int key = Arrays.binarySearch(numsClone, second);
            if (key >= 0) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == second && i != j)
                        return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
