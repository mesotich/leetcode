class Solution {

    public int myAtoi(String s) {
        if (s == null || s.isEmpty())
            return 0;
        int len = s.length();
        char ch = s.charAt(0);
        if (len == 1 && ch < 48 || ch > 59)
            return 0;
        int start = 0;
        int end;
        boolean isSignFind = false;
        boolean isMinus = false;
        int result;
        while (((ch = s.charAt(start)) == ' ' && !isSignFind) || ch == '0'
                || (!isSignFind && ch == '+') || (!isSignFind && ch == '-')) {
            if (ch == '0' || ch == '+' || ch == '-') {
                isSignFind = true;
                if (ch == '-')
                    isMinus = true;
            }
            start++;
            if (start == len)
                return 0;
        }
        if (ch < 48 || ch > 57)
            return 0;
        end = start;
        while ((ch = s.charAt(end)) >= 48 && ch <= 57) {
            if (end - start >= 10)
                return isMinus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            end++;
            if (end == len)
                break;
        }
        try {
            result = Integer.parseInt(s.substring(start, end));
        } catch (NumberFormatException e) {
            return isMinus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return isMinus ? -result : result;
    }
}


