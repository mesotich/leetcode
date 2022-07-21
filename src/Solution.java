class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convert("ABCDE", 4));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        StringBuilder sb = new StringBuilder();
        int left;
        int right;
        int step = 2 * (numRows - 1);
        int column = s.length() / step + 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < column; j++) {
                left = j * step - i;
                right = j * step + i;
                if (left >= 0 && left < s.length() && left != j * step - step / 2 && left != right)
                    sb.append(s.charAt(left));
                if (right >= 0 && right < s.length())
                    sb.append(s.charAt(right));
            }
        }
        return sb.toString();
    }
}

