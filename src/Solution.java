import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(solution.maximumWealth(accounts));
    }

    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt(acc -> Arrays.stream(acc).reduce(Integer::sum).orElse(0))
                .max().orElse(0);
    }
}
