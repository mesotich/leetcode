class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intToRoman(3999));
    }

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        char[] chars = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int n;
        int i = 0;
        int del;
        while (num > 0) {
            n = num % 10;
            del = n % 5;
            if (del == 4) {
                if (n == 9) sb.append(chars[i + 2]);
                else sb.append(chars[i + 1]);
                sb.append(chars[i]);
            } else {
                sb.append(String.valueOf(chars[i]).repeat(del));
                if (n >= 5) sb.append(chars[i + 1]);
            }
            num /= 10;
            i += 2;
        }
        return sb.reverse().toString();
    }
}

