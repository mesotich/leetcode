class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int result = 0;
        int current = 0;
        int previous = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I' -> current = 1;
                case 'V' -> current = 5;
                case 'X' -> current = 10;
                case 'L' -> current = 50;
                case 'C' -> current = 100;
                case 'D' -> current = 500;
                case 'M' -> current = 1000;
            }
            if (current <= previous) result += current;
            else result = result - 2 * previous + current;
            previous = current;
        }
        return result;
    }
}

