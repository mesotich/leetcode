class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int n = 0;
        while (n < arr.length) {
            int first = i < nums1.length ? nums1[i] : Integer.MAX_VALUE;
            int second = j < nums2.length ? nums2[j] : Integer.MAX_VALUE;
            if (first < second) {
                arr[n] = first;
                i++;
            }
            if (first >= second) {
                arr[n] = second;
                j++;
            }
            n++;
        }
        int middle = arr[arr.length / 2];
        return arr.length % 2 != 0 ? middle : (double) (middle + arr[arr.length/2 - 1]) / 2;
    }
}

