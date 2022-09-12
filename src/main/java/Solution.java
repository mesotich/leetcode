class Solution {

    private int result = 0;

    public int longestValidParentheses(String s) {
        if (s.isEmpty())
            return 0;
        return 0;
    }

    public int sumValid(String s, int i, int sum) {
        if (i > s.length() - 1)
            return 0;
        if (s.charAt(i) == ')')
            return 2;
        sum+=sumValid(s, i + 1, sum + 2);
        return sum;
    }
}