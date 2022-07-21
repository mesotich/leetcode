class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("aba"));
    }

    public String longestPalindrome(String s) {
        int left;
        int right;
        int maxLen = 0;
        int[] result = new int[2];
        for (int i = 0; i < s.length(); i++) {
            left = i;
            right = i;
            while (right < s.length()-1 && s.charAt(i) == s.charAt(right+1)) {
                right++;
            }
            while (left > 0 && right < s.length()-1 && s.charAt(left-1) == s.charAt(right+1)) {
                left--;
                right++;
            }
            int len = right - left + 1;
            if (len > maxLen) {
                maxLen = len;
                result[0] = left;
                result[1] = right;
            }
        }
        return s.substring(result[0], result[1] + 1);
    }
}

