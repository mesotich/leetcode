
class Solution {

    public int divide(int dividend, int divisor) {
        if (dividend == divisor)
            return 1;
        if (dividend == 0)
            return 0;
        boolean sign = ((dividend ^ divisor) & Integer.MIN_VALUE) == 0;
        dividend = dividend < 0 ? dividend : -dividend;
        divisor = divisor < 0 ? divisor : -divisor;
        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE && sign) {
                dividend = Integer.MAX_VALUE;
                sign = false;
            }
            return sign ? -dividend : dividend;
        }
        int result = 0;
        int del;
        int i;
        while (dividend <= divisor) {
            i = 1;
            del = divisor;
            dividend -= del;
            result++;
            while (dividend <= del) {
                dividend -= del;
                result += i;
                del += del;
                i += i;
            }
        }
        return sign ? result : -result;
    }
}