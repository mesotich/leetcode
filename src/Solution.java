import java.util.*;
import java.util.stream.Collectors;

class Solution {

    private int len;
    private int lenAll;
    private String s;
    private Map<String, Integer> map;

    public List<Integer> findSubstring(String s, String[] words) {
        len = words[0].length();
        lenAll = words.length * len;
        if (s.length() < lenAll)
            return Collections.emptyList();
        List<Integer> result = new ArrayList<>();
        this.s = s;
        map = Arrays.stream(words).collect(Collectors.toMap(w -> w, w -> 1, (v1, v2) -> v1 + 1));
        int i = 0;
        while (s.length() - i >= lenAll) {
            if (map.containsKey(s.substring(i, i + len)) && findSubRec(i))
                result.add(i);
            i++;
        }
        return result;
    }

    private boolean findSubRec(int i) {
        Map<String, Integer> map = new HashMap<>(this.map);
        int lenAll = this.lenAll;
        String w;
        while (s.length() - i >= lenAll && lenAll != 0) {
            w = s.substring(i, i + len);
            if (!map.containsKey(w) || map.get(w) == 0) return false;
            i += len;
            lenAll -= len;
            map.put(w, map.get(w) - 1);
        }
        return lenAll == 0;
    }
}