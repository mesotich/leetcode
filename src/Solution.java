import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {

    private int len;
    private int n;
    private List<Integer> result;

    public List<String> generateParenthesis(int n) {
        if (n == 1)
            return new ArrayList<>(List.of("()"));
        this.n = n;
        len = 2 * n;
        result = new ArrayList<>();
        generation(1, 0, 0);
        return result.stream().map(x -> intToString(x, n)).collect(Collectors.toList());
    }

    private void generation(int exp, int open, int close) {
        if (open + close == len) {
            result.add(exp);
            return;
        }
        if (open < n)
            generation(exp << 1 | 1, open + 1, close);
        if (close < open)
            generation(exp << 1, open, close + 1);
    }

    private String intToString(int exp, int n) {
        StringBuilder sb = new StringBuilder();
        char ch;
        for (int i = 0; i < len; i++) {
            ch = exp % 2 == 1 ? ')' : '(';
            sb.append(ch);
            exp /= 2;
        }
        return sb.toString();
    }
}
