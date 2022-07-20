import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abb"));
    }

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLength = 0;
        for (int first=0, last=0; last < s.length(); last++) {
            Integer repeated = map.get(s.charAt(last));
            if (repeated == null || repeated < first) {
                maxLength = Math.max(maxLength, last - first + 1);
            } else {
                first = repeated + 1;
            }
            map.put(s.charAt(last), last);
        }
        return maxLength;
    }
}
