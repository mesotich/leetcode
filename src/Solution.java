class Solution {

    public int strStr(String haystack, String needle) {
        int st = 0;
        char ch = needle.charAt(0);
        while (st + needle.length() <= haystack.length()) {
            if (haystack.charAt(st) != ch) {
                st++;
                continue;
            }
            if (needle.length() == 1)
                return st;
            if (st > haystack.length() - 2)
                return -1;
            int n = 1;
            while (haystack.charAt(st + n) == needle.charAt(n)) {
                if (n == needle.length() - 1)
                    return st;
                if (st + n == haystack.length() - 1)
                    return -1;
                n++;
            }
            st++;
        }
        return -1;
    }
}