class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxSquare = 0;
        int min = 0;
        while (left < right) {
            min = Math.min(height[left], height[right]);
            maxSquare = Math.max(maxSquare, (right - left) * min);
            min = min == height[left] ? left++ : right--;
        }
        return maxSquare;
    }
}

