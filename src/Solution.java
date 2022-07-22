class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(1));
    }

    public boolean isPalindrome(int x) {
        if (x == 0)
            return true;
        if (x < 0)
            return false;
        int num = (int) Math.log10(x);
        if (num == 0)
            return true;
        int del;
        while (num >= 1) {
            del = (int) Math.pow(10, num);
            if (x % 10 != x / del) {
                return false;
            }
            x = x % del;
            x /= 10;
            num -= 2;
        }
        return true;
    }
}

