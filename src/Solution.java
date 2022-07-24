class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isMatch("a", "a"));
    }

    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        int sI = 0;
        int pI = 0;
        char sCh = 0;
        char pCh = 0;
        boolean sStop = false;
        boolean pStop = false;
        boolean isDiff = false;
        while (sI < sLen || pI < pLen) {
            if (!sStop && sI < sLen) sCh = s.charAt(sI);
            if (!pStop && pI < pLen) pCh = p.charAt(pI);
            if (sCh != pCh && pCh != '.') {
                if (pCh == '*') {
                    isDiff = false;
                    sStop = false;
                    pCh = p.charAt(pI - 1);
                    if (pCh == '.') return true;
                    pStop = sCh == pCh;
                } else {
                    if (!isDiff) isDiff = true;
                    else return false;
                    if (pStop) pStop = false;
                }
            } else {
                if (!isDiff)
                    sStop = true;
            }
            if (sI < sLen && !sStop) sI++;
            if (pI < pLen && !pStop) pI++;
        }
        return !isDiff;
    }
}

